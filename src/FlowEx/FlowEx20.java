package FlowEx;

// 2중 반복문을 이용하여 쌍으로 출력
public class FlowEx20 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.printf("[%d,%d]", i, j);
            }
            System.out.println(); // 첫 번째 for문이 끝날 때마다 한칸씩 개행
        }
    } // main
} // class
