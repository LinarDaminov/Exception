package homeWork_2;

public  class Driver  <T extends Transport & Competing> {
    private final String driversName;
    private String driversLicense;
    private int experience;

    private final T car;

    public Driver(String driversName, String driversLicense, int experience, T car) {
        this.driversName = driversName;
        this.driversLicense = driversLicense;
        this.experience = experience;
        this.car = car;
    }
    public void startMove() {
        System.out.println(" I am starting move");
   }
    public   void stopMove() {
        System.out.println(" i am stopping move");
    }
    public  void reFull() {
        System.out.println(" I am full my car ");
    }
    @Override
    public String toString() {
        return "Водитель: "  + driversName + ", Категория прав: " + driversLicense  +
                ", опыт вождения: " + experience ;
    }
}

