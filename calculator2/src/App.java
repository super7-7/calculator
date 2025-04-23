package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();


            int result = calculator.calculate(num1, num2, operator);

            System.out.print("계산을 계속 하시겠습니까? (exit 입력 시 종료): ");
            String check = scanner.nextLine();

            if (check.equals("exit")) {
                System.out.println("계산이 종료되었습니다.");
                break;

            }
        }
    }
}





            // 메서드 호출
        //int result = calculator.calculate(1, 2, '+');


