package sql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Sqlconnect {
    public static void main(String[] args) {

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=student";
        String userName = "sa";
        String userPwd = "123";

        try
        {
            Class.forName(driverName);
            System.out.println("���������ɹ���");

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("��������ʧ�ܣ�");
        }
        try{
            Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
            System.out.println("�������ݿ�ɹ���");

            Statement statement = dbConn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM Student");

            while (set.next()){

                String name = set.getString("Sname");
                String sex = set.getString("Ssex");
                System.out.println("������"+name+"�Ա�"+sex);
            }

            statement.close();
            dbConn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("SQL Server����ʧ�ܣ�");
        }
    }
}
