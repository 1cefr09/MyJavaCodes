package atguigu04.compare.comparator;

import atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:57
 * @Version 1.0
 */
public class ComparatorTest {

    @Test
    public void test1(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaweiMate50pro",6299);
        arr[1] = new Product("Xiaomi13pro",4999);
        arr[2] = new Product("VivoX90pro",5999);
        arr[3] = new Product("Iphone14ProMax",9999);
        arr[4] = new Product("HonorMagic4",6299);

        //����һ��ʵ����Comparator�ӿڵ�ʵ����Ķ���
        Comparator comparator = new Comparator(){

            //����ж���������o1,o2�Ĵ�С�����׼���Ǵ˷����ķ�����Ҫ��д���߼���
            //���磺���ռ۸�Ӹߵ�������
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){

                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return -Double.compare(p1.getPrice(),p2.getPrice());

                }

                throw new RuntimeException("���Ͳ�ƥ��");

            }
        };


        Comparator comparator1 = new Comparator(){

            //����ж���������o1,o2�Ĵ�С�����׼���Ǵ˷����ķ�����Ҫ��д���߼���
            //���磺����name�ӵ͵�������
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){

                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return p1.getName().compareTo(p2.getName());
                }

                throw new RuntimeException("���Ͳ�ƥ��");

            }
        };

        Arrays.sort(arr,comparator1);


        //����󣬱���
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    @Test
    public void test2(){
        String[] arr = new String[]{"Tom","Jerry","Tony","Rose","Jack","Lucy"};

        Arrays.sort(arr,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 =(String) o1;
                    String s2 =(String) o2;

                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("���Ͳ�ƥ��");
            }
        });

        //����󣬱���
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
