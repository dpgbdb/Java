package step01;
import java.util.Scanner;
/* 
 * 날짜 : 2022/08/19
 * 이름 : 김동민
 * 내용 : 백준 1단계 7번 두 자연수 A와 B가 주어진다.
 *  이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}

}