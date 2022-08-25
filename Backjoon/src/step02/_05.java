package step02;
/*
 * 날짜 : 2022/08/23
 * 이름 : 김동민
 * 내용 : 백준 2단계 5번문제, 알림 45분전으로 설정하기
 */
import java.util.Scanner;
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h= sc.nextInt();
		int m= sc.nextInt();
		
		if(m<45) {
			m=60-(45-m);
			h--;
		 if(h<0){
			h=23;
			
		}
		 System.out.println(h+" "+m);
		}else {
			System.out.println(h+" "+(m-45));
		}
		
		
	}

}
