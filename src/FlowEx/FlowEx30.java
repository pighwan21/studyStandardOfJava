package FlowEx;

// break문 사용. 숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘기는지 알아내는 예제.
public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {                      // 무한 반복
            if(sum > 100)                   // sum의 값이 100을 넘기면
                break;                      // break문이 수행되어 자신이 속한 반복문을 즉시 벗어난다.
            ++i;
            sum += i;                       // 앞의 두 문장은 sum += ++i; 로 줄여 쓸 수 있다.
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
