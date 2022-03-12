package Lesson14;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Test2 {
    public static void time(){
        firstOuter : for(int hour = 0; hour < 6; hour++){
            secondOuter : for(int min = 0; min < 60; min++){
                if(hour > 1 && min % 10 == 0) break firstOuter;
                inner : for(int sec = 0; sec < 60; sec++){
                    if(sec * hour > min) continue secondOuter;
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }
    public static void main(String[] args) {
        Test2.time();
    }
}
