class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int driven;
    private int batteryStatus;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.driven = 0;
        this.batteryStatus = 100;
    }

    public boolean batteryDrained() {
        return batteryStatus < batteryDrain;
    }

    public int distanceDriven() {
        return this.driven;
    }

    public void drive() {
        if(batteryDrain <= batteryStatus) {
            this.driven += speed;
            this.batteryStatus -= batteryDrain;
        } 
        
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    
}

class RaceTrack {
    
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
