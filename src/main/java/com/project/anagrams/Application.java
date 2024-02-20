package com.project.anagrams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
//		String A = "Alba";
//		String B = "abla";
//		MultiValueHashMap<String,String> anagramsOf = new MultiValueHashMap<>();
//
//		boolean result =  isAnagram(A, B);
//		System.out.print("isAnagram ?: " + result);
//
//
//	}
//	static boolean isAnagram(String str1, String str2) {
//		return sortString(str1).equals(sortString(str2));
//	}
//	static String sortString(String inputString){
//		return inputString.toLowerCase().chars()
//				.sorted()
//				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//				.toString();
	}
}
