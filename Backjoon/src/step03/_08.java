package step03;
/*
 * 날짜 : 2022/08/26
 * 이름 : 김동민
 * 내용 : 백준 3단계 8번문제, 별찍기
 */
import java.util.Scanner;
public class _08 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		for(int j=0; j<a;j++) {
		for(int i=0; i<a;i++) {
			System.out.print("*");
			if(i==j) {
				break;
			}
		}
		System.out.print("\n");
		}
		
	}

}
