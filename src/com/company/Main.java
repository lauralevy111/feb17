package com.company;

public class Main {

    public static void main(String[] args) {
        Email em1 = new Email("Harry","Styles");

        em1.setAlternateEmail("hs@syco.com");
        System.out.println(em1.getAlternateEmail());
    }
}
