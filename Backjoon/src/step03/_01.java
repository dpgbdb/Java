package step03;
/*
 * 날짜 : 2022/08/24
 * 이름 : 김동민
 * 내용 : 백준3단계 1번문제,구구단
 */
import java.util.Scanner;
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		int gop = 0;
		for(int i=1;i<=9; i++) {
			gop = dan*i;
			System.out.println(dan+" * "+i+" = "+gop);
		}
		
	}

}
