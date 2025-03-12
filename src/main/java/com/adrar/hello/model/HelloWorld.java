package com.adrar.hello.model;

public class HelloWorld {
    private String value = "Hello, World!";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return this.getValue();
    }
}
