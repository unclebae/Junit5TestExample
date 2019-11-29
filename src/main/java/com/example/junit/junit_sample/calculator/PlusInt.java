package com.example.junit.junit_sample.calculator;

/**
 * PlusInt
 */
public class PlusInt implements Operation<Integer> {

    @Override
    public Integer operate(Integer lvalue, Integer rvalue) {
        return lvalue + rvalue;
    }

}