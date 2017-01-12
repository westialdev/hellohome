package com.leadtech.cv.dev;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.leadtech.cv.dev.helloutils.RequestHello;
import com.leadtech.cv.dev.helloutils.ResponseHello;
import com.leadtech.cv.dev.home.Hello;

import java.util.UUID;

public class LambdaRequestHandler
        implements RequestHandler<RequestHello, ResponseHello>
{

    private static String generateId()
    {
        final UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public ResponseHello handleRequest(RequestHello input, Context context)
    {
        System.out.println(
                "DEBUG: com.leadtech.cv.dev.LambdaRequestHandler.handleRequest"
        );
        Hello hello = new Hello();
        String result = hello.invoke(
                input.getFirstName(),
                input.getLastName(),
                LambdaRequestHandler.generateId()
        );
        return new ResponseHello(result);
    }
}
