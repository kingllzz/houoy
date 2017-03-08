package com.iandtop.jxy.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * Created by andyzhao on 2017-03-04.
 */
public class LoginException extends NestedRuntimeException
{

    private static final long serialVersionUID = 5498058653840752035L;

    public LoginException(String message)
    {
        super(message);
    }

    public LoginException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
