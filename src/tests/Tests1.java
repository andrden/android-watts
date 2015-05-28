package tests;

import org.boofcv.example.blinkwatt.MPoint;
import org.boofcv.example.blinkwatt.MPoints;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by denny on 5/28/15.
 */
public class Tests1 {
    public static void main(String[] args) throws Exception{
        new Tests1().test1();
    }

    public void test1() throws Exception{
        List<MPoint> pts = new ArrayList<MPoint>();
        BufferedReader br = new BufferedReader(new InputStreamReader(Tests1.class.getResourceAsStream("log1.txt")));
        String line=null;
        while((line=br.readLine())!=null){
            pts.add(MPoint.parse(line));
        }
        MPoints mpts = new MPoints(pts);
        assertTrue(mpts.valid());
        assertEquals("[5, 10, 15, 19]", mpts.impStarts().toString());
    }

    private void assertEquals(String s, String s1) {
        if( !s.equals(s1) ){
            throw new RuntimeException(s+ " "+s1);
        }
        System.out.println(s1);
    }

    private void assertTrue(boolean valid) {
        if( !valid ){
            throw new RuntimeException();
        }
    }
}
