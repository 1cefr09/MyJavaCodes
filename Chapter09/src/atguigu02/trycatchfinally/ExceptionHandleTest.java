package atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author �й��-�κ쿵
 * @create 11:50
 */
public class ExceptionHandleTest {

    @Test
    public void test1(){
        try{
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);

        }catch(NullPointerException e){
            System.out.println("������NullPointerException���쳣");
        }catch(InputMismatchException e){
            System.out.println("������InputMismatchException���쳣");
        }catch(RuntimeException e){
            System.out.println("������RuntimeException���쳣");
        }

        System.out.println("�쳣����������������ִ��...");
    }



    @Test
    public void test2(){
        try{
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch(NumberFormatException e){
            e.printStackTrace();
            //��
//            System.out.println(e.getMessage());
        }

        System.out.println("�������");
//        System.out.println(str);

    }

    //******************�������������ʱ�쳣***************************
    @Test
    public void test3() {
        try{

            File file = new File("D:\\hello.txt");

            FileInputStream fis = new FileInputStream(file); //���ܱ�FileNotFoundException

            int data = fis.read(); //���ܱ�IOException
            while(data != -1){
                System.out.print((char)data);
                data = fis.read(); //���ܱ�IOException
            }

            fis.close(); //���ܱ�IOException
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("��ȡ���ݽ���....");
    }

}
