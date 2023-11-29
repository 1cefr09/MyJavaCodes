package atguigu02.memory;

/**
 * Perosn类对应的测试类
 *
 * @author 尚硅谷-宋红康
 * @create 14:38
 */
public class PersonTest {
    public static void main(String[] args) {
        // 1. 创建Person类的对象
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 24;
        p1.gender = '男';
        System.out.println("name="+p1.name+",age="+p1.age+",gender="+p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interests("游泳");

        // 2. 创建第二个Person类的对象
        Person p2 = new Person();
        p2.name = "Rose";
        p2.age=18;
        p2.gender='女';
        System.out.println("name="+p2.name+",age="+p2.age+",gender="+p2.gender);

    }
}
