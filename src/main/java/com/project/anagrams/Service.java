package com.project.anagrams;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import org.apache.logging.log4j.Logger;


// This class provides the service logic for handling anagrams.
@Component
public class Service {
	// Data structure to store anagrams.
	MultiValueHashMap<String,String> anagrams = new MultiValueHashMap<>();
	// Set to store the list of anagrams.
	HashSet<String> anagramSet = new HashSet<>();
	// Logger for logging messages.
	private static final Logger log = LogManager.getLogger(Service.class);

	// Method to retrieve anagrams for a given string.
	HashSet<String> getAnagramList(String str) {
		// Check if there are any anagrams stored.
		if (!anagrams.isEmpty()) {
			System.out.print("anagramsOf.keySet(): " + anagrams.keySet());
			// Iterate through stored anagrams.
			for (String key : anagrams.keySet()) {
				// Check if the current key is an anagram of the input string.
				if (isAnagram(str, key)) {
					// Add the anagram to the set.
					anagramSet = anagrams.getValueList(key);
					anagramSet.add(key);
				}
			}
		}
		// Remove the input string from the set (itself cannot be its own anagram).
		anagramSet.remove(str);
		return anagramSet;
	}

	// Method to save anagrams.
	boolean saveAnagram(String str1, String str2) {
		// Log input strings.
		log.info("input strings : {}, {}", str1, str2);
		// Check if the input strings are anagrams.
		boolean result = isAnagram(str1, str2);
		// If they are anagrams, save them.
		if (result) {
			// Save the anagrams.

			if (anagrams.isEmpty()|| !(isAnagramSaved(str1) || isAnagramSaved(str2))) {
				anagrams.putValueList(str1, str2);
			}
			// Update anagrams map with the new relations.
			for (String key : anagrams.keySet()) {
				if (isAnagram(str1, key)){
					anagrams.putValueList(key, str1);
				}
				if (isAnagram(str2, key)) {
					anagrams.putValueList(key, str2);
				}
			}
		}
		// Log the updated anagrams.
		log.info("Anagrams : {}", anagrams.toString());
		return result;
	}

	// Method to check if the anagram was already saved
	boolean isAnagramSaved(String str){
		for (String key : anagrams.keySet()) {
			if (isAnagram(str, key)) {
				return true;
			}
		}
		return false;
	}

	// Method to check if two strings are anagrams.
	boolean isAnagram(String str1, String str2) {
		return sortString(str1).equals(sortString(str2));
	}

	// Method to sort a string alphabetically.
	String sortString(String inputString) {
		return inputString.toLowerCase().chars()
				.sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}
}
