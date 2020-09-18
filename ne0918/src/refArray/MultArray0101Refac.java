package refArray;

public class MultArray0101Refac {

	public static void main(String[] args) {
		Long[][] arrLong = {{1L,2L,3L},{10L,20L,30L},{100L,200L,300L}}; 		
		arrPrint(arrLong);
		System.out.println("=================\n");
		Long[][] arrLong2 = {{1L,2L},{10L,20L,30L,40L,50L},{100L}};
		arrPrint(arrLong2);
		
		String[][] arrStr = new String[][] {{"영희", "순희"},{"yangdoll","sample"}};
		System.out.println("=================\n");
		arrPrint(arrStr);
	
	}
	public static void arrPrint(Object[][] arrData) {
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println("베얄에 저장된 값:"  + arrData[i][j]);
			}
		}
	}
	
//	public static void arrPrint(String[][] arrData) {
//		for (int i = 0; i < arrData.length; i++) {
//			for (int j = 0; j < arrData[i].length; j++) {
//				System.out.println("베얄에 저장된 값:"  + arrData[i][j]);
//			}
//		}
//	}

}
