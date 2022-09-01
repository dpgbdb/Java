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
		int count=a;
		for(int j=1;j<=a;j++) {
		for(int i=1;i<count;i++) {
		System.out.print(" ");
			
		}
			for(int b=0;b<j;b++) {
			System.out.print("*");
			}
			System.out.print("\n");
			count=count-1;		
		}
		
		}
	
	}


