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

    //��̬�����
    static {
            try {
                Class.forName(driverName);
                System.out.println("���������ɹ���");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("��������ʧ�ܣ�");
            }
            try {
                dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
                System.out.println("�������ݿ�ɹ���");

                //��¼����
                //login("michong", "123");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.print("SQL Server����ʧ�ܣ�");
            }
        }

        public static void login(String name,String passwd){
            try {
                Statement statement = dbConn.createStatement();

                PreparedStatement ps=dbConn.prepareStatement("select * from Login WHERE name=?");
                ps.setString(1,name);
                ResultSet set = ps.executeQuery();

                while (set.next()){

//                    System.out.println(set.getString(1));��ȡ��һ�е�ֵ
//                    System.out.println(set.getString(2));��ȡ�ڶ��е�ֵ

                    //ȥ���ַ������ҿո�
                    String password=set.getString(2).trim();

                    System.out.println(passwd);
                    if (passwd.equals(password)){
                        System.out.println("��¼�ɹ�������");
                        flag=true;
                        //islogin();
                    }else {
                        System.out.println("��¼ʧ�ܣ�����");
                        flag=false;
                        //islogin();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    //��ȡ��¼״ֵ̬����¼�ɹ�����true��ʧ����Ϊfalse
    public static boolean islogin(){
        return flag;
    }

    //��ѯѧ����Ϣ
    public  void SelectStudent(){
        try {
            Statement statement = dbConn.createStatement();

            PreparedStatement ps=dbConn.prepareStatement("select * from Student");
            ResultSet set = ps.executeQuery();

            while (set.next()){
                //ȥ���ַ������ҿո�
                String studentInfo=set.getString(2).trim();
                System.out.println(studentInfo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
