import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

    private LocalDateTime moment;
    private int gigasecond = 1000000000;
    
    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return this.moment.plus(gigasecond, ChronoUnit.SECONDS);
    }
}
