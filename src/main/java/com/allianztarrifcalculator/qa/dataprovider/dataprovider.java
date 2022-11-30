package com.allianztarrifcalculator.qa.dataprovider;

import com.allianztarrifcalculator.qa.utility.ExcelLab;
import org.testng.annotations.DataProvider;

import java.io.IOException;

/**
 * @author time
 * @Date 11/27/2022
 */
public class dataprovider {

ExcelLab excelLab = new ExcelLab();

    @DataProvider(name="basicdataprovider")
    Object[][] getBasicData() throws IOException {
        String path = "C:/Users/time/Downloads/Compressed/AllianzTarrifCalculatorProject/src/test/TestData/testData.xlsx";
        int rowNum = excelLab.getRowCount(path, "basicInfo");
        int colCount = excelLab.getCellCount(path,"basicInfo", 1);

        String basicdata[][] = new String[rowNum][colCount];
        for(int i=1; i<=rowNum; i++){
            for (int j=0; j<colCount; j++){
                basicdata[i-1][j] = ExcelLab.getCellData(path, "basicInfo", i,j);
            }
        }
        return (basicdata);
    }

}



