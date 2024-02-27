public class Main {
    public static void main(String[] args)
    {
        Cube cube = new Cube(3);
        System.out.println("Объём куба равен " + cube.getVolume());

        Pyramid pyramid = new Pyramid(3,4);
        System.out.println("Объём пирамиды равен " + pyramid.getVolume());
    }
}
