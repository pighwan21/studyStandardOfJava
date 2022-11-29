package FlowEx;

// for문의 활용 3 : i는 1부터 10까지 증가, j는 10부터 1까지 감소시키며 출력
public class FlowEx14 {
    public static void main(String[] args) {
        for(int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.printf("%d \t %d \n", i, j);
        }
        System.out.println();
        // 위의 코드를 더 간단히 하면
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %d \n", i, 11-i);
        }
    } // main
} // class
