package atguigu02.iterator;

import atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: IteratorTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:10
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));

        //��ȡ����������
        Iterator iterator = coll.iterator();
//        System.out.println(iterator.getClass());

        //��ʽ1��
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        System.out.println(iterator.next());//��������˼�����Ԫ�صĸ������ᱨNoSuchElementException�쳣

        //��ʽ2��
//        for(int i = 0;i < coll.size();i++){
//            System.out.println(iterator.next());
//        }

        //��ʽ3���Ƽ�
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));

        //��ʽ1������ı���
//        Iterator iterator = coll.iterator();
//
//        while((iterator.next()) != null){
//            System.out.println(iterator.next());
//        }

        //��ʽ2������ı���
        //ÿ�ε���coll.iterator()�����᷵��һ���µĵ���������
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }
    }
}
