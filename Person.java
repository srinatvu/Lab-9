public class Person {
  private String name;
  private int age;
  private String color;

  public Person(String aName, int aAge, String aColor) {
    name = aName;
    age = aAge;
    color = aColor;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }
}