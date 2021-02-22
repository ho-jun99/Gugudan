import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputValue = scanner.nextLine();
        String[] splitValue = inputValue.split(",");

        int frist_num = Integer.parseInt(splitValue[0]);
        int second_num = Integer.parseInt(splitValue[1]);

        Gugudan.print(Gugudan.calculate(frist_num,second_num));


    }
}
