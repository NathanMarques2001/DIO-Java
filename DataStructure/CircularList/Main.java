package CircularList;

public class Main {

	public static void main(String[] args) {

		CircularList<String> listaCircular = new CircularList<String>();

		listaCircular.add("c0");
		System.out.println(listaCircular);

		listaCircular.remove(0);
		System.out.println(listaCircular);

		listaCircular.add("c1");
		listaCircular.add("c2");
		System.out.println(listaCircular);
		
		System.out.println(listaCircular.get(0));
		System.out.println(listaCircular.get(2));
	}

}
