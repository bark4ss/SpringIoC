package com.example.model;

public class OperationModel {

    private String operation;
    private int a;
    private int b;
    private int c;

    public OperationModel() {
    }

    public OperationModel(int c) {
        this.c = c;
    }

    public OperationModel(String operation) {
        this.operation = operation;
    }

    public OperationModel(int a, int b, int c) {
        this(c);
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private void initialize() {
        System.out.println("Run initialize method");
        this.a = 3;
        this.b = 9;
        this.c = 11;
    }
}
