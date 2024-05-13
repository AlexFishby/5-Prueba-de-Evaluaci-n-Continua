public class ReadCommand implements Command {
    private MediaComponent mediaComponent;

    public ReadCommand(MediaComponent mediaComponent) {
        this.mediaComponent = mediaComponent;
    }

    @Override
    public void execute() {
        mediaComponent.display();
    }
}
