package lldpractice.strategy;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Engineer sde1Engineer = EngineerFactory.createEngineer("Sumit",Designation.SDE1);
        System.out.println(sde1Engineer.calculateIncrement());
        Engineer sde2Engineer = EngineerFactory.createEngineer("Nishant",Designation.SDE2);
        System.out.println(sde2Engineer.calculateIncrement());
        Engineer sde3Engineer = EngineerFactory.createEngineer("Ruchi",Designation.SDE3);
        System.out.println(sde3Engineer.calculateIncrement());


        Bike bike = VehicleFactory("BIKE");
        bike.start();
        Car car = VehicleFactory("CAR");
        car.start();
        Train train = VehicleFactory("Train");
        train.start();
    }
}
