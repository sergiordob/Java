public class CurrentDayAndYear
{
        public int[] getTime(long minutes)
    {

        int value[2] = 0;

        remainingMinutes =  ( (int) minutes % 525600);
        value[0] = remainingMinutes/1440; //days
        value[1] = ( (int) minutes/525600); //year

        return value;
    }
}
