package com.cjbdev.functions;

/**
 * Must create your own functional interface in order to create a function in Java which accepts more than two arguments
 * and returns a value
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @param u the function argument
     * @param v the function argument
     * @return the function result
     */
    R apply(T t, U u, V v);
}
