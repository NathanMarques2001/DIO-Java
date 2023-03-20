package Queue;

public class Node<T> {
	private Object object;
	private Node<T> nodeRef;

	public Node() {

	}

	public Node(T object) {
		this.nodeRef = null;
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public Node<T> getNodeRef() {
		return nodeRef;
	}

	public void setNodeRef(Node<T> nodeRef) {
		this.nodeRef = nodeRef;
	}

	@Override
	public String toString() {
		return "Node [object=" + object + "]";
	}
}
