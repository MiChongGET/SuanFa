/**
 * Created by Administrator on 2016/11/16.
 */
import java.util.Random;
import java.util.Scanner;

public class tree {

    public static void main(String[] args) {
        Random input = new Random();
        int a = input.nextInt(100);//0-100°¡°¡ìªìª
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        System.out.println("ÊäÈëµÄÊı×Ö"+b);

    }
}
