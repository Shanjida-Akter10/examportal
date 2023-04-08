package com.exam.helper;

public class UserNotFoundException extends  Exception{

    public UserNotFoundException(){
        super("User Not Found");
    }
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
