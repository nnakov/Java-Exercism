class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int drivenDistance;
    private int batteryStatus;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.drivenDistance = 0;
        this.batteryStatus = 100;
    }

    public int maxDistance() {
        return speed * (batteryStatus / batteryDrain);
    }
    
    public boolean batteryDrained() {
        return batteryStatus < batteryDrain;
    }

    public int distanceDriven() {
        return this.drivenDistance;
    }

    public void drive() {
        if(batteryDrain <= batteryStatus) {
            this.drivenDistance += speed;
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
       
        return car.maxDistance() >= distance;
    }
}
