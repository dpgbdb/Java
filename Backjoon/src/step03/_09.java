package step03;
/*
 * 날짜 : 2022/08/26
 * 이름 : 김동민
 * 내용 : 백준 3단계 9번문제, 별찍기
 */
import java.util.Scanner;
public class _09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int a=sc.nextInt();
		for(int k=0;k<=a;k++) {
		for(int i=0;i<a;i++) {
			System.out.print(" ");
		}
		for(int j=0;j<k;j++) {
			System.out.println("*");
		}	
		}
	
	}

}
