/**
 * Created by Administrator on 2016/11/23.
 */
public class Q3 {
    public static void main(String[] args) {
        String capter="����:101010100����:101010300˳��:101010400����:101010500ͨ��:101010600��ƽ:101010700����:101010800��̨:101010900ʯ��ɽ:101011000����:101011100��ɽ:101011200����:101011300��ͷ��:101011400ƽ��:101011500�˴���:101011600��ү��:101011700";
        String regex = "\\W+:";
        String regex2 = "\\d{9}";
        String[] num = capter.split(regex);
        String[] name = capter.split(regex2);
        for (int i = 0; i <num.length-1;i++) {
            System.out.print(name[i]);
            System.out.print(num[i+1]);
            System.out.println("");
        }
    }
}
