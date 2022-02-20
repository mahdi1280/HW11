package ir.maktab.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("ali","armin","reza","mansor","naser"));
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        collect.forEach((integer, strings) -> System.out.print(integer+"=["+strings.size()+"="+strings+"],"));


    }
}
