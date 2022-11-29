package FlowEx;

import java.util.*;

// switch문 3 : 주민등록번호를 입력받아서 성별을 확인하고 출력하는 예제
public class FlowEx08 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세용(ex) 881226-1010888) -> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);              // 입력받은 번호의 8번째 문자를 gender에 저장(index : 0~)

        switch (gender) {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    } // main
} // class
