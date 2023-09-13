import java.util.Scanner;
import java.util.Locale;

public class Listing_9_2
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        TV modelOne = new TV();

        int on;
        int channel;
        int volume;
        char option;
        char upOrDownOrExit = 'x';

        System.out.print("Press 1 to turn ON: ");
        on = input.nextInt();

            if (on == 1)
            {
                modelOne.turnOn();

                System.out.print("Enter a channel (1-120): ");
                channel = input.nextInt();
                modelOne.setChannel(channel);
                System.out.printf("Channel %d selected. ", channel);
                System.out.print("Enter the volume: ");
                volume = input.nextInt();
                modelOne.setVolume(volume);

                System.out.print("Do you want to customize the volume (y/n)? ");
                option = input.next().charAt(0);

                if (option == 'y')
                {
                    while (upOrDownOrExit != '0')
                    {
                        System.out.printf("Press +/- or 0 to exit (Volume %d): ", modelOne.volumeLevel);
                        upOrDownOrExit = input.next().charAt(0);

                        if (upOrDownOrExit == '+')
                        {
                            modelOne.volumeUp();
                        }
                        else if (upOrDownOrExit == '-')
                        {
                            modelOne.volumeDown();
                        }
                    }
                }
                else if (option == 'n')
                {

                }

                upOrDownOrExit = 'x';
                System.out.print("Do you want to customize the channel (y/n)? ");
                option = input.next().charAt(0); //aqui

                if (option == 'y')
                {
                    while (upOrDownOrExit != '0')
                    {
                        System.out.printf("Press +/- or 0 to exit (Channel %d): ", modelOne.channel);
                        upOrDownOrExit = input.next().charAt(0);

                        if (upOrDownOrExit == '+')
                        {
                            modelOne.channelUp();
                        }
                        else if (upOrDownOrExit == '-')
                        {
                            modelOne.channelDown();
                        }
                    }
                }
                else if (option == 'n')
                {

                }

                System.out.printf("%nChannel = %d%nVolume = %d%nTv State = %b", modelOne.channel, modelOne.volumeLevel, modelOne.on);
            }
            else
            {
                System.out.print("The TV is Off!");
            }
    }
}
