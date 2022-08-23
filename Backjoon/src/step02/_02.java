package step02;
import java.util.Scanner;
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		
		if(90<=s) {
			System.out.println("A");
		}else if(80<=s) {
			System.out.println("B");
		}else if(70<=s) {
			System.out.println("C");
		}else if(60<=s) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
