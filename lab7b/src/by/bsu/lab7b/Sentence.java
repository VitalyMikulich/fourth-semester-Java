package by.bsu.lab7b;

public class Sentence {
    String sentence;

    public Sentence(String sentence){
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public int indexOf(String symbol){
        return sentence.indexOf(symbol);
    }

    public int lastIndexOf(String symbol){
        return sentence.lastIndexOf(symbol);
    }

    public String substring(int start, int end){
        return sentence.substring(start, end);
    }
}
