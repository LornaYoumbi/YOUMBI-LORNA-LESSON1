/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
      Account lorna = new Account("Happy Lorna");
      
      Account lorna1 = new Account();
      
      System.out.printf("Initial name is: %s%n%n", lorna.getName());
      System.out.println();
      
      System.out.println("Please enter the name:");
      
      String lornaAccountName = input.nextLine();
      
      lorna.setName(lornaAccountName);
      
      System.out.println();
      
      System.out.println ("Account Name is:" + lorna.getName());
      
      
      
      Date monday = new Date(23,10,2023);
      System.out.println();
      System.out.println("Month of today:" + monday.monthchar());
      System.out.println("Day:_" +monday.getDay() + "Month:_" +monday.monthchar()+"Year:_"+monday.getYear());
      
      
      System.out.print("\"Welcome to Java Programming\"");
      
      
    }
    
}




