public class WeekDaysPrinter {
    public static void main(String[] args) throws Exception {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < daysOfWeek.length; i++) {
            if (i >= 5) break; // Stop the loop after printing Friday
            System.out.println(daysOfWeek[i]);

        }
    }
}
