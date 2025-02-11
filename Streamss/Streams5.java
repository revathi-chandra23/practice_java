package Streamss;

import java.util.List;

public class Streams5 {
    public static void main(String[] args) {

  //    5. Write a Java program to count the number of strings in a
        //    list that start with a specific letter using streams.

        List<String> li=List.of("revathi","ranu","ponu","bujji","chiiti","thaali","raja");
       long count=li.stream().filter(s->s.startsWith("r")).count();
    }
}
