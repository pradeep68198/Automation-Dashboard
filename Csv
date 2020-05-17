package com.test.validation;

import java.io.IOException;

public class Csv {

	public static void main(String[] args) throws IOException {
		
		String path1="C:\\Users\\Admin\\Desktop\\Pavithra\\New folder\\Prade1.csv";
		String path2="C:\\Users\\Admin\\Desktop\\Pavithra\\New folder\\Prade2.csv";
		String path3="C:\\Users\\Admin\\Desktop\\Pavithra\\New folder\\Prade3.csv";
		String path4="C:\\Users\\Admin\\Desktop\\Pavithra\\New folder\\Prade4.csv";
		
		
		String fin1="cmd /c start /min java -jar Cobol2Csv.jar -I DTAR020.bin -O "+path1+" -C DTAR020.cbl -Q DoubleQuote -IFS Fixed_Length -IC CP037 -ofs Byte_Text -oc cp1252";
		String fin2="cmd /c start /min java -jar Cobol2Csv.jar -I DTAR020.bin -O "+path2+" -C DTAR020.cbl -Q DoubleQuote -IFS Fixed_Length -IC CP037 -ofs Byte_Text -oc cp1252 -D x'01'";
		String fin3="cmd /c start /min java -jar Cobol2Csv.jar -I DTAR020.bin -O "+path3+" -C DTAR020.cbl -Q DoubleQuote -IFS Fixed_Length -IC CP037 -ofs Byte_Text_NAME_1ST_LINE -oc utf-8 -D x'01'";
		String fin4="cmd /c start /min java -jar Cobol2Csv.jar -I DTAR020.bin -O "+path4+" -C DTAR020.cbl -Q ' -IFS Fixed_Length -IC CP037 -D \\u0001";
		
		Runtime run=Runtime.getRuntime();
		Process p1=run.exec(fin1);
		//Process p2=run.exec(fin2);
		//Process p3=run.exec(fin3);
		//Process p4=run.exec(fin4);
		

	}

}
