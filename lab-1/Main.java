//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: David Reese
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    int[] arr = {5, 9, 3, 12, 7, 3, 11, 5};

    //while loop forwards
    int whileInt = 0;
    String forwards = "";
    while (whileInt != arr.length)
    {
      forwards = forwards + arr[whileInt] + " ";
      whileInt++;
    }
    System.out.println(forwards);

    // for loop backwards
    String backwards = "";
    for(int i = arr.length - 1; i >= 0; i--)
    {
      backwards = backwards + arr[i] + " ";
    }
    System.out.println(backwards);

    System.out.println(arr[0] + " " + arr[arr.length - 1]);

    Lab1 lab = new Lab1();

    System.out.println(lab.increment(1));

    System.out.println(lab.max(64, 128));

    System.out.println(lab.min(64, 128));

    System.out.println(lab.sum(new int[]{1,2,3,4}));

    System.out.println(lab.average(new int[]{10,5}));

    System.out.println(lab.max(new int[]{16, 128, 8, 32, 64}));

    System.out.println(lab.min(new int[]{16, 128, 8, 32, 64}));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b)
  {
    if(a > b)
      return a;
    return b;
  }

  public int min(int a, int b)
  {
    if(a > b)
      return b;
    return a;
  }

 public int sum(int[] nums)
 {
  int sum = 0;

  for(int i = 0; i < nums.length; i++)
  {
    sum += nums[i];
  }

  return sum;
 } 

 public float average(int[] nums)
 {
  float sum = 0;

  for(int i = 0; i < nums.length; i++)
  {
    sum += nums[i];
  }
  
  return sum / nums.length;
 }

 public int max(int[] nums)
 {

  int max = 0;

  for(int i = 0; i < nums.length; i++)
  {
    if( nums[i] > max )
    {
      max = nums[i];
    }
  }
  
  return max;
 }

 public int min(int[] nums)
 {

  int min = nums[0];

  for(int i = 0; i < nums.length; i++)
  {
    if(min > nums[i])
    {
      min = nums[i];
    }
  }
  
  return min;
 }

}
