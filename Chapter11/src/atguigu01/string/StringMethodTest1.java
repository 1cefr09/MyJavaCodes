package atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringMethodTest1
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 8:55
 * @Version 1.0
 */
public class StringMethodTest1 {
    /*
    *   ��1��boolean isEmpty()���ַ����Ƿ�Ϊ��
        ��2��int length()�������ַ����ĳ���
        ��3��String concat(xx)��ƴ��
        ��4��boolean equals(Object obj)���Ƚ��ַ����Ƿ���ȣ����ִ�Сд
        ��5��boolean equalsIgnoreCase(Object obj)���Ƚ��ַ����Ƿ���ȣ������ִ�Сд
        ��6��int compareTo(String other)���Ƚ��ַ�����С�����ִ�Сд������Unicode����ֵ�Ƚϴ�С
        ��7��int compareToIgnoreCase(String other)���Ƚ��ַ�����С�������ִ�Сд
        ��8��String toLowerCase()�����ַ����д�д��ĸתΪСд
        ��9��String toUpperCase()�����ַ�����Сд��ĸתΪ��д
        ��10��String trim()��ȥ���ַ���ǰ��հ׷�
        ��11��public String intern()������ڳ������й���
    *
    * */
    @Test
    public void test1(){
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        String s4 = null;
        System.out.println(s4.isEmpty());//����ָ���쳣

        String s5 = "hello";
        System.out.println(s5.length());//5
    }

    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = "HellO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abcd";
        String s4 = "adef";
        System.out.println(s3.compareTo(s4));

        String s5 = "abcd";
        String s6 = "aBcd";
        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareToIgnoreCase(s6));

        String s7 = "��ab";
        String s8 = "��cd";
        System.out.println(s7.compareTo(s8));

        String s9 = " he  llo   ";
        System.out.println("****" + s9.trim() + "*****");
    }

    /*
    *   ��11��boolean contains(xx)���Ƿ����xx
        ��12��int indexOf(xx)����ǰ�����ҵ�ǰ�ַ�����xx��������з��ص�һ�γ��ֵ��±꣬Ҫ��û�з���-1
        ��13��int indexOf(String str, int fromIndex)������ָ�����ַ����ڴ��ַ����е�һ�γ��ִ�����������ָ����������ʼ
        ��14��int lastIndexOf(xx)���Ӻ���ǰ�ҵ�ǰ�ַ�����xx��������з������һ�γ��ֵ��±꣬Ҫ��û�з���-1
        ��15��int lastIndexOf(String str, int fromIndex)������ָ�����ַ����ڴ��ַ��������һ�γ��ִ�����������ָ����������ʼ����������
    *
    * */
    @Test
    public void test3(){
        String s1 = "�����й�Ƚ���";
        System.out.println(s1.contains("���"));

        System.out.println(s1.indexOf("����"));
        System.out.println(s1.indexOf("����",1));

        System.out.println(s1.lastIndexOf("����"));
        System.out.println(s1.lastIndexOf("����",4));
    }
    /*
    *   ��16��String substring(int beginIndex) ������һ���µ��ַ��������Ǵ��ַ����Ĵ�beginIndex��ʼ��ȡ������һ�����ַ�����
        ��17��String substring(int beginIndex, int endIndex) ������һ�����ַ��������Ǵ��ַ�����beginIndex��ʼ��ȡ��endIndex(������)��һ�����ַ�����
    * */
    @Test
    public void test4(){
        String s1 = "�����й�Ƚ���";
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));//[2,5)
    }

    /*
    * ��18��char charAt(index)������[index]λ�õ��ַ�
    ��19��char[] toCharArray()�� �����ַ���ת��Ϊһ���µ��ַ����鷵��
    ��20��static String valueOf(char[] data)  ������ָ�������б�ʾ���ַ����е� String
    ��21��static String valueOf(char[] data, int offset, int count) �� ����ָ�������б�ʾ���ַ����е� String
    ��22��static String copyValueOf(char[] data)�� ����ָ�������б�ʾ���ַ����е� String
    ��23��static String copyValueOf(char[] data, int offset, int count)������ָ�������б�ʾ���ַ����е� String
    * ��24��boolean startsWith(xx)�����Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
      ��25��boolean startsWith(String prefix, int toffset)�����Դ��ַ�����ָ��������ʼ�����ַ����Ƿ���ָ��ǰ׺��ʼ
     ��26��boolean endsWith(xx)�����Դ��ַ����Ƿ���ָ���ĺ�׺����
    * */
    @Test
    public void test5(){
        String s1 = "�����й�Ƚ���";
        System.out.println(s1.charAt(2));

        String s2 = String.valueOf(new char[]{'a', 'b', 'c'});
        String s3 = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2 == s3);

        System.out.println(s1.startsWith("����a"));
        System.out.println(s1.startsWith("����",5));

    }

    /*
    * ��27��String replace(char oldChar, char newChar)������һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �õ��ġ� ��֧������
    ��28��String replace(CharSequence target, CharSequence replacement)��ʹ��ָ��������ֵ�滻�����滻���ַ�������ƥ������ֵĿ�����е����ַ�����
    ��29��String replaceAll(String regex, String replacement)��ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ�����
    ��30��String replaceFirst(String regex, String replacement)��ʹ�ø����� replacement �滻���ַ���ƥ�������������ʽ�ĵ�һ�����ַ�����
    * */
    @Test
    public void test6(){
        String s1 = "hello";
        String s2 = s1.replace('l', 'w');
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.replace("ll", "wwww");
        System.out.println(s3);

    }
}
