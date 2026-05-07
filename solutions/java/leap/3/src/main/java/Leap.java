class Leap {

    boolean isLeapYear(int year) {
        //if divisible by 100 must be also by 400 divisable
      //  if((year%4==0 && year%100 != 0) || (year%100 == 0 && year%400 == 0) ) {
        return (year%4 == 0 && year%100 !=0) || (year%100 == 0 && year%400 == 0);
    }

}
