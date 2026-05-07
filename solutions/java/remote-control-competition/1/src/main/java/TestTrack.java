import java.util.List;
import java.util.Collections;

public class TestTrack {

   
    
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars, (p1, p2) -> p2.getNumberOfVictories() - p1.getNumberOfVictories());
        
        return cars;
    }
}
