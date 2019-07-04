package UIOperatonExm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	String path;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFCell cell;
	public FileInputStream input;

	public excelReader(String path) throws FileNotFoundException {
		this.path = path;

		try {
			input = new FileInputStream(path);
			workbook = new XSSFWorkbook(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public String[][] getDataFromSheet(String sheetName, String ExcelSheet) {
		String dataset[][] = null;
		try {
			sheet = workbook.getSheet(sheetName);
			
			int totalRows = sheet.getLastRowNum()+1;
			
			int totalColumns = sheet.getRow(0).getLastCellNum();
			
			dataset = new String[totalRows-1][totalColumns];
			
			for(int i=1;i<totalRows;i++){
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<totalColumns;j++){
					XSSFCell cell = row.getCell(j);
					
					if(cell.getCellType()== Cell.CELL_TYPE_STRING);
					dataset[i-1][j]=cell.getStringCellValue();
				}
			}

			return dataset;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataset;
	}

	public static void main(String[] args) throws IOException {
		
		String path = "/home/vinayak/workspace/WebApplication/src/test/java/UIOperatonExm/Data.xlsx";
		excelReader reader = new excelReader(path);
		reader.getDataFromSheet("ABC", "Data.xlsx");
	}

}
