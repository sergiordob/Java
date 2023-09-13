package br.com.classes;
import java.util.Date;

public class StopWatch
{
    private long startTime;
    private long endTime;

    public StopWatch()
    {
        this.startTime = System.currentTimeMillis(); //pega o tempo atual
    }

    public void start()
    {
        this.startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime()
    {
        return this.getEndTime() - this.getStartTime();
    }

    public long getStartTime()
    {
        return this.startTime;
    }

    public long getEndTime()
    {
        return this.endTime;
    }
}
