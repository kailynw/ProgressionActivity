package com.williams.kailyn;

public class Main {

    public static void main(String[] args) {
        Progression progression= new Progression(15);
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());

        progression= new MultProgression(1,3);
        System.out.println("\n"+progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());

        progression= new FibonacciProgression();
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        System.out.println(progression.nextValue());
        progression.printProgression();


        //progression.printProgression();



    }
}
