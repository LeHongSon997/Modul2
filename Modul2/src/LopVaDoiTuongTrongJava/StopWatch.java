package LopVaDoiTuongTrongJava;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime starTime, endTime;

    public StopWatch() {
        starTime = LocalTime.now();
    }

    public StopWatch(LocalTime starTime, LocalTime endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public LocalTime getStarTime() {
        return starTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        starTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int milisecond = ((endTime.getHour() - starTime.getHour()) * 3600 + (endTime.getMinute() - starTime.getMinute()) * 60 + (endTime.getSecond() - starTime.getSecond()) * 1000);
        return milisecond;
    }
}
