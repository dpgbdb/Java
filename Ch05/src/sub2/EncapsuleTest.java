package sub2;
/*
 *  날짜 : 2022/08/25
 *  이름 : 김동민
 *  내용 : Java 캡슐화 실습하기 
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		//객체 생성
		Car sonata=new Car("소나타","흰색",10);
	
		sonata.speedUp(80);
		sonata.speedDown(30);
		sonata.Show();
		
	}
}
