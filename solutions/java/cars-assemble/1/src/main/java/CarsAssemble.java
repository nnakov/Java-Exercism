public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int producedPerHour = 221;
        double production = speed * producedPerHour;
        if(speed <= 4) {
            return production;
        } else if (speed <= 8) {
            return production *= 0.9;
        } else if (speed == 9) {
            return production *= 0.8; 
        } else if (speed ==10) {
            return production *= 0.77;
        }
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        double production = productionRatePerHour(speed) / 60;
        return (int) production;
    }
}
