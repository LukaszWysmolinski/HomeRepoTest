package com.sdacademy.helloworld.texts;

public class TextPrinter {

    public static void main(String[] args) {
        System.out.print("Hello!\n"); //\n is the same as println - new line
        System.out.print("My name is Adam.\n");
        System.out.print(" I'm 20 years old");
        System.out.print(" I'm "+20+" years old"); // merged two strings
        System.out.println();
        System.out.println("I've decided to became JAVA developer\n\n\n");
        System.out.println("You may wish me \"good luck!\""); // to display " you have to add \"
        System.out.println("2 + 12 = "+2+12+" correct?");
        System.out.println("2 + 12 = "+(2+12)+" correct?"); // dzialania w nawiasie maja pierwszenstwo dlatego najpierw jest obliczony wynik

        System.out.print("\n\n");

        System.out.printf("Number=%d\n",23); //printf wyswietla formatowany  tekst // %d wstawia liczbe z dalszej czesci komendy
        System.out.printf("Number=%10d\n",23); // %10d oznacza ze liczba jest wyswietlona na 10 miejscach -czyli 8 spacji plus 23
        System.out.printf("Number=%-10d\n",23); //spacje sa po liczbie bo jest -

        System.out.printf("Number1=%d Number2=%d Number3=%d\n",11,12,13);

        System.out.printf("Pi=%f\n",3.14159265359); //%f wyswietla zmiennoprzecinkowa liczbe
        System.out.printf("Pi=%.2f\n",3.14159265359); // dwa miejsca po przecinku
        System.out.printf("Pi=%7.2f\n",3.14159265359); // cala liczba na 7 miejscach z 2 miejscami po przecinku - do prawej wyrownanie
        System.out.printf("Pi=%-7.2f\n",3.14159265359); // -||- to samo ale do prawej

        //More formattings
        //https://alvinalexander.com/programming/printf-format-cheat-sheet
    }
}