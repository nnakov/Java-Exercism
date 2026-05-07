public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        

        return 221*speed*switch(speed) {
            case 5,6,7,8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 1;
        };

    }

    public int workingItemsPerMinute(int speed) {
        double production = productionRatePerHour(speed) / 60;
        return (int) production;
    }
}
