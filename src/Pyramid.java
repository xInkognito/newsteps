public class Pyramid implements Shape{
    public Pyramid(int plane, int height)
    {
        setPlane(plane);
        setHeight(height);
    }
    private int plane;
    private int height;

    public void setPlane(int plane){
        this.plane = plane;
    }
    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public int getVolume() {
        int volume = this.height*this.plane/3;
        return volume;
    }
}
