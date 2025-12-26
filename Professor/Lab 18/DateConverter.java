//KYAW SOE LWIN
//Lab18
//24November
//The program is about converting dates from numerical month-day format.

public class DateConverter
 {
    private static final String[] monNames = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
    private static final int[] monLengths = {0, 31, 28, 31, 30, 31, 30, 31, 31,
                                             30, 31, 30, 31};

    public static void convertDate(String date) throws MonthException, DayException 
    {
        int slashPosn = date.indexOf('/');
        if (slashPosn == -1)
            throw new MonthException("Date format incorrect, slash '/' not found.");

        String monStr = date.substring(0, slashPosn);
        String dayStr = date.substring(slashPosn + 1);
        int monNum = Integer.parseInt(monStr);
        int dayNum = Integer.parseInt(dayStr);


        if (monNum < 1 || monNum > 12)
            throw new MonthException("Invalid month. Please enter "+
            "a value between 1 and 12.");
        if (dayNum < 1 || dayNum > monLengths[monNum])
            throw new DayException("Invalid day for the given month.");

        System.out.println(date + " represents " + monNames[monNum] + " " + dayNum);
    }
}
