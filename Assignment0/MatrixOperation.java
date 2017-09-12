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
public class MatrixOperation {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
    a[i][j]=sc.nextInt();
    }
    }
    int temp=0;
    for(int i=0;i<n;i++){
       for(int j=i;j<n;j++){
       temp=a[i][j];    
       a[i][j]=a[j][i];
       a[j][i]=temp;
       }   
      }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}
