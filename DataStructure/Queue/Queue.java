package Queue;

public class Queue<T> {

	private Node<T> lastNode;

	public Queue() {
		this.lastNode = null;
	}

	public void enqueue(T obj) {
		Node<T> newNode = new Node<T>(obj);
		newNode.setNodeRef(lastNode);
		lastNode = newNode;
	}

	public T dequeue() {
		if (!isEmpty()) {
			Node<T> firstNode = lastNode;
			Node<T> aux = lastNode;
			while (true) {
				if (firstNode.getNodeRef() != null) {
					aux = firstNode;
					firstNode = firstNode.getNodeRef();
				} else {
					aux.setNodeRef(null);
					break;
				}
			}
			return (T)firstNode.getObject();
		}
		return null;
	}

	public T first() {
		if (!isEmpty()) {
			Node<T> firstNode = lastNode;
			while (true) {
				if (firstNode.getNodeRef() != null) {
					firstNode = firstNode.getNodeRef();
				} else {
					break;
				}
			}
			return (T) firstNode.getObject();
		}
		return null;
	}

	public boolean isEmpty() {
		return this.lastNode == null ? true : false;
	}

	@Override
	public String toString() {
		String finalString = "";
		Node<T> aux = lastNode;

		if (lastNode != null) {
			while (true) {
				finalString += "[No{objeto=" + aux.getObject() + "}]--->";
				if (aux.getNodeRef() != null) {
					aux = aux.getNodeRef();
				} else {
					finalString += "null";
					break;
				}
			}
		} else {
			finalString = "null";
		}
		return finalString;
	}
}
