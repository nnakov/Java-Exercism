class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int multiplier = String.valueOf(numberToCheck).length();
        int current = numberToCheck;
        int sum = 0;
        for(int i = 0; i < multiplier; i++) {
            int digit = current % 10;
            current /= 10;
            sum += Math.pow(digit, multiplier);
            
        }
        return sum == numberToCheck;
    }

}
