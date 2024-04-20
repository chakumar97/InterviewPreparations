package com.polymorphism.overload;

public class StaticOverload {

    public static String getMessage(){
        System.out.println("Default message...");
        return "default message...";
    }

    public static String getMessage(String key){
        System.out.println("Message is: " + key);
        return "Message is:" + key;
    }

    public static void main(String[] args) {

        StaticOverload.getMessage();
        StaticOverload.getMessage("chandan");
    }
}
