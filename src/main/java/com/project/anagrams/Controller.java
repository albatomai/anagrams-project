package com.project.anagrams;


import java.util.HashSet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// This class handles HTTP requests related to anagrams.
@RestController
class Controller {
    private final Service service;
    Controller(Service service) {
        this.service = service;
    }

    // Endpoint to save anagrams.
    @PostMapping("/anagrams")
    ResponseEntity<Boolean> newAnagrams(@RequestBody Request request) {

        validateRequest(request);
        return ResponseEntity.ok(service.saveAnagram(request.getA(), request.getB()));
    }

    // Endpoint to retrieve anagrams for a given string.
    @GetMapping("/anagrams/{str}")
    ResponseEntity<HashSet<String>> getAnagrams(@PathVariable String str) {
        return ResponseEntity.ok(service.getAnagramList(str));
    }
    private static void validateRequest(Request request) {
        if (!isStringOnlyAlphabet(request.getA()) || !isStringOnlyAlphabet(request.getB())){
            throw new InvalidInputException(request);
        }
    }
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null) && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }
}