package com.example.lab;

import java.util.Arrays;

public class Sentence {
    private Word[] data;
    private Punctuation[] data1;
    private String sentence;

    public Sentence(String sentence_string) {
        sentence_string = new String(sentence_string.trim());
        System.out.println(Arrays.toString(sentence_string.split(" "))+"   1");
        int word_counter;
        word_counter = 1;
        char symbol;
        int punctuation_counter = 1;

        for (int i = 0; i < sentence_string.length(); i++) {
            symbol = sentence_string.charAt(i);
            if (sentence_string.charAt(i) == ' ') {
                word_counter++;
            }
            if ((symbol == '.') | (symbol == ',') | (symbol == '!')
                    | (symbol == '?') | (symbol == '/') | (symbol == ':'))
                punktuation_counter++;

        }

        Word[] word = new Word[word_counter];

        Punctuation[] punctuation = new Punctuation[punkruation_counter];
        word_counter = 0;
        punktuation_counter = 0;

        sentence_string = new String(sentence_string.replace(".", ""));
        String[] l = sentence_string.split(" ");

        for (int i = 0; i < l.length; i++) {
            word[i] = new Word(l[i]);
        }

        sentence = sentence_string;
        data = word;
        data1 = punctuation;
    }

    public Word[] getWord() {
        return data;
    }

    public Punctuation[] getPunctuations() {
        return data1;
    }

    public int wordNumber() {
        return data.length;
    }

    public int punctuationNumber() {
        return data1.length;
    }

    public String GetSen() {
        return sentence;
    }
}
