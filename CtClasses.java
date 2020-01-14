package day22;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CtClasses {
    public static void main(String[] args) {
        zoom();
    }
    public static void zoom() {
        Date date=new Date();
        SimpleDateFormat todayF=new SimpleDateFormat("EEEE");
        String zoom=todayF.format(date);
        System.out.println("What's Today?");
        Runtime runtime=Runtime.getRuntime();
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Saturday"};
        String links[]={"LINK OF THE SUNDAY", //you need to fill these strings with your class links
                "LINK OF THE MONDAY",
                "LINK OF THE TUESDAY",
                "LINK OF THE WEDNESDAY",
                "LINK OF THE THURSDAY",
                "LINK OF THE SATUDAY"};
        String go="";
        for (int i=0;i<=6;i++) {
            if (zoom.equals(days[i])) {
                go=links[i];
                break;
            }
        }
        String chromeAndGo[]={"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome",go}; //this works only for windows. if you are using mac, you need to type your browser's adress in this chromeAndGo array[0].
        try {
            runtime.exec(chromeAndGo);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}