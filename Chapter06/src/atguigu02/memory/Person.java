package atguigu02.memory;

/**
 * @author 尚硅谷-宋红康
 * @create 14:31
 */

public class Person {
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少保证每天"+hour+"个小时的睡眠");
    }

    public void interests(String hobby){
        System.out.println("人的爱好是"+hobby);
    }
}
