package step03;
/*
 * 날짜 : 2022/08/31
 * 이름 : 김동민
 * 내용 : 백준 3단계 10번문제
 */
import java.util.Scanner;
public class _10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]= new int [a];
		int x=sc.nextInt();
		
		for(int i=0; i<a;i++) {
			int b=sc.nextInt();
			arr[i]=b;
		}
		sc.close();
		
		for(int j : arr) {
			if(j<x) {
				System.out.print(j+" ");
			}
		}
	
	
	}

}
