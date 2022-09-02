package step04;
/*
 * 날짜 : 2022/09/02
 * 이름 : 김동민
 * 내용 : 백준4단계 1번문제
 */
import java.util.Scanner;
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		int c=sc.nextInt();
		int[] arr= new int [c];
		
		for(int i=0 ;i<c;i++) {
		int a=sc.nextInt();
			
		arr[i]=a;
		    if(i==0) {
		    	min=a;
		    	max=a;
		    }
			if(arr[i]>max) {
				max = a;
				
			}
			if(arr[i]<min) {
				min = a;
			}
		}
	System.out.println(min+" "+max);
	}

}

