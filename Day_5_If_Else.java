/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_5_If_Else {
    
    public static void main(String[] args) {
        
        System.out.println("------------if statement------------");
        int x= 2;
        if(x%2==0)
        {
           System.out.println("Even number using if");
        }
        System.out.printf("\n\n-----------if else---------\n");
        int num= (int)(Math.random()*100);
        if(num%2==0)
        {
             System.out.printf("%d is even number", num);
        }
        else
        {
            System.out.printf("%d is odd number", num);
        }
        
        
        
        System.out.printf("\n\n-----------else if---------\n");
        int mark= (int)(Math.random()*100);
        if(mark>=90)
        {
             System.out.printf("You have obtain %d mark (A+)", mark);
        }
        else if(mark >=80 && mark <90)
        {
          System.out.printf("You have obtain %d mark (A)", mark);
        }
         else if(mark >=70 && mark <80)
        {
          System.out.printf("You have obtain %d mark (B+)", mark);
        }
        
         else if(mark >=60 && mark <70)
        {
          System.out.printf("You have obtain %d mark (B)", mark);
        }
        
         else if(mark >=50 && mark <60)
        {
          System.out.printf("You have obtain %d mark (C+)", mark);
        }
        
         else if(mark >=40 && mark <50)
        {
          System.out.printf("You have obtain %d mark (C)", mark);
        }
        else
         {
             System.out.printf("You have obtain below 40 mark (%d). So poor", mark);
         }
        
        
        
        
        System.out.println("\ns-----------Nested if else-------------");
        int num1=(int)(Math.random()*100);
     
        if(num1>50)
        {
            if(num1>80)
            {
                System.out.println("Above  80");
            }
            else
            {
                if(num1>70)
                {
                    System.out.println("Above 70");
                }
                else
                {
                    if(num1>60)
                    {
                        System.out.println("Above 60");
                    }
                    else
                    {
                        System.out.println("Between 50 and 60");
                    }
                }
            }
        }
        else
        {
            System.out.println("Below 50");
        }
        
    
    System.out.println("\n---------------Switch-------------\n");
    int SwitchNum=(int)(Math.random()*10);
    
    
    switch(SwitchNum%2)
            {
                case 0:
                    System.out.printf("%d is even number", SwitchNum);
                    break;
                   
                    
                case 1:
                    System.out.printf("%d is odd number", SwitchNum);
                    break;
            }
       
    }
    

}
