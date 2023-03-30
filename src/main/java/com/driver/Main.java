package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        // Calling the product(int x, int y) method
        int result1 = p.product(2, 3);
        System.out.println("Result1: " + result1);

        // Calling the product(int x, int y, int z) method
        int result2 = p.product(2, 3, 4);
        System.out.println("Result2: " + result2);

        // Calling the product(double x, double y) method
        double result3 = p.product(2.0, 3.0);
        System.out.println("Result3: " + result3);
    }
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

}