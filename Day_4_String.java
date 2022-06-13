/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_4_String {
    public static void main(String[] args) {
        char[] stringArray={'a','n','u','s','h'};
        String stringObject= new String(stringArray); //object of java String class
        System.out.println(stringObject);
        System.out.println(stringArray);
        
         System.out.println("The lengeth of the Array stringArray is "+stringObject.length()); //length method
         
         String fName="Anush";
         String lName=" Adhikari";
         
         System.out.println(fName.concat(lName));
         
         //formatted string
         int age=22;
         System.out.printf("hello i am %s"
                 + " my cast is %s"
                 + " i am %d year old "
                 ,fName,lName, age);
         
         /*
         String details;
         details= String.format("hello i am %s"
                             + " i am %d year old "
                             + " my cast is %s"
                             ,fName,lName, age);
         System.out.println(details);
         S*/
    }
    
}
