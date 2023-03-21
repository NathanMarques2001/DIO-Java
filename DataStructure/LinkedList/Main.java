package LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<String>();

		lista.add("conteudo 1");
		lista.add("conteudo 2");
		lista.add("conteudo 3");
		lista.add("conteudo 4");

		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));

		System.out.println(lista);

		System.out.println("Removendo da lista o dado -> " + lista.remove(3));
		System.out.println(lista);
	}

}
