package Lesson15;

public class Homework {
    public static void time(){
        int hour = 0;
        firstOuter : while(hour < 6){
            int min = 0;
            secondOuter : do{
                min++;
                if(hour > 1 && min % 10 == 0) break firstOuter;
                int sec = 0;
                inner : while(sec < 60){
                    if(sec * hour > min) continue secondOuter;
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
                //min++;
            } while(min < 60);
            hour++;
        }
    }


    public static void main(String[] args) {
        time();
    }

}
