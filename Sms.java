import java.time.LocalTime;
import java.time.LocalDate;

public class Sms {
    private String receiverNumber;
    private String senderNumber;
    private String content;
    private boolean status;
    private LocalDate date;
    private LocalTime time;
    private String smsId;
    public static int smsIdCounter = 0;

    public Sms(String receiverNumber, String senderNumber, String content, boolean status) {
        this.receiverNumber = receiverNumber;
        this.senderNumber = senderNumber;
        this.content = content;
        this.status = status;
        this.time = LocalTime.now();
        this.date = LocalDate.now();
        this.smsId = String.format("%03d", smsIdCounter++);
    }

    public Sms() {
        this("Unknown", "Unknown", "Unknown", true);
    }

    @Override
    public String toString() {
        return String.format("{SmsID: %s | Sender: %s | Receiver: %s | Content: %-20s | Status: %b | Sent Time: %02d:%02d | Sent Date: %02d-%s-%04d}",
                smsId, senderNumber, receiverNumber, content, status, time.getHour(), time.getMinute(), date.getDayOfMonth(), date.getMonth(), date.getYear());
    }
}
