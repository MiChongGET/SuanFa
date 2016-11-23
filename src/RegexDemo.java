import com.sun.javafx.fxml.expression.Expression;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/22.
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("ÇëÊäÈëÒ»¸öÊÖ»úºÅ:");
//        String a = s.nextLine();
////        System.out.println(checkQQ(a));
//        System.out.println(TelNum(a));

        //¼ì²âÓÊÏä
//        System.out.println("ÇëÊäÈëÒ»¸öÓÊÏä£º");
//        String a = s.nextLine();
//        System.out.println(CheckEmail(a));
        String s1 = s.nextLine();
        System.out.println(Add(s1));
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

    //ÅÐ¶ÏÊÖ»úºÅ
    public static  boolean TelNum(String s){
        return s.matches("1[38]\\d{9}");
    }
    //ÓÊÏäÅÐ¶Ï£º
    public static boolean CheckEmail(String s){
        //return s.matches("[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})");
        return s.matches("\\w+@\\w{2,6}(\\.\\w{2,3})+");
    }

    //Êý×Ö±£ÃÜ
    public static String Add(String s){
        String a ="*";
        String regex = "\\d";
        return  s.replaceAll(regex,a);

    }
}
