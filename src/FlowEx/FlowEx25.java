package FlowEx;

import java.util.*;

// while문 사용 : 사용자로부터 숫자를 입력받고, 이 숫자의 각 자리의 합을 구하는 예제
// 어떤 수를 10으로 나머지 연산(%)하면 마지막 자리를 얻을 수 있다.
// 어떤 수를 10으로 나누면(/) 마지막 한자리가 제거된다.
public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세용.(ex) 12345) -> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();        // 화면을 통해 입력받은 내용을 tmp에 저장
        num = Integer.parseInt(tmp);            // 입력받은 문자열(tmp)을 숫자로 변환

        while(num != 0) {
            // num을 10으로 나눈 나머지를 sum에 더함
            sum += num % 10;                    // sum = sum + num % 10;
            System.out.printf("sum = %3d num = %d\n", sum, num);

            num /= 10;                          // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합 : " + sum);
    } // main
} // class
