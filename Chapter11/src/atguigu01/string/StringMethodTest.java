package atguigu01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:49
 * @Version 1.0
 */
public class StringMethodTest {

    /*
    * String��������ʹ��
    * */
    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);

    }

    /*
    * String�볣���������ṹ֮���ת��
    *
    * 1. String������������͡���װ��֮���ת������ϰ��
    *
    * 2. String��char[]֮���ת��
    *
    * 3. String��byte[]֮���ת�����Ѷȣ�
    * */
    @Test
    public void test2(){
        int num = 10;
        //������������ ---> String
        //��ʽ1��
        String s1 = num + "";
        //��ʽ2��
        String s2 = String.valueOf(num);

        //String --> ������������:���ð�װ���parseXxx(String str)
        String s3 = "123";
        int i1 = Integer.parseInt(s3);

    }
    //String��char[]֮���ת��
    @Test
    public void test3(){
        String str = "hello";
        //String -->char[]:����String��toCharArray()
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char[] ---> String:����String�Ĺ�����
        String str1 = new String(arr);
        System.out.println(str1);//hello

    }

    //String��byte[]֮���ת�����Ѷȣ�
    /*
    * ��utf-8�ַ����У�һ������ռ��3���ֽڣ�һ����ĸռ��1���ֽڡ�
    * ��gbk�ַ����У�һ������ռ��2���ֽڣ�һ����ĸռ��1���ֽڡ�
    *
    * utf-8��gbk�����¼�����ascii�롣
    *
    * ��������룺
    *   ���룺String ---> �ֽڻ��ֽ�����
    *   ���룺�ֽڻ��ֽ����� ----> String
    * Ҫ�󣺽���ʱʹ�õ��ַ������������ʱʹ�õ��ַ���һ�£���һ�£��ͻ����롣
    *
    * */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc�й�");

        //String -->byte[]:����String��getBytes()
        byte[] arr = str.getBytes(); //ʹ��Ĭ�ϵ��ַ���:utf-8
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        //getBytes(String charsetName):ʹ��ָ�����ַ���
        byte[] arr1 = str.getBytes("gbk");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //byte[] ---> String:
        String str1 = new String(arr); //ʹ��Ĭ�ϵ��ַ�����utf-8
        System.out.println(str1);

        String str2 = new String(arr,"utf-8");//��ʽ��ָ��������ַ�����utf-8
        System.out.println(str2);

        //����
//        String str3 = new String(arr,"gbk");//��ʽ��ָ��������ַ�����gbk
//        System.out.println(str3);

        String str4 = new String(arr1,"gbk");
        System.out.println(str4);
    }

}
