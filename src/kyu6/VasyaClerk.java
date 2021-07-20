package kyu6;

/*
The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.
 */

public class VasyaClerk {

    public static String Tickets(int[] peopleInLine) {
        int fifties = 0;
        int twentyFives = 0;

        for (int cash : peopleInLine
        ) {
            switch (cash) {
                case 25:
                    twentyFives = twentyFives + 1;
                    break;
                case 50:
                    if (twentyFives > 0) {
                        twentyFives = twentyFives - 1;
                        fifties = fifties + 1;
                    } else if (fifties > 0) {
                        fifties = fifties - 1;
                    } else {
                        return "NO";
                    }
                    break;
                case 100:
                    if (twentyFives >= 3) {
                        twentyFives = twentyFives - 3;

                    } else if (twentyFives >= 1 && fifties >= 1) {
                        twentyFives = twentyFives - 1;
                        fifties = fifties - 1;
                    } else {
                        return "NO";
                    }
                    break;
                default:
                    return "NO";
            }
        }
        return "YES";
    }
}