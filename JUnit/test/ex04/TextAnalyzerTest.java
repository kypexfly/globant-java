/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ex04;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rczgr
 */
public class TextAnalyzerTest {

    public TextAnalyzerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetWordCount_WithEmptyText_ShouldReturnZero() {
        TextAnalyzer analyzer = new TextAnalyzer("");

        int wordCount = analyzer.getWordCount();

        assertEquals(0, wordCount);
    }

    @Test
    public void testGetWordCount_WithTextContainingWords_ShouldReturnCorrectCount() {
        TextAnalyzer analyzer = new TextAnalyzer("This is a sample text.");

        int wordCount = analyzer.getWordCount();

        assertEquals(5, wordCount);
    }

    @Test
    public void testGetSentenceCount_WithEmptyText_ShouldReturnZero() {
        TextAnalyzer analyzer = new TextAnalyzer("");

        int sentenceCount = analyzer.getSentenceCount();

        assertEquals(0, sentenceCount);
    }

    @Test
    public void testGetSentenceCount_WithTextContainingSentences_ShouldReturnCorrectCount() {
        TextAnalyzer analyzer = new TextAnalyzer("This is sentence one. This is sentence two!");

        int sentenceCount = analyzer.getSentenceCount();

        assertEquals(2, sentenceCount);
    }

    @Test
    public void testGetWordFrequency_WithEmptyText_ShouldReturnEmptyMap() {
        TextAnalyzer analyzer = new TextAnalyzer("");

        Map<String, Integer> wordFrequency = analyzer.getWordFrequency();

        assertTrue(wordFrequency.isEmpty());
    }

    public void testGetWordFrequency_WithTextContainingWords_ShouldReturnCorrectFrequency() {
        TextAnalyzer analyzer = new TextAnalyzer("This is a sample text. This is another sample text.");

        Map<String, Integer> wordFrequency = analyzer.getWordFrequency();

        assertEquals(6, wordFrequency.size());
        assertEquals(2, (int) wordFrequency.getOrDefault("this", 0));
        assertEquals(2, (int) wordFrequency.getOrDefault("is", 0));
        assertEquals(2, (int) wordFrequency.getOrDefault("a", 0));
        assertEquals(2, (int) wordFrequency.getOrDefault("sample", 0));
        assertEquals(1, (int) wordFrequency.getOrDefault("text", 0));
        assertEquals(1, (int) wordFrequency.getOrDefault("another", 0));
    }

}
