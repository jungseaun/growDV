package cooperation;

public class Student {
	
	String stName;
	int grade;
	int money;
	
	public Student(String stName, int money) {
		this.stName = stName;
		this.money = money;
	}
	
	public void take(Bus bus) { // 승차 메서드
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) { // 승차 메서드
		subway.take(1200);
		this.money -= 1200;
	}
	
	
	public void showInfo() {
		System.out.println(stName + "님의 남은 돈은" + money + "입니다.");
	}
}
