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
    private static boolean flag = true;



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

//        try {
//            ArrayList<LoginList> lists = new ArrayList<LoginList>();
//
//            Statement statement = dbConn.createStatement();
//            ResultSet set = null;
////            set = statement.executeQuery("SELECT * FROM Login");
////           while (set.next()){
////
////              String na = set.getString("name");
////              String pass = set.getString("passwd");
////              LoginList loginList = new LoginList(na,pass);
////              lists.add(loginList);
////           }
////
////            Iterator it = lists.iterator();
////            while (it.hasNext()){
////                LoginList login = (LoginList) it.next();
////                System.out.println("name:"+login.getName()+"passwd"+login.getPasswd());
////            }
//
//            statement.close();
//            dbConn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        }



        public static void login(String name,String passwd){



            try {
                Statement statement = dbConn.createStatement();
//                String sql = "select passwd from Login WHERE name='"+name+"'";


                PreparedStatement ps=dbConn.prepareStatement("select * from Login WHERE name=?");
                ps.setString(1,name);
                ResultSet set = ps.executeQuery();

                while (set.next()){

//                    System.out.println(set.getString(1));
//                    System.out.println(set.getString(2));

                    //ȥ���ַ������ҿո�
                    String password=set.getString(2).trim();

                    System.out.println(passwd);
                    if (passwd.equals(password)){
                        System.out.println("��¼�ɹ�������");
                        islogin(true);
                    }else {
                        System.out.println("��¼ʧ�ܣ�����");
                        islogin(false);
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            //return flag;
    }

    public static final boolean islogin(boolean f){

        return f;
    }

}
