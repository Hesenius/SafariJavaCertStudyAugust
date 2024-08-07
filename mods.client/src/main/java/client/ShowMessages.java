package client;

import utils.message.Messages;

import java.lang.reflect.Field;

// compile with:
//  javac -d modules --module-path modules --module-source-path "./*/src/main/java" --module mods.provider,mods.client
// execute with:
//  java -p modules -m mods.client/client.ShowMessages
public class ShowMessages {
  public static void main(String[] args) throws Throwable {
    System.out.println(Messages.helpful);

//    System.out.println("package access " + other.Sneaky.getMessage());
    Class<?> cl = Messages.class;
    Field f = cl.getDeclaredField("secret");
    f.setAccessible(true);
    String val = (String)f.get(null);
    System.out.println("private " + val);
  }
}
