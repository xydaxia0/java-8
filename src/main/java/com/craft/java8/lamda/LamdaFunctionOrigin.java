package com.craft.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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

        Predicate<String> predicate = (String s) -> s.length() > 0;


    }



}
