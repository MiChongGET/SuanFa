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
            System.out.println("���¼Sql server���ݿ⣺");
            Scanner scanner = new Scanner(System.in);
            System.out.println("�������¼����");
            String name = scanner.nextLine();
            System.out.println("���������룺");
            String passwd =scanner.nextLine();

            startSql.login(name,passwd);
            System.out.println(startSql.islogin());
        }while (!(startSql.islogin()));

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("�������¼����");
//        String name2 = scanner.nextLine();
//        System.out.println("���������룺");
//        String passwd2=scanner.nextLine();
//
    }

//    public static boolean logining(){
//        StartSql startSql = new StartSql();
//        System.out.println("���¼Sql server���ݿ⣺");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("�������¼����");
//        String name = scanner.nextLine();
//        System.out.println("���������룺");
//        String passwd =scanner.nextLine();
//
//        startSql.login(name,passwd);
//        return startSql.islogin();
//    }
}
