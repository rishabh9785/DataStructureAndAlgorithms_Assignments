/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csed
 */
import java.util.*;
public class ArrayMaxMin {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    int temp_max=a[0];
    for(int i=1;i<n;i++){
    if(temp_max<a[i]){
    temp_max=a[i];
    }
    }
    System.out.println(temp_max);
    int temp_min=a[0];
    for(int i=1;i<n;i++){
    if(temp_min>a[i]){
    temp_min=a[i];
    }
    }
    System.out.println(temp_min);
    }
}
