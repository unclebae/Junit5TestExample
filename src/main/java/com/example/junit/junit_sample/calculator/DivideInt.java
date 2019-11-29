package com.example.junit.junit_sample.calculator;

/**
 * DivideInt
 */
public class DivideInt implements Operation<Integer> {

    @Override
    public Integer operate(Integer lvalue, Integer rvalue) {
        checkRvalue(rvalue);
        return lvalue / rvalue;
    }

    public void checkRvalue(Integer rvalue) {
        if (rvalue == 0) {
            throw new IllegalArgumentException("RValue can't be zero");
        }
    }

}