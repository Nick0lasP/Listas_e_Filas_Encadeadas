package ex2;


public class PrincipalTeste {

	public static void main(String[] args) {
		int tamanho = 10;

		LinkedQueue<Integer> fila = new LinkedQueue<>(tamanho);

		System.out.println(fila.isEmpty());

		int[] numeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			numeros[i] = (int) (Math.random() * 1000 + 1);
		}

		for (int i = 0; i < tamanho; i++) {
			fila.enqueue(numeros[i]);
		}
		
		//pequena rotina que fiz para testar, está bem bagunçada, fique a vontade para alterar
		System.out.println(fila.toString());
		System.out.println(fila.numElements());
		System.out.println(fila.isEmpty());
		System.out.println(fila.isFull());
		System.out.println(fila.back());
		System.out.println(fila.front());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.numElements());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.back());
		System.out.println(fila.front());
		System.out.println(fila.dequeue());
		System.out.println(fila.isEmpty());
		System.out.println(fila.isFull());
		System.out.println(fila.toString());
		System.out.println(fila.numElements());
		fila.enqueue(124);
		System.out.println(fila.toString());
		System.out.println(fila.back());
		System.out.println(fila.front());
		fila.enqueue(12);
		System.out.println(fila.toString());
		System.out.println(fila.back());
		System.out.println(fila.front());
		

	}

}
