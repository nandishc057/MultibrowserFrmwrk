package com.amazon.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExeclRead implements AutoConstants {
	static FileInputStream exfile;
	static Workbook wb;

	public static int getRowCount(String sheetName) throws FileNotFoundException {
		try {
			exfile = new FileInputStream(execlReadFilePath);
			wb = WorkbookFactory.create(exfile);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		int rCntExecl = wb.getSheet(sheetName).getLastRowNum();
		return rCntExecl;
	}

	public static int getCellCount(String sheetName, int rNumber) {
		try {
			exfile = new FileInputStream(execlReadFilePath);
			wb = WorkbookFactory.create(exfile);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		int cellCount = wb.getSheet(sheetName).getRow(rNumber).getLastCellNum();
		return cellCount;

	}
	
	public static String getData(String sheetName, int rCntExecl, int cellCount) {
		try {
			exfile = new FileInputStream(execlReadFilePath);
			wb = WorkbookFactory.create(exfile);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				Cell cellData= wb.getSheet(sheetName).getRow(rCntExecl).getCell(cellCount);
				return cellData.toString();
//				return cellData.getStringCellValue();
		}
	}