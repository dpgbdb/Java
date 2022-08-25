package step03;
/*
 * 날짜 : 2022/08/24
 * 이름 : 김동민
 * 내용 : 백준문제 3단계 4번,영수증 가격 확인
 */
import java.util.Scanner;
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int num = sc.nextInt();
		int arr[]=new int[num];
		int sum=0;
		for(int i=0;i<num;i++) {
			int pr=sc.nextInt();
			int n=sc.nextInt();
			arr[i]=pr*n;
		}
		sc.close();
		for(int k : arr) {
			sum+=k;
		}
		if(sum==tot) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
