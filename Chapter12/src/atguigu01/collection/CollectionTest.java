package atguigu01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: CollectionTest
 * Description:
 *      ����Collection�з�����ʹ��
 *
 * @Author �й��-�κ쿵
 * @Create 11:23
 * @Version 1.0
 */
public class CollectionTest {
    /*
    *   ��1��add(Object obj)�����Ԫ�ض��󵽵�ǰ������
        ��2��addAll(Collection other)�����other�����е�����Ԫ�ض��󵽵�ǰ�����У���this = this �� other
    * */
    @Test
    public void test(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);//�Զ�װ��
        coll.add("�й��");
        coll.add(new Object());
        coll.add(new Person("Tom",12));

        System.out.println(coll);

        //addAll(Collection other)
        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(456);


        System.out.println(coll.size());//5

        coll.addAll(coll1);
//        coll.add(coll1);

        System.out.println(coll);

        //size():
        System.out.println(coll.size());//7


    }

    /*
    *  ��3��int size()����ȡ��ǰ������ʵ�ʴ洢��Ԫ�ظ���
        ��4��boolean isEmpty()���жϵ�ǰ�����Ƿ�Ϊ�ռ���
        ��5��boolean contains(Object obj)���жϵ�ǰ�������Ƿ����һ����obj����equals����true��Ԫ��
        ��6��boolean containsAll(Collection coll)���ж�coll�����е�Ԫ���Ƿ��ڵ�ǰ�����ж����ڡ���coll�����Ƿ��ǵ�ǰ���ϵġ��Ӽ���
        ��7��boolean equals(Object obj)���жϵ�ǰ������obj�Ƿ����
    * */

    @Test
    public void test2(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));

        //isEmpty()
        System.out.println(coll.isEmpty());

        //contains(Object obj)
        System.out.println(coll.contains("AA"));//true
        System.out.println(coll.contains(128));//true
        System.out.println(coll.contains(new String("�й��")));//true
        System.out.println(coll.contains(new Person("Tom",12)));//false-->true

        //containsAll(Collection coll)
        Collection coll1 = new ArrayList();

        //add()
        coll1.add("AA");
        coll1.add(128);
//        coll1.add("BB");

        System.out.println(coll.containsAll(coll1));
    }

    /*
    *   ��8��void clear()����ռ���Ԫ��
        ��9�� boolean remove(Object obj) ���ӵ�ǰ������ɾ����һ���ҵ�����obj����equals����true��Ԫ�ء�
        ��10��boolean removeAll(Collection coll)���ӵ�ǰ������ɾ��������coll��������ͬ��Ԫ�ء���this = this - this �� coll
        ��11��boolean retainAll(Collection coll)���ӵ�ǰ������ɾ�����������в�ͬ��Ԫ�أ�ʹ�õ�ǰ���Ͻ�������coll�����е�Ԫ����ͬ��Ԫ�أ�����ǰ�����н������������ϵĽ�������this  = this �� coll��
    *
    * */
    @Test
    public void test3(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));
        System.out.println(coll);
//        coll.clear();
//        System.out.println(coll);
//        System.out.println(coll.size());//0

        //remove(Object obj)
        coll.remove(new Person("Tom",12));

        coll.remove("AA");
        System.out.println(coll);

    }

    /*
    *  ��12��Object[] toArray()�����ذ�����ǰ����������Ԫ�ص�����
        ��13��hashCode()����ȡ���϶���Ĺ�ϣֵ
        ��14��iterator()�����ص������������ڼ��ϱ���
    * */
    @Test
    public void test4(){
        Collection coll = new ArrayList<>();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));

        //���� ---> ����
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        //hashCode():
        System.out.println(coll.hashCode());

    }

    @Test
    public void test5(){
        String[] arr = new String[]{"AA","BB","CC"};
        Collection list = Arrays.asList(arr);
        System.out.println(list);

        List list1 = Arrays.asList("AA", "BB", "CC", "DD");
        System.out.println(list1);
    }

    @Test
    public void test6(){
        Integer[] arr = new Integer[]{1,2,3};
        List list = Arrays.asList(arr);
        System.out.println(list.size());//3
        System.out.println(list);


        int[] arr1 = new int[]{1,2,3};
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size());//1
        System.out.println(list1);

    }

    @Test
    public void test7() {
        Collection coll = new ArrayList();

    }
}
