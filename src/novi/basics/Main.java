package novi.basics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// An ArrayList example

        List<String> winners = new ArrayList<>();
        winners.add("Jennifer Lopez");
        winners.add("Ariana Grande");
        winners.add("Cari B");
        winners.add("Selena Gomez");
        winners.add("Madonna");

        System.out.println("How many names are nominated: " + winners.size());
        System.out.println("The Winner is: " + winners.get(4));
        System.out.println("The last person in the list is: " + winners.get(winners.size() - 1));
        winners.set(0, "JLO");
        System.out.println("Name is changed to: " + winners.get(0));
        winners.remove(4);
        System.out.println("How many names are nominated: " + winners.size());

        winners.clear();
        System.out.println("How many names are nominated: " + winners.size());
    }
}
