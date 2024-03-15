package atguigu03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 15:33
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    * - �ɱ��ԣ������ں�ʱ����������Ӧ���ǲ��ɱ�ġ�
     - ƫ���ԣ�Date�е�����Ǵ�1900��ʼ�ģ����·ݶ���0��ʼ��
     - ��ʽ������ʽ��ֻ��Date���ã�Calendar���С�
     - ���⣬����Ҳ�����̰߳�ȫ�ģ����ܴ�������ȡ�
    *
    * */
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = s1.replace('l', 'w'); //String�Ĳ��ɱ���
        System.out.println(s1);//hello
        //���Calendar�Ŀɱ���
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void test2(){
        //ƫ���ԣ�Date�е�����Ǵ�1900��ʼ�ģ����·ݶ���0��ʼ��
        Date date = new Date(2022,11,14);
        System.out.println(date);
    }

    /*
    * JDK8��api:LocalDate \ LocalTime \ LocalDateTime
    * */
    @Test
    public void test3(){
        //now():��ȡ��ǰ���ں�ʱ���Ӧ��ʵ��
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);//2022-12-05
        System.out.println(localTime);//15:43:51.474
        System.out.println(localDateTime); //2022-12-05T15:43:51.475

        //of():��ȡָ�������ڡ�ʱ���Ӧ��ʵ��
        LocalDate localDate1 = LocalDate.of(2021, 5, 23);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 5, 11, 23, 45);
        System.out.println(localDate1);
        System.out.println(localDateTime1);

        //getXXX()
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());
        //���ֲ��ɱ���
        //withXxx()
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(15);
        System.out.println(localDateTime2);//2022-12-05T15:48:48.399
        System.out.println(localDateTime3);//2022-12-15T15:48:48.399
        //plusXxx()
        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System.out.println(localDateTime2);//2022-12-05T15:50:21.864
        System.out.println(localDateTime4);//2022-12-10T15:50:21.864

    }

    /*
    * JDK8��api: Instant
    * */
    @Test
    public void test4(){
        //now():
        Instant instant = Instant.now();
        System.out.println(instant);//2022-12-05T07:56:27.327Z
        //�˽⣺
        OffsetDateTime instant1 = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(24123123312L);
        System.out.println(instant2); //1970-10-07T04:52:03.312Z

        long milliTime = instant.toEpochMilli();
        System.out.println(milliTime);

        System.out.println(new Date().getTime());
    }

    /*
    * JDK8��api: DateTimeFormatter
    * */
    @Test
    public void test5(){
        //�Զ���ĸ�ʽ���磺ofPattern(��yyyy-MM-dd hh:mm:ss��)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        //��ʽ�������ڡ�ʱ��-->�ַ���
        LocalDateTime localDateTime = LocalDateTime.now();
        String strDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println(strDateTime);//2022/12/05 16:04:44

        //�������ַ��� ---> ���ڡ�ʱ��
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2022/12/05 15:04:44");
        LocalDateTime localDateTime1 = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime1);//2022-12-05T15:04:44

    }
}
