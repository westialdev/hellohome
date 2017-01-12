package com.leadtech.cv.dev.utils;

public class ResponseHello
{
    private String greetings;

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public ResponseHello(String greetings) {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.utils.ResponseHello.ResponseHello"
        );
        this.greetings = greetings;
    }

    public ResponseHello() {
    }
}
