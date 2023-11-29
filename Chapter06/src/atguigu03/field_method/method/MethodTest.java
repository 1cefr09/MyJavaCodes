

package atguigu03.field_method.method;

/**
 * @author 尚硅谷-宋红康
 * @create 19:01
 */
public class MethodTest {
    public static void main(String[] args) {

    }
}

class Person{
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少每天睡眠"+ hour +"个小时");
    }

    public String interests(String hobby){
        String info= "我的爱好是：" + hobby;
        System.out.println(info);
        return info;
    }
}