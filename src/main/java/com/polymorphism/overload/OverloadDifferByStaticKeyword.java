package com.polymorphism.overload;

public class OverloadDifferByStaticKeyword {

    //Not possible compile time error

//    public String getMessage(){
//        System.out.println("Default message...");
//        return "default message...";
//    }

    public static String getMessage(){
        System.out.println("Message got: " );
        return "Message got:";
    }

    public static void main(String[] args) {
        OverloadDifferByStaticKeyword.getMessage();
    }
}
