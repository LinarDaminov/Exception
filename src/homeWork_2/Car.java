package homeWork_2;

public class Car extends Transport implements Competing {
    private final bodyType bodyType;
    public enum  bodyType {СЕДАН, ХЕТЧБЕК, КУПЕ, УНИВЕРСАЛ, ВНЕДОРОЖНИК,КРОССОВЕР,ПИКАП,ФУРГОН, МИНИВЕН}


    public Car(String brand, String model, double engineVolume,bodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    public Car.bodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void startMove() {
    }
    @Override
    public void finishMove() {
    }
    @Override
    public String pitStop() {
        return "Пит стоп";
    }

    @Override
    public double bestTime() {
        System.out.println();
        return 0.55;
    }
    @Override
    public double maxSpeed() {
        return 220;
    }

    public void makeDiagnostic() {

    }


    public void checkType() {
        if (this.bodyType !=null) {
            System.out.println("Тип авто по кузову: " + this.bodyType);
        } else {
            System.out.println("Недостаточно информации");
        }
    }





}
