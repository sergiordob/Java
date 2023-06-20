public class Day
{
    public String getToday(int today_local)
    {
        String today;

        switch (today_local)
        {
            case 0: today = "Sunday";       break;
            case 1: today = "Monday";       break;
            case 2: today = "Tuesday";      break;
            case 3: today = "Wednesday";    break;
            case 4: today = "Thursday";     break;
            case 5: today = "Friday";       break;
            case 6: today = "Saturday";     break;
            default: today = "Error";       break;
        }
        return today;
    }

    public String getFutureDay(int today_local, int elapsed_days)
    {
        int actual_day = today_local + elapsed_days;
        String day_to_print = null;

        if (actual_day <= 31)
        {
            if (actual_day == 0 || actual_day == 7 || actual_day == 14 || actual_day == 21 || actual_day == 28)
            {
                day_to_print = "Sunday";
            }
            else if (actual_day == 1 || actual_day == 8 || actual_day == 15 || actual_day == 22 || actual_day == 29)
            {
                day_to_print = "Monday";
            }
            else if (actual_day == 2 || actual_day == 9 || actual_day == 16 || actual_day == 23 || actual_day == 30)
            {
                day_to_print = "Tuesday";
            }
            else if (actual_day == 3 || actual_day == 10 || actual_day == 17 || actual_day == 24 || actual_day == 31)
            {
                day_to_print = "Wednesday";
            }
            else if (actual_day == 4 || actual_day == 11 || actual_day == 18 || actual_day == 25)
            {
                day_to_print = "Thursday";
            }
            else if (actual_day == 5 || actual_day == 12 || actual_day == 19 || actual_day == 26)
            {
                day_to_print = "Friday";
            }
            else if (actual_day == 6 || actual_day == 13 || actual_day == 20 || actual_day == 27)
            {
                day_to_print = "Saturday";
            }
        }
        else
        {
            day_to_print = "Error!";
        }
        return day_to_print;
    }
}
