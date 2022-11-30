package FlowEx;

import java.util.*;

// 중첩 for문 : 구구단 맹글기
public class FlowEx18 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }

        int pig = 0;
        
        // 입력받은 단만 출력해보기
        System.out.print("몇단을 볼테냐 -> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        pig = Integer.parseInt(tmp);

        for(int i = pig; i <= pig; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    } // main
} // class
