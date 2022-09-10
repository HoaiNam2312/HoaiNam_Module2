package ss4_lop_va_doi_tuong.Stop_Watch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public void khoiTao() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public int getElapsedTime() {

       return  this.endTime.getSecond()- this.startTime.getSecond();
    }


}
