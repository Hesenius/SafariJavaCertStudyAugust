package serialstuff;

import java.io.*;

class RCToy {
  private static int count = 0;
  private int age;

  public RCToy() {
    //super();
    count++;
  }

  public RCToy(int age) {
    this();
    this.age = age;
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "RCToy for age " + age + ", count " + count;
  }
}

class Robot extends RCToy implements Serializable {
  private int weaponCount;
  // transient int extra;

  public Robot(int weaponCount) {
    super(weaponCount == 0 ? 3 : 10);
    this.weaponCount = weaponCount;
    System.out.println(this);
  }

  @Override
  public String toString() {
    return super.toString() + " a Robot with weaponcount = " + weaponCount;
  }
}
public class Example {
  public static void main(String[] args) {
    Robot r = new Robot(3);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      oos.writeObject(r);
    } catch (IOException ioe) {
      System.out.println("write failed");
    }

    System.out.println("---------------------");
    try (ObjectInputStream ois = new ObjectInputStream(
        new ByteArrayInputStream(baos.toByteArray()))) {
      Object obj = ois.readObject();
      System.out.println(obj);
    } catch (Exception ioe) {
      System.out.println("read failed");
    }

  }
}
