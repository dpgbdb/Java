package sub06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/27
 * 이름 : 김동민
 * 내용 : 자바 총정리 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b= 0, c = 0;
		
		try {
			System.out.printf("첫번째 수 : ");
			a = Integer.parseInt(br.readLine());

			System.out.printf("두번째 수 : ");
			b = Integer.parseInt(br.readLine());
			
			System.out.printf("세번째 수 : ");
			c = Integer.parseInt(br.readLine());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("가장 큰 수는 %d입니다.", larger(larger(a,b),c));
	}
	
	public static int larger(int a, int b) {
		return (a >= b) ? a : b;
	}

}
