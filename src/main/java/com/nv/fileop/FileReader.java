package com.nv.fileop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
	public static final String inPath="F:\\Workspace\\Practice\\fileoperations\\src\\main\\resources\\DM_data.txt";
	public static final String outPath="F:\\Workspace\\Practice\\fileoperations\\src\\main\\resources\\DM_data1.txt";
	
	public static void main(String[] args) throws IOException {
		fileOperations(inPath, outPath);
	}
	
	
	static void fileOperations(String inPath,String outPath) throws IOException {	
		String S=null;
		String S1=null;
		String[] words=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new java.io.FileReader(inPath));	
			bw=new BufferedWriter(new FileWriter(outPath));
			while((S=br.readLine())!=null) {
				words=null;
				words=S.split(":");
				S1=words[0];
				words=words[1].split(" ",2);
				bw.write(words[1]+" , "+S1+" "+words[0]+"\n");
			}
		}finally {
			if(br!=null)
					br.close();
			if(bw!=null)
					bw.close();
		}
	
}
}

