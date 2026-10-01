class WordCounterQ28 {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();
        String[] words = text.split("\\s+");
        int count = words.length;

        System.out.println("Language: " + language);
        System.out.println("Number of Words: " + count);
    }

    public static void main(String[] args) {
        WordCounterQ28 w = new WordCounterQ28();
        w.countWords("Java is an easy programming language");
    }
}