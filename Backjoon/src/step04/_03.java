package step04;
/*
 * 날짜 : 2022/09/05
 * 이름 : 김동민
 * 내용 : 백준 4단계 3번문제
 */
import java.util.Scanner;
public class _03 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int arr[]= new int [10];
	int count = 0;
	for(int i=0; i<10;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]%42!=0) {
			count+=1;
		}
		if(count==0) {
			count+=1;
		}
	}
	System.out.println(count);
}
}