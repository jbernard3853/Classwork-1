package Lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
			File theFile = new File("DOHMH_New_York_City_Restaurant_Inspection_Results.csv");
			try {
				CSVUtilities myCSV = new CSVUtilities(theFile);
				//getColumnHeaders
				List<String> headers = myCSV.getColumnHeaders();
				
				/*				
				 * for (String s: headers) {
					System.out.println(s);
				}
				//GetColumnData
				List<String> stringData = myCSV.getDataString(2);
				for (String s: stringData) {
					System.out.println(s);
				}
				*/
				
				List<Integer> brooklyn = myCSV.getAllGrades(myCSV, "BROOKLYN");
				List<Integer> manhattan = myCSV.getAllGrades(myCSV, "MANHATTAN");
				List<Integer> bronx = myCSV.getAllGrades(myCSV, "BRONX");
				List<Integer> queens = myCSV.getAllGrades(myCSV, "QUEENS");
				List<Integer> statenisland = myCSV.getAllGrades(myCSV, "STATEN ISLAND");
				System.out.println(brooklyn);
				System.out.println(manhattan);
				System.out.println(bronx);
				System.out.println(queens);
				System.out.println(statenisland);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}
