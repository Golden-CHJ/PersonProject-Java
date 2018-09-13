
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class lineCount {
	public static int linecount(File file) {
		int linecount = 0;
		try {
			if (file.isFile() && file.exists()) {	//����ļ����Ƿ��������ļ��Ƿ����
				FileReader fileReader = new FileReader(file);
				LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
				while(lineNumberReader.readLine() != null) {
					linecount++;
				}
				lineNumberReader.close();
			} else {
				System.out.println("�ļ�������");
			}
		}catch (Exception e) {
			System.out.println("�ļ���ȡ����");
		}
		return linecount;
	}
}
