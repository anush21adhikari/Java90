
public class Day_4_Operator {
    public static void main(String[] args) {
        int x=5;
        System.out.println("initially x = " +x);
        int y=6;
        System.out.println(x==y);
        
        x++;// arithematic operator
        
        System.out.println("after increasing x by 1 x = " +x);
        
       
        System.out.println(x==y);
        String a = (x!=y)? "x is equal to y":"x is not equal to y";
        System.out.println(a);
        
    }
}
