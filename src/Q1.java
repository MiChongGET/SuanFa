import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/20.
 */
public class Q1 {
    public static void main(String[] args) {
        System.out.println("������һ������");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        maxOne(a);
    }

    public static void maxOne(int i) {
        char[] chars = Integer.toBinaryString(i).toCharArray();
        int count = 0,max=0;
        for (int j = 0; j <chars.length ; j++) {
//            String b = String.valueOf(chars[j]);
            if (chars[j]=='1'){
                count++;
            }
            else {
                count=0;
            }
            if (max<count){
                max=count;
            }
            System.out.println("countΪ��"+count);
        }
        System.out.println("��������1Ϊ: "+max);
    }
}
