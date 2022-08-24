package step03;
/*
 * 날짜 : 2022/08/24
 * 이름 : 김동민
 * 내용 : 백준문제 2단계 2번,a+b 여러번 입력하기
 */
import java.util.Scanner;
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		int arr[]=new int[t];
		
		for(int i=0;i<t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[i] =a+b;
		}
		sc.close();
		
		for(int k : arr) {
			System.out.println(k);
		}
	}
	
}
