package step03;
/* 
 * 날짜 : 2022/08/24
 * 이름 : 김동민
 * 내용 : 백준문제 3단계3번, 1부터n까지 출력
 */
import java.util.Scanner;
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
