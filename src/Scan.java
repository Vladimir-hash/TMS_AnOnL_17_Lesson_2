import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sumNumbers = firstNumber + secondNumber;
        String lastWord = "Сумма " + firstNumber + " и " + secondNumber + " равна " + sumNumbers;
        System.out.println(lastWord);
    }
}
