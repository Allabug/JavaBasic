package simpleClasses.ex6;

public class Time {
    int hours;
    int minutes;
    int seconds;


    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void changeHours(int newHours) {
        this.hours = (this.hours + newHours) % 24;
        if (this.hours < 0) {
            this.hours += 24;
        }
    }

    public void changeMinutes(int newMinutes) {
        this.minutes = (this.minutes + newMinutes) % 60;
        if (this.minutes < 0) {
            this.minutes += 60;
        }
    }

    public void changeSeconds(int newSeconds) {
        this.seconds = (this.seconds + newSeconds) % 60;
        if (this.seconds < 0) {
            this.seconds += 60;
        }
    }

    public String getTime() {
        String hoursStr = formatTime(hours);
        String minsStr = formatTime(minutes);
        String secStr = formatTime(seconds);

        String time = hoursStr + ":" + minsStr + ":" + secStr;

        return time;
    }

    public static String formatTime(int a) {
        String str;
        if (a >= 0 && a <= 9) {
            str = "0" + String.valueOf(a);
        } else {
            str = String.valueOf(a);
        }
        return str;
    }
}
