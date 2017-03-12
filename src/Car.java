/**
 * Created by Сергей on 12.03.2017.
 */
public class Car {

    private final String model;
    private final String brand;
    private final String colour;
    private final String intColour;
    private final int engHp;
    private final double engVol;
    private final int gearNum;
    private final boolean interIsLeather;
    private final boolean isOffRoad;

    private Car(CarBuilder builder)
    {
        this.model = builder.model;
        this.brand = builder.brand;
        this.colour = builder.colour;
        this.intColour = builder.intColour;
        this.engHp = builder.engHp;
        this.engVol = builder.engVol;
        this.gearNum = builder.gearNum;
        this.interIsLeather = builder.interIsLeather;
        this.isOffRoad = builder.isOffRoad;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return colour;
    }

    public String getIntColour() {
        return intColour;
    }

    public int getEngHp() {
        return engHp;
    }

    public double getEngVol() {
        return engVol;
    }

    public int getGearNum() {
        return gearNum;
    }

    public boolean isInterIsLeather() {
        return interIsLeather;
    }

    public boolean isOffRoad() {
        return isOffRoad;
    }

    public static class CarBuilder{

        private final String model;
        private final String brand;
        private  String colour;
        private  String intColour;
        private  int engHp;
        private  double engVol;
        private  int gearNum;
        private  boolean interIsLeather;
        private  boolean isOffRoad;


        public CarBuilder(String brand, String model)
        {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder colour(String colour)
        {
            this.colour = colour;
            return this;
        }
        public CarBuilder intColour(String intColour)
        {
            this.intColour = intColour;
            return this;
        }
        public CarBuilder engHp(int engHp)
        {
            this.engHp = engHp;
            return this;
        }
        public CarBuilder gearNum(int gearNum)
        {
            this.gearNum = gearNum;
            return this;
        }
        public CarBuilder engVol(double engVol)
        {
            this.engVol = engVol;
            return this;
        }
        public CarBuilder interIsLeather(boolean interIsLeather)
        {
            this.interIsLeather = interIsLeather;
            return this;
        }
        public CarBuilder isOffRoad(boolean isOffRoad)
        {
            this.isOffRoad = isOffRoad;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }

    }
}
