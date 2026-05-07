import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {

        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {

        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18) ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter us = DateTimeFormatter.ofPattern("h:mm a");
        DateTimeFormatter day = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter month = DateTimeFormatter.ofPattern("MMMM");
        return "You have an appointment on " + appointmentDate.format(day) + ", " + appointmentDate.format(month) + " " + appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", " + "at " + appointmentDate.format(us) + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
