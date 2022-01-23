public class loops_2 {
    public static void main (String[] args) {

        Object[][] paintname = {{"classy",23.43}, {"rouge", 22.43}, {"bleu-versalles",30.42},
                {"antarctic-white",20.63}};
        for (Object [] paint_type:paintname) {
            System.out.println(paint_type[0]);

        }
    }
}
