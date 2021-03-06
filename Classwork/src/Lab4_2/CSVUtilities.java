package Lab4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author BT_1N3_16
 *
 */
public class CSVUtilities {
	public ArrayList<String> CSVData = new ArrayList<>();
	
	/**
	 * Constructor accepts a File and reads all the data into CSVData
	 * @param csv
	 * @throws FileNotFoundException
	 */
	public CSVUtilities(File csv) throws FileNotFoundException {
	      FileReader file = new FileReader(csv);
	      
		  try (BufferedReader br = new BufferedReader(file)){
	            String line = br.readLine();
	            
	            while (line != null) {					
	            	this.CSVData.add(line);
	            	line = br.readLine();
	        }
	        } catch(IOException ioe) {
	        	ioe.printStackTrace();
	        }
	}

	/**
	 * @return an ArrayList with the headers for each column
	 */
	public List<String> getColumnHeaders(){
		ArrayList<String> results = new ArrayList<>();
		String[] headings = CSVData.get(0).split(",");
		for (String s: headings) {
			results.add(s);
		}
		return results;
	}

	/**
	 * @param column
	 * @return an ArrayList with the data for a column specified
	 */
	public List<String> getDataString(int column){
		List<String> results = new ArrayList<>();
		for (int i = 1; i<CSVData.size(); i++) {
			String[] r = CSVData.get(i).split(",");
			if(r.length > column) {
				results.add(r[column]);
			}
			else {
				results.add("Z");
			}
		}
		return results;
	}

	/**
	 * @param column
	 * @return an ArrayList with the data converted to Integer
	 */
	public List<Integer> getDataInt(int column){
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i<CSVData.size(); i++) {
			String[] r = CSVData.get(i).split(",");
			result.add(Integer.parseInt(r[column]));
		}
		return result;
	}

	/**
	 * @param column
	 * @return an ArrayList with the data converted to Double
	 */
	public List<Double> getDataDouble(int column){
		List<Double> result = new ArrayList<>();
		for (int i = 1; i<CSVData.size(); i++) {
			String[] r = CSVData.get(i).split(",");
			result.add(Double.parseDouble(r[column]));
		}
		return result;
	}
	
	/**
	 * @param csvFile
	 * @param borough
	 * @param grade
	 * @return the counts of a grade in a specified borough
	 */
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
	
	/**
	 * @param csvFile
	 * @param borough
	 * @return list containing the counts of each grade from a specified borough
	 */
	public static List<Integer> getAllGrades(CSVUtilities csvFile, String borough) {
		List<Integer> total = new ArrayList<>();
		String[] grade = {"A","B","C"};
		for (String s: grade) {
			total.add(gradeCount(csvFile, borough, s));
		}
		return total;
	}
}
