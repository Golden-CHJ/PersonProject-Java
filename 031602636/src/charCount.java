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
				while(bReader.read() != -1)
					charcount++;
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
