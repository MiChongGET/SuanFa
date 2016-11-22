import com.sun.javafx.fxml.expression.Expression;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/22.
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个手机号:");
        String a = s.nextLine();
//        System.out.println(checkQQ(a));
        System.out.println(TelNum(a));
    }

    public static boolean checkQQ(String s){
//        boolean flag = true;
//
//        if (s.length()>=5&&s.length()<=12){
//            if (!s.startsWith("0")){
//                char[] chars = s.toCharArray();
//                for (int i = 0; i <chars.length-1 ; i++) {
//                    if (!Character.isDigit(chars[i])){
//                        flag = false;
//                        break;
//                    }
//                }
//            }else{
//                flag = false;
//            }
//        }else{
//                flag = false;
//        }
//        return flag;


        return s.matches("[0-9]{5,15}");
    }

    public static  boolean TelNum(String s){

        return s.matches("1[38]\\d{9}");
    }
}
