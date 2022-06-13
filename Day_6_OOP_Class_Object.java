/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_6_OOP_Class_Object {
    int x=100;
    Day_6_OOP_Class_Object(int y)
    {
        this.x=y;
    }
    public static void main(String[] args) {
        Day_6_OOP_Class_Object oopClass=new Day_6_OOP_Class_Object(0);  // creating object
        
        Day_6_OOP_Class_Object oopClass1=new Day_6_OOP_Class_Object(1); 
        Day_6_OOP_Class_Object oopClass2=new Day_6_OOP_Class_Object(2); 
        Day_6_OOP_Class_Object oopClass3=new Day_6_OOP_Class_Object(3); 
        
        System.out.println(oopClass.x);
        System.out.println(oopClass1.x);
        System.out.println(oopClass2.x);
        System.out.println(oopClass3.x);
        
        
         Day_4_Maths newObj= new  Day_4_Maths();
         System.out.println(newObj.multipleClass);
    }
   
}
