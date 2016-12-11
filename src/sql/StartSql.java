package sql;

import java.sql.*;

/**
 * Created by Administrator on 2016/12/11.
 */
public class StartSql {
    private static Connection dbConn = null;
    private static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Student";
    private static final String userName = "sa";
    private static final String userPwd = "123";
    private static boolean flag = false;

    //静态代码块
    static {
            try {
                Class.forName(driverName);
                System.out.println("加载驱动成功！");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("加载驱动失败！");
            }
            try {
                dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
                System.out.println("连接数据库成功！");

                //登录功能
                //login("michong", "123");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.print("SQL Server连接失败！");
            }
        }

        public static void login(String name,String passwd){
            try {
                Statement statement = dbConn.createStatement();

                PreparedStatement ps=dbConn.prepareStatement("select * from Login WHERE name=?");
                ps.setString(1,name);
                ResultSet set = ps.executeQuery();

                while (set.next()){

//                    System.out.println(set.getString(1));获取第一列的值
//                    System.out.println(set.getString(2));获取第二列的值

                    //去除字符串左右空格
                    String password=set.getString(2).trim();

                    System.out.println(passwd);
                    if (passwd.equals(password)){
                        System.out.println("登录成功！！！");
                        flag=true;
                        //islogin();
                    }else {
                        System.out.println("登录失败！！！");
                        flag=false;
                        //islogin();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    //获取登录状态值，登录成功返回true，失败则为false
    public static boolean islogin(){
        return flag;
    }

    //查询学生信息
    public  void SelectStudent(){
        try {
            Statement statement = dbConn.createStatement();

            PreparedStatement ps=dbConn.prepareStatement("select * from Student");
            ResultSet set = ps.executeQuery();

            while (set.next()){
                //去除字符串左右空格
                String studentInfo=set.getString(2).trim();
                System.out.println(studentInfo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
