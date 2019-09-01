package familyAccount;

import java.util.Scanner;


public class Unitity {
	//  画面入力した内容を取得する
	private static Scanner scanner = new Scanner(System.in);
	public static char readMenuSelection() {
	char c;
	for(; ;) {
		String str=readKeyBoard(1);
		c=str.charAt(0);
		if(c!='1'&&c!='2'&&c!='3'&&c!='4') {
			System.out.println("入力が間違えました、１〜４の数字を入力してください");
			
		}else break;
		
	}
	
	return c;
	}

	public static int readNumber() {
		int n;
		for (;;) {
			String str = readKeyBoard(6);
			try {
				n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				System.out.println("入力した数字が間違えました、４位以内の数字を入力してください");
			}
		
		}
		return n;
	}

	public static String readString() {
		String str = readKeyBoard(8);
		return str;
	}

	public static char readSelectConfirm() {
		char c;
		for (;;) {
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if (c != 'Y' && c != 'N') {
				System.out.println("'Y' or 'N'を入力してください");
			} else
				break;
		}
		return c;

	}

	private static String readKeyBoard(int limit) {
		String line = "";
		while (scanner.hasNext()) {
			line = scanner.nextLine();
			if (line.length() < 1 || line.length() > limit) {
				System.out.println(limit + "以内の数字を入力してください");
				continue;
			}
			break;
		}
		return line;
	}
}
