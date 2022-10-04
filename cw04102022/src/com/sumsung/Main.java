package com.sumsung;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        //int a, b;
        //a=sc.nextInt();
        //b=sc.nextInt();
        //int x=a>b ? a:b;
        //System.out.println(x);

        double x=sc.nextDouble();
        double y=sc.nextDouble();
        String res=(x*x+y*y>4 && x<2 && x>y && y>0) ? "YES" : "NO";
        System.out.println(res);
    }
}

