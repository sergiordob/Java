public class Date
{
    public static String getMonth(int month)
    {
        String literal_month;

        switch(month)
        {
            case 1: literal_month = "January";      break;
            case 2: literal_month = "February";     break;
            case 3: literal_month = "March";        break;
            case 4: literal_month = "April";        break;
            case 5: literal_month = "May";          break;
            case 6: literal_month = "June";         break;
            case 7: literal_month = "July";         break;
            case 8: literal_month = "August";       break;
            case 9: literal_month = "September";    break;
            case 10: literal_month = "October";     break;
            case 11: literal_month = "November";    break;
            case 12: literal_month = "December";    break;
            default: literal_month = "Error";       break;
        }
        return literal_month;
    }

    public static int getYear(int year)
    {
        return year;
    }

    public static int getDays(int month, int year)
    {
        int days;

        if ( (year % 400 == 0) || ( (year % 4 == 0) && (year % 100 != 0) ) ) //Essa logica identifica anos bissextos
        {
           switch (month)
           {
               case 1: days = 31;   break;
               case 2: days = 29;   break;
               case 3: days = 31;   break;
               case 4: days = 30;   break;
               case 5: days = 31;   break;
               case 6: days = 30;   break;
               case 7: days = 31;   break;
               case 8: days = 31;   break;
               case 9: days = 30;   break;
               case 10: days = 31;  break;
               case 11: days = 30;  break;
               case 12: days = 31;  break;
               default: days = 00; break;
           }
        }
        else
        {
            switch (month) //Caso o ano nao seja bissexto, o ano eh normal
            {
                case 1: days = 31;   break;
                case 2: days = 28;   break;
                case 3: days = 31;   break;
                case 4: days = 30;   break;
                case 5: days = 31;   break;
                case 6: days = 30;   break;
                case 7: days = 31;   break;
                case 8: days = 31;   break;
                case 9: days = 30;   break;
                case 10: days = 31;  break;
                case 11: days = 30;  break;
                case 12: days = 31;  break;
                default: days = 00; break;
            }
        }
        return days;
    }
}
