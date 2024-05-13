import java.util.ArrayList;
import java.util.List;

public class MediaCollection implements MediaComponent{
    private List<MediaComponent> components = new ArrayList<>();

    public void addComponent(MediaComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        for (MediaComponent component : components) {
            component.display();
        }
    }
}
