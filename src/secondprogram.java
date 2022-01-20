public class secondprogram {
    public static void main (String[] args) {

        String paintname = "classy";
        double cost_can = 18.65;
        int PaintCoveragePerCan_SQR_meter = 5;
        int wall_length_inMn=15000;
        int wall_heigth_inMn=6000;
        int wall_area_inMn_sqr = (wall_length_inMn/1000)*(wall_heigth_inMn/1000);
        System.out.println(wall_area_inMn_sqr);
        int tinsneeded = (int) wall_area_inMn_sqr/PaintCoveragePerCan_SQR_meter;
        System.out.println(tinsneeded);
        if(wall_area_inMn_sqr%PaintCoveragePerCan_SQR_meter != 0) {

            tinsneeded++;
        }
        double total_cost = tinsneeded * cost_can;
        System.out.println(tinsneeded);
        System.out.println("the cost of the paint " + paintname + " is: £" + total_cost );
    }
}
