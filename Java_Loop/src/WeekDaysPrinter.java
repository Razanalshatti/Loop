public class WeekDaysPrinter {
    public static void main(String[] args) throws Exception {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        
        for (String day : daysOfWeek) {
            
            if (!day.equals("Saturday") && !day.equals("Sunday")) {
                System.out.println(day);
            }
        }
    }
}
