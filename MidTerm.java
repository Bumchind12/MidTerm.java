package hello;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int answer = random.nextInt(20) + 1;
		int attemps = 0;
		
		while (true) {
			System.out.println("정답을 추측하여 보시오:  ");
			int guess = scanner.nextInt();
			attemps++;
			
			if (guess < answer) {
				System.out.println("제시한 정수가 낮습니다.  ");
				
			} else if (guess > answer) {
				System.out.println("제시한 정수가 높습니다.  ");
			} else {
				System.out.println("축하합니다. 시도횟수=" + attemps);
				break;
			}
		}
		
		scanner.close();
	}
}
