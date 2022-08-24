package step02;
/*
 * 날짜 : 2022/08/24
 * 이름 : 김동민
 * 내용 : 백준 2단계 7번 문제, 주사위 세개
 */
import java.util.Scanner;
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		int thi = sc.nextInt();
		int m=0;
		
		if((fir==sec)&(thi==fir)) {
			m=10000+(fir*1000);
		}
		else if(fir==sec) {
			m=1000+(fir*100);
		}else if(fir==thi) {
			m=1000+(fir*100);
		}else if(sec==thi) {
			m=1000+(sec*100);
		}else {
			if(fir>sec) {
				if(fir>thi) {
					m=fir*100;
				}else {					
					m=thi*100;
				}
			}else if(sec>thi) {
				m=sec*100;
			}else {
				m=thi*100;
			}
			
		}
		System.out.println(m);
	}
}
