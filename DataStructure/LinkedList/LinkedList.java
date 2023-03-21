package LinkedList;

public class LinkedList<T> {

	Node<T> firstNode;

	public LinkedList() {
		firstNode = null;
	}

	public void add(T content) {
		Node<T> newNode = new Node<T>(content);
		if (this.isEmpty()) {
			firstNode = newNode;
			return;
		}
		Node<T> aux = firstNode;
		for (int i = 0; i < this.size() - 1; i++) {
			aux = aux.getNextNode();
		}
		aux.setNextNode(newNode);
	}

	public T get(int index) {
		validateIndex(index);
		return getNode(index).getContent();
	}

	private Node<T> getNode(int index) {

		validateIndex(index);

		Node<T> aux = firstNode;
		Node<T> returnNode = null;

		for (int i = 0; i <= index; i++) {
			returnNode = aux;
			aux = aux.getNextNode();
		}
		return returnNode;
	}

	public T remove(int index) {
		validateIndex(index);
		Node<T> pivot = this.getNode(index);

		if (index == 0) {
			firstNode = pivot.getNextNode();
			return pivot.getContent();
		}

		Node<T> previousNode = getNode(index - 1);
		previousNode.setNextNode(pivot.getNextNode());

		return pivot.getContent();
	}

	public int size() {
		int listLength = 0;
		Node<T> aux = firstNode;

		while (true) {
			if (aux != null) {
				listLength++;
				if (aux.getNextNode() != null) {
					aux = aux.getNextNode();
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return listLength;
	}

	public boolean isEmpty() {
		return firstNode == null ? true : false;
	}

	private void validateIndex(int index) {
		if (index >= size()) {
			throw new IndexOutOfBoundsException(
					"Nao existe conteudo no indice " + index + "nesta lista. Esta lista tem tamanho " + (size() - 1));
		}
	}

	@Override
	public String toString() {
		String str = "";
		Node<T> aux = firstNode;
		for (int i = 0; i < this.size(); i++) {
			str += "No [conteudo=" + aux.getContent() + "]--->";
			aux = aux.getNextNode();
		}
		str += "null";
		return str;
	}
}
