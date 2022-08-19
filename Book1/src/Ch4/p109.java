package Ch4;
/* 날짜 : 2022/08/18
 * 이름 : 김동민
 * 내용 : 반복문, while문으로 1부터 10까지 더하기
 */
public class p109 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(num<=10){
			sum+=num;
			num++;
		}
		System.out.println("1부터 10까지의 합은"+sum+"입니다");
	}

}
