package CircularList;

public class Node<T> {

	private T content;
	private Node<T> nextNode;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node(T content) {
		this.content = content;
		this.nextNode = null;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + "]";
	}

}
