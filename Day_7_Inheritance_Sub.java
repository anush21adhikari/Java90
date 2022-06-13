/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_7_Inheritance_Sub extends Day_7_Inheritance_Super {
    public int Division(int x, int y)
    {
       return  x/y;
    }
    
    
    
    
     public void Display()
     {
         System.out.println("I am the display  method from sub class");
     }
     
     String name ="sub class name";
     
     
     
     
     public void myMethod()
     {
      Day_7_Inheritance_Sub inObj= new Day_7_Inheritance_Sub();
      
      // sub class
      inObj.Display();
      
      //super class
      super.Display();
       System.out.println("value of the variable named num in super class: "+ inObj.name);
      System.out.println("value of the variable named num in super class: "+ super.name);
     }
     
     Day_7_Inheritance_Sub(int x)
     {
         super(x);
     }
     Day_7_Inheritance_Sub()
     {
        
     }
     
     
     
     
    public static void main(String[] args) {
       Day_7_Inheritance_Sub inheritObj= new Day_7_Inheritance_Sub();
        Day_7_Inheritance_Sub inheritObj1= new Day_7_Inheritance_Sub(4);
        System.out.println(inheritObj.Addition(5, 8));
        
        System.out.println(inheritObj.Subtraction(4, 6));
        System.out.println(inheritObj.Multiplication(3, 7));
        System.out.println(inheritObj.Division(21, 7));
        inheritObj.myMethod();
        inheritObj1.getX();
        
         
    }
    
}
