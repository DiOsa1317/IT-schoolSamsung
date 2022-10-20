package com.samsung;

public class App {
    public static void main(String[] args) {
        int[][]arr=new int[6][6];
        vvod(arr);
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
               if(i==j) System.out.print(arr[i][j] + "\t");
               break;
            }
            //System.out.print("\n");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i]+ " "); //optimal decision for printing the main diagonal
        }


    //int[][]ar=new int[10][];
     //for(int i = 0; i < ar.length; i++){
       //  ar[i]=new int
    //}


    }

    public static void vvod(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                arr[i][j]=(int) (Math.random()*100);
            }
        }
    }
}
