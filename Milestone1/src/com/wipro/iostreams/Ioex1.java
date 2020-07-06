package com.wipro.iostreams;
import java.io.*;
public class Ioex1 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\DELL\\Desktop\\IOex1.txt");
		FileInputStream fin=new FileInputStream("C:\\Users\\DELL\\Desktop\\IOex1.txt");  
		String s="Example for fileinput and fileoutput stream";    
        byte b[]=s.getBytes();  
        fout.write(b);    
        fout.close();    
        System.out.println("success..."); 
        int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i); 
        }
        fin.close();
	}

}
