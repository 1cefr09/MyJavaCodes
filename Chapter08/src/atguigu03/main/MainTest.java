package atguigu03.main;

/**
 * ClassName: MainTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:35
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) { //��������
        String[] arr = new String[]{"AA","BB","CC"};
        Main.main(arr);
    }
}

class Main{

    public static void main(String[] args) { //��������ͨ�ľ�̬����
        System.out.println("Main��main()�ĵ���");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

}
