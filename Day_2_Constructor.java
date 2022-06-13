
public class Day_2_Constructor {
    
    final int x=50;
    int age;
    long phone;
    String name, address;
    
    public Day_2_Constructor()
    {
      // x=100;
    }

    
    //paramerized constructor 
    public Day_2_Constructor(int y)
    {
      //  this.x=y;
    }
     
    public Day_2_Constructor (String name, int age, String address, long phone)
    {
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
    }
    public static void main(String[] args) {
        
        Day_2_Constructor obj1= new Day_2_Constructor();
        
        Day_2_Constructor obj2= new Day_2_Constructor(500);
        
        Day_2_Constructor obj3= new Day_2_Constructor("Anush", 22, "Imadole TampoPark", 98431425);
        
        System.out.println("value form default constructor is "+ obj1.x);
        System.out.println("value form parameterized constructor is "+ obj2.x);
        System.out.println("My name is "+obj3.name+". I am from "+obj3.address+". I am "+obj3.age+" and my contact number is "+obj3.phone);
    }
}
