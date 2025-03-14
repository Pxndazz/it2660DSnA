import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      Lab4.outputList(insertionSortedList);
    }
  }
    
    

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here

      // Copying list to accurately time both lists
      ArrayList<Integer> insertionlist = new ArrayList<>(integerList);

      long timer = System.currentTimeMillis();
      for(int i = 1; i < insertionlist.size(); i++)
      {
        int currentValue = insertionlist.get(i);
        int j = i - 1;

        while(j >= 0 && insertionlist.get(j) > currentValue)
        {
          insertionlist.set(j + 1, insertionlist.get(j));
          j--;
        }

        insertionlist.set(j + 1, currentValue);

      }
      System.out.println("\n\nInsertion Sort Time: " + (System.currentTimeMillis() - timer));
    return insertionlist;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here

    // Copying list to accurately time both lists
    ArrayList<Integer> bubblelist = new ArrayList<>(integerList);

    long timer = System.currentTimeMillis();

    boolean swappedSomething = true;
    while(swappedSomething)
    {
      swappedSomething = false;
      for(int i = 0; i < bubblelist.size() - 1; i++)
      {
        if(bubblelist.get(i) > bubblelist.get(i + 1))
        {
          int temp = bubblelist.get(i);
          bubblelist.set(i, bubblelist.get(i+1));
          bubblelist.set(i + 1, temp);
          swappedSomething = true;
        }
      }
    }

    System.out.println("\n\nBubble Sort Time: " + (System.currentTimeMillis() - timer));
    return bubblelist;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}
