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
				
				List<Integer> brooklyn = getAllGrades(myCSV, "BROOKLYN");
				List<Integer> manhattan = getAllGrades(myCSV, "MANHATTAN");
				List<Integer> bronx = getAllGrades(myCSV, "BRONX");
				List<Integer> queens = getAllGrades(myCSV, "QUEENS");
				List<Integer> statenisland = getAllGrades(myCSV, "STATEN ISLAND");
				System.out.println(brooklyn);
				System.out.println(manhattan);
				System.out.println(bronx);
				System.out.println(queens);
				System.out.println(statenisland);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	
	public static int gradeCount(CSVUtilities csvFile, String borough, String grade) {
		int result = 0;
		List<String> boroughs = csvFile.getDataString(1);
		List<String> grades = csvFile.getDataString(2);
		for (int i = 0; i < boroughs.size(); i++) {
			if(boroughs.get(i) != null && grades.get(i) != null && boroughs.get(i).equals(borough)) {
				if (grades.get(i).equals(grade)) {
					result++;
				}
			}
		}
		return result;
	}
	
	public static List<Integer> getAllGrades(CSVUtilities csvFile, String borough) {
		List<Integer> total = new ArrayList<>();
		String[] grade = {"A","B","C"};
		for (String s: grade) {
			total.add(gradeCount(csvFile, borough, s));
		}
		return total;
	}
}
