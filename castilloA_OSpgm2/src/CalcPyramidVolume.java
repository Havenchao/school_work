public class CalcPyramidVolume {

    public double pyramidVolume(double base, double width, double height){
        return (base * width) * height * (1.0/3.0);
    }

    public static void main(String... args){
        CalcPyramidVolume clc = new CalcPyramidVolume();

        System.out.println(clc.pyramidVolume(1.0, 1.0, 1.0));

    }
}
