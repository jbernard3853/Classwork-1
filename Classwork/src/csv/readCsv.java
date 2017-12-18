package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;

public class readCsv {

	public static void main (String[] args) throws IOException {
		List<Salad> data = readInfo("salads.csv");
		Salad beef = new Salad("beef salad", "$10000");
		addLine(beef);
		for (Salad s : data) { 
			System.out.println(s); 
		}

	}
	
	private static List<Salad> readInfo(String fileName){
        List<Salad> data = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            
            while (line != null) {
            	String[] attributes = line.split(",");
            	Salad salad = createSalad(attributes);
            	data.add(salad);
            	line = br.readLine();
        }
        } catch(IOException ioe) {
        	ioe.printStackTrace();
        }
        return data;
	}
       
	public static Salad createSalad(String[] metadata) {
		String name = metadata[0];
		String price = metadata[1];
		return new Salad(name,price);
	}
	
	public static void addLine(Salad salad) throws IOException {
		FileWriter writer = new FileWriter("salads.csv", true);
		
			try {
				writer.append(salad.getName());
				writer.append(",");
				writer.append(salad.getPrice());
				writer.append("\n");
			}
			catch (IOException e) {
				e.printStackTrace();
			} 	
			writer.flush();
			writer.close();
	}
}
