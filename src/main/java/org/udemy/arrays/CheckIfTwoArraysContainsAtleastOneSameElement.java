package org.udemy.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//complexity : O(n^2)
public class CheckIfTwoArraysContainsAtleastOneSameElement {
    public static boolean checkMatching(char[] ch,char[] ch1){
        boolean flag=false;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch1.length;j++){
                if(ch[i]==ch1[j])
                {
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    //complexity : O(n)
    public static boolean checkMatching1(char[] ch,char[] ch1){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c:ch){
            set1.add(c);
        }
        for(char c:ch1){
            set2.add(c);
        }
        set1.retainAll(set2);
        if(set1.size()>0)
            return true;
        else
            return false;
    }
    //complexity : O(n)
    public static boolean checkMatching2(char[] ch,char[] ch1){
        boolean flag=false;
        Set<Character> set1 = new HashSet<>();
        for(char c:ch){
            set1.add(c);
        }
        for(int i=0;i<ch1.length;i++){
            if(set1.contains(ch1[i])){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static boolean checkMatching3(char[] ch,char[] ch1){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c:ch){
            set1.add(c);
        }
        for(char c:ch1){
            set2.add(c);
        }
        Set<Character> common=set1.stream().filter(set2::contains).collect(Collectors.toSet());
        if(common.size()>0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        //two arrays of any size
        // any matching return true
        //no matching return false
        char[] ch={'a','b','c','d'};
        char[] ch1={'a','y','z'};

        System.out.println(checkMatching(ch,ch1));
        System.out.println(checkMatching1(ch,ch1));
        System.out.println(checkMatching2(ch,ch1));
        System.out.println(checkMatching3(ch,ch1));

       // System.out.println(Arrays.mismatch(ch,ch1));
    }
}
