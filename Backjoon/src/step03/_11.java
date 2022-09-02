package step03;
/*
 * 날짜 : 2022/09/02
 * 이름 : 김동민
 * 내용 : 두 정수 A와B를 입력받은 다음,A+B를 출력하는 프로그램을 작성하시오
 * 문제 :입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
입력의 마지막에는 0 두 개가 들어온다.
 출력		각 테스트 케이스마다 A+B를 출력한다.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class _11 {
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	int[] arr;
	for(int i=0; i<=99999; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a==0)&&(b==0)) {
			break;
		}	
		list.add(i,a+b);
			
	}
	sc.close();
	for(int j=0; j<list.size();j++) {
		System.out.println(list.get(j));
	}
	
}
}