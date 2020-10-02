package cooperation;

public class Subway {
	int lineNum;
	int passCount;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) { // 승차 메서드
		this.money += money;
		passCount++;
	}
	
	public void showSubInfo() {
		System.out.println(lineNum + "번 지하철의 승객은" + passCount + "명 이고, 수입은" + money + "입니다.");
	}
}
