package atguigu03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 11:47
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    * Date���ʹ��
    *
    * |--java.util.Date
    *   > ������������ʹ��
    *   > ����������ʹ�ã���toString() �� long getTime()
    *       |----java.sql.Date: ��Ӧ�����ݿ��е�date����
    *
    * */
    @Test
    public void test1(){
        Date date1 = new Date(); //����һ�����ڵ�ǰϵͳʱ���Date��ʵ��
        System.out.println(date1.toString());//Mon Dec 05 11:56:26 CST 2022

        long milliTimes = date1.getTime();
        System.out.println("��Ӧ�ĺ�����Ϊ��" + milliTimes); //1670212256045

        Date date2 = new Date(1710243114465L); //����һ������ָ��ʱ�����Date��ʵ��
        System.out.println(date2.toString());
    }
    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1710243114465L);
        System.out.println(date1.toString());//2013-06-03

        System.out.println(date1.getTime());//1370202256045
    }

    /*
    * SimpleDateFormat�ࣺ��������ʱ��ĸ�ʽ���ͽ���
    *
    * ��ʽ��������--->�ַ���
    * �������ַ��� ---> ����
    *
    * */
    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        //��ʽ��������--->�ַ���
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);//2024/3/12 ����7:37

        //�������ַ��� ---> ����
        Date date2 = sdf.parse("2024/3/12 ����7:37");
        System.out.println(date2);
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //��ʽ��������--->�ַ���
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);//2022-12-05 14:27:19

        //�������ַ��� ---> ����
        Date date2 = sdf.parse("2022-12-05 14:27:19");
        System.out.println(date2);

        //����ʧ�ܡ���Ϊ�������ַ���������SimpleDateFormat����ʶ��ĸ�ʽ��
//        Date date3 = sdf.parse("22-12-5 ����2:21");
//        System.out.println(date2);
    }

    /*
    * Calendar:������
    * �� ʵ���� ����Calendar��һ�������࣬����������Ҫ�����������ʵ������������ͨ��Calendar�ľ�̬����
    *          getInstance()���ɻ�ȡ
    *
    * �ڳ��÷�����get(int field) / set(int field,xx) / add(int field,xx) / getTime() / setTime()
    * */

    @Test
    public void test5(){
        Calendar calendar = Calendar.getInstance();

//        System.out.println(calendar.getClass());

        //���Է���
        //get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set(int field,xx)
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field,xx)
        calendar.add(Calendar.DAY_OF_MONTH,3);
        calendar.add(Calendar.DAY_OF_MONTH,-5);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime():Calender --> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():ʹ��ָ��Date����Calendar
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
