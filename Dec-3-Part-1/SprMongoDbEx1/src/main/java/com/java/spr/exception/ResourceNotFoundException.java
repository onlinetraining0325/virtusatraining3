package com.java.spr.exception;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}
