import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class charCount {

	public static int charCount(File file) {
		int charcount = 0;
		try {
			if (file.isFile() && file.exists()) {	//����ļ����Ƿ��������ļ��Ƿ����
				InputStreamReader isReader = new InputStreamReader(new FileInputStream(file),"utf-8");
				BufferedReader bReader = new BufferedReader(isReader);
				int value = 0;
				int value2 = 0;
				while((value = bReader.read()) != -1) {
					if (value >= 0 && value<=255) {
						charcount++;
						value2 = value;
					}
				}
				charcount = charcount - lineCount.lineCount(file);
				//���ڻس�ռ�����ַ�
				bReader.close();
			} else {
				System.out.println("�ļ�������");
			}
		}catch (Exception e) {
			System.out.println("�ļ���ȡ����");
		}
		return charcount;
	}
	
}
