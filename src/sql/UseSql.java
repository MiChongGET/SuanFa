package sql;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/11.
 */
public class UseSql {
    private static StartSql startSql = new StartSql();;
    public static void main(String[] args) {


        do {
            System.out.println("-------------------");
            System.out.println("请登录Sql server数据库：");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入登录名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String passwd = scanner.nextLine();

            startSql.login(name, passwd);

            //System.out.println(startSql.islogin());

        } while (!(startSql.islogin()));
     //   System.out.println("------正在查询学生信息-------");
//        startSql.SelectStudent();
        System.out.println("---------欢迎登录管理系统---------");

        while (true){
            System.out.println("--------------------");
            System.out.println("0:退出 1:查询学生信息");
            Scanner s = new Scanner(System.in);
            function(s.nextInt());
        }

    }

    public static void function(int num){
        switch (num){
            case 0:
                System.exit(0);
            case 1:
                startSql.SelectStudent();
                break;

        }
    }
}
