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

	public void remove(T content) {
		try {
			BinNode<T> current = this.root;
			BinNode<T> father = null;
			BinNode<T> son = null;
			BinNode<T> aux = null;

			while (current != null && !current.getContent().equals(content)) {
				father = current;
				if (content.compareTo(current.getContent()) < 0) {
					current = current.getLeftNode();
				} else {
					current = current.getRightNode();
				}
			}

			if (current == null) {
				System.out.println("Conteudo nao encontrado");
			}

			if (father == null) {
				if (current.getRightNode() == null) {
					this.root = current.getLeftNode();

				} else if (current.getLeftNode() == null) {
					this.root = current.getRightNode();

				} else {
					for (aux = current, son = current.getLeftNode(); son.getRightNode() != null; aux = son, son = son
							.getLeftNode()) {

						if (son != current.getLeftNode()) {
							aux.setLeftNode((son.getLeftNode()));
							son.setLeftNode(root.getLeftNode());
						}
					}
					son.setLeftNode(root.getRightNode());
					root = son;
				}

			} else if (current.getRightNode() == null) {
				if (father.getLeftNode() == current) {
					father.setLeftNode(current.getLeftNode());

				} else {
					father.setRightNode(current.getLeftNode());
				}

			} else if (current.getLeftNode() == null) {
				if (father.getLeftNode() == current) {
					father.setLeftNode(current.getRightNode());

				} else {
					father.setRightNode(current.getRightNode());
				}

			} else {
				for (aux = current, son = current.getLeftNode(); son.getRightNode() != null; aux = son, son = son
						.getRightNode()) {

					if (son != current.getLeftNode()) {
						aux.setRightNode(son.getLeftNode());
						son.setLeftNode(current.getLeftNode());
					}
					son.setRightNode(current.getRightNode());

					if (father.getLeftNode() == current) {
						father.setLeftNode(son);

					} else {
						father.setRightNode(son);
					}
				}
			}

		} catch (NullPointerException error) {
			System.out.println("Conteudo nao encontrado");
		}
	}
}
