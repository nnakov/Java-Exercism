import java.math.BigInteger;

class Grains {
    

    
    BigInteger grainsOnSquare(final int square) {
        BigInteger sum = BigInteger.valueOf(1);
        BigInteger factor = BigInteger.valueOf(2);
        if(square < 1 || square > 64) {
            throw new IllegalArgumentException ("square must be between 1 and 64");
        }
        for(int i = 1; i < square; i++) {
            sum = sum.multiply(factor);
        }
        return sum;
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrains = BigInteger.valueOf(0);
        for(int i = 1; i <= 64; i++) {
            totalGrains = totalGrains.add(grainsOnSquare(i));
        }
        return totalGrains;
    }

}
