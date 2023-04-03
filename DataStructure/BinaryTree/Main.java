package BinaryTree;

public class Main {

	public static void main(String[] args) {

		BinaryTree<Integer> arvore = new BinaryTree();
		
		arvore.insert(13);
		arvore.insert(10);
		arvore.insert(25);
		arvore.insert(2);
		arvore.insert(12);
		arvore.insert(20);
		arvore.insert(31);
		arvore.insert(29);
		
		arvore.displayInOrder();
		arvore.displayPreOrder();
		arvore.displayPostOrder();
		
		arvore.remove(29);
		
		arvore.displayPreOrder();
	}

}
