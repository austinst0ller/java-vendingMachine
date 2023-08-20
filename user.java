public class User extends Item implements Vending {
  public User() {  // class constructor
    super();  // invokes Item() constructor
  }

  public void printPrompt() {
    super.Out();  // invoke Out() in Item class
  }

  @Override
  public void vend() {  // override vend() from interface
    System.out.println("Your item is about to drop, have a great day!");
  }
  
}