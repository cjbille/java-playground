package com.cjbdev;

import com.cjbdev.functions.Functions;

/**
 * Main class for executing playground code
 */
public class App {
    public static void main(String[] args) {
        System.out.println("--- Executing Java Playground! ---");

        System.out.println(Functions.tripleValueFunc.apply(3));
        System.out.println(Functions.addValuesFunc.apply(8, 90));
        System.out.println(Functions.multipylyValuesFunc.apply(24, 74, 38));
        System.out.println(Functions.noArgFunction.apply());
        System.out.println(Functions.greeterFunc.apply());
    }
}
