package atguigu04.block;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author �й��-�κ쿵
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

    static String info = "����һ����";

    public void eat(){
        System.out.println("�˳Է�");
    }

    public Person(){}

    //�Ǿ�̬�����
    {
        System.out.println("�Ǿ�̬�����2");
    }
    {
        System.out.println("�Ǿ�̬�����1");
        age = 1;
        System.out.println("info = " + info);
    }


    //��̬�����
    static{
        System.out.println("��̬�����2");
    }
    static{
        System.out.println("��̬�����1");
        System.out.println("info = " + info);
//        System.out.println("age = " + age);
//        eat();
    }



}
