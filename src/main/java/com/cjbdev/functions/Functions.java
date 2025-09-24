package com.cjbdev.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Class and package refer to functional programming within the java language
 * Functional programming concepts
 * <ul>
 *     <li>Immutability</li>
 *     <li>Functional purity</li>
 *     <li>First class functions</li>
 * </ul>
 * Define functions with the {@link java.util.function.Function} interface - Note that the Function interface
 * can only create functions that accept one argument.
 * Can use the {@link java.util.function.BiFunction} interface to create functions that accept two arguments
 */
public class Functions {

    public static Function<Integer, Integer> tripleValueFunc = x -> x * 3;
    public static BiFunction<Integer, Integer, Integer> addValuesFunc = (x, y) -> x + y;
    public static TriFunction<Integer, Integer, Integer, Integer> multipylyValuesFunc = (x, y, z) -> x * y * z;

}
