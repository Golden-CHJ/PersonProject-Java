import java.io.File;
import java.util.Scanner;
/*
 * �����򣬿����������н��ܲ���
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		File file = new File(path);
		int charcount = charCount.charCount(file);
		System.out.println("characters:" + charCount.charCount(file));
		System.out.println("lines:" + lineCount.lineCount(file));
	}
}
