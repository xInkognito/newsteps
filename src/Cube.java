public class Cube implements Shape{
    public Cube(int plane)
    {
        setPlane(plane);
    }
    private int plane;

    public void setPlane(int plane){
        this.plane = plane;
    }

    @Override
    public int getVolume() {
        int volume = this.plane*this.plane;
        return volume;
    }
}
