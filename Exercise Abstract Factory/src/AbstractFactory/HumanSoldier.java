package AbstractFactory;

public class HumanSoldier implements Soldier{

    @Override
    public void shoot() {
        System.out.println("Humano Disparando");
    }
}
