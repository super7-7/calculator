package calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private List<Integer> results = new ArrayList<>();


    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public int calculate(int num1, int num2, char operator) {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "= " + (num1+num2));
                return result;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "= " + (num1-num2));
                return result;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "= " + (num1*num2));
                return result;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "= " + (num1/num2));
                    return result;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                    return 0;
                }
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        results.add(result); // 결과 저장
        return result;
    }

}
