/**
 * Created by Administrator on 2016/11/23.
 */
public class Q3 {
    public static void main(String[] args) {
        String capter="北京:101010100朝阳:101010300顺义:101010400怀柔:101010500通州:101010600昌平:101010700延庆:101010800丰台:101010900石景山:101011000大兴:101011100房山:101011200密云:101011300门头沟:101011400平谷:101011500八达岭:101011600佛爷顶:101011700";
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
