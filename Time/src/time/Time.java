package time;

/**
 *
 * @author Mustafa R. Hegazy
 */
public class Time {

    private int currentHour;
    private int currentMinute;
    private int currentSecond;
    private long TotalTime;

    public Time() {
        TotalTime = System.currentTimeMillis();
    }

    public Time(long time) {
        TotalTime = time;
    }

    public Time(int hour, int minute, int second) {
        currentHour = hour;
        currentMinute = minute;
        currentSecond = second;
    }

    public void setTime(long elapsedTime) {
        TotalTime = elapsedTime;
    }

    public int getHour() {
        return (int) (TotalTime / (1000 * 60 * 60)) % 24;
    }

    public int getMinute() {
        return (int) (TotalTime / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int) (TotalTime / 1000) % 60;
    }

    public static void main(String[] args) {
        Time time = new Time(555550000);
        Time time2 = new Time();

        System.out.println("Auto Time");
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":"
                + time2.getSecond());

        System.out.println("Elapsed Time");
        System.out.println(time.getHour() + ":" + time.getMinute() + ":"
                + time.getSecond());

        System.out.println("Specified Time");
        time2.setTime(2432423534L);
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":"
                + time2.getSecond());
    }

}
