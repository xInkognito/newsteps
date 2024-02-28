import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Cube implements Shape {
    @Getter
    private int plane;

    @Override
    public int getVolume() {
        return this.plane * this.plane;
    }
}
