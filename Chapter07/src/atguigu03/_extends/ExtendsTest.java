package atguigu03._extends;

/**
 * ClassName: ExtendsTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:09
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tony";
//        p1.age = 12;
        p1.eat();

        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "Tom";
//        s1.age = 12;
        s1.eat();

        //���٣���ȡs1������ĸ���
        System.out.println(s1.getClass().getSuperclass());
        //���٣���ȡp1������ĸ���
        System.out.println(p1.getClass().getSuperclass());//java.lang.Object

    }
}
