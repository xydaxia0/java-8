package com.craft.java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Xavier on 2016/6/2.
 */
public class LamdaFunctionOrigin {

    static int test;

    public static void main(String[] args) {
        /*List<String> test = Arrays.asList("tes", "test", "teststts");
        test.forEach(System.out::println);
        Something something = new Something();
        Convert<Integer, String> convert = Integer::valueOf;
        System.out.println(convert.convert("123"));
        PersonFactory personFactory = Person::new;
        personFactory.create("niu", "bi");*/
/*        int i = 0;
        Convert<Integer, String> convert = from -> {
            test = test + i;
            return String.valueOf(i + from + test);};*/

        Predicate<String> predicate = string -> string.length() > 0;
        System.out.println(predicate.and(string -> string.length() <10).test("123445"));
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.stream().filter(i -> i > 200).sorted((i, j) -> i - j).map(i -> i = 1).reduce( (sum ,item) -> sum + item));
    }



}
