package step02;
/*
 * 날짜 : 2022/08/23
 * 이름 : 김동민
 * 내용 : 백준문제 2단계 4번, 사분면 고르기
 */
import java.util.Scanner;
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		
		if(x>0&&y>0) {
			System.out.println("1");
		}else if(x>0&&y<0) {
			System.out.println("4");
		}else if(x<0&&y>0) {
			System.out.println("2");
		}else if(x<0&&y<0) {
			System.out.println("3");
		}
		
		
	}

}
