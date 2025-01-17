
// Binary Tree Class:
class Binary_Search_Tree {

	Node root; // ? private

	// ?  Python Printing format:
	public static void print(Object o) {
        System.out.println(o);
    }

	// ?   [ Search, Insert, Delete, Display ]

	// Search Name:
	public Player search(String name) {
		return executeSearch(root, name);
	}
	private Player executeSearch(Node root, String name) {
		if(root == null) {
			return null;
		}
		if(root.player.name.equals(name) == true) {
			return root.player;
		}

		Player found = executeSearch(root.left, name);
		if(found != null) {
			return found;
		}
		return executeSearch(root.right, name);
	}


	// Insert / Add:
	public void insert(Player player) {
		root = executeInsert(root, player);
	}
	private Node executeInsert(Node root, Player player) {
		if(root == null) {
			root = new Node(player);
			return root;
		}
		if(root.player.score < player.score) {
			root.left = executeInsert(root.left, player);
		}
		else {
			root.right = executeInsert(root.right, player);
		}
		return root;
	}

	// Delete:
	public Node delete(String name) {
		return executeDelete(root, name);
	}
	private Node executeDelete(Node root, String name) {
		if(root == null) { // basically do nothing
			return root;
		}
		else if(root.player.name.equals(name) && root.player != null) {
				root.player = null;
				return root;
			}

			// Continue through whole tree by searching branches:
			root.left = executeDelete(root.left, name);
			root.right = executeDelete(root.right, name);
			return root;

	}

	// Display:
	public void display() {
		executeDisplay(root);
	}
	private void executeDisplay(Node root) {
		if(root != null) {
			executeDisplay(root.left);
			print(root.player);
			executeDisplay(root.right);
		}
		// else do nothing
	}

} // EOC

