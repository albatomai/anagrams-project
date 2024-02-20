package com.project.anagrams;
class InvalidInputException extends RuntimeException {

    InvalidInputException(Request request) {
        super("Input must be words, input provided: " + request);
    }
}