import java.util.*;
import java.io.*;

/*

Find Intersection
Have the function FindIntersection(strArr) read the array of strings
stored in strArr which will contain 2 elements: the first element will
represent a list of comma-separated numbers sorted in ascending order,
the second element will represent a second list of comma-separated
numbers (also sorted). Your goal is to return a comma-separated string
containing the numbers that occur in elements of strArr in sorted order.
If there is no intersection, return the string false.

Examples
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13
Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10

*/

class Main {

  public static String FindIntersection(String[] strArr) {
    String[] first = strArr[0].split(",");
    String[] second = strArr[1].split(",");
    String result = "";
    for(int position = 0; position<first.length;position++){
      for(int positionOfSecond =0; positionOfSecond <second.length;positionOfSecond++){
        if(first[position].equals(second[positionOfSecond])){
          if(result.equals(""))
          result = first[position].trim();
          else
          result = result+","+first[position].trim();
          continue;
        }
      }
    }
    return result;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine()));
  }

}
