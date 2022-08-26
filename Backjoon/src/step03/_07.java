package step03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 날짜 : 2022/08/26
 * 이름 : 김동민
 * 내용 : 백준3단계 7번문제, a+b -8
 */
import java.util.Scanner;
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		List<String> ArrayList = new ArrayList<>(Arrays.asList());

		for(int i=1; i<=t;i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			ArrayList.add("Case #"+i+": "+a+" + "+b+" = "+(a+b));
			
		}
		sc.close();
		for(String j : ArrayList) {
			System.out.println(j);
			
		}
	}

}
