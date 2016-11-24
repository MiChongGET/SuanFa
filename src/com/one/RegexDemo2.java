package com.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/11/23.
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        String a = "aa bbb adf adsa as qw kmn nk q qwr nmk";
        String regex = "\\b\\w{3}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
