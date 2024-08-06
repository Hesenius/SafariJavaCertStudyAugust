package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class AC4 implements AutoCloseable {
//  private static int nextId = 1;
//  private int myId = nextId++;

  private int myId;
  public AC4(int id) {
    this.myId = id;
  }
  @Override
  public void close() throws Exception {
    throw new SQLException("From AC " + myId);
  }
}
public class Ex1 {
  public static void main(String[] args) throws Throwable {
    var two = new AC4(2);
    try (
        var one = new AC4(1);
//        var two = new AC4();
        two;
    ){
//      one = null;
      if (Math.random() > 0) {
        throw new FileNotFoundException();
      }
    }
//    two.close();
//    two = null;
  }
}
