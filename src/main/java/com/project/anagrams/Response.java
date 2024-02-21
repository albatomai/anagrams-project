package com.project.anagrams;


class Response {

    ;
    private Boolean isAnagram;


    Response(Boolean isAnagram) {
        this.isAnagram = isAnagram;
    }


    public Boolean getIsAnagram() {
        return isAnagram;
    }

    public void setIsAnagram(Boolean anagram) {
        isAnagram = anagram;
    }
}
