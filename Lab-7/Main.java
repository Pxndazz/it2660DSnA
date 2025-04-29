class Main {
  public static void main(String[] args) {
    String[] vertices = {
      
      "Liberal Arts", // vertex 0
      "Student Services", // 1
      "Health Careers & Sciences", // 2
      "Health Technologies Center", // 3
      "Recreation Center", // 4
      "Technology Learning Center", // 5 
      "Business & Technology", // 6
      "Theater" // 7
    };

    int[][] edges = {
      {0, 1}, // lib arts to student ser
      {0, 7}, // lib arts to theatre
      {0, 6}, // lib arts to BusTech (i think this one counts?)
      {7, 6}, // theatre to bustech
      {6, 1}, // bus tech to student services
      {1, 5}, // student serv to tech learn center
      {1, 2}, // student serv to health career sciences
      {1, 4}, // student serv to rec center
      {4, 2}, // rec center to health career sciences
      {2, 3} // health career sciences to health technologies center
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices!

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));

    System.out.println();
    dfs.printPath(graph.getIndex("Health Technologies Center"));

    System.out.println();
    dfs.printPath(graph.getIndex("Student Services"));

    System.out.println();
    dfs.printPath(graph.getIndex("Recreation Center"));

    System.out.println();
    dfs.printTree();
  }
}
