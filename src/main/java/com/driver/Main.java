package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
        Product p = new Product();
        int ans1 = p.product(2,3);
        int ans2 = p.product(2,3,4);
        double ans3 = p.product(2.3,4.5);
//        System.out.println(ans1);
//        System.out.println(ans2);
//        System.out.println(ans3);
    }
}

class Product{
    Product(){

    }
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