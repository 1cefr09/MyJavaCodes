package atguigu06.polymorphism;

/**
 * ClassName: PersonTest1
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 17:03
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
        //����ֱ�ӵ����������еĽṹ
//        p1.earnMoney();
//        System.out.println(p1.isSmoking);
//

        //����ת�ͣ�ʹ��ǿת����
        Man m1 = (Man)p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        System.out.println(m1 == p1);//true,p1��m1ָ��ѿռ��е�ͬһ������

        /*
        * ����ת�Ϳ��ܻ���֣�����ת���쳣��ClassCastException��
        * */
        Person p2 = new Woman();
//        Man m2 = (Man)p2;
//        m2.earnMoney();

        /*
        * 1. ����������ת��֮ǰ��ʹ��instanceof�����жϣ������������ת���쳣
        * 2. ��ʽ�� a instanceOf A : �ж϶���a�Ƿ�����A��ʵ����
        * 3. ���a instanceOf A ����true����
        *       a instanceOf superA ����Ҳ��true�����У�A ��superA�����ࡣ
        * */
        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.earnMoney();
        }

        if(p2 instanceof Woman){
            System.out.println("Woman");
        }

        if(p2 instanceof Person){
            System.out.println("Person");
        }
        if(p2 instanceof Object){
            System.out.println("Object");
        }

    }
}
