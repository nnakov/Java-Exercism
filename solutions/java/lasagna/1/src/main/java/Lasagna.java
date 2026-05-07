public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int cookingTime = 40;
        return cookingTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        int remainingTime = 40 - actualMinutes;
        return remainingTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int ovenTime) {
        return layers*2 + ovenTime;
    }
}
