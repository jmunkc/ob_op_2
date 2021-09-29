package inheritance_abstract;

public class Circle extends GeometricalFigure{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    public double calculateArea(){
        return this.radius * radius * Math.PI;
    }


    public double calculatePerimter(){
        return this.radius * 2 * Math.PI;
    }
}
