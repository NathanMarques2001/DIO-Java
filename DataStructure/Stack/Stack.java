package Stack;

public class Stack {

	private Node topNode;

	public Stack() {
		this.topNode = null;
	}

	public void push(Node newNode) {
		Node aux = topNode;
		topNode = newNode;
		topNode.setNodeRef(aux);
	}

	public Node pop() {
		if (!this.isEmpty()) {
			Node removedNode = topNode;
			topNode = topNode.getNodeRef();
			return removedNode;
		}
		return null;
	}

	public boolean isEmpty() {
		return topNode == null ? true : false;
	}

	public Node top() {
		return topNode;
	}

	@Override
	public String toString() {
		String finalPrint = "------------\n";
		finalPrint += "   Pilha\n";
		finalPrint += "------------\n";

		Node printNode = topNode;

		while (true) {
			if (printNode != null) {
				finalPrint += "[No = " + printNode.getData() + "]\n";
				printNode = printNode.getNodeRef();
			} else {
				break;
			}
		}
		finalPrint += "============";
		return finalPrint;
	}
}
