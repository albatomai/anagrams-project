package com.project.anagrams;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;


class Request {


    private String a;
    private String b;

    Request() {}

    Request(String a, String b) {

        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Request{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
