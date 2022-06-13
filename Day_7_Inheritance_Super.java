/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_7_Inheritance_Super {
    
    public int Addition(int x, int y)
    {
        return x+y;
    }
    
    public int Subtraction(int x, int y)
    {
        return Math.abs(x-y);
    }
     public int Multiplication(int x, int y)
    {
        return x*y;
    }
    
     
     
     int x;
      
     Day_7_Inheritance_Super(int x)
     {
         this.x=x;
     }
     
      Day_7_Inheritance_Super()
     {
        
     }
     public void getX()
     {
         System.out.printf("the value of x is %d",x);
     }
     // use of super and sub keywords
     
     public void Display()
     {
         System.out.println("I am the display  method from main class");
     }
     
     String name ="main class name";
}
