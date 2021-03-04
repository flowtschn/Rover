
package Steering;

public class DifferentialSteering implements Steering {

    private double ml;
    private double mr;
    private double radius;
    private Pair<Double , Double> p = new Pair<>(ml,mr);

    @Override
    public Pair<Double,Double> driveTo(Vector v) {
        radius = Math.sqrt(Math.pow(v.x,2)+Math.pow(v.y,2));
        mr = Math.round(Math.sqrt(Math.pow(radius-v.x,2)+Math.pow(v.y,2)));
        ml = Math.round(Math.sqrt(Math.pow(radius+v.x,2) + Math.pow(v.y,2)));
        if (v.y<0) {

            mr=-mr;
            ml=-ml;
        }
        if (v.y==0){
            if (v.x>0) {
                System.out.println("Rover turns right");
            }
            if (v.x<0){
                System.out.println("Rover turns left");

            }
        }
        p = new Pair(ml,mr);
        return  p;







    }


}
