package step04;
/*
 * 날짜 : 2022/09/05
 * 이름 : 김동민
 * 내용 : 백준4단계 2번문제
 */
import java.util.Scanner;
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int [9];
		int max= 0;
		int count=0;
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
				count=i+1;
			}
			
		}
		sc.close();
	System.out.println(max);
	System.out.println(count);
	}

}
