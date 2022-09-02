package step03;
/*
 * 날짜 : 2022/09/02
 * 이름 : 김동민
 * 내용 : 백준3단계 13번문제
 */
import java.util.Scanner;
public class _13 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a=sc.nextInt();
		int hap=0;
		int newa=0;
		int ju =0;
		int count=0;
		ju=a;
		while(true) {
		hap=(a/10)+(a%10);
		newa=((a%10)*10)+(hap%10);
		count=count+1;
		a=newa;
		if(ju==newa) {
			break;
		}
		}
		System.out.println(count);
	}
	

}
