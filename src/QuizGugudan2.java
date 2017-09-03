import java.util.Scanner;

public class QuizGugudan2 {
	/*
	 * ## 최종 요구사항 2
	 * 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
	 * 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
	 * 팔칠단은 2 \* 1 ... 2 \* 7, 3 \* 1 ... 3 \* 7, ... , 8 \* 1 ... 8 \* 7 까지 구현
	 */
	public static void main(String[] args) {
		
		System.out.println("값을 입력해 주십시오.");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] SplitedValue = inputValue.split(","); 
		
		int first = (Integer.parseInt(SplitedValue[0]));
		int second = (Integer.parseInt(SplitedValue[1]));
		
		for(int i = 2; i <= first; i++) {
			for(int j = 1; j <= second; j++) {
				System.out.println(i * j);
			}
		}
		
	}

}
