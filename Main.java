import java.util.*;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var entries = new ArrayList<Person>();

        while(true) {
          System.out.print("Who are you?: ");
          var who = scanner.next();
          System.out.print("How old are you?: ");
          var howOld = scanner.nextInt();

          var someOne = new Person(who, howOld);
          if(!entries.contains(someOne)) {
              entries.add(someOne);
          } else {
              System.out.println(someOne.name() + "is already entried.");
          }
	  
          entries.stream()
                    .sorted(Comparator.comparingInt(Person::age))
                    .forEach(System.out::println);
        }
    }

}

record Person(String name, int age) {};

