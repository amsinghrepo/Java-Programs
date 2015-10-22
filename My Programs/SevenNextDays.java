import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

public class SevenNextDays{

public static void main(String args[]){

Calendar calendar = new GregorianCalendar();// current date today

Collection collOfDays = new ArrayList();

// collection contains the same object seven times! To avoid this issue, we should have coded it this way:

//Date currentDate = new Date();  // change for actual date after seven days

for(int i = 0; i<7; ++i){
Date currentDate = new Date();

calendar.add(Calendar.DATE, 1);
currentDate.setTime(calendar.getTimeInMillis());
collOfDays.add(currentDate);
}

for(Object oneDay : collOfDays){
System.out.println("The next day is: " + oneDay);
}
}

}