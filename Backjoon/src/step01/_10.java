package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김동민
 * 내용 : 백준 1단계 10번 문제 . 체스말 개수 문제
 */
public class _10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int q=sc.nextInt();
		int l=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		
		if(k==1) {

			System.out.print("0 ");
		}else {
			k=1-k;
			System.out.print(k+" ");
		}
		if(q==1) {
			System.out.print("0 ");
		}else {
			q=1-q;
			System.out.print(q+" ");
		}
		if(l==2) {
			System.out.print("0 ");
		}else {
			l=2-l;
			System.out.print(l+" ");
		}
		if(b==2) {
			System.out.print("0 ");
		}else {
			b=2-b;
			System.out.print(b+" ");
		}
		if(n==2) {
			System.out.print("0 ");
		}else {
			n=2-n;
			System.out.print(n+" ");
		}
		if(p==8) {
			System.out.print("0 ");
		}else {
			p=8-p;
			System.out.print(p+" ");
			System.out.print("0");
		}
	}
}
