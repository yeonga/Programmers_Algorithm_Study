package all_question_level1;

// 두 정수 사이의 합 - 등차수열 이용 (다른사람 풀이 도움)

public class Sum_two_essence_shorter {

	class Solution {

		public long solution(int a, int b) {
			return sumAtoB(Math.min(a, b), Math.max(b, a));
		}

		private long sumAtoB(long a, long b) {
			return (b - a + 1) * (a + b) / 2;
		}
	}

}
