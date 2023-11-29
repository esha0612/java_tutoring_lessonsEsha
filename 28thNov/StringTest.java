// package 28thNov;

class Poem {
    private String title;
    private String author;
    // every line is seperated by a newline character
    private String poem;

    public Poem() {
        this.title = "";
        this.author = "";
        this.poem = "";
    }

    public Poem(String title, String author, String poem) {
        this.title = title;
        this.author = author;
        this.poem = poem;
    }

    public Poem(Poem obj) {
        this.title = obj.title;
        this.author = obj.author;
        this.poem = obj.poem;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author= author;
    }

    public void setPoem(String poem) {
        this.poem = poem;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPoem() {
        return this.poem;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Poem: " + this.poem);
    }

    // returns the number of lines in the poem
    public int getNumLines() {
        // YOUR CODE HERE
        return this.poem.split("\n").length;
    }

    // returns the number of words in the poem
    public int getNumWords() {
        // YOUR CODE HERE
        // the words may be split by a space or a newline character
        return this.poem.split(" ").length + this.poem.split("\n").length;
    }

    // calculates the average number of words per line
    public double getAvgWordsPerLine() {
        // YOUR CODE HERE
        return (double) this.getNumWords() / this.getNumLines();
    }

    // returns the number of times the word @param:word occurs in the poem
    public int getNumOccurrences(String word) {
        // YOUR CODE HERE
        return this.poem.split(word).length - 1;
    }
}

public class StringTest {
    public static void main(String[] args) {
        Poem p1 = new Poem("The Road Not Taken", "Robert Frost", "Two roads diverged in a yellow wood,\n" +
                "And sorry I could not travel both\n" +
                "And be one traveler, long I stood\n" +
                "And looked down one as far as I could\n" +
                "To where it bent in the undergrowth;\n" +
                "\n" +
                "Then took the other, as just as fair,\n" +
                "And having perhaps the better claim,\n" +
                "Because it was grassy and wanted wear;\n" +
                "Though as for that the passing there\n" +
                "Had worn them really about the same,\n" +
                "\n" +
                "And both that morning equally lay\n" +
                "In leaves no step had trodden black.\n" +
                "Oh, I kept the first for another day!\n" +
                "Yet knowing how way leads on to way,\n" +
                "I doubted if I should ever come back.\n" +
                "\n" +
                "I shall be telling this with a sigh\n" +
                "Somewhere ages and ages hence:\n" +
                "Two roads diverged in a wood, and I—\n" +
                "I took the one less traveled by,\n" +
                "And that has made all the difference.");
        p1.display();
        System.out.println("Number of lines: " + p1.getNumLines());
        System.out.println("Number of words: " + p1.getNumWords());
        System.out.println("Average number of words per line: " + p1.getAvgWordsPerLine());
        System.out.println("Number of occurrences of the word 'I': " + p1.getNumOccurrences("I"));
        System.out.println("Number of occurrences of the word 'the': " + p1.getNumOccurrences("the"));
        System.out.println("Number of occurrences of the word 'and': " + p1.getNumOccurrences("and"));
        System.out.println("Number of occurrences of the word 'road': " + p1.getNumOccurrences("road"));
        System.out.println("Number of occurrences of the word 'yellow': " + p1.getNumOccurrences("yellow"));
        System.out.println("Number of occurrences of the word 'wood': " + p1.getNumOccurrences("wood"));

        System.out.println();
    }
}
