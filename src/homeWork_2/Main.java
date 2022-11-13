package homeWork_2;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "2170", 1.5, Car.bodyType.СЕДАН);
        Car toyota = new Car("Toyota", "corolla", 1.8, Car.bodyType.КУПЕ);
        Car bmw = new Car("bmw", "x5", 2.0, Car.bodyType.МИНИВЕН);
        Car kia = new Car("kia", "rio", 1.8, Car.bodyType.СЕДАН);

        Truck daff = new Truck("Daff", "550", 3.2, Truck.LoadCapacity.N1);

        Truck maz = new Truck("maz", "650", 2.9, Truck.LoadCapacity.N2);
        Truck dfm = new Truck("dongFeng", "Captain", 3.0, Truck.LoadCapacity.N3);
        Truck valday = new Truck("valday", "next", 2.6, Truck.LoadCapacity.N2);

        Bus paz = new Bus("paz", "251", 2.6, Bus.Capacity.SMALL);
        Bus folAz = new Bus("golAz", "5291", 3.8, Bus.Capacity.MEDIUM);
        Bus liAz = new Bus("liaz", "254", 3.3, Bus.Capacity.VERY_LARGE);
        Bus nefAz = new Bus("nefAz", "657", 4.5, Bus.Capacity.LARGE);
        System.out.println(lada.toString());
        System.out.println(toyota.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println();
        System.out.println(daff.toString());
        System.out.println(maz.toString());
        System.out.println(dfm.toString());
        System.out.println(valday.toString());
        System.out.println();
        System.out.println(paz.toString());
        System.out.println(folAz.toString());
        System.out.println(liAz.toString());
        System.out.println(nefAz.toString());

        DriverD driverD = new DriverD("Иванов Иван Иванович", "D", 15, paz);
        DriverC driverC = new DriverC("Дмитриев Дмитрий Дмитриевич", "C", 20, daff);
        DriverB driverB = new DriverB("Петров Петр Петрович", "B", 10, bmw);


        System.out.println(driverD.toString() +" "+ paz.toString() );
        System.out.println(driverB.toString() +","+ bmw.toString() );
        System.out.println(driverC.toString() +" "+ daff.toString() );

        System.out.println(daff.bestTime());
        System.out.println(paz.maxSpeed());
        System.out.println(toyota.pitStop());

        bmw.checkType();
        lada.checkType();
        nefAz.checkType();
        liAz.checkType();
        daff.checkType();
        maz.checkType();


    }
}
