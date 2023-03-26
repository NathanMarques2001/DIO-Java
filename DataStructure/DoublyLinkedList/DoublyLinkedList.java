package DoublyLinkedList;

public class DoublyLinkedList<T> {

	private DoublyNode<T> firstNode;
	private DoublyNode<T> lastNode;
	private int listLength;

	public DoublyLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.listLength = 0;
	}

	public void add(T element) {
		DoublyNode<T> newNode = new DoublyNode(element);
		newNode.setNextNode(null);
		newNode.setPreviousNode(this.lastNode);
		if (this.firstNode == null) {
			this.firstNode = newNode;
		}
		if (this.lastNode != null) {
			this.lastNode.setNextNode(newNode);
		}
		this.lastNode = newNode;
		this.listLength++;
	}

	public void add(int index, T element) {
		DoublyNode<T> aux = getNode(index);
		DoublyNode<T> newNode = new DoublyNode(element);
		newNode.setNextNode(aux);

		if (newNode.getNextNode() != null) {
			newNode.setPreviousNode(aux.getPreviousNode());
			newNode.getNextNode().setPreviousNode(newNode);
		} else {
			newNode.setPreviousNode(this.lastNode);
			this.lastNode = newNode;
		}

		if (index == 0) {
			this.firstNode = newNode;
		} else {
			newNode.getPreviousNode().setNextNode(newNode);
		}
		this.listLength++;
	}

	public void remove(int index) {
		if (index == 0) {
			this.firstNode = this.firstNode.getNextNode();
			if (this.firstNode != null) {
				this.firstNode.setPreviousNode(null);
			}
		} else {
			DoublyNode<T> aux = getNode(index);
			aux.getPreviousNode().setNextNode(aux.getNextNode());
			if (aux != this.lastNode) {
				aux.getNextNode().setPreviousNode(aux.getPreviousNode());
			} else {
				this.lastNode = aux;
			}
		}
		this.listLength--;
	}

	public int size() {
		return this.listLength;
	}

	public T get(int index) {
		return this.getNode(index).getContent();
	}

	private DoublyNode<T> getNode(int index) {
		DoublyNode<T> aux = this.firstNode;

		for (int i = 0; (i < index) && (aux != null); i++) {
			aux = aux.getNextNode();
		}
		return aux;
	}

	@Override
	public String toString() {
		String str = "";

		DoublyNode<T> aux = this.firstNode;
		for (int i = 0; i < size(); i++) {
			str += "[Node{Content=" + aux.getContent() + "}]-->";
			aux = aux.getNextNode();
		}
		str += "null";
		return str;
	}
}
