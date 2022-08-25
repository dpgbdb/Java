package step02;
/*
 * 날짜 : 2022/08/23
 * 이름 : 김동민
 * 내용 : 백준 2단계 6번,오븐 문제
 */
import java.util.Scanner;
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int sum = 0;
		int a = 0;
		sum =m+r;
		
		if(sum>=60) {
			a=sum/60;
			sum=sum%60;
			h=h+a;
			if(h>=24) {
				h=h-24;
			}
			System.out.println(h+" "+sum);
		}else{
			
			if(h>=24) {
				h=h-24;
			}
			System.out.println(h+" "+sum);
		}
		
		
	
		
	}

}
