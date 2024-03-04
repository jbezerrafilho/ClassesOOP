public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

//  Métodos que manipulam os atributos de uma classe jamais poderá ser estático
//  Métodos na maioria das vezes são públicos devido interagirem como o objeto
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
