package com.cjbdevlabs;

public class Calculator {
    
    public int sum(int x, int y) {
        return x + y;
    }
    
    public int substract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Ints cannot be divided by zero");
        }
        return x / y;
    }

    public boolean isEven(int i) {
        return i % 2 == 0;
    }

    public int[] incrementArray(int[] values) {
        var newValues = new int[values.length];
        for (var i = 0; i < values.length; i++) {
            newValues[i] = values[i] + 1;
        }
        return newValues;
    }
}
