/**
 * Created by Administrator on 2016/11/20.
 * —°‘Ò≈≈–Ú
 *
 */
public class ChooseArray {
    public static void main(String[] args) {
        int[] array = {11,40,12,25,65,19,38};
        System.out.println("≈≈–Ú«∞£∫");
        printArray(array);
        System.out.println("≈≈–Ú∫Û£∫");
        SelectArray(array);
        printArray(array);

    }
    public static void SelectArray(int[] ints){

        for (int i = 0; i <ints.length-1 ; i++) {
            for (int j = i+1; j <ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

    }

    public static void printArray(int[] ints){
        System.out.print("[");
        for (int i = 0; i < ints.length; i++){
            if (i==ints.length-1){
                System.out.print(ints[i]);
            }else
                System.out.print(ints[i]+",");
        }
        System.out.println("]");
    }
}
