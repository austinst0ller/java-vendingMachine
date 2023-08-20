class Main {
  public static void main(String[] args) {
    Name name = new Name();  // name obj calls Name()
    
    User user = new User();  // user obj calls User()
    user.printPrompt();  
    user.vend();
  }
}