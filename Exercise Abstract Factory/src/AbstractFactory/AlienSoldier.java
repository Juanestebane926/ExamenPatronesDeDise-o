package AbstractFactory;

public class AlienSoldier implements Soldier{

    @Override
    public void shoot() {
        System.out.println("Soldado Alien disparando");
    }
}
