public class Lasagna {
    
    public int expectedMinutesInOven() {
        int cookingTime = 40;
        return cookingTime;
    }
    
    public int remainingMinutesInOven(int actualMinutes) {
        int remainingTime = expectedMinutesInOven() - actualMinutes;
        return remainingTime;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    
    public int totalTimeInMinutes(int layers, int ovenTime) {
        return preparationTimeInMinutes(layers) + ovenTime;
    }
}
