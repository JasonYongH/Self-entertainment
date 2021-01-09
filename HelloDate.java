import java.util.*;
/* a test class */
class person{
    int age;
    person(){
        System.out.println("this is the start of constructor method");
        System.out.println(age);
        age = 3;
        System.out.println(age);
        System.out.println("this is the end of constructor method");
    }
}
public class HelloDate {
    int count = 1;
    public static void main(String[] args){
        System.out.print("Hello, it's: ");
        System.out.println(new Date());
        person Jason = new person();
        Random rod = new Random();
        for (int i = 0; i < 100; ++i)
        {
            System.out.print(rod.nextInt(100) + " ");
        }
    }
}
