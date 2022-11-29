package FlowEx;

import java.util.*;

// switch문 2 : 컴퓨터와 사용자가 가위바위보 하는 게임 코드
public class FlowEx07 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세용 -> ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();               // 화면을 통해 입력받은 숫자를 user에 저장
        int com = (int)(Math.random() * 3) + 1;     // 1, 2, 3 중 하나가 com에 저장됨

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴은 " + com + "입니다.");

        switch (user-com) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다. 우리는 모두 친구!");
//            break;                                  // 마지막 문장이므로 break를 사용할 필요가 없다.
        }
    } // main
} // class
