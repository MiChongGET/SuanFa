import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/18.
 */
public class StringDemo {
    public static void main(String[] args) {
//        String s1 = "helloworld";
//        String s2 = "helloworld";
//        String s3 = "Helloworld";
//        String s4 = "hellow";
//        System.out.println(s1.equalsIgnoreCase(s3));
//        System.out.println(s1.substring(2));
//        System.out.println(s1.compareTo(s4));
//

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("������һ���ַ���:");
//        String a = scanner.nextLine();
//        //System.out.println("��ת֮����ַ���Ϊ��"+MyReverse(a));
//
//        //System.out.println("��"+SameNum(a)+"��a");
//
//        String max = a;
//        System.out.println("������Ҫ���ҵ��ַ���");
//        String min = scanner.nextLine();
//        System.out.println(min+"����"+getCount(max,min)+"��");


        Scanner  scanner = new Scanner(System.in);
        System.out.println("�������ַ�����");
        System.out.println("�Ƿ��ǶԳ��ַ�:"+isSame(scanner.next()));

    }

    //�ַ�����ת����
    public static String MyReverse(String s){
        String result="";
        char[] b = s.toCharArray();
        for (int i =b.length-1;i>=0;i--) {
            result+= b[i];
        }
        return result;
    }

    public static String SameNum(String s){
        int num = 0;
        for ( int i =0;i<s.length();i++ )
        {
            // ��ȡÿ���ַ����ж��Ƿ����ַ�a
            if (s.charAt(i)=='a') {
                // �ۼ�ͳ�ƴ���
                num++;
            }
        }

        return (num+"");
    }

    //�����ַ���
    public static int getCount(String max,String min){
        int count = 0;
        //���ҵ�һ�γ��ֵ�λ��
        int first = max.indexOf(min);

        while (first!=-1){
            count++;
            int startIndex = first+min.length();
            max = max.substring(startIndex);
            first = max.indexOf(min);
        }
        return count;
    }

    //�ж��Ƿ��ǶԳ��ַ���
//    public static boolean isSame(String s){
//        char[] chars = s.toCharArray();
//        for (int start = 0,end = chars.length-1; start <end ; start++,end--) {
//            if (chars[start]!=chars[end]){
//                return false;
//            }
//        }
//        return true;
//    }


    public static boolean isSame(String s){

        //ʹ�û��弼��
//        boolean flag = true;
//        StringBuffer sb = new StringBuffer(s);
//        if (s.equals(sb.reverse())){
//            flag=false;
//        }
//        return flag;

        //��������

        return new StringBuffer(s).reverse().toString().equals(s);

    }



}
