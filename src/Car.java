public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Red";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

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
