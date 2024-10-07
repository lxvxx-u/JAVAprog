import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        // dBm(데시벨 밀리와트) 계산하기
        // W(전력) 게산하기

        Scanner scan = new Scanner(System.in);

        double dbm, V, R, P;


        System.out.print("V(전압)을 입력하세요.\n입력: ");
        V = scan.nextDouble();

        System.out.print("R(저항)을 입력하세요.\n입력: ");
        R = scan.nextDouble();

        // 전력
        P = V * V / R;
        
        // dBm
        dbm = 10 * Math.log10(P) + 30;

        System.out.println("전력 : " + P + "\ndBm : " + dbm );
        }
    }
