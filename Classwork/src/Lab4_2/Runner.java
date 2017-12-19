package Lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
			File theFile = new File("DOHMH_New_York_City_Restaurant_Inspection_Results.csv");
			try {
				//readCSV
				CSVUtilities myCSV = new CSVUtilities(theFile);
				for(String s :myCSV.CVSData) {
					System.out.println(s);
				}
				//getColumnHeaders
				List<String> headers = myCSV.getColumnHeaders();
				for (String s: headers) {
					System.out.println(s);
				}
				//GetColumnData
				List<String> stringData = myCSV.getDataString(1);
				for (String s: stringData) {
					System.out.println(s);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
