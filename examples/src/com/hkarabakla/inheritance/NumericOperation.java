package com.hkarabakla.inheritance;

public class NumericOperation<T extends Number> {
    private T obj;

    public NumericOperation(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    boolean isDividableByTen() {
        return obj.doubleValue() - obj.intValue() == 0 && obj.intValue() % 10 == 0;
    }

    boolean absEqual(NumericOperation<?> another) {
        return Math.abs(this.obj.doubleValue()) == Math.abs(another.obj.doubleValue());
    }
}
