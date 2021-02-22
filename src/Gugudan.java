import java.util.Scanner;

public class Gugudan {

    public static int[] calculate(int first_num, int second_num){
        int[] result = new int[second_num];

        for(int i = 0; i<second_num; i++){
            result[i] = (first_num*(i+1));

        }
    return result;

    }

    public  static void print(int[] result){
        for(int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }

    }





}

