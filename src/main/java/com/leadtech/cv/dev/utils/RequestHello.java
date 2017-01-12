package com.leadtech.cv.dev.utils;

public class RequestHello
{

    private String firstName;
    private String lastName;

    public String getFirstName()
    {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello.getFirstName"
        );
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello.setFirstName"
        );
        this.firstName = firstName;
    }

    public String getLastName()
    {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello.getLastName"
        );
        return lastName;
    }

    public void setLastName(String lastName)
    {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello.setLastName"
        );
        this.lastName = lastName;
    }

    public RequestHello(String firstName, String lastName)
    {
        System.out.printf(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello 2p: %s %s\n",
                firstName,
                lastName
        );
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public RequestHello(String key1, String key2, String key3)
    {
        System.out.printf(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello 3p: %s %s %s\n",
                key1,
                key2,
                key3
        );
        this.firstName = key1;
        this.lastName = key2;
    }

    public RequestHello()
    {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.utils.RequestHello NO params"
        );
    }
}
