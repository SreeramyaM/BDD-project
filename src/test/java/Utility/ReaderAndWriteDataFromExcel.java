package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ReaderAndWriteDataFromExcel {
	public ReaderAndWriteDataFromExcel() throws Exception {
	}
	private static WritableCellFormat courier;

	public void writeDataToExcelFile(String strData, String sheetName, String colHeader, String FILE_PATH) throws Exception {
		
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);
		
		int intRowCount = wwb.getSheet(sheetName).getRows();
		int intColCount = wwb.getSheet(sheetName).getColumns();
		int colIndex = 0;		
		
		try
		{			
			for(int z = 0; z <= intColCount-1; z++ ) {
				
				jxl.Cell[] value = (jxl.Cell[]) wwb.getSheet(sheetName).getColumn(z);
				String result = value[0].getContents();
				
				if(result.equals(colHeader))
				{
					colIndex = z;
					break;
				}
				
			}
						
			for (int intRow = 0; intRow <= intRowCount; intRow++) {
				WritableCell cell = wwb.getSheet(sheetName).getWritableCell(colIndex, intRow);
				
				if (cell.getType() == CellType.EMPTY) {
					
					WritableCellFormat wcf1 = new WritableCellFormat();
					
					wcf1.setBorder(Border.ALL, BorderLineStyle.THIN);
					wcf1.setWrap(true);
					
					WritableFont courier10pt = new WritableFont(WritableFont.COURIER, 10);
					courier = new WritableCellFormat(courier10pt);
					
					wcf1.setFont(courier10pt);	         
					Label label0 = new Label(colIndex, intRow, strData, wcf1);
					
					wwb.getSheet(sheetName).addCell(label0);
					wwb.write();
					
					intRow = intRowCount + 1;
					
					break;
				}
			}
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			wwb.close();
		}
	}

	public String readingDataFromExcel(String sheetName, String colHeader, String filePath) throws BiffException, IOException, WriteException {
		String result = "";
		Sheet ws = null;
		
		FileInputStream file = new FileInputStream(new File(filePath));
		HSSFWorkbook workbook_ = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook_.getSheet(sheetName);
		
		Workbook wwb = Workbook.getWorkbook(new File(filePath));

		//int intRowCount = wwb.getSheet(sheetName).getRows();
		int intColCount = wwb.getSheet(sheetName).getColumns();
		int colIndex = 0;		
		
		try
		{			
			for(int z = 0; z <= intColCount-1; z++ ) {
				
				jxl.Cell[] value = (jxl.Cell[]) wwb.getSheet(sheetName).getColumn(z);
				String result1 = value[0].getContents();
				
				if(result1.equals(colHeader))
				{
					colIndex = z;
					break;
				}				
			}			
		
			Iterator<Row> rowIterator = sheet.iterator();
			for (Row row : sheet) {
				Iterator<Cell> cellIterator = row.cellIterator();
				for (Cell cell : row) {
					if(cell.getColumnIndex() <= intColCount && cell.getColumnIndex() == colIndex)
					{
						if (cell.getStringCellValue() != null && cell.getStringCellValue() != "") {
							result = cell.getStringCellValue();
						} else {
							break;
						}						
					}
				}
			}
			
		}catch(Exception e) {
			
		}
				
		finally
		{
			wwb.close();
		}
		
		return result;
		
	}
	
	public String RunON() throws Exception {
		String strResult = "Local System";
		return strResult;
	}

	  public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {		          
		          return true;
		      }
		          }
		      return false;
		  }
}
