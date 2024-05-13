public class MediaFactory {
    public Media createMedia(String type) {
        switch (type) {
            case "book":
                return new Book();
            case "magazine":
                return new Magazine();
            case "newspaper":
                return new Newspaper();
            default:
                throw new IllegalArgumentException("Invalid media type");
        }
    }
}