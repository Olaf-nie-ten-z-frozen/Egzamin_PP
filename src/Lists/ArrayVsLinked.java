package Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsLinked {
    public void run() {
        String[] friends = "John,Jane,Bob,Mary".split(",");
        int i = 0;
        while( i < friends.length) {
            System.out.println(friends[i]);
            i++;
        }
        //length jest "elementem" tablicy datego nie wywołuje sie go za pomocą ()
        System.out.println("Wielkosc tablicy: " + friends.length);
        System.out.println("==========================");
        //Teraz z użyciem ArrayList
        /*ArrayList posiada taki plus że nie trzeba specyfikować wielkości
        tablicy z tego też powodu możemy dowolnie dobierać i usówać wybrane indeksy
        z pomocą przychodzą nam też funkcje sortujące i wyszukiwania*/
        ArrayList<String> friendsList = new ArrayList<>();
        friendsList.add("Klapcie");
        friendsList.add("Tomek");
        friendsList.add("Ala");
        //szybkie dodawanie elementów do tablicy
        ArrayList<String> friendsList2 = new ArrayList<>(Arrays.asList("John", "Jane", "Bob", "Mary"));
        System.out.println(friendsList);
        System.out.println("Wielkosc tablicy: " + friendsList.size());
        //sortowanie tablicy
        friendsList.sort(String::compareTo);
        System.out.println(friendsList);
        friendsList.set(1, "Srapcie"); //zmiana elementu o indeksie 1 na nowy element
        System.out.println(friendsList.get(1)); //pobranie elementu z tablicy o indeksie 1
        System.out.println(friendsList.contains("Srapcie")); //sprawdzenie c
        System.out.println("Na sam koniec LinkedArray vs ArrayList");
        System.out.println("wynik: ArrayList jest szybsze jednak możemy dodawać i usuwać elementy dużo szybciej w LinkedList");
    }
}
