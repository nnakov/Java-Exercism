public class EliudsEggs {
    public int eggCount(int number) {
        
        int count = 0;
        while(number > 0 ) {
            if(number % 2 != 0) {
                count++;
            }
            number /= 2;
        }
        return count;
    }
}
