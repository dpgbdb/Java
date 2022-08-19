package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김동민
 * 내용 : 백준 1단계 11번 문제 . 나머지
 */
public class _11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int q,w,e,r;
		q=(a+b)%c;
		w=((a%c)+(b%c))%c;
		e=(a*b)%c;
		r=((a%c)*(b%c))%c;
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		System.out.println(r);
		
	}

}
