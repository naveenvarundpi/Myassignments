package readata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String[][] readexceldata(String excelname) {
		// TODO Auto-generated method stub
		
		try {
			XSSFWorkbook wb;
			wb = new XSSFWorkbook("./data/"+excelname+".xlsx");
			XSSFSheet sheetAt = wb.getSheetAt(0);
			int lastRowNum = sheetAt.getLastRowNum();
			System.out.println();
			short lastCellNum = sheetAt.getRow(1).getLastCellNum();
			String[][] data=new String[lastRowNum][lastCellNum];
			for(int i=1;i<=lastRowNum;i++)
			{
				XSSFRow row = sheetAt.getRow(i);
				//short lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum; j++) 
				{
				String stringCellValue = row.getCell(j).getStringCellValue();
				//System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				}
				//System.out.println();
			}
			wb.close();
			return data;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
}
