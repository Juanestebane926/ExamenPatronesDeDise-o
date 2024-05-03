package AbstractFactory;

public class AlienFactory implements FactionFactory{
    @Override
    public Soldier createSoldier() {
        return new AlienSoldier();
    }

    @Override
    public Vehicle createVehicle() {
        return new AlienVehicle();
    }
}
