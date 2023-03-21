package LinkedList;

public class Node<T> {

	private T content;
	private Node nextNode;

	public Node() {
	}

	public Node(T content) {
		this.nextNode = null;
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + "]";
	}

	public String toStringLinked() {
		String str = "Node [content=" + content + "]";

		if (nextNode != null) {
			str += "->" + nextNode.toString();
		} else {
			str += "->null";
		}
		return str;
	}
}
