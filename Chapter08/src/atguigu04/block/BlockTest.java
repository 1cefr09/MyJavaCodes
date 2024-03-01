package atguigu04.block;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author ÉĞ¹è¹È-ËÎºì¿µ
 * @Create 10:01
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        System.out.println(Person.info);


        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);//1
//        p1.eat();
    }
}

class Person{

    String name;
    int age;

    static String info = "ÎÒÊÇÒ»¸öÈË";

    public void eat(){
        System.out.println("ÈË³Ô·¹");
    }

    public Person(){}

    //·Ç¾²Ì¬´úÂë¿é
    {
        System.out.println("·Ç¾²Ì¬´úÂë¿é2");
    }
    {
        System.out.println("·Ç¾²Ì¬´úÂë¿é1");
        age = 1;
        System.out.println("info = " + info);
    }


    //¾²Ì¬´úÂë¿é
    static{
        System.out.println("¾²Ì¬´úÂë¿é2");
    }
    static{
        System.out.println("¾²Ì¬´úÂë¿é1");
        System.out.println("info = " + info);
//        System.out.println("age = " + age);
//        eat();
    }



}
