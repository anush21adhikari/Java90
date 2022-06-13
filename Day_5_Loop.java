/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITRO
 */
public class Day_5_Loop {
    public static void main(String[] args) {
        int x=10;
        
        //for loop
          System.out.printf("\n\n\n For loop \n");
        for(int i=1; i<=x; i++)
        {
            System.out.printf("Anush %d \n", i);
        }
        
        // while loop
        System.out.printf("\n\n\n While loop \n");
        int a=1;
        while(a<=x)
        {
            System.out.println(a);
            a++;
        }
        
        
          System.out.printf("\n\n Do while loop \n");
          int b=1;
          do
          {  
              System.out.printf("do while loop %d \n",b);
              b++;
          }
          while(b<=20);         
          
          // break 
          int c=10;
          for(int i=1; i<=c;i++ )
          {
              if(i==5)
              {
                  break;
              }
              
              System.out.printf("Break Statement %d \n",i);
          }
                    
          //continue
           int d=10;
          for(int i=1; i<=d;i++ )
          {
              if(i==5 || i==7 || i==9)
              {
                  continue;
              }
              
              System.out.printf("Continue Statement %d \n", i);
          }         
          
          //for each loop
           System.out.printf("\nFor each loop \n");
          int[] NewArray={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
          for(int e:NewArray)
          {
             System.out.println(e);
          }
    }
    
}
