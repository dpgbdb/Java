package step03;
/*
 * 날짜 : 2022/08/26
 * 이름 : 김동민
 * 내용 : 백준3단계 6번문제, a+b -7
 */
import java.util.Scanner;
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int arr[]=new int [t];
		int c=0;

		for(int i=0; i<t;i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			arr[i]=a+b;
		}
		sc.close();
		for(int j : arr) {
			c=c+1;
			System.out.println("Case #"+c+": "+j);
		}
	}

}
