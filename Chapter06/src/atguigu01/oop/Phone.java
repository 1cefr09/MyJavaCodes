package atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:26
 */
public class Phone {
    // 属性
    String name;
    double price;

    // 方法
    public void call(String name){
        System.out.println("手机能打电话");
    }

    public void sendMessage(String message){
        System.out.println(message);
    }

    public void playGame(){
        System.out.println("能玩游戏");
    }

}
