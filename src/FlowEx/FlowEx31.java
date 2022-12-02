package FlowEx;

// continue문의 사용.
public class FlowEx31 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {

            if(i%3==0)
                continue;          // 조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동한다.
            if(i%2==1) {
                System.out.printf("%d는 홀수입니다.\n", i);
            } else {
                System.out.printf("%d는 짝수입니다.\n", i);
            }
        }
    }
}
