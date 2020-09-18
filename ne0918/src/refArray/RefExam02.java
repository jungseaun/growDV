package refArray;

public class RefExam02 {

	public static void main(String[] args) {
		if (args.length == 3) {
			int start = Integer.parseInt(args[0]);
			int end = Integer.parseInt(args[1]);
			int incre = Integer.parseInt(args[2]);
			int sum = 0;
			
			for (int i = start; i < end; i+= incre) {
				sum += i;
			}
			System.out.println("원하는 결과 값:" + sum);
		}else {
			System.out.println("파라메터 개수가 3개(초기값 종료값 증가값)를 넘겨주세요....");
		}
	}
}
