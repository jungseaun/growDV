package refArray;

import javax.print.DocFlavor.STRING;

public class RefExam01 {
	public static void main(String[] args) {
		char[] hex = new char[5];
		hex[0] = 'C'; hex[1] = 'A'; hex[2] = 'F'; hex[3] = 'E'; hex[4] = '5';
		//char[] hex2 = "CAFE".toCharArray();
		String[] binary = {
						"0000", "0001", "0010", "0011",
						"0100", "0101", "0110", "0111",
						"1000", "1001", "1010", "1011",
						"1100", "1101", "1110", "1111"
		};
		String result="";
		String test = "";
		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {
				test += binary[hex[i]-'0'];
				System.out.println(test + "test");
			}else {
				result += binary[hex[i]-'A' +10];
			}
		}
		System.out.println("hex:");
		for (int i = 0; i < hex.length; i++) {
			System.out.println(hex[i]);
		}
		System.out.println();
		System.out.println("binary:" + result);
	}	
}
