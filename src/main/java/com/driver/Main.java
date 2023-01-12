package com.driver;

public class Main {
    public static void Main(String[] args){
        Product p = new Product();
        int ans1 = p.product(5,6);
        int ans2 = p.product(5,6,7);
        double ans3 = p.product(2.5,7.1);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}

class Product{
    public static int product(int x,int y){
        return x*y;
    }
    public static int product(int x,int y,int z){
        return x*y*z;
    }
    public static double product(double x,double y){
        return x*y;
    }
}