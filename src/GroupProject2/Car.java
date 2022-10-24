package GroupProject2;

public class Car {
    double carPrice;
    String color;

    double calculateSalePrice(){

        return carPrice;
    }
}
class Sedan extends Car {
    double length;
    double calculateSalePrice() {
        if(length > 20) {
            return carPrice *.95;
        } else {
            return  carPrice *.9;
        }
    }
}
class Truck extends Car {
    double weight;

    double calculateSalePrice() {
        if(weight > 2000) {
            return carPrice * .9;
        } else
            return carPrice * .8;
    }
}
class TestCode {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.carPrice = 20000;
        sedan.length = 22;
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck();
        truck.carPrice = 50000;
        truck.weight = 2500;
        System.out.println(truck.calculateSalePrice());
    }
}

