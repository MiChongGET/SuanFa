/**
 * Created by Administrator on 2016/11/21.
 */
public class Q2 {
    public static void main(String[] args) {
        String s = "Im loved mn,    v   China";
        int index = s.length();
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = chars.length-1; i>=0; i--) {
            if (chars[i]==' '){
                sb.append(s.substring(i,index));
                index = i;
            }
            if (i==0){
                sb.append(" ");
                sb.append(s.substring(0,index));
                System.out.println("sb:"+sb);
            }
        }
    }
}
