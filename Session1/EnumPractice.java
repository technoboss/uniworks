public class EnumPractice {
    public enum DaysOfTheWeek {
        MONDAY(5), 
        TUESDAY(8), 
        WEDNESDAY(4), 
        THURSDAY(12), 
        FRIDAY(9), 
        SATURDAY(8), 
        SUNDAY(0);

        final int workingHours;

        DaysOfTheWeek (int workingHours) {
            this.workingHours = workingHours;
        }
    }

    public static void main(String[] args){
        // Assigning a single value of the enum class
        //DaysOfTheWeek sevenDay =  DaysOfTheWeek.SUNDAY;
        //System.out.println(sevenDay);
        // Printing all the values of the enum class
        // for (DaysOfTheWeek weekdays : DaysOfTheWeek.values()) {
        //     System.out.println(weekdays);
        // }

        // Get weekly total hours
        int MON = DaysOfTheWeek.MONDAY.workingHours;
        int TUE = DaysOfTheWeek.TUESDAY.workingHours;
        int WED = DaysOfTheWeek.WEDNESDAY.workingHours;
        int THU = DaysOfTheWeek.THURSDAY.workingHours;
        int FRI = DaysOfTheWeek.FRIDAY.workingHours;
        int SAT = DaysOfTheWeek.SATURDAY.workingHours;
        int SUN = DaysOfTheWeek.SUNDAY.workingHours;


        int totalWeeklyHours = MON + TUE + WED + THU + FRI + SAT + SUN;
        double avgWeeklyHours = (double) (MON + TUE + WED + THU + FRI + SAT + SUN) / 7;

        System.out.println("Total weekly working Hours: " + totalWeeklyHours);
        System.out.printf("Average weekly working Hours: %.2f", avgWeeklyHours);
    }
}
