package Queue;

public class Main {

	public static void main(String[] args) {

		Queue<String> fila = new Queue<String>();

		fila.enqueue("primeiro");
		fila.enqueue("segundo");
		fila.enqueue("terceiro");
		fila.enqueue("quarto");

		System.out.println(fila);

		System.out.println("Retirando o primeiro dado -> " + fila.dequeue());
		System.out.println(fila);

		fila.enqueue("ultimo");
		System.out.println(fila);

		System.out.println("Primeiro dado -> " + fila.first());
	}

}
