package Lab4_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class CSVReader {

	public static void main(String[] args) {
			cards.add(base);
			money.add(Integer.parseInt(text.getText()));
		
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("status.txt"), "utf-8"));
		writer.write(text.getText());
		writer.close();
	}
	
	public static void writeScore() {
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("hiscores.txt"), "utf-8"));
		if (Integer.parseInt(text.getText()) > 0) {	
			writer.write(text.getText());
			writer.close();
		}
	}
	
	public static void topScores(File csv, int count) {
		int total = 0;
		ArrayList<Integer> top = new ArrayList<>();
		   FileReader file = new FileReader(csv);
			  try (BufferedReader br = new BufferedReader(file)){
		            String line = br.readLine();
		            
		            while (line != null && total < count) {					
						top.add(line)
						line = br.readLine();
						total++;
		        }
		        } catch(IOException ioe) {
		        	ioe.printStackTrace();
		   }
	}
}
