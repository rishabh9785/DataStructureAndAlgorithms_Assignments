/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author csed
 */
import java.util.*;
public class BubbleSort {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    int temp=a[0];
    for(int i=0;i<n;i++){
       for(int j=i;j<n;j++){
       if(a[i]>a[j]){
       temp=a[i];
       a[i]=a[j];
       a[j]=temp;
       }
       }
    }
    for(int i=0;i<n;i++){
    System.out.println(a[i]+" ");
    }
}
}