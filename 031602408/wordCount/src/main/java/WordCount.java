package main.java;
import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import lib.java.Print;  
public class WordCount {  
 
    public static void main(String[] args) throws Exception { 
    	Scanner scanner=new Scanner(System.in);
    	String pathname=scanner.nextLine();
        //���ı�����ת��ΪСд
        Reader myReader = new FileReader(pathname);
    	Reader myBufferedReader = new BufferedReader(myReader);
    	CharArrayWriter  tempStream = new CharArrayWriter();  
    	int i = -1;
    	int k1=0;
     	do {
     		k1++;
    	if(i!=-1) 
    	tempStream.write(i);
    	i = myBufferedReader.read();
    	if(i >= 65 && i <= 90){
    	i += 32;
    	}
    	}while(i != -1);
    	myBufferedReader.close();
    	Writer myWriter = new FileWriter(pathname);
    	tempStream.writeTo(myWriter);
    	tempStream.flush();
    	tempStream.close();
    	myWriter.close();
    	///�ٴζ�ȡ�ĵ�
    BufferedReader br = new BufferedReader(new FileReader(pathname));  
        
        List<String> lists = new ArrayList<String>();  //�洢���˺󵥴ʵ��б�  
        String read= null;
		while((read = br.readLine()) != null){  
            String[] wordsArr1 = read.split("[^a-zA-Z]");  //���˳�ֻ������ĸ��  
            for (String word : wordsArr1) {  
                if(word.length() != 0){  //ȥ������Ϊ0����  
                	lists.add(word);  
                }  
            }  
        }  
          
        br.close();  
          
        Map<String, Integer> wordsCount = new TreeMap<String,Integer>();  //�洢���ʼ�����Ϣ��keyֵΪ���ʣ�valueΪ������       
        for (String li : lists) {  
            if(wordsCount.get(li) != null){  
                wordsCount.put(li,wordsCount.get(li) + 1);  
            }else{  
                wordsCount.put(li,1);  
            }  
  
        }  
        System.out.println("Characters: "+k1);
        Print printwords=new Print();
        printwords.printWords(wordsCount);
        Print printline=new Print();
        printline.printline(pathname);
        Print printWordsFrequence=new Print();
        printWordsFrequence.printWordFrequence(wordsCount);
             }  
}
 
  
