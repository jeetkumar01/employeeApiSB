package com.jeet.demo.security;

public class PasswordEncrypter {

    public String encryptPassword(String pass){
        char ch[] = pass.toCharArray();
        String result= "";
        for(int i = 0; i < ch.length; i++) {
            String hexString = Integer.toHexString(ch[i]);
            result += hexString;
        }
        return result;
    }
    public String decryptPassword(String pass){
        String result = "";
        char[] charArray = pass.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result += ch;
        }
        return result;
    }

}
