package TestNg.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Salary {

	public static void main(String[] args) throws Throwable    {
		FileInputStream fis = new FileInputStream("./SDET1.xlsx");

		Workbook workbook1 = WorkbookFactory.create(fis);
		int lastrow = workbook1.getSheet("Sheet3").getLastRowNum();

		for (int i = 1; i <= lastrow; i++) 
		{
			String salaryofemp= workbook1.getSheet("Sheet3").getRow(i).getCell(2).getStringCellValue();		

			if(Integer.parseInt(salaryofemp)>50000)
			{
				System.out.println(workbook1.getSheet("Sheet3").getRow(i).getCell(1).getStringCellValue()+" "+salaryofemp);
			}
		}
	}
}

