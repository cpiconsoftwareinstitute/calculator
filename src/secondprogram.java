import java.util.Scanner;

public class secondprogram {
//***********************************************************//
    public static int decider(double tinsneeded){
        int n;
        if (tinsneeded < 10) {
            n = 1;
        } else if (tinsneeded > 10 && tinsneeded < 15) {
            n = 2;
        } else {
            n = 3;
        }
        return n;
    }
//***********************************************************//
//***********************************************************//
public static double decider_2(String season, Object paint_type){
          double cost_can;
            if (season == "summer") {
               cost_can = (double) paint_type*1.2;
            } else if (season == "winter") {
                cost_can = (double) paint_type*0.8;
            } else {
                cost_can = (double) paint_type;
            }
            return cost_can;
        }
//***********************************************************//

//***********************************************************//
    public static void warner(int n, String first_statement, String second_statement,
                                 String third_statement){
        switch(n){

            case 1:
                System.out.println(first_statement);
                break;
            case 2:
                System.out.println(second_statement);
                break;
            default:
                System.out.println(third_statement);
                break;

        }
    }
//***********************************************************//
    public static void main (String[] args) {

        Object[][] paintname = {{"classy",23.43}, {"rouge", 22.43}, {"bleu-versalles",30.42},
                {"antarctic-white",20.63}};

        double cost_can;
        int n;
        int PaintCoveragePerCan_SQR_meter = 5;

        int wall_length_inMn = 15000;
        int wall_heigth_inMn = 6000;
        int wall_area_inMn_sqr = (wall_length_inMn / 1000) * (wall_heigth_inMn / 1000);
        System.out.println("What season are we now?: ");
        Scanner sc = new Scanner(System.in);

        String season = sc.nextLine();
        System.out.println("Total area of the wall: " + wall_area_inMn_sqr);
        String result = (wall_length_inMn > 20000) ? "You need to apply for a loan" :
                "You can ask for this money to your parents";
        System.out.println(result);
        if (season == "winter") {
            n = 1;
        } else if (season == "summer") {
            n = 2;
        } else if (season == "Spring") {
            n = 3;
            }else if (season == "Autumn") {
            n = 3;
        }else {
            n=5;
            System.out.println("Error!");
        }
        warner(n,"You have to hire an expensive company",
                "You can hire a cheaper company",
                "Make sure the company that you hire is at least medium quality");
        System.out.println("Suggestion:");

        String moment = switch (n) {

            case 1 -> "Invisible Group - London";
            case 2 -> "Trinity Decorating - Bristol";
            default -> "Osceola's Paint Master LLC - Windermere";
        };
        System.out.println(moment);
        int tinsneeded = (int) wall_area_inMn_sqr / PaintCoveragePerCan_SQR_meter;
        if (wall_area_inMn_sqr % PaintCoveragePerCan_SQR_meter != 0) {

            tinsneeded++;
        }
        System.out.println("Number of can needed: " + tinsneeded);
        n = decider(tinsneeded);

        warner(n,"You can buy it in tesco", "You have to order it in Amazon",
                "You have to go to a warehouse personally");


        for (Object [] paint_type:paintname) {
            System.out.println("   ");
            System.out.println("***** " + paint_type[0] +" *****");
            System.out.println("   ");


            cost_can = decider_2(season, paint_type[1]);

            double total_cost = tinsneeded * cost_can;

            System.out.println("the cost of the paint with " + paint_type[0] + " in " +season+ " is: £"
                    + total_cost);
        }
    }
}
