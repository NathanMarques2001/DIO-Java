package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList<String> listaDuplamenteEncadeada = new DoublyLinkedList<String>();

		listaDuplamenteEncadeada.add("c1");
		listaDuplamenteEncadeada.add("c2");
		listaDuplamenteEncadeada.add("c3");
		listaDuplamenteEncadeada.add("c4");
		listaDuplamenteEncadeada.add("c5");
		listaDuplamenteEncadeada.add("c6");
		listaDuplamenteEncadeada.add("c7");

		System.out.println(listaDuplamenteEncadeada);

		System.out.println("Removendo o elemento 3 da lista...");
		listaDuplamenteEncadeada.remove(3);

		System.out.println("Adicionando um elemento a posicao 3 da lista...");
		listaDuplamenteEncadeada.add(3, "99");

		System.out.println(listaDuplamenteEncadeada);
		System.out.println("Elemento 3 da lista -> " + listaDuplamenteEncadeada.get(3));
	}

}
