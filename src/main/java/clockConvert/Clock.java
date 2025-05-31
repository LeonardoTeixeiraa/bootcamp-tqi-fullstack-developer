package clockConvert;

public sealed abstract class Clock permits BRLClock, USClock{
    protected int hour;
    protected int minute;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60){
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    protected int second;

    private String formatTime(int value) {
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTime(){
        return formatTime(hour) + ":" + formatTime(minute) + ":" + formatTime(second);
    }
    abstract Clock convert(Clock clock);
}

