
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
            List<String> myList = new List<>();
            System.out.println(myList.contains("hello"));
            myList.add("hello");
            System.out.println(myList.contains("hello"));
            int index = myList.indexOfValue("hello");
            System.out.println(index);
            System.out.println(myList.value(index));
            myList.remove("hello");
            System.out.println(myList.contains("hello"));
            List<Integer> numbers = new List<>();
            numbers.add(90);
            System.out.print(numbers);
            
            Pair<String,Integer>  pair = new Pair<>("one",1);
            System.out.println(pair.getKey() +" -> "+ pair.getValue());

    }

}
