class money{
    money(){
        System.out.println("this is money test");
    }
    void getMoney(){
        System.out.println("get money");
    }
}
public class test{
    public static String name = "Yong Hao";
    public static String s = new String("top");
    public static int testMoney(String test_str){
        System.out.println(test_str);
        return test_str.length();
    }
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println(name);
        System.out.println(s);

        money fake_money = new money();
        fake_money.getMoney();
        int money_return = testMoney("this is a test");
        System.out.println(money_return);
    }
}