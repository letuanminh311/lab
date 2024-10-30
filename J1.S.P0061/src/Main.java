//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InputData inp = new InputData();

        System.out.println("=====Calculator Shape Program=====");

        double rectWidth = inp.getDoubleInput("Please input side width of Rectangle: ");
        double rectLength = inp.getDoubleInput("Please input length of Rectangle: ");
        double circleRadius = inp.getDoubleInput("Please input radius of Circle: ");
        double sideA = inp.getDoubleInput("Please input side A of Triangle: ");
        double sideB = inp.getDoubleInput("Please input side B of Triangle: ");
        double sideC = inp.getDoubleInput("Please input side C of Triangle: ");

        Rectangle rectangle = new Rectangle(rectWidth, rectLength);
        Circle circle = new Circle(circleRadius);
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}