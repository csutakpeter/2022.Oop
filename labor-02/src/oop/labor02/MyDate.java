package oop.labor02;

public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int year,int month, int day){
        if(DateUtil.isValidDate(year, month, day) == true) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDay(){return day;}

    public String toString(){
        return year+"."+month+"."+day;
    }
}
