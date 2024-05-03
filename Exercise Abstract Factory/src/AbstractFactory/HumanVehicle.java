package AbstractFactory;

public class HumanVehicle implements Vehicle{
    @Override
    public void move() {
        System.out.println("Carro humano moviendose");
    }
}
