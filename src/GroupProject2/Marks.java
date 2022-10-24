package GroupProject2;

public abstract class Marks {
    double subject1;
    double subject2;
    double subject3;

    abstract void getPercentage();

}
class A extends Marks{

    A(double subject1,double subject2,double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    void getPercentage() {
        double Average = (subject1 + subject2 + subject3)/3;
        System.out.println(Average);
    }
}
class B extends A{
    double subject4;

    B(double subject1,double subject2,double subject3,double subject4){
        super(subject1,subject2,subject3);
        this.subject4=subject4;
    }
    void getPercentage() {
        double Average = (subject1 + subject2 + subject3 + subject4)/4;
        System.out.println(Average);
    }

    public static void main(String[] args) {
        Marks[] mark={new A(80,70,75),new B(90,100,68,87)};
        for(Marks Mark:mark){
            Mark.getPercentage();
        }

    }
}

