package sub1;
/*
 * 날짜 : 2022/08/25
 * 이름 : 김동민
 * 내용 : Java 클래스 실습하기
 * 
 * 클래스(Class)와 객체
 *  - 클래스는 객체를 생성하는 구조체이고 속성(필드)과 기능(메서드)으로 구성
 *  - 객체는 클래스의 실제 인스턴스이고 new 연산으로 생성
 */
public class ClassTest {
	public static void main(String[] args) {
		//객체 생성
		
		Car sonata =new Car();
		
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 10;
		
		//객체 기능
		sonata.speedUp(80);
		sonata.speedDown(30);
		sonata.Show();
		//객체 생성
		Car avante = new Car();
		//객체 속성 초기화
		avante.name = "아반테";
		avante.color= "은색";
		avante.speed = 10;
		//객체 기능
		avante.speedUp(70);
		avante.speedDown(40);
		avante.Show();
		
		//Account 객체 생성
		Account ibk =new Account();
		
		ibk.bank = "기업은행";
		ibk.id="979-015406-01-011";
		ibk.name = "김동민";		
		ibk.balance =1000;
		
		ibk.deposit(5000000);
		ibk.withdraw(7000);
		ibk.show();
	}
}
