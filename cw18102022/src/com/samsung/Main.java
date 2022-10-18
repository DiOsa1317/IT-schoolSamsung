package com.samsung;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        //int[] ar=new int[N];
        //for (int i = 0; i < ar.length; i++) {
          //  ar[i]=sc.nextInt();
        //}
        //for(int i : ar) {
           // System.out.print(i + " ");
        //}

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=str(a,b);
        System.out.println(sum);
        public static int str(int a, int b) {
            int z=a+b;
            return z;
        }
    }
}
