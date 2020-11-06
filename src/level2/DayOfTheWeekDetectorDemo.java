package level2;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        while (true) {
            int dayNumber = detector.getDayNumberFromUser();
            String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
            System.out.println(dayOfTheWeek);
        }
    }
}
