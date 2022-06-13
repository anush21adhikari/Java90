/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_4_Array {
    public static void main(String[] args) {
        char[] name={'a','n','u','s','h'};
        System.out.println(name);
        System.out.println(name[1]);
        
        for(int i=0; i<name.length;i++)
        {
            System.out.println(name[i]);
        }
        
        float[] num={1,2,3,4,5,6,7,8,9,10};
        float Total=0;
        for(int i=0; i<num.length;i++)
        {
            Total += num[i];
        }
        System.out.println(Total);
        
        int num1= (int) Total; //narrowint type casting
        System.out.println(num1);
        
        
         System.out.println("for each");
        for (float f: num)
        { 
            int x= (int)f;
            System.out.println(x);
        }
         System.out.println("for each add");
         float forAdd=0;
         for(float add:num)
         {
              forAdd += add; 
         }
         
         System.out.println(forAdd);
         
         String[] stuName={"Anush","Asmita","Balram","Uma"};
         for(String Students:stuName)
         {
             System.out.println(Students);
         }
    }
}
