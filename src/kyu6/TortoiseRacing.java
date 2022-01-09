package kyu6;

import java.util.Arrays;

public class TortoiseRacing {

    public static void main(String[] args){
        System.out.println(Arrays.toString(race(720, 850, 70)));

    }

    public static int[] race(int speed1, int speed2, int lead) {

        if (speed1 >= speed2) {
            return null;
        }

        double speedBetweenTortoises = speed2 - speed1;
        double time = lead / speedBetweenTortoises;

        int[] hourMinSec = new int[3];

        int t = (int) (time * 3600);
        hourMinSec[0] = t / 3600;
        t %= 3600;
        hourMinSec[1] = t / 60;
        t %= 60;
        hourMinSec[2] = t;

        return hourMinSec;
    }
}

/*
wo tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1 -1".
 */
