package oop.labor02;

public class DateUtil {

    public static boolean leapYear(int year){
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) return true;
        else return false;
    }

    public static boolean isValidDate(int year, int month, int day){
        if(year<1) return false;
        if(month<1 || month>12) return false;
        if(day<1 || day>31) return false;

        double monthArr[] ={4, 6, 9, 11};
                for(int i=0; i<3; ++i){
                    if(month == monthArr[i] && day>30) return false;
                }

        if(month==2 && leapYear(year) == false){
            if(day>28) return false;
        }
        if(month==2 && leapYear(year) == true){
            if(day>29) return false;
        }
        return true;
    }

}
