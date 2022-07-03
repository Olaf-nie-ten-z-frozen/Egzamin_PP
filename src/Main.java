import Abstracts.Dogy_style;
import Lists.ArrayVsLinked;
import MultithreadingBitch.MultiThrExt;
import MultithreadingBitch.MultiThrIntern;

public class Main {
    public static void main(String[] args) {
        ArrayVsLinked arrayVsLinked = new ArrayVsLinked();
        arrayVsLinked.run();
        System.out.println("===========================================================");
        Dogy_style dog = new Dogy_style(22, "Dogy", "Human");
        dog.getInfo();
        System.out.println("===========================================================");
        //Oznaczamy thready przez Construktor w MultiThr
        MultiThrExt thread = new MultiThrExt(0);
        MultiThrExt thread1 = new MultiThrExt(1);
        MultiThrExt thread2 = new MultiThrExt(2);
        /**
         * !Aby stworzyć nowy wątek należy użyć metody start()
        użycie metody run nie wywoła nam tak naprawdę nowego wątku
        możemy to zobaczyć uruchamiając dwie metody przy użyciu start() i run()*/

        /* uruchomienie wątku*/
        thread.start();
        //Nie wiem jeszcze dlaczego ale thread przy uzyciu metody .run() wykonuje sie drugi XD
        thread1.start();
        thread2.start();
        //najpozniejszy watek wykonuje sie najwczesniej(I mean...good to know)

        /**
         * Ważne do zapamiętania jest to że nawet jeśli w jednym przypadku wątek wyrzuci błąd to zepsuje on tylko dany przypadek wątku
         * Np. Dla metody którą wykonywaliśmy wyrzej moglibyśmy wyrzucić wyjątek i jedyny bład jaki byśmy zobacyzli to w miejscu jego wyrzucenia
         * nie zaburzy to całego wątku tylko wątek dla danego przypadku wyrzucił błąd
         */
        /**
         * !Teraz zrobimy to samo co na górze tylko z użyciem interfejsu Runnable
         * ?Używanie interfejsu jest zawsze lepszą opcja ponieważ możemy implementować wiele interfejsów i tylko jedno rozszerzenie extends
         */
        MultiThrIntern intThread = new MultiThrIntern(69);
        // !jedyna dodatkowa rzecz jaką musimy zrobić aby korzystać z interfejsu to stworzenie threada Przy użyciu klasy Thread
        Thread thread3 = new Thread(intThread);
        thread3.start();
        // ? Przydatne funkcje w wątkach to: join(), interrupt(), isAlive(), isInterrupted()
        //join() - czeka na zakończenie wątku i wykonuje tylko go (usuwa multiwątkowość)
        //interrupt() - zatrzymuje wątek (wrzuca go w stan interrupted) (możemy go wywołać tylko raz)
        //isAlive() - sprawdza czy wątek jest aktywny(zwraca boola)
        //isInterrupted() - sprawdza czy wątek został przerwany(zwraca boola)

    }
}