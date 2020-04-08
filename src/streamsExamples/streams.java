package streamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class streams {

    public static void main(String args[]){
        List<String> myStream = new ArrayList<String>();

        myStream.add("Julia");
        myStream.add("Cathy");
        myStream.add("Rita");
        myStream.add("Siv");
        myStream.add("Emily");
        myStream.add("Julia2");
        myStream.add("Cathy2");
        myStream.add("Rita2");
        myStream.add("Siv2");
        myStream.add("Emily2");

        System.out.print(myStream);
        System.out.println("==========");

        Stream<String> s = myStream.stream();
        s.forEach(System.out::println);
        System.out.println("==========");

        System.out.println(myStream.size());
        long size =
                myStream.stream()
                .count();
        System.out.println(size);
        System.out.println("==========");

        List<String> sortedNames =
                myStream.stream()
                .sorted()
                .collect(toList());
        System.out.println(sortedNames);
        System.out.println("==========");

        List<String> longNames =
                myStream.stream()
                .filter(d->d.length()>5)
                .sorted()
                .collect(toList());
        System.out.println(longNames);
        System.out.println("==========");

        List<String> longestNames =
                myStream.stream()
                        .sorted(comparing(d->-d.length()))
                        .limit(3)
                        .collect(toList());
        System.out.println(longestNames);
        System.out.println("==========");
    }
}
