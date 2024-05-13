import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MediaControlador {
    private List<MediaComponent> models;
    private JFrame Vista;

    public MediaControlador(List<MediaComponent> models, JFrame Vista) {
        this.models = models;
        this.Vista = Vista;
    }

    public void displayMedia(int index) {
        models.get(index).display();
    }

    public int getMediaItemCount() {
        return models.size();
    }

    public static void main(String[] args) {
        MediaItem1 item = new MediaItem1.Builder()
                .setTitle("Tituloejemplo")
                .setAuthor("AutorEjemplo")
                .setYear(2022)
                .setMedia(new Book())
                .build();

        List<MediaComponent> mediaItems = new ArrayList<>();
        mediaItems.add(item);

        Vista vista = new Vista(new MediaControlador(mediaItems, new JFrame()));
        vista.display();
        // Resto del código...Modelo empleado por el momento para 1 media item.
    }
}
