package com.cjbdev;

import com.cjbdev.functions.Functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

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

        int[] arrayOfInts = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> listOfInts = Arrays.stream(arrayOfInts).boxed().toList();
        var doubleListOfInts = listOfInts.stream().map(x -> x * 2).toList();

        BinaryOperator<Integer> getSum = (acc, x) -> {
            var result = acc + x;
            System.out.println("acc: " + acc + ", x: " + x + ", result: " + result);
            return result;
        };

        // reduce
        Integer sum = listOfInts.stream().reduce(0, getSum);
        System.out.println("The sum is: " + sum);

        // recursion
        Functions.countDown(10);
    }
}
