package atguigu02.singleton;

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:04
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);

    }
}

//����ʽ
class Bank{

    //1. ��Ĺ�����˽�л�
    private Bank(){

    }

    //2. ������ڲ�������ǰ���ʵ��
    //4. ������Ҳ��������Ϊstatic��
    private static Bank instance = new Bank();

    //3. ʹ��getXxx()������ȡ��ǰ���ʵ������������Ϊstatic��
    public static Bank getInstance(){
        return instance;
    }

}
