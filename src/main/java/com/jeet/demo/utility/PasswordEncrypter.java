package com.jeet.demo.utility;

public class PasswordEncrypter {

    public static String encryptPassword(String pass){
        char ch[] = pass.toCharArray();
        String result= new String();
        for(int i = 0; i < ch.length; i++) {
            String hexString = Integer.toHexString(ch[i]);
            result += hexString;
        }
        return result;
    }
}
