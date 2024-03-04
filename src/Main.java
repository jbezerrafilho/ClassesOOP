public class Main {
    public static void main(String[] args) {
        Car car = new Car();

//      O método `describeCar()` irá imprimir os valores default dos atributos
//      do objeto
        car.describeCar();
        System.out.println("make = " + car.getMake());
        System.out.println("model = "+ car.getModel());

    }
}
