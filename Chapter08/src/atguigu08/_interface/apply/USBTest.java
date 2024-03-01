package atguigu08._interface.apply;

/**
 * ClassName: USBTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:49
 * @Version 1.0
 */
public class USBTest {

    public static void main(String[] args) {

        //1.�����ӿ�ʵ����Ķ���
        Computer computer =  new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);

        //2.�����ӿ�ʵ�������������
        computer.transferData(new Camera());
        System.out.println();

        //3.�����ӿ�����ʵ����Ķ���
        USB usb1 = new USB(){
            public void start(){
                System.out.println("U�̿�ʼ����");
            }
            public void stop(){
                System.out.println("U�̽�������");
            }
        };
        computer.transferData(usb1);

        //4. �����ӿ�����ʵ�������������

        computer.transferData(new USB(){
            public void start(){
                System.out.println("ɨ���ǿ�ʼ����");
            }
            public void stop(){
                System.out.println("ɨ���ǽ�������");
            }
        });

    }

}

class Computer{

    public void transferData(USB usb){ //��̬��USB usb = new Printer();
        System.out.println("�豸���ӳɹ�....");
        usb.start();

        System.out.println("���ݴ����ϸ�ڲ���....");

        usb.stop();
    }

}

class Camera implements USB{

    @Override
    public void start() {
        System.out.println("�������ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("�������������");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("��ӡ����ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("��ӡ����������");
    }
}

interface USB{
    //��������
    //USB�ĳ������ߡ�...


    //����
    public abstract void start();
    void stop();
}
