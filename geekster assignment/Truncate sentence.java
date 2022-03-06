package com.company;

class Main {
    public static String truncateSentence(String s, int k) {
        int spaceCount = 0;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == ' ') spaceCount++;
            if (spaceCount == k) break;
            index++;
        }
        return s.substring(0, index);
    }

        public static void main(String[] args) {

          String s= truncateSentence("hello how are you Contestant", 2);
          System.out.println(s);
        }
    }

