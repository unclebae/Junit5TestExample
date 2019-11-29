package com.example.junit.junit_sample.calculator;

/**
 * MinusInt
 */
public class MinusInt implements Operation<Integer> {

    @Override
    public Integer operate(Integer lvalue, Integer rvalue) {
        return lvalue - rvalue;
    }

}