package atguigu05.communication;

/**
 * ClassName: ProducerConsumerTest
 * Description:
 *      ����2��������&������
 *      ������(Productor)����Ʒ������Ա(Clerk)����������(Customer)�ӵ�Ա��ȡ�߲�Ʒ����Աһ��ֻ�ܳ���
 *      �̶������Ĳ�Ʒ(����:20���������������ͼ��������Ĳ�Ʒ����Ա���������ͣһ�£���������п�λ�Ų�Ʒ
 *      ����֪ͨ�����߼����������������û�в�Ʒ�ˣ���Ա����������ߵ�һ�£���������в�Ʒ����֪ͨ��������
 *      ȡ�߲�Ʒ��
 *
 *      ������
 *      1. �Ƿ��Ƕ��߳����⣿ �ǣ������ߡ�������
 *      2. �Ƿ��й������ݣ��У� ���������ǣ���Ʒ
 *      3. �Ƿ����̰߳�ȫ���⣿ �У���Ϊ�й�������
 *      4. �Ƿ���Ҫ�����̰߳�ȫ���⣿�ǣ� ��δ���ʹ��ͬ������
 *      5. �Ƿ�����̼߳��ͨ�ţ� ���ڡ�
 *
 * @Author �й��-�κ쿵
 * @Create 10:32
 * @Version 1.0
 */

class Clerk{ //��Ա

    private int productNum = 0;//��Ʒ������

    //���Ӳ�Ʒ�����ķ���
    public synchronized void addProduct(){

        if(productNum >= 20){
            //�ȴ�
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            productNum++;
            System.out.println(Thread.currentThread().getName() + "�����˵�" + productNum + "����Ʒ");

            //����
            notifyAll();
        }

    }

    //���ٲ�Ʒ�����ķ���
    public synchronized void minusProduct(){

        if(productNum <= 0){

            //�ȴ�
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName() + "�����˵�" + productNum + "����Ʒ");
            productNum--;

            //����
            notifyAll();
        }



    }
}


class Producer extends Thread{  //������

    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while(true){
            System.out.println("�����߿�ʼ������Ʒ...");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.addProduct();

        }

    }
}
class Consumer extends Thread{ //������
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("�����߿�ʼ���Ѳ�Ʒ...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.minusProduct();

        }

    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer pro1 = new Producer(clerk);
        Consumer con1 = new Consumer(clerk);
        Consumer con2 = new Consumer(clerk);

        pro1.setName("������1");
        con1.setName("������1");
        con2.setName("������2");

        pro1.start();
        con1.start();
        con2.start();


    }
}
