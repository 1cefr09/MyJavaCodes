package atguigu08._interface.exer1;

/**
 * ClassName: EatableTest
 * Description:
 *  ����������EatableTest������Eatable���飬�洢�����˶��󣬲��������飬����eat()����
 * @Author �й��-�κ쿵
 * @Create 8:51
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];

        eatables[0] = new Chinese(); //��̬��
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();

        }
    }
}
