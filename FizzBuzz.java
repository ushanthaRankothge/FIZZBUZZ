/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UR
 */
public class FizzBuzz 
{    
 public void fizzbuzz(int n)
 {
 for (int i = 1; i <= n; i++)
 {
 if (i % 3 == 0 && i % 5 ==0)
 {
 System.out.println("FizzBuzz");
 } else if (i % 3 == 0){
     System.out.println("fizz");
 }
 else if (i % 5 == 0)
 {
 System.out.println("buzz");
 } else {
     System.out.println(i);
 }
 }
 }
 public static void main (String[] args) 
 {
 FizzBuzz fizz = new FizzBuzz();
 fizz.fizzbuzz(9);
 }
        
 }