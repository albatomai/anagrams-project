package com.project.anagrams;

import jakarta.persistence.Entity;


class Response {


    private Boolean isAnagram;


    Response(Boolean isAnagram) {
        this.isAnagram = isAnagram;
    }


    public Boolean getAnagram() {
        return isAnagram;
    }

    public void setAnagram(Boolean anagram) {
        isAnagram = anagram;
    }
}
