package CircularList;

public class CircularList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int listLength;

	public CircularList() {
		this.head = null;
		this.tail = null;
		this.listLength = 0;
	}

	public void add(T element) {
		Node<T> newNode = new Node<T>(element);

		if (this.listLength == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.head.setNextNode(this.tail);
		} else {
			newNode.setNextNode(this.tail);
			this.head.setNextNode(newNode);
			this.tail = newNode;
		}
		this.listLength++;
	}

	public T get(int index) {
		return this.getNode(index).getContent();
	}

	private Node<T> getNode(int index) {
		if (this.isEmpty()) {
			throw new IndexOutOfBoundsException("A lista esta vazia!");
		}
		if (index == 0) {
			return this.tail;
		}

		Node<T> aux = this.tail;
		for (int i = 0; i < index; i++) {
			aux = aux.getNextNode();
		}

		return aux;
	}

	public void remove(int index) {
		if (index >= this.listLength) {
			throw new IndexOutOfBoundsException("O indice e maior que o tamanho da lista!");
		}

		Node<T> aux = this.tail;
		if (index == 0) {
			this.tail = this.tail.getNextNode();
			this.head.setNextNode(this.tail);

		} else if (index == 1) {
			this.tail.setNextNode(this.tail.getNextNode().getNextNode());

		} else {
			for (int i = 0; i < index - 1; i++) {
				aux = aux.getNextNode();
			}
			aux.setNextNode(aux.getNextNode().getNextNode());
		}
		this.listLength--;
	}

	public boolean isEmpty() {
		return this.listLength == 0 ? true : false;
	}

	public int size() {
		return this.listLength;
	}

	@Override
	public String toString() {
		String str = "";

		Node<T> aux = this.tail;
		for (int i = 0; i < this.size(); i++) {
			str += "[Node{Content=" + aux.getContent() + "}]-->";
			aux = aux.getNextNode();
		}
		str += this.isEmpty() ? "null" : "(Retorna ao inicio)";
		return str;
	}
}
