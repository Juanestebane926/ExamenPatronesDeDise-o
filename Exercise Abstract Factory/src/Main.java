import AbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        FactionFactory humanFactory = new HumanFactory();
        FactionFactory alienFactory = new AlienFactory();

        Soldier humanSoldier = humanFactory.createSoldier();
        humanSoldier.shoot();

        Vehicle humanVehicle = humanFactory.createVehicle();
        humanVehicle.move();

        Soldier alienSoldier = alienFactory.createSoldier();
        alienSoldier.shoot();

        Vehicle alienVehicle = alienFactory.createVehicle();
        alienVehicle.move();




    }
}