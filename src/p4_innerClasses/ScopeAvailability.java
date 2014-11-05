package p4_innerClasses;

/**
 * Created by Jack on 05.10.2014.
 */
public class ScopeAvailability {
    public static void main(String[] args) {
        boolean b = true;
        if(b){
            class TrackingSlip {
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip() {return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }
}
