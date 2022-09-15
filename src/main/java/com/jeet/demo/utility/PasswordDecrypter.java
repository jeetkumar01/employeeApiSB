package com.jeet.demo.utility;

public class PasswordDecrypter {
    public static String decryptPassword(String pass){
        String result = new String();
        char[] charArray = pass.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result += ch;
        }
        return result;
    }

}
