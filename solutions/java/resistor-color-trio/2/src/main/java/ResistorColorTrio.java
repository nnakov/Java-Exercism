import java.util.List;

class ResistorColorTrio {
    String label(String[] colors) {
        
       List<String> colorCodes = List.of(
            "black", "brown","red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
        );
        
        int resistorValue = (colorCodes.indexOf(colors[0])*10 + colorCodes.indexOf(colors[1])) * (int) Math.pow(10, colorCodes.indexOf(colors[2])); 

        if(resistorValue < 1000) {
            return resistorValue + " ohms";
        } else if (resistorValue < 1000000) {
            return resistorValue/1000 + " kiloohms";
        } else if (resistorValue < 100000000) {
            return resistorValue/1000000 + " megaohms"; 
        } else if (resistorValue < 200000000){
            return resistorValue/10000000 + " gigaohms";
        } else {
            return "99 gigaohms";
        }
    }
}
