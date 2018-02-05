package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil 
{
	static Workbook wb;
	public ExcelFileUtil() throws Exception
	{
		FileInputStream fis = new FileInputStream("./Utilities/ExcelFileUtil.java");
		wb = WorkbookFactory.create(fis);
	}
	
	public void rowCount(String sheetname)
	{
		wb.getSheet(sheetname).getLastRowNum();
	}
	
	public void colCount(String sheetname, int rownum)
	{
		wb.getSheet(sheetname).getRow(rownum).getLastCellNum();
	}
	
	public static String getData(String sheetname, int row, int column)
	{
		String data = "";
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType() == Cell.CELL_TYPE_NUMERIC)
		{
			int celldata = (int) wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			data = String.valueOf(celldata);
		}
		else
			{
				data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
			}
		return data;
	}
	
	public static void setData(String sheetname, int row, int column, String data)
	{
		Sheet sh = wb.getSheet(sheetname);
		Row rownum = sh.getRow(row);
		Cell cell = rownum.getCell(column);
		cell.setCellValue(data);
		
	}
}















