public class DownloadCommand implements Command{
    private MediaItem1 mediaItem;

    public DownloadCommand(MediaItem1 mediaItem) {
        this.mediaItem = mediaItem;
    }


    @Override
    public void execute() {
        System.out.println("Downloading media item: " + mediaItem.getTitle());
        // Aquí iría la lógica para descargar el mediaItem
        // Por ejemplo, podrías tener un método en mediaItem que maneje la descarga:
        mediaItem.download();
    }


}
