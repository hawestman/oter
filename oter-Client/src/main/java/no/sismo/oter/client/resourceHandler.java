package no.sismo.oter.client;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class resourceHandler {
	
	public resourceHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getIdentsFromFile(String fileName){
		
		List<String> numberIdList = new ArrayList<String>();
		
		
		
		ClassLoader classLoader = getClass().getClassLoader();
		
		File file = new File(classLoader.getResource(fileName).getFile());
		 
		try (Scanner scanner = new Scanner(file)) {
	 
			while (scanner.hasNextLine() && numberIdList.size() < 200) {
				
				
				String[] line = scanner.nextLine().split(";");
				
				String fonr = line[0];
				String fonrType = line[1];
				if(fonr.matches("[0-9]+") && fonr.length() >= 8 && fonr.length() <= 11){
					numberIdList.add(fonr);
				}
				
				//System.out.println(fonr);
				
			}
			
			
			
			scanner.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return numberIdList;
	}
	
}
