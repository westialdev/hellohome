package com.leadtech.cv.dev.home;


public class Hello
{
    public String invoke(String firstName, String lastName, String correlationId)
    {
        String message = String.format("%s, %s", lastName, firstName);
        System.out.printf("%s - %s\n", correlationId, message);
        return message;
    }

}
