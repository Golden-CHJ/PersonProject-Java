import java.io.File;
import java.util.Scanner;
/*
 * �����򣬿����������н��ܲ���
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		
		System.out.println(path);
		File file = new File(path);
		int charcount = charCount.charCount(file);
		System.out.println(charcount);
	}
}
