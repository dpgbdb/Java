package sub7;
/*
 * 날짜 : 2022/08/31
 * 이름 : 김동민
 * 내용 : 다형성 실습하기 
 */



public class PolyTest {
	public static void main(String[] args) {

		//다형성을 적용한 객체 생성
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		}
}
