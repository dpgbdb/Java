package sub4;
/*
 * 날짜 : 2022/08/18
 * 이름 : 김동민
 * 내용 : Java 반복문 while 실습하기
 */
public class WhileTest {
	
	public static void main(String[] args) {
		
		//1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k<=10) {
			sum+=k;
			k++;
		}
		System.out.println("1부터 10까지 합 : "+sum);	
		//do ~while
		int i=1;
		int tot=0;
		
		do{
		if(i%2==0){
		tot+=i;
		}
		i++;	
		}while(i<=10);
		System.out.println("1부터 10까지 짝수합 : "+tot);
		//break
		int num =1;
		
		while(true) {
			if(num%5==0&&num%7==0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소 공배수:"+num);
		//continue
		int total = 0;
		int j= 0;
		while(j<=10) {
			j++;
			//홀수합으로 수정 2022-08-18 김동민
			if(j%2==0){
				continue;
			}
			total+=j;
		}
		System.out.println("1부터 10까지 홀수합 : "+total);
		
		
		
		
	}
}
