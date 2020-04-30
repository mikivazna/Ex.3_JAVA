import java.util.*;
public class FASE4 {

	public static void main(String[] args) {
		
		
		String ciudad1 [] = {"B", "a", "r", "c", "e", "l", "o", "n", "a"};
	
		String ciudad2 [] = {"C", "a", "d", "i", "s"};
		
		String ciudad3 [] = {"M", "a", "d", "r", "i", "d"};
		
		String ciudad4 [] = {"M", "a", "l", "a", "g", "a"};
		
		String ciudad5 [] = {"S", "a", "n", "t", "a", "n", "d", "e", "r"};
		
		String ciudad6 [] = {"V", "a", "l", "e", "n", "c", "i", "a"};
		
		String aux;
		
		int n1 = ciudad1.length;
		
		 for(int i = 0;i <= n1/2; i++){
			 
			 aux = ciudad1[n1-1];
			 ciudad1[n1-1] = ciudad1[i];
			 ciudad1[i] = aux;
			 n1--;
		 }
		 
		 
		 for (int i = 0; i < ciudad1.length; i++){
			 
			 System.out.print(ciudad1[i] + " ");
		 }
		
		
	}

}
