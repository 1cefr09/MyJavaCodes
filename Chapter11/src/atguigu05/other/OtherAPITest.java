package atguigu05.other;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * ClassName: OtherAPITest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:00
 * @Version 1.0
 */
public class OtherAPITest {
    @Test
    public void test1() {
        String javaVersion = System.getProperty("java.version");
        System.out.println("java��version:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java��home:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os��name:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os��version:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("user��name:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("user��home:" + userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("user��dir:" + userDir);
    }

    @Test
    public void test2() {
        Runtime runtime = Runtime.getRuntime();
        long initialMemory = runtime.totalMemory(); //��ȡ�������ʼ��ʱ���ڴ�����
        long maxMemory = runtime.maxMemory(); //��ȡ����������ڴ�����
        String str = "";
        //ģ��ռ���ڴ�
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long freeMemory = runtime.freeMemory(); //��ȡ���ж��ڴ�����

        System.out.println("���ڴ棺" + initialMemory / 1024 / 1024 * 64 + "MB");
        System.out.println("���ڴ棺" + maxMemory / 1024 / 1024 * 4 + "MB");
        System.out.println("�����ڴ棺" + freeMemory / 1024 / 1024 + "MB") ;
        System.out.println("�����ڴ棺" + (initialMemory-freeMemory) / 1024 / 1024 + "MB");
    }

    @Test
    public void test3(){
        //���ɣ�floor(x + 0.5)
        System.out.println(Math.round(12.3));//12
        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(-12.3));//-12
        System.out.println(Math.round(-12.6));//-13
        System.out.println(Math.round(-12.5));//-12
    }

    @Test
    public void test4(){
//        long bigNum = 123456789123456789123456789L;

        BigInteger b1 = new BigInteger("12345678912345678912345678");
        BigInteger b2 = new BigInteger("78923456789123456789123456789");

        //System.out.println("�ͣ�" + (b1+b2));//����ģ��޷�ֱ��ʹ��+�������

        System.out.println("�ͣ�" + b1.add(b2));
        System.out.println("����" + b1.subtract(b2));
        System.out.println("�ˣ�" + b1.multiply(b2));
        System.out.println("����" + b2.divide(b1));
        System.out.println("�ࣺ" + b2.remainder(b1));
    }

    @Test
    public void test5(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);
        // System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void test6(){
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);

        int j = random.nextInt(10); //�����ȡ[0,10)��Χ������
        System.out.println(j);
    }
}
