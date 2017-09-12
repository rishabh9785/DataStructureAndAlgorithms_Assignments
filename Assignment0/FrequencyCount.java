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
public class FrequencyCount {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    int count[]=new int[n];
    for(int i=0;i<n;i++){
    count[i]=0;
    }
    for(int i=1;i<n;i++){
    count[a[i]-1]++;
    }
    int temp_max=count[0],maxElement=0;
    for(int i=0;i<n;i++){
    if(temp_max<count[i]){
        temp_max=count[i];
    maxElement=i+1;
    }
    }
        System.out.println(maxElement+" "+temp_max);
    }
}
