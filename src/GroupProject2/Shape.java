package GroupProject2;

public interface Shape {
    void CalculateArea();
    void Calculateperimiter();
    double radius = 3;
    double pie=3.14;
    double length = 5;
    double weight = 4;


}
class Circle implements Shape{

    @Override
    public void CalculateArea() {
        System.out.println("Circle Area is "+pie*(radius*radius));
    }

    @Override
    public void Calculateperimiter() {
        System.out.println(" Circle perimiter is = "+(2*pie)*radius);
    }
}
class Square implements Shape{

    @Override
    public void CalculateArea() {
        System.out.println("Square Area is ="+length*length);
    }

    @Override
    public void Calculateperimiter() {
        System.out.println("Square perimiter is ="+length*weight);
    }

    public static void main(String[] args) {
        Shape[]Size={new Circle(),new Square()};
        for(Shape shape :Size) {
            shape.CalculateArea();
            shape.Calculateperimiter();
        }
    }
}

