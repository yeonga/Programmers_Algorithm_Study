package all_question_level1;

import java.util.Scanner;

/* n 횟수에 따라 수박수박수박 출력하기 
 	*** 삼항 연산자 이용 ***
 */
public class Watermelon {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); 	// 주어진 횟수
		String answer = "";			// 정답 answer 변수 정해주기 
		
		for (int i=1; i<=n; i++) {
			answer += (i%2!=0) ? "수" : "박";		// 삼항 연산자 이용하여 홀수일 경우 "수" 출력 / 짝수일 경우 "박" 출력 
		}	System.out.print(answer);
		
	}

}

/*		프로그래머스 답변

 class Solution {
    public String solution(int n) {
        String answer = "";
        
        for (int i=1; i<=n; i++)
            answer += (i%2 != 0) ? "수" : "박";
            return answer;
    }
}
 */
