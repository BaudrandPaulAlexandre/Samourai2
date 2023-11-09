package histoires;

import personnages.Humain;

public class MonHistoire {

	public static void main (String[] args) {
		
		Humain paul = new Humain("Paul", "limonade", 4); 
		
		paul.bonjour();
		paul.boire();
		
	}
	
}
