class RaindropConverter {

    String convert(int number) {
          if(number % 3 == 0 ) {
                if(number % 5 == 0 && number % 7 == 0) {
                    return "PlingPlangPlong";
                } else if(number % 5 == 0) {
                    return "PlingPlang";
                } else if(number % 7 == 0) {
                    return "PlingPlong";
                }
                return "Pling";
          } else if (number % 5 == 0) {
                if(number % 7 == 0) {
                    return "PlangPlong";
                }
                return "Plang";
          } else if (number % 7 == 0) {
                return "Plong";
          } 
       return "" + number;
    }
}
