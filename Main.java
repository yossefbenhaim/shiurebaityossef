package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
    public static void  print(int [] in, ArrayList<Integer> resh){

        for (int i : in) {

            // auxilary variable
            try{
                Math.sqrt(resh.get(i));
            }catch (ArithmeticException e){
             System.out.println("you cant do it");
            }
            catch (NullPointerException e) {
                System.out.println("");
            }

        }

    }
    public static void natmatix(){
        Scanner s = new Scanner(System.in);
        double a , b ,c;
        a = s.nextDouble();
        b  = s.nextDouble();
        c = s.nextDouble();
       ;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException  e){
            System.out.println("you cent do this is not ");
        }

        try {
            Math.sqrt(c);
        }catch (ArithmeticException e){
            System.out.println("you cent do this is not ");
        }
        try{
            Math.log(b/c);
        } catch (ArithmeticException e){
            System.out.println("you cent do this is not ");
        }


    }
     public static void bigBetwinTo(int [] arr1, int [] arr2) {
        int sum = 0;
         for(int i =0,j = 0;i< arr1.length&&j<arr2.length; i++,j++ ) {

             try {
                 Math.max(arr1[i], arr2[j]);
             } catch (ArithmeticException e) {
                 System.out.println("Errorer");
             }catch (NullPointerException e){

             }
         }
      }
        public static void pointer(Point a,Point b){
         try {
             double sum = (a.x-b.x)/(a.y-b.y);
         }catch (ArithmeticException e){
             System.out.println("You can not make it illegal");
         }catch (NullPointerException e){
             System.out.println("You can not make it illegal");
         }
        }
     }

