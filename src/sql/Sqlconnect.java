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
            System.out.println("加载驱动成功！");

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("加载驱动失败！");
        }
        try{
            Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
            System.out.println("连接数据库成功！");

            Statement statement = dbConn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM Student");

            while (set.next()){

                String name = set.getString("Sname");
                String sex = set.getString("Ssex");
                System.out.println("姓名："+name+"性别："+sex);
            }

            statement.close();
            dbConn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("SQL Server连接失败！");
        }
    }
}
