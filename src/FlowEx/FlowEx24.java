package FlowEx;

// while문으로 카운트 다운 맹글기
public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운 발사 준비 빵빵빵");

        while(i--!=0) {
            System.out.println(i);
            for(int j = 0; j < 2_000_000_000; j++) {
                ;       // 빈문장 ;
            }
        }
        System.out.println("당신은 죽었습니다");
    }
}
