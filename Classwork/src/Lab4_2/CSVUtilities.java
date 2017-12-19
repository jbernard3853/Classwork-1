package Lab4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import csv.Salad;

public class CSVUtilities {
	public ArrayList<String> CVSData = new ArrayList<>();
	
	//Constructor accepts a File and reads all the data into CSVData
	public CSVUtilities(File csv) throws FileNotFoundException {
	      FileReader file = new FileReader(csv);
	      
		  try (BufferedReader br = new BufferedReader(file)){
	            String line = br.readLine();
	            
	            while (line != null) {
	            	String[] attributes = line.split(",");
	            	/*
					for(String s :attributes) {
						System.out.println(s);
					}
					*/
	            	this.CVSData.addAll(Arrays.asList(attributes));
	            	line = br.readLine();
	        }
	        } catch(IOException ioe) {
	        	ioe.printStackTrace();
	        }
	}
	
	/*
	public static Restaurant createRestaurant(String[] metadata) {
		String name = metadata[0];
		String price = metadata[1];
		return new Salad(name,price);
	}
	 */
	
	//Return an ArrayList with the headers for each column
	public List<String> getColumnHeaders(){
		ArrayList<String> results = new ArrayList<>();
		String[] headings = CVSData.get(0).split(",");
		for (String s: headings) {
			results.add(s);
		}
		return results;
	}

	//Return an ArrayList with the data for a column specified
	public List<String> getDataString(int column){
		ArrayList<String> results = new ArrayList<>();
		for (String s: CVSData) {
			String[] r = s.split(",");
			results.add(r[column]);
		}
		return results;
	}

	//Return an ArrayList with the data converted to Integer
	public List<Integer> getDataInt(int column){
		ArrayList<Integer> result = new ArrayList<>();
		for(String s: CVSData) {
			String[] r = s.split(",");
			result.add(Integer.parseInt(s));
		}
		return result;
	}

	//Return an ArrayList with the data converted to Double
	public List<Double> getDataDouble(int column){
		ArrayList<Double> result = new ArrayList<>();
		for(String s: CVSData) {
			String[] r = s.split(",");
			result.add(Double.parseDouble(s));
		}
		return result;
	}


}
