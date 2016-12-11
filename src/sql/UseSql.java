package sql;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/11.
 */
public class UseSql {
    public static void main(String[] args) {
        StartSql startSql = new StartSql();

        do{
            System.out.println("-------------------");
            System.out.println("ÇëµÇÂ¼Sql serverÊı¾İ¿â£º");
            Scanner scanner = new Scanner(System.in);
            System.out.println("ÇëÊäÈëµÇÂ¼Ãû£º");
            String name = scanner.nextLine();
            System.out.println("ÇëÊäÈëÃÜÂë£º");
            String passwd =scanner.nextLine();

            startSql.login(name,passwd);
            System.out.println(startSql.islogin());
        }while (!(startSql.islogin()));

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("ÇëÊäÈëµÇÂ¼Ãû£º");
//        String name2 = scanner.nextLine();
//        System.out.println("ÇëÊäÈëÃÜÂë£º");
//        String passwd2=scanner.nextLine();
//
    }

//    public static boolean logining(){
//        StartSql startSql = new StartSql();
//        System.out.println("ÇëµÇÂ¼Sql serverÊı¾İ¿â£º");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ÇëÊäÈëµÇÂ¼Ãû£º");
//        String name = scanner.nextLine();
//        System.out.println("ÇëÊäÈëÃÜÂë£º");
//        String passwd =scanner.nextLine();
//
//        startSql.login(name,passwd);
//        return startSql.islogin();
//    }
}
