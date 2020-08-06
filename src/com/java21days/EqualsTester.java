package com.java21days;

class EqualsTester {
    public static void main(String[] arguments) {
        String str1, str2;
        str1 = "Boy, that escalated quickly.";
        str2 = str1;
        /*str1 and str2 point to the same object*/
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        str2 = new String(str1);
        /* str2 is now its own object but has the value of str1 */
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same Value? " + str1.equals(str2));
        
    }
}