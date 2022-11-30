package FlowEx;

import java.util.*;

// 중첩 for문 : 별찍기 기초2
public class FlowEx17 {
    public static void main(String[] args) {
        for(int j = 1; j <= 1; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 1; j <= 2; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 1; j <= 3; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 1; j <= 4; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 1; j <= 5; j++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
        // 위의 식을 간단히 하면?(1, 2, 3, 4, 5 조건식의 숫자만 변할 뿐 나머지는 같은 상황
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요. \n-> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();            // 화면을 통해 입력받은 내용을 tmp에 저장
        num = Integer.parseInt(tmp);                // 입력받은 문자열 tmp를 숫자로 변환

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // main
} // class
