package transportation;

import transportation.bus.Bus;
import transportation.taxi.Taxi;

public class Main {
    public static void main(String[] args) {
        Transportation bus =new Bus();
//버스 프린트
//        bus.TransportationNum(1);
//        bus.Current(2);
//        bus.AmountFuel(-50);
//        bus.Status("차고지행");
//        bus.AmountFuel(10);
//        bus.Status("운행중");
//        bus.Current(45);
//        bus.Current(5);
//        bus.AmountFuel(-55);
//        bus.CurrentSpeed(10);
//        bus.AmountFuel(1000);
//        bus.CurrentSpeed(10);


//텍시 프린트
        Transportation taxi=  new Taxi();
        Transportation taxi1 =new Taxi();
        taxi.TransportationNum(1);
        ((Taxi) taxi).ridding(2,"서울역","2km");
        taxi.AmountFuel(-80);
        ((Taxi) taxi).ridding(5,"","");
        ((Taxi) taxi).ridding(3,"구로디지털단지역","12km");
        taxi.AmountFuel(-20);
        taxi.CurrentSpeed(10);
//

    }
}
