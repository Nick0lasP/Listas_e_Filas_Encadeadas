package ex1;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		int tamanho = 10;
		
		LinkedStack<Integer> pilha =  new LinkedStack<>(tamanho);

		System.out.println(pilha.isEmpty());
		
		int [] numeros = new int[tamanho];
		
		for(int i = 0; i<tamanho; i++) {
			numeros[i] = (int)(Math.random() * 1000 + 1) ;
		}
		
		
		for(int i = 0; i<tamanho; i++) {
			pilha.push(numeros[i]);
		}
		
		//pequena rotina que fiz para testar, está bem bagunçada, fique a vontade para alterar
		System.out.println(pilha.numElements());
		System.out.println(pilha.isFull());
		System.out.println(pilha.toString());
		System.out.println("Retirei o elemento: " + pilha.pop());
		System.out.println(pilha.numElements());
		System.out.println(pilha.top());
		System.out.println(pilha.isEmpty());
		System.out.println(pilha.isFull());
		System.out.println(pilha.toString());
		pilha.push(2378);
		System.out.println(pilha.numElements());
		System.out.println(pilha.isFull());
		System.out.println(pilha.toString());
		
		
	}

}
