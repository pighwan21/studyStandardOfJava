package FlowEx;

import java.util.*;

// switch문 1 : 현재 몇 월인지 입력받아서 해당하는 계절을 출력하는 예제
public class FlowEx06 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. -> ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();              // 화면을 통해 입력받은 숫자를 month에 저장

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
//            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }
        // 위의 switch문을 if문으로 바꾸면 아래와 같다.
//        if (month == 3 || month == 4 || month == 5) {
//            System.out.println("현재의 계절은 봄입니다.");
//        } else if (month == 6 || month == 7 || month == 8) {
//            System.out.println("현재의 계절은 여름입니다.");
//        } else if (month == 9 || month == 10 || month == 11) {
//            System.out.println("현재의 계절은 가을입니다.");
//        } else
//            System.out.println("현재의 계절은 겨울입니다.");
    } // main
} // class
