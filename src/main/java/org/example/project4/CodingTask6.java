package org.example.project4;

public class CodingTask6 {

    private String word;

    public CodingTask6(String word) {
        this.word = word;
    }

    public int countVowel() {
        System.out.print("There are "+word.replaceAll("[^aiueoAIUEO]","").length()+" vowels in the word \""+word+"\"");
        return word.replaceAll("[^aiueoAIUEO]","").length();
    }
}
class CountingVowelTester{
    public static void main(String[] args) {
        CodingTask6 count=new CodingTask6("documentation");
        count.countVowel();
    }
}


