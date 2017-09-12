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
public class InsertionSort {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int holeposition=0;
    int valueToInsert=0;
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    
    for(int i=1;i<n;i++){
      holeposition=i;
      valueToInsert=a[i];
      while(holeposition>0&&a[holeposition-1]>valueToInsert){
      a[holeposition]=a[holeposition-1];
      holeposition--;
       }
      a[holeposition]=valueToInsert;
    }
    for(int i=0;i<n;i++){
    System.out.println(a[i]+" ");
    }
    }
}
