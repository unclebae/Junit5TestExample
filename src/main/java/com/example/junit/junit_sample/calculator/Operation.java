package com.example.junit.junit_sample.calculator;

/**
 * Operation
 */
public interface Operation<T> {

    T operate(T lvalue, T rvalue);

}