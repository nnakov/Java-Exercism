public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        if(speed <= 4) {
            return 221*speed;
        } else if (speed <= 8) {
            return 221*speed * 0.9;
        } else if (speed == 9) {
            return 221*speed * 0.8; 
        } else if (speed ==10) {
            return 221*speed * 0.77;
        }
        return 221*speed;
    }

    public int workingItemsPerMinute(int speed) {
        double production = productionRatePerHour(speed) / 60;
        return (int) production;
    }
}
