package FlowEx;

import java.util.*;

// do-while문 활용. 반복적으로 사용자의 입력을 받아서 처리할 때 유용
// Math.random()을 이용해서 1과 100 사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출 때까지 반복하는 예제
public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;           // 1~100 사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100 사이의 정수를 입력하세용 -> ");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세용!");
            } else if (input < answer){
                System.out.println("더 큰 수로 다시 시도해보세용!");
            }
        } while (input != answer);

        System.out.println("정답입니다~~");
    } // main
} // class
