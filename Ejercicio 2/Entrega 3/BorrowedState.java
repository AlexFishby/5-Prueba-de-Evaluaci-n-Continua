//import Comun.MediaItem1;

public class BorrowedState implements State{
    private MediaItem1 mediaItem;


    public BorrowedState(MediaItem1 mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override
    public void handleRequest() {
        System.out.println("Manejando un request para media item: " + mediaItem.getTitle());
        // Aquí iría la lógica para manejar el estado prestado del mediaItem
        // Por ejemplo, podrías tener un método en mediaItem que maneje el cambio de estado:
        mediaItem.changeState(new ReservedState(mediaItem));
    }
}
