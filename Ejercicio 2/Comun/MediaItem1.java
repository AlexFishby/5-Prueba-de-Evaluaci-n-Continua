// esta clase es comun al resto de las entregas y no se ha modificado

public class MediaItem1 implements MediaComponent{
    private String title;
    private String author;
    private int year;
    private Book media;
    private State state;

    private MediaItem1(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.year = builder.year;
        this.media = builder.media;
        this.state = new AvailableState(this);
    }

    public static class Builder {
        private String title;
        private String author;
        private int year;
        private Book media;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setMedia(Book media) {
            this.media = media;
            return this;
        }

        public MediaItem1 build() {
            return new MediaItem1(this);
        }
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    public void download() {
        System.out.println("Downloading " + getTitle() + "...");
    }

    // Getters and setters for title, author, and year...

    public void changeState(State state) {
        this.state = state;
    }

    public void handleRequest() {
        state.handleRequest();
    }
}
