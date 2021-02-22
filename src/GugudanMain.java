import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert first num");
        int first_num = scanner.nextInt();
        System.out.println("insert second num)");
        int second_num = scanner.nextInt();

        Gugudan.print(Gugudan.calculate(first_num, second_num));


    }
}
