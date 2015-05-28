package org.boofcv.example.blinkwatt;

import java.util.StringTokenizer;

/**
 * Created by denny on 5/28/15.
 */
public class MPoint {
    final long time;
    final double val;

    public MPoint(long time, double val) {
        this.time = time;
        this.val = val;
    }

    public long getTime() {
        return time;
    }

    public double getVal() {
        return val;
    }

    public static MPoint parse(String line){
        StringTokenizer st = new StringTokenizer(line);
        return new MPoint(Long.parseLong(st.nextToken()), Double.parseDouble(st.nextToken()));
    }
}
