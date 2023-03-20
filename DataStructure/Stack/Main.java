package Stack;

public class Main {

	public static void main(String[] args) {

		Stack pilha = new Stack();

		pilha.push(new Node(1));
		pilha.push(new Node(2));
		pilha.push(new Node(3));
		pilha.push(new Node(4));
		pilha.push(new Node(5));
		pilha.push(new Node(6));

		System.out.println(pilha);

		System.out.println("Removendo do topo o dado -> " + pilha.pop());

		System.out.println(pilha);

		System.out.println("Pilha vazia? -> " + pilha.isEmpty());

		pilha.push(new Node(99));
		System.out.println("O topo da pilha e o dado -> " + pilha.top());
	}

}
