package BinaryTree;

public class Main {

	public static void main(String[] args) {

		BinaryTree<Integer> arvore = new BinaryTree();
		
		arvore.insert(8);
		arvore.insert(3);
		arvore.insert(1);
		arvore.insert(6);
		arvore.insert(4);
		arvore.insert(7);
		arvore.insert(10);
		arvore.insert(14);
		arvore.insert(13);
		
		arvore.displayPreOrder();
		arvore.displayPostOrder();
		arvore.displayInOrder();
	}

}
