package sql;


import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Sqlconnect {
    private static Connection dbConn;
    public static void main(String[] args) {

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Student";
        String userName = "sa";
        String userPwd = "123";

        try {
            Class.forName(driverName);
            System.out.println("�������سɹ�������");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("���ݿ����ʧ�ܣ�����");
        }
        try{
            dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
            System.out.println("�������ݿ�ɹ���");
                login();
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("SQL Server����ʧ�ܣ�");
        }
    }

    public static  void login(){


        try {
            ArrayList<LoginList> list = new ArrayList<LoginList>();

            Statement statement = dbConn.createStatement();
            ResultSet set = null;
            set = statement.executeQuery("SELECT * FROM Login");
            while (set.next()){
//
//                String name = set.getString("name");
//                String passwd = set.getString("passwd");
////                System.out.println("������"+name+"�Ա�"+passwd);
//                LoginList loginList  = new LoginList(name,passwd);
//                list.add(loginList);
            }

            System.out.println("��¼��"+list);
            statement.close();
            dbConn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}
