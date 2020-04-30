import java.util.*;

public class FASE2 {

	public static void main(String[] args) {
		String ciudad1="Barcelona", ciudad2="Madrid", ciudad3="Valencia" ,ciudad4="Malaga" ,ciudad5="Cadis", ciudad6="Santander";
		
		ArrayList<String> arrayCiutats = new ArrayList<String>();

		arrayCiutats.add(ciudad1); 
		arrayCiutats.add(ciudad2);
		arrayCiutats.add(ciudad3);
		arrayCiutats.add(ciudad4);
		arrayCiutats.add(ciudad5);
		arrayCiutats.add(ciudad6);
		
		Collections.sort(arrayCiutats);
		
		for (String nombre:arrayCiutats){
			
			System.out.println(nombre);
		}
	}

}
