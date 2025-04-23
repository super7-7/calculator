import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙 연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);



            if(num1 > 0 && num2 > 0) {

                switch (operator) {
                    case '+':
                        System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println(num1 + "*" + num2 + "= " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 != 0) {
                            System.out.println(num1 + "/" + num2 + "= " + (num1 / num2));
                            break;
                        } else {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        }
                        break;

                }
                System.out.print("계산을 더 하시겠습니까? (exit를 입력 시 종료): " );
                String end = sc.nextLine();
                if (end.equals("exit")) {
                    System.out.println("계산이 종료되었습니다.");
                    break;
                }
            } else {
                System.out.println("양의 정수만 입력하세요");
            }


        }

    }
}
