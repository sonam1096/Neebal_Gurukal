package com.gurukul.Day10Assignment;
import java.util.*;

public class que3 {
    public static void permutations(char ar[], int fi) {
        if (fi == ar.length - 1) {
            
            System.out.println(ar);
            return;
        }

        for (int i = fi; i < ar.length; i++) {
            swap(ar, i, fi);
            permutations(ar, fi + 1);
           swap(ar, i, fi);
        }
    }

    private static void swap(char[] ar, int i, int fi) {
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        char p[] = s.toCharArray();
        permutations(p, 0);
    }
}
