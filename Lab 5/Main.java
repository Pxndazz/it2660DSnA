import java.util.*;

class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree

    BST<Integer> lab5Tree = new BST<>();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    int[] treeValues = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
    
    for(int i = 0; i < treeValues.length; i++)
    {
      lab5Tree.insert(treeValues[i]);
    }

    // Step 3 - Delete the value 17

    lab5Tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)

    //System.out.println("Inorder (Sorted): " + lab5Tree.inorder() + "\n");
    System.out.print("Inorder (Sorted): " );
    lab5Tree.inorder();

    // Step 5 - Traverse and output the values using postorder

    System.out.print("\nPostorder: ");
    lab5Tree.postorder();

    // Step 6 - Traverse and output the values using preorder
    System.out.print("\nPreorder: ");
    lab5Tree.preorder();

    // Step 7 - Display the result of a search for the value 36
    boolean result;

    result = lab5Tree.search(36);

    System.out.print("\nSearch Result for 36: " + result);
    

    // Step 8 - Display the result of a search for the value 37
    result = lab5Tree.search(37);

    System.out.print("\nSearch Result for 37: " + result);

    // Step 9 - Using the path() method, display the path from the root to 2

    ArrayList<BST.TreeNode<Integer>> pathList2 = lab5Tree.path(2);

    System.out.print("\nPath from Root to 2: ");

    for(int i = 0; i < pathList2.size(); i++)
    {
      System.out.print(pathList2.get(i).element + " ");
    }

    // Step 10 - Display the path from the root to 34

    ArrayList<BST.TreeNode<Integer>> pathList34 = lab5Tree.path(34);

    System.out.print("\nPath from Root to 34: ");

    for(int i = 0; i < pathList34.size(); i++)
    {
      System.out.print(pathList34.get(i).element + " ");
    }

  }
}
