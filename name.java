import java.util.*;
public class Name {
  private String name;  // private field

  public void setName(String name) {  // setter
    this.name = name;
  }

  public String getName() {  // getter
    return this.name;
  }

  public Name() {  // class constructor
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");  // prompt
    setName(sc.nextLine());  // sets name to user input
    System.out.println("Hello " + this.getName() + "\n");  // calls getName()
  }
  
}