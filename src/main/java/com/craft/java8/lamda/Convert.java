package com.craft.java8.lamda;

/**
 * Created by Xavier on 2016/6/3.
 */
@FunctionalInterface
public interface Convert<F, T>  {

    T convert(F from);

}
