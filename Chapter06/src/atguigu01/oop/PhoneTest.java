package atguigu01.oop;

import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 16:29
 */
public class PhoneTest {
    public static void main(String[] args) {
//        Scanner scann = new Scanner(System.in);
        Phone p1 = new Phone(); // 创建对象
        // 调用属性,格式: 对象.属性
        p1.name = "小米";
        p1.price = 1999;
        System.out.println("name=" + p1.name + ",price=" + p1.price);

        // 调用方法,格式: 对象.方法
        p1.call("张三");
        p1.sendMessage("有内鬼,终止交易");
        p1.playGame();
    }
}
