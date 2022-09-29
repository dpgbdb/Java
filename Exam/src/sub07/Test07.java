package sub07;
/*
 * 날짜 : 2022/09/28
 * 이름 : 김동민
 * 내용 : 자바 총정리 연습문제
 */
interface Player{
	public void play();
}


class BaseBallPlayer implements Player{
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
}
class FootBallPlayer implements Player{
	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
}
public class Test07 {
	public static void main(String[] args) {
		
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playgame(p1);
		playgame(p2);
		
	}
	public static void playgame(Player p) {
		p.play();
	}

}
