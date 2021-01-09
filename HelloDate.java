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

class shape{
    shape() {
        System.out.println("this is shape constructor");
    }
}

class circle extends shape{
    circle() {
        System.out.println("this is circle constructor");
    }
}

public class HelloDate {
    int count = 1;
    public static void main(String[] args){
        // System.out.print("Hello, it's: ");
        // System.out.println(new Date());
        // person Jason = new person();

        // float f[] = new float[10];
        // Random rod = new Random();
        // for (int i = 0; i < 10; ++i)
        // {
        //     f[i] = rod.nextFloat();
        // }
        // for (float x: f)
        // {
        //     System.out.print(x + " ");
        // }
        // label1:
        // for (int i = 0; i < 3; i++)
        // {
        //     for (int j = 0; j < 3; ++j)
        //     {
        //         System.out.println("i is: " + i + ", j is: " + j);
        //         if (1 == j)
        //         {
        //             break label1;
        //         }
        //     }
        // }
        // circle tes = new circle();
        // tes = null;
        // System.gc();
        Day day = Day.FRIDAY;
        if (day == Day.FRIDAY)
        {
            System.out.println("successful test for enum class");
        }
        shape tos = new shape();
        System.out.println(tos);
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
