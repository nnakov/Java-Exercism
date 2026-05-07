class NeedForSpeed {

    protected int speed;
    protected int batteryDrain;
    protected int driven;
    protected int batteryCharge;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.driven = 0;
        this.batteryCharge = 100;
    }

    public boolean batteryDrained() {
        return batteryDrain == 0 || batteryDrain > batteryCharge;
    }

    public int distanceDriven() {
        return this.driven;
    }

    public void drive() {
        if(batteryDrain <= batteryCharge) {
            this.driven += this.speed;
            this.batteryCharge -= batteryDrain;
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
        return distance <= car.speed * (100 / car.batteryDrain);
    }
}
