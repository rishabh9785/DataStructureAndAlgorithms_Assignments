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
import java.lang.Math;
import java.util.*;
public class RandomGenerator {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random a=new Random();
    int rand=a.nextInt(201)+1900;
    System.out.println(rand);
    if(rand%4==0){
    System.out.println("it is a leap year");
            }
    else{
    System.out.println("not a leap year");
    }
    
    }
}
