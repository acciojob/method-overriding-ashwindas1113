package com.driver;

public class Main {
    public static void main(String[] args) {
        B object = new B();
        object.meth();

        B object2 = new B();
        object2.meth();
    }

    public static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        // Task 4: Override the meth method in class B.
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}


