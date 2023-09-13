public class TV
{
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV()
    {

    }

    public void turnOn()
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }

    public void setChannel(int newChannel)
    {
        channel = newChannel;
    }

    public void setVolume(int newVolumeLevel)
    {
        volumeLevel = newVolumeLevel;
    }

    public void channelUp()
    {
        if (on && (channel < 120))
        {
            channel++;
        }
    }

    public void channelDown()
    {
        if (on && (channel > 1))
        {
            channel--;
        }
    }

    public void volumeUp()
    {
        if (on && (channel < 7))
        {
            volumeLevel++;
        }
    }

    public void volumeDown()
    {
        if (on && (channel > 1))
        {
            volumeLevel--;
        }
    }
}
