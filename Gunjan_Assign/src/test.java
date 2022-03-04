import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.opencsv.CSVWriter;

public class test {
	 public static void main(String argv[])throws IOException{
	    
		 	String str="marry had a little lamb.peter called for the wolf,and Aescop came.Cinderella likes shoes.";
		 
		    String[] arrOfStr = str.split("[, ?.@]+");
		    
		    String filename = "C:\\Users\\Gunjan\\Desktop\\sentenc63.csv"; 
		    HSSFWorkbook workbook = new HSSFWorkbook();  
		    HSSFSheet sheet = workbook.createSheet("Senetence");
		    int k=1;
		 
		    
		    		     
		    //split the sentence and words
		    String[] res = str.split("[.]", 0);
		    System.out.println(Arrays.toString(res)) ;
		    
		    HSSFRow rowhead = sheet.createRow(0);  
		    rowhead.createCell(0).setCellValue(Arrays.toString(res));  
		    		       
		     for(String myStr: res)	{    	    							    	
		    System.out.println(myStr);  
		    
		     HSSFRow rowhead1 = sheet.createRow(k);  
		     rowhead1.createCell(0).setCellValue(myStr); 
			 k++;
		     }	
		     
		     FileOutputStream fileOut = new FileOutputStream(filename);  
		     workbook.write(fileOut);  
		     //closing the Stream  
		     fileOut.close();  
		     //closing the workbook  
		     workbook.close();  
		     
	      
	 }     
}
