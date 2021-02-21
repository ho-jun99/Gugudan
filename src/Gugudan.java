import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        // 2단
//        System.out.println(2*1);
//        System.out.println(2*2);
//        System.out.println(2*3);
//        System.out.println(2*4);
//        System.out.println(2*5);
//        System.out.println(2*6);
//        System.out.println(2*7);
//        System.out.println(2*8);
//        System.out.println(2*9);
//        System.out.println("4단");
//        int result = 4*1;
//
//        System.out.println(result);
//        result = 4*3;
//        System.out.println(result);
//        result = 4*4;
//        System.out.println(result);
//        result = 4*5;
//        System.out.println(result);
//        result = 4*6;
//        System.out.println(result);
//        result = 4*7;
//        System.out.println(result);
//        result = 4*8;
//        System.out.println(result);
//        result = 4*9;
//        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        System.out.println(number*1);
//        System.out.println(number*2);
//        System.out.println(number*3);
//        System.out.println(number*4);
//        System.out.println(number*5);
//        System.out.println(number*6);
//        System.out.println(number*7);
//        System.out.println(number*8);
//        System.out.println(number*9);

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert num");
        int num = scanner.nextInt();

        if ((1<num)&&(num<10)) {
            for (int i = 1; i < 10; i++) {
                System.out.println(num * i);
            }
        } else{
            System.out.println("올바른 값을 입력해 주십시오");
        }
//

//        int i = 1;
//        while(i<10){
//            System.out.println(num*i);
//            i++;
//        }
//
//    }
//        for (int i = 1; i < 10; i++) {
//            System.out.println(num * i);
//        }



    }
}
