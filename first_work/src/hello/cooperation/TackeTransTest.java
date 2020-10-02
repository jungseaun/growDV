package cooperation;

public class TackeTransTest {
	public static void main(String[] args) {
		Student studentJ = new Student("je", 5000);
		Student studentk = new Student("kim", 5000);
	
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		studentJ.take(bus100);
		studentk.takeSubway(subwayGreen);
	
		studentJ.showInfo();
		studentk.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubInfo();
	}
}
