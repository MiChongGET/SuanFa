package sql;

/**
 * Created by Administrator on 2016/12/11.
 */
public class LoginList {

    private String name;
    private String passwd;

    public LoginList(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "LoginList{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
