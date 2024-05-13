// import Comun.MediaItem1;

public class ReservedState implements State{
    private MediaItem1 mediaItem1;

    public ReservedState(MediaItem1 mediaItem1){
        this.mediaItem1 = mediaItem1;
    }

    @Override
    public void handleRequest() {
        System.out.println("Estado reservado");
    }
}
