// package com.Endsem_java;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
       
        int n;

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  

        float sum=0,avg=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        avg=sum/n;

        sum=0;
        for(int i=0;i<n;i++){
            sum+=(arr[i]-avg)*(arr[i]-avg);
        }

        sum=sum/n;

        System.out.println(Math.sqrt(sum));





    }
}