package Ch3;

/*날짜 : 2022/08/18
 *이름 : 김동민
 *내용 : 비트 이동 연산자 사용하기
 */
public class p85 {
	public static void main(String[] args) {
		int num=0B00000101;
		System.out.println(num<<2);
		System.out.println(num>>2);
		System.out.println(num>>>2);
		
		System.out.println(num);
		num=num<<2;
		System.out.println(num);
	}
}
