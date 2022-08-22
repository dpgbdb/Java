package step01;
<<<<<<< HEAD

=======
>>>>>>> cd733423f34ea51d749351fd7fdd5382dfcc6150
import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김동민
 * 내용 : 백준 1단계 12번 문제 . 곱셈
 */
public class _12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fir=sc.nextInt();
		int sec=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int a=fir;
		int b=sec;
		while(b>0){
		if(b/100!=0) {
			sum1=a*(b%10);
		b=b/10;
		
		}else if(b/10!=0) {
			sum2=a*(b%10);
		b=b/10;
		}else if(b!=0) {
			sum3=a*b;
			b=b/10;
		}
			
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(fir*sec);
		}
}