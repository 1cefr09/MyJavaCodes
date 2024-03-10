package atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Description:
 * ʹ��ʵ��Runnable�ӿڵķ�ʽ��ʵ����Ʊ��--->�����̰߳�ȫ����ġ�
 * ʹ��ͬ���������������Ʊ�е��̰߳�ȫ���⡣
 *
 * @Author �й��-�κ쿵
 * @Create 15:19
 * @Version 1.0
 */

class SaleTicket implements Runnable {
    int ticket = 100;
    Object obj = new Object();
    Dog dog = new Dog();

    @Override
    public void run() {
//        synchronized (this) {
            while (true) {

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//            synchronized (obj){ //obj:��Ψһ�ģ�yes
//            synchronized (dog){ //dog:��Ψһ�ģ�yes
            synchronized (this){ //this:��Ψһ�ģ�yes��������Ŀ�е�s

                if (ticket > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "��Ʊ��Ʊ��Ϊ��" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }


        }

    }
}

public class WindowTest {
    public static void main(String[] args) {

        SaleTicket s = new SaleTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();


    }
}

class Dog {

}
