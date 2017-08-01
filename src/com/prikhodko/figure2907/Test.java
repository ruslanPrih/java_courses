package com.prikhodko.figure2907;

/**
 * Created by руслан on 29.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        /*
        Rectangle rectangle=new Rectangle(40,30);
        Square square = new Square(20);
        Circle cyrcle = new Circle(10);


        Figure[] figures={rectangle, square, cyrcle};
        for (Figure figure: figures){
            System.out.println(figure);


        Figure figure = rectangle;
        System.out.println(figure.getPerimeter());
        Rectangle r= (Rectangle)figure;
        System.out.println(r);


        //проверка цепочки наследования
        System.out.println(figure instanceof Rectangle);
        System.out.println(figure);

        Rectangle rectangle = new Rectangle(40, 20);
        Square square = new Square(20);


        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());
        System.out.println(square.getPerimeter());
        System.out.println(square.getSquare());

        Circle circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());

        Figure[] figures = {rectangle, square, circle};
        for (Figure figure: figures) {
            System.out.println(figure);
        }

        Figure figure = rectangle;

        System.out.println(figure);

        Rectangle r = (Rectangle) figure;
        System.out.println(r);

        System.out.println(r instanceof Figure);

        r = (Rectangle) square;
        Square s = (Square) r;

        System.out.println(s);
*/

        Rectangle rectangle = new Rectangle(40, 30);
        Square square = new Square(20);
        Circle cyrcle = new Circle(10);
        IsoscelesTriangle tri1 = new IsoscelesTriangle(10, 25, 35);
        RightAngleTriangle tri2 = new RightAngleTriangle(5, 10);
        EquilateralTriangle tri3 = new EquilateralTriangle(12);


        Figure[] figures = {rectangle, square, cyrcle, tri1, tri2, tri3};
        for (Figure figure : figures)
            System.out.println(figure);

        System.out.println(tri1);
        System.out.println("perimetr= " + tri1.getPerimeter());
        System.out.println("area= " + tri1.getSquare());
        System.out.println(tri2);
        System.out.println("perimetr= " + tri2.getPerimeter());
        System.out.println("area= " + tri2.getSquare());
        System.out.println(tri3);
        System.out.println("perimetr= " + tri3.getPerimeter());
        System.out.println("area= " + tri3.getSquare());


        Figure figure = tri1;
        Figure figure2 = tri3;
        Figure figure3= tri2;

        System.out.println(figure);
        System.out.println(figure2);

        Triangle r = (Triangle) figure;
        System.out.println(r);
        Triangle r2 = (IsoscelesTriangle) figure2;
        System.out.println(r2);

        System.out.println(r2 instanceof Figure);



    }
}
