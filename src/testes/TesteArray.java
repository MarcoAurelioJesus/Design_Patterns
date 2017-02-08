package testes;

public class TesteArray {
	
	 public static void main(String args[]) {
		    int[] idades = new int[3];
		    for (int i = 0; i < 3; i++) {
		      idades[i] = i * 3;
		    }
		    
		    // imprimindo toda a array
		    for (int x : idades) {
		      System.out.println(x);
		    }
		  }
		}