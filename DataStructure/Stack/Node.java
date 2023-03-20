package Stack;

public class Node {

	private int data;
	private Node nodeRef;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNodeRef() {
		return nodeRef;
	}

	public void setNodeRef(Node nodeRef) {
		this.nodeRef = nodeRef;
	}

	@Override
	public String toString() {
		return "Node [Dado=" + data + "]";
	}

}
