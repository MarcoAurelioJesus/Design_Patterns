package testes;

public class Turma {

	int[] notas;

 
		
		public static void main(String[] args) {

			Turma fj11 = new Turma();
			fj11.notas = new int[10];
			
			fj11.notas[0] = 9;
			fj11.notas[1] = 2;
			fj11.notas[4] = 3;
			
			for(int i = 0; i < fj11.notas.length ; i++){
				
			System.out.println(fj11.notas[i]);

		}

	}
}