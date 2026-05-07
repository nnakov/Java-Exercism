public class JedliksToyCar {

    public int distance = 0;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return battery > 0 ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if(battery == 0) {
            System.out.println("Battery empty");
        } else {
            this.distance += 20;
            this.battery -= 1; 
        }  
    }
}
