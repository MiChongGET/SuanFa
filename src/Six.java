/**
 * Created by Administrator on 2016/11/23.
 */
import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Six {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in );
        int a=scanner.nextInt();
        judge(a);

    }
    public static void judge(int value)
    {

        for(int i=1;i<=value;i++)
        {
            for(int k=1;k<=value-i;k++)
                System.out.print(" ");
            outputNumber(i);
        }
//        for(int i=value-1;i>=1;i--)
//        {
//            for(int k=1;k<=value-i;k++)
//                System.out.print(" ");
//            outputNumber(i);
//        }

    }
    public static  void outputNumber(int line)
    {

        for(int j=1;j<=line;j++)
            System.out.print(j);
        for(int x=line-1;x>=1;x--)
            System.out.print(x);
        System.out.println("");

    }


}
