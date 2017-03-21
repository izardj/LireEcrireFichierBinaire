package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) {
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try{
			File f1 = new File("chat.jpg");
			fr = new FileInputStream(f1);
			
			File f2 = new File("nouveau_chat.jpg");
			fw = new FileOutputStream(f2);
			
			int c;
			while((c=fr.read())!=-1){
				fw.write(c);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fr != null) fr.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
			try {
				if(fw != null) fw.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}


	}

}
