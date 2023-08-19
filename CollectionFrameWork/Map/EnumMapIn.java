package CollectionFrameWork.Map;

import java.util.EnumMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumMapIn {
    public static void main(String[] args) {
                EnumMap<Day, String> schedule = new EnumMap<>(Day.class);

        schedule.put(Day.MONDAY, "Work");
        schedule.put(Day.TUESDAY, "Meeting");
        schedule.put(Day.WEDNESDAY, "Gym");
        schedule.put(Day.THURSDAY, "Study");
        schedule.put(Day.FRIDAY, "Party");
        schedule.put(Day.SATURDAY, "Relax");
        schedule.put(Day.SUNDAY, "Family Time");

        // Iterate through the EnumMap and print the schedule for each day
        // for (Day day : Day.values()) {
        //     System.out.println(day + ": " + schedule.get(day));
        System.out.println(schedule);
    }

}
