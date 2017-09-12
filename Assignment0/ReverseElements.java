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
public class ReverseElements {
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
     a[i]=sc.nextInt();
     }
     int temp=0;
     for(int i=1;i<=n/2;i++){
         temp=a[n-i];
         a[n-i]=a[i-1];
         a[i-1]=temp;
     }
     for(int i=0;i<n;i++){
     System.out.println(a[i]+" ");
     }
     
         
         
     
     }
}
