
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
		System.out.println("characters:" + charCount.charcount(file));
		System.out.println("words:" + wordCount.wordcount(file));
		System.out.println("lines:" + lineCount.linecount(file));
		
		writeInTxt.writeTxt("characters:" + charCount.charcount(file));
		writeInTxt.writeTxt("words:" + wordCount.wordcount(file));
		writeInTxt.writeTxt("lines:" + lineCount.linecount(file));
		wordDetail.worddetail(file);
		scanner.close();
	}
}
