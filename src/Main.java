public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        System.out.println("Объём куба равен " + cube.getVolume());

        //@Builder & @ToString
        Pyramid pyramid = Pyramid.builder().plane(3).height(4).build();
        System.out.println(pyramid);
        System.out.println("Объём пирамиды равен " + pyramid.getVolume());
    }
}
