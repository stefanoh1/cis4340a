/*
Rule 7
ERR04-J. Do not complete abruptly from a finally block 
*/

class TryFinally {
  private static boolean doLogic() {
    try {
      throw new IllegalStateException();
    } finally {
      System.out.println("logic done");
    }
    // Any return statements must go here; 
    // applicable only when exception is thrown conditionally
  }
}
