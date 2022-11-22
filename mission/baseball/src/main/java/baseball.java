import java.util.*;
import java.io.*;

public class baseball {
    public static void main(String[] args) throws IOException, IllegalArgumentException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        while(true) {
            // rand : 컴퓨터의 숫자 3개
            int[] rand = new int[3];
            for (int i = 0; i < 3; i++) {
                rand[i] = random.nextInt(8) + 1;
                for(int j=0; j<i; j++){
                    if(rand[i]==rand[j]){
                        i--;
                        break;
                    }
                }
            }
            for(int i=0; i<3; i++){
                System.out.print(rand[i] + " ");
            }
            int count = 0;
            while(true) {
                // count : 9회일 시, 게임 종료
                int strike = 0;
                int ball = 0;
                count++;
                System.out.print("숫자를 입력해주세요 : ");
                String input = br.readLine();

                // 예외1
                if (input.length() != 3) {
                    throw new IllegalArgumentException("[Error]세자리 숫자가 아닙니다.");
                }
                // num : 사용자의 숫자 3개
                int[] num = new int[input.length()];
                for (int i = 0; i < input.length(); i++) {
                    num[i] = input.charAt(i) - '0';
                }
                // 예외2
                for (int i = 0; i < input.length(); i++) {
                    if (num[i] <= 0 || num[i] > 9) {
                        throw new IllegalArgumentException("[Error]1~9까지의 숫자가 아닙니다.");
                    }
                }

                // 스트라이크 & 볼 처리
                for (int i = 0; i < input.length(); i++) {
                    for (int j = 0; j < input.length(); j++) {
                        if (rand[i] == num[j] && i==j) {
                            strike++;
                        }
                        else if (rand[i] == num[j]) {
                            ball++;
                        }
                    }
                }

                System.out.println(strike + "스트라이크 " + ball + "볼");
                if (strike == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 당신의 승리입니다.");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                } else if (count == 9) {
                    System.out.println("9번의 시도 동안 맞히지 못했습니다! 당신의 패배입니다.");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                } else {
                    continue;
                }
                // 1 or 2 선택시
                int cmd = Integer.parseInt(br.readLine());
                if (cmd == 1) {
                    break;
                } else if (cmd == 2) {
                    return;
                } else {
                    System.out.println("잘못 입력하셨습니다. 게임을 종료합니다.");
                    return;
                }
            }


        }



    }
}
