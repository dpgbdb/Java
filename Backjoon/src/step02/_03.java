package step02;
/*
 * 날짜 : 2022/08/23
 * 이름 : 김동민
 * 내용 : 백준문제 2단계 3번, 윤년구하기
 */
import java.util.Scanner;
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year  = sc.nextInt();
		if(((year%4)==0)&&((year%100)!=0)||((year%400)==0)) {
			System.out.println("1");
			
		}else {
			System.out.println("0");
		}
		
	}

}
