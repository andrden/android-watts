package org.boofcv.example.blinkwatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denny on 5/28/15.
 */
public class MPoints {
    List<MPoint> list;

    public MPoints(List<MPoint> list) {
        this.list = list;
    }

    double max(){
        double mx = list.get(0).getVal();
        for( MPoint p : list ){
            if( p.getVal()>mx ){
                mx = p.getVal();
            }
        }
        return mx;
    }

    int countOver(double v){
        int c=0;
        for( MPoint p : list ){
            if( p.getVal()>=v ){
                c++;
            }
        }
        return c;
    }

    public boolean valid(){
        return list.size()>10 && countOver(max()*0.95)>0.6*list.size();
    }

    public List<Long> impStarts(){
        List<Long> starts = new ArrayList<Long>();
        double threshold = 0.9*max();
        boolean inImp=false;
        for( MPoint p : list ){
            if( p.getVal()<threshold ){
                if( !inImp ) {
                    starts.add(p.getTime());
                    inImp = true;
                }
            }else{
                inImp = false;
            }
        }
        return starts;
    }

    Long watts(){
        List<Long> starts = impStarts();
        if( starts.size()>=2 ) {
            long dt = starts.get(starts.size() - 1) - starts.get(0);
            long watts = (starts.size() - 1) * 1000L * 3600 * 1000 / Watt.IMP_PER_KWATTH / dt;
            return watts;
        }
        return null;
    }
}
