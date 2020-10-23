package level1.task_3;

public class DayOfWeek {
    public int dayOfWeek;

    DayOfWeek() {
    }

    DayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String printDay(int dayOfWeek) {
        if (dayOfWeek==1)return "Monday";
        else if(dayOfWeek==2)return "Tuesday";
        else if (dayOfWeek==3)return "Wednesday";
        else if(dayOfWeek==4)return "Thursday";
        else if(dayOfWeek==5)return "Friday";
        else if(dayOfWeek==6)return "Saturday";
        else return "Sunday";
    }
}
