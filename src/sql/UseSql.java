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
            System.out.println("���¼Sql server���ݿ⣺");
            Scanner scanner = new Scanner(System.in);
            System.out.println("�������¼����");
            String name = scanner.nextLine();
            System.out.println("���������룺");
            String passwd = scanner.nextLine();

            startSql.login(name, passwd);

            //System.out.println(startSql.islogin());

        } while (!(startSql.islogin()));
     //   System.out.println("------���ڲ�ѯѧ����Ϣ-------");
//        startSql.SelectStudent();
        System.out.println("---------��ӭ��¼����ϵͳ---------");

        while (true){
            System.out.println("--------------------");
            System.out.println("0:�˳� 1:��ѯѧ����Ϣ");
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
