package com.example.junit.junit_sample.calculator;

/**
 * MultiInt
 */
public class MultiInt implements Operation<Integer> {

    @Override
    public Integer operate(Integer lvalue, Integer rvalue) {
        return lvalue * rvalue;
    }
}