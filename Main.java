import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();

    Person a = new Person("Vishnu", 21, "blue");
    people.add(a);
    Person b = new Person("A", 87, "pink");
    people.add(b);
    Person c = new Person("B", 13, "yellow");
    people.add(c);
    Person d = new Person("C", 55, "black");
    people.add(d);
    Person e = new Person("D", 4, "green");
    people.add(e);

    try {
 FileWriter toWriteFile;
 toWriteFile = new FileWriter("data.txt");
 BufferedWriter output = new BufferedWriter(toWriteFile);
 for(int i=0; i < people.size(); i++) {
   Person p = people.get(i);
   output.write(p.getName());
   output.newLine();
   output.write(Integer.toString(p.getAge()));
   output.newLine();
   output.write(p.getColor());
   output.newLine();
   output.flush();
 }
 output.close();
    }
    catch (IOException exception) {
System.out.println("An error occurred when writing: " + exception);
    }

        try {
 FileReader toReadFile;
 toReadFile = new FileReader("data.txt");
 BufferedReader reader = new BufferedReader(toReadFile);
while (reader.ready()) {
 String name = reader.readLine();
 String age = reader.readLine();
 String color = reader.readLine();
 System.out.printf("%-10s%-10s%-10s\n",name,age,color);
} 
reader.close();
    }
    catch (IOException exception) {
System.out.println("An error occurred when reading: " + exception);
    }
  }

}