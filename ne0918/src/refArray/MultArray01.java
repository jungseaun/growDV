package refArray;

public class MultArray01 {

	public static void main(String[] args) {
		long[][] arrLong = {{1,2,3},{10,20,30},{100,200,300}}; 		
		
		for (int i = 0; i < arrLong.length; i++) {
			for (int j = 0; j < arrLong[i].length; j++) {
				System.out.println("베얄에 저장된 값:"  + arrLong[i][j]);
			}
		}
		long[][] arrLong2 = {{1,2},{10,20,30,40,50},{100}};
	
		System.out.println("=================");
		for (int i = 0; i < arrLong2.length; i++) {
			for (int j = 0; j < arrLong2[i].length; j++) {
				System.out.println("베얄에 저장된 값:"  + arrLong2[i][j]);
			}
		}
	}
}
