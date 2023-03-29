package BinaryTree;

public class BinaryTree<T extends Comparable<T>> {

	private BinNode<T> root;

	public BinaryTree() {
		this.root = null;
	}

	public void insert(T content) {
		BinNode<T> newNode = new BinNode(content);
		this.root = insert(root, newNode);
	}

	private BinNode<T> insert(BinNode<T> current, BinNode<T> newNode) {
		if (current == null) {
			return newNode;

		} else if (newNode.getContent().compareTo(current.getContent()) < 0) {
			current.setLeftNode(insert(current.getLeftNode(), newNode));

		} else {
			current.setRightNode(insert(current.getRightNode(), newNode));
		}
		return current;
	}

	public void displayInOrder() {
		System.out.println("\n Exibindo em Ordem: ");
		displayInOrder(this.root);
	}

	private void displayInOrder(BinNode<T> current) {
		if (current != null) {
			displayInOrder(current.getLeftNode());
			System.out.print(current.getContent() + ", ");
			displayInOrder(current.getRightNode());
		}
	}

	public void displayPostOrder() {
		System.out.println("\n Exibindo Pos Ordem: ");
		displayPostOrder(this.root);
	}

	private void displayPostOrder(BinNode<T> current) {
		if (current != null) {
			displayPostOrder(current.getLeftNode());
			displayPostOrder(current.getRightNode());
			System.out.print(current.getContent() + ", ");
		}
	}

	public void displayPreOrder() {
		System.out.println("\n Exibindo Pre Ordem: ");
		displayPreOrder(this.root);
	}

	private void displayPreOrder(BinNode<T> current) {
		if (current != null) {
			System.out.print(current.getContent() + ", ");
			displayPreOrder(current.getLeftNode());
			displayPreOrder(current.getRightNode());
		}
	}
}
