package Wyzwanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    public void shouldGive60() {
        //given
        String time1 = "9:00am-10:00pm";
        //when
        int result = Main2.returnMinutes(time1);
        //then
        Assertions.assertEquals(60, result);
    }
    @Test
    public void shouldGive690() {
        //given
        String time1 = "12:30pm-12:00am";
        //when
        int result = Main2.returnMinutes(time1);
        //then
        Assertions.assertEquals(690, result);
    }
    @Test
    public void shouldGive1425() {
        //given
        String time1 = "1:23am-1:08am";
        //when
        int result = Main2.returnMinutes(time1);
        //then
        Assertions.assertEquals(1425, result);
    }
    @Test
    public void shouldGive1320() {
        //given
        String time1 = "1:00pm-11:00am";
        //when
        int result = Main2.returnMinutes(time1);
        //then
        Assertions.assertEquals(1320, result);
    }
}