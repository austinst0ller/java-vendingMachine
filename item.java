import java.util.*;
public class Item {
  public Item() {  // class constructor
    System.out.println("Choose an item from the list below!");
    System.out.println("(Enter only the item's number): ");
  }

  public void Out() {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> optionList = new ArrayList<>();  // collection
    String x = "#1 Coffee Creamer";
    String y = "#2 Black Cold Brew";
    String z = "#3 An Actual Tree";
    optionList.add(x);  // add String x to optionList
    optionList.add(y);  // add String y to optionList
    optionList.add(z);  // add String z to optionList
    System.out.println();

    for (String str : optionList) {  // print optionList items
      System.out.println(str);
    }

    System.out.println();
    System.out.print("Enter a number: ");  // prompt

    int itemNumber;  // users input field

    while (true) {  // catch possible InputMismatchException
      try {
        itemNumber = sc.nextInt();
        break;
      } catch (Exception e) {
        System.out.println("Enter a valid choice.");
        System.out.print("Enter a number: ");
        sc.next();
      }
    }

    while (itemNumber != 1 && itemNumber != 2 && itemNumber != 3) {
      System.out.println("Enter a valid choice.");
      System.out.print("Enter a number: ");
      itemNumber = sc.nextInt();
    } if (itemNumber == 1 || itemNumber == 2 || itemNumber == 3) {
        switch (itemNumber) {
          case 1:
            System.out.println("You chose " + optionList.get(0) + "!");
            break;
          case 2:
            System.out.println("You chose " + optionList.get(1) + "!");
            break;
          case 3:
            System.out.println("You chose " + optionList.get(2) + "!");
            break;
        }
    }

    System.out.println();
    sc.close();
  }
}