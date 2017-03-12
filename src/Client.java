/**
 * Created by Сергей on 12.03.2017.
 */
public class Client {

    public static void main(String[]args)
    {
       Car mySolaris = new Car.CarBuilder("Hyundai" , "Solaris")
                              .colour("gray-blue")
                              .intColour("gark")
                              .engHp(123)
                              .engVol(1.6)
                              .gearNum(5)
                              .interIsLeather(false)
                              .isOffRoad(false)
                              .build();
       Car hisFerrari = new Car.CarBuilder("Ferrari" , "F50").build();

        System.out.println("My car is the nice "+
                           mySolaris.getBrand() + " " +
                           mySolaris.getModel() + ", painted in beloved "+
                           mySolaris.getColor() + " colour and it has powerful engine with " +
                           mySolaris.getEngVol() + " litres volume, which gives me incredible " +
                           mySolaris.getEngHp()+ " HP!");
        System.out.println("And his car is "+ hisFerrari.getBrand() + " " +hisFerrari.getModel()+
                           " and it is so uninteresting, so I have not added other fields.");
    }
}
