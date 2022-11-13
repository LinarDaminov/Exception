package homeWork_2;

public class Truck extends Transport implements Competing {
    private final LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String pitStop() {
        return null;
    }

    @Override
    public double bestTime() {
        return 0;
    }

    @Override
    public double maxSpeed() {
        return 0;
    }

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    public enum LoadCapacity {
        N1(0, 3.5), N2(3.5, 12), N3(12, 100);
        private final double minWeight;
        private final double maxWeight;

        LoadCapacity(double minWeight, double maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public double getMinWeight() {
            return minWeight;
        }

        public double getMaxWeight() {
            return maxWeight;
        }
    }

    public void checkType() {
        if (this.loadCapacity != null) {
            System.out.println("Тип авто по грузоподъемности: " + this.loadCapacity);
        } else {
            System.out.println("Недостаточно информации");
        }
    }
    public void makeDiagnostic() {
        System.out.println();
    }


}
