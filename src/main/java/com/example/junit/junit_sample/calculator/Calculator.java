package com.example.junit.junit_sample.calculator;

/**
 * Calculator
 */
public class Calculator<T> {

    Operation<T> operation;

    public Calculator(Operation<T> operation) {
        this.operation = operation;
    }

    public T calculate(T lvalue, T rvalue) {
        T returnValue = operation.operate(lvalue, rvalue);

        System.out.println("Lvalue: " + lvalue + " RValue: " + rvalue + " Result: " + returnValue);

        return returnValue;
    }
}