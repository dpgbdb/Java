package sub05;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * 날짜 : 2022/09/26
 * 이름 : 김동민
 * 내용 : 자바 총정리 연습문제
 */
public class Test05 {
	public static void main(String[] args) {
		
		int price =187000;
		
		int won50000 = price / 50000 ;
		int won10000 = (price-150000) / 10000;
		int won5000  = (price-180000) / 5000;
		int won1000  = (price-185000) / 1000;
	
		System.out.println("5만원권 : "+won50000+"장");
		System.out.println("5만원권 : "+won10000+"장");
		System.out.println("5만원권 : "+won5000+"장");
		System.out.println("5만원권 : "+won1000+"장");
	}
}
