/*
2
7 3
1 2 3 4 5 6 7
5 10
7 7 7 7 7

Case #1: 1
Case #2: 5
*/
import java.util.Scanner;

public class Solution {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();
    int testCases = Integer.parseInt(line);

    for(int i=0; i<testCases; i++){
      String bagsAndKids = sc.nextLine();
      String[] arrayBagsKids = bagsAndKids.split(" ");
      //int bags = Integer.parseInt(arrayBagsKids[0]);
      int kids = Integer.parseInt(arrayBagsKids[1]);

      String candiesLine = sc.nextLine();
      String[] arrayCandies = bagsAndKids.split(" ");
      int[] candies = new int[arrayCandies.length];

      for(int j=0; j<arrayCandies.length; j++){
        candies[j] = Integer.parseInt(arrayCandies[j]);
      }

      int remainCandy = remainingCandy(kids, candies);
      System.out.println("Case #"+(i+1)+": "+remainCandy);

    }
  }

  private static int remainingCandy(int kids, int[] candies){
    int totalCandies = 0;

    for(int i=0; i<candies.length; i++){
      totalCandies += candies[i];
    }

    return totalCandies%kids;
  }
}
/* Sample solution
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int testCase = 0; testCase < testCases; testCase++) {
            String[] firstLine = scanner.nextLine().split(" ");
            int numCandyBags = Integer.parseInt(firstLine[0]);
            int numKids = Integer.parseInt(firstLine[1]);
            int totalAmountCandies = 0;
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < numCandyBags; j++) {
                totalAmountCandies += Integer.parseInt(numbers[j]);
            }
            int res = totalAmountCandies % numKids;
            System.out.println(String.format("Case #%s: %s", testCase+1, res));
        }
    }
}
 */
