public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes)
    {
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time addTime(Time otherTime)
    {
        int newHours = this.hours + otherTime.hours;
        int newMinutes = this.minutes + otherTime.minutes;

        if (newMinutes >= 60)
        {
            newMinutes -= 60;
            newHours++;
        }
        if (newHours >= 24)
        {
            newHours -= 24;
        }
        return new Time(newHours, newMinutes);
    }
}
