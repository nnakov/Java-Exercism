import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class HighScores {

    private List<Integer> highScores = new ArrayList<>();
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        int highest = highScores.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .max()
            .getAsInt();
        return highest;
    }

    List<Integer> personalTopThree() {
        List<Integer> threeHighest = highScores.stream()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .collect(Collectors.toList());
        return threeHighest;
    }

}
