package com.sivasrinivas.misc;

public class Base10Encoder {

    private final int base;
    private final String chars;

    public Base10Encoder(int base, String chars) {
        this.base = base;
        this.chars = chars;
    }

    public static final Base10Encoder BASE_62 = new Base10Encoder(62, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

    public static void main(String[] args) {
        long number = 1000;
        System.out.println(BASE_62.encode(number));
        System.out.println(BASE_62.decode(BASE_62.encode(number)));
    }

    public String encode(long number) {
        StringBuilder sb = new StringBuilder();
        do {
            long reminder = number % base;
            sb.insert(0, chars.charAt((int)reminder));
            number /= base;
        } while(number > 0); // to handle edge case where given num is 0
        return sb.toString();
    }

    public long decode(String number) {
        long result = 0L;
        int len = number.length();
        for(int i=0; i< len; i++) {
            result += chars.indexOf(number.charAt(len-i-1)) * Math.pow(base, i);
        }
        return result;
    }
}
