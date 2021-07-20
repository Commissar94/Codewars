package kyu6;

import java.util.Arrays;

public class Dubstep {

    static String dubstepDecoder(String song) {
        //А можно было просто сделать return song.replaceAll("(WUB)+", " ").trim();
        return Arrays.toString(song.split("WUB"))
                .replace(",", " ")
                .trim().replaceAll(" +", " ")
                .replaceAll("[\\[\\]]", "")
                .trim();
    }
}