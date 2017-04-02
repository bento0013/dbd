
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noom
 */
public class TestDate {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
                    try {
                       Date date = format.parse("20160421 01:19:0");
                        System.out.println("date = " + date);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
    }
}
