public class ExternalMediaFormat {
    private String title;
    private String author;
    private int year;

    public ExternalMediaFormat(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void show() {
        // Show media...
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    // Getters and setters for title, author, and year...
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
