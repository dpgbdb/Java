package Ch4;
/* 날짜 : 2022/08/18
 * 이름 : 김동민
 * 내용 : if-else if-else문으로 입장료 계산하기
 */
public class p97 {
	public static void main(String[] args) {
		int age=9;
		int charge=0;
		
		if(age<8) {
			charge=1000;
			System.out.println("취학 전 아동입니다");
		}else if(age<14) {
			charge=2000;
			System.out.println("초등학생입니다.");
		}
		else if(age<20) {
		charge=2500;
		System.out.println("청소년입니다.");
		}else if(age<20) {
			charge=3000;
			System.out.println("성인입니다.");
			}
		
	System.out.println("입장료는" +charge+"원입니다");
	}
}
