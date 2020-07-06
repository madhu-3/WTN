package com.wipro.iostreams;
import java.io.*;
public class Ioex2 {

	public static void main(String[] args) throws IOException {
		int c=0;
		System.out.println("Enter data and to stop $");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\IOex2.txt");
		while((char)c!='$'){
			c=br.read();
			fw.write(c);
		}
		fw.close();
		FileReader fr=new FileReader("C:\\Users\\DELL\\Desktop\\IOex2.txt");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		fr.close();
		// TODO Auto-generated method stub

	}

}
