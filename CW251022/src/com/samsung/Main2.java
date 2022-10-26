package com.samsung;

import java.util.Scanner;

public class Main2 {
    public static void rotRight (int[] ar) {
        int m = ar[ar.length - 1];
        for (int i = ar.length - 1; i > 0; i--) {
            ar[i] = ar[i - 1];
        }
        ar[0] = m;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] ar=new int[N];
        for(int i=0; i<ar.length; i++){
            ar[i]=sc.nextInt();
        }
        rotRight(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
