package com.samsung;

import java.util.Scanner;

static int d=19
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>5) {
            System.out.println("a>5");
            System.out.println("!");
        } else {
            System.out.println("a<5");
            System.out.println("!");
        }


        int a, b, c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b)
            if(a>c) System.out.println(a);
            else System.out.println(c);
        else
            if(b>c) System.out.println(b);
            else System.out.println(c);

    int n;
    n=sc.nextInt();
    switch(n) {
        case 1:
            System.out.println("January");
            break;
        default:
            System.out.println("NO");
    }

    if(n>0) {
        int d=8;
    }
}
