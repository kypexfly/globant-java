/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rczgr
 */
public class TextAnalyzer {

    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public int getWordCount() {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public int getSentenceCount() {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] sentences = text.trim().split("[.!?]+");
        return sentences.length;
    }

    public Map<String, Integer> getWordFrequency() {
    Map<String, Integer> frequencyMap = new HashMap<>();

    if (text == null || text.isEmpty()) {
        return frequencyMap;
    }

    String[] words = text.trim().split("\\s+");

    for (String word : words) {
        word = word.toLowerCase();
        frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
    }

    return frequencyMap;
}
}
