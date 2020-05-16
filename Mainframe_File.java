package com.test.validation;

import java.io.FileNotFoundException;
import java.io.IOException;

import net.sf.JRecord.JRecordInterface1;
import net.sf.JRecord.Common.Constants;
import net.sf.JRecord.Details.AbstractLine;
import net.sf.JRecord.IO.AbstractLineReader;
import net.sf.JRecord.IO.AbstractLineWriter;
import net.sf.JRecord.def.IO.builders.ICobolIOBuilder;

public class Mainframe_File {
	
	public static String salesFile      = "DTAR020.bin";
	public static String salesFileOut   = "C:\\Users\\Admin\\Desktop\\Pavithra\\DTAR020out.txt";
	static double GST_CONVERSION = 1.1;
	
	 static AbstractLine saleRecord;
	 static double gstExclusive;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	
		   ICobolIOBuilder ioBuilder = JRecordInterface1.COBOL
                   .newIOBuilder("DTAR020.cbl")
                       .setFont("cp037")
                       .setFileOrganization(Constants.IO_FIXED_LENGTH_RECORDS);   
		  
       AbstractLineReader reader = ioBuilder.newReader(salesFile);
       AbstractLineWriter writer = ioBuilder.newWriter(salesFileOut);
       
       while ((saleRecord = reader.read()) != null) {
           System.out.println(saleRecord.getFieldValue("DTAR020-KEYCODE-NO").asString()
                   + " " + saleRecord.getFieldValue("DTAR020-QTY-SOLD").asString()
                   + " " + saleRecord.getFieldValue("DTAR020-SALE-PRICE").asString());

           //gstExclusive = saleRecord.getFieldValue("DTAR020-SALE-PRICE").asDouble() / GST_CONVERSION;
           //saleRecord.getFieldValue("DTAR020-SALE-PRICE").set(gstExclusive);
          // writer.write(saleRecord);

         //System.out.println(" " + saleRecord.getFieldValue("DTAR020-SALE-PRICE").asString());
       }
      
      reader.close();
       writer.close();
	
	}

}
