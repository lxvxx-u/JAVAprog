import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
        dBm = 10 * Math.log10(P) + 30;

        System.out.println("전력 : " + P + "\ndBm : " + dBm );
        }
    }
