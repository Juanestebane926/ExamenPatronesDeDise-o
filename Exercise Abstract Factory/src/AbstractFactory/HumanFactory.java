package AbstractFactory;

public class HumanFactory implements FactionFactory{
    public Vehicle createVehicle(){
        return new HumanVehicle();
    }

    public Soldier createSoldier(){
        return new HumanSoldier();
    }

}
