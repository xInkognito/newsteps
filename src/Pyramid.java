import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Pyramid implements Shape {
    private int plane;
    private int height;
    @Override
    public int getVolume() {
        return this.height * this.plane / 3;
    }
}
