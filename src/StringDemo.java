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
//        System.out.println("请输入一个字符串:");
//        String a = scanner.nextLine();
//        //System.out.println("反转之后的字符串为："+MyReverse(a));
//
//        //System.out.println("有"+SameNum(a)+"个a");
//
//        String max = a;
//        System.out.println("请输入要查找的字符：");
//        String min = scanner.nextLine();
//        System.out.println(min+"共有"+getCount(max,min)+"个");


        Scanner  scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        System.out.println("是否是对称字符:"+isSame(scanner.next()));

    }

    //字符串反转功能
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
            // 获取每个字符，判断是否是字符a
            if (s.charAt(i)=='a') {
                // 累加统计次数
                num++;
            }
        }

        return (num+"");
    }

    //查找字符串
    public static int getCount(String max,String min){
        int count = 0;
        //查找第一次出现的位置
        int first = max.indexOf(min);

        while (first!=-1){
            count++;
            int startIndex = first+min.length();
            max = max.substring(startIndex);
            first = max.indexOf(min);
        }
        return count;
    }

    //判断是否是对称字符：
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

        //使用缓冲技术
//        boolean flag = true;
//        StringBuffer sb = new StringBuffer(s);
//        if (s.equals(sb.reverse())){
//            flag=false;
//        }
//        return flag;

        //方法二：

        return new StringBuffer(s).reverse().toString().equals(s);

    }



}
