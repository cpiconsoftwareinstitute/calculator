public class loops {

    public static void main (String[] args) {

        int a = 5;

        for(int i=1;i<=100;i++){

            if(100%i==0){
                System.out.println(i + " is divider of 100");
            }
            if(i%5==0){
                System.out.println(i + " is multiple of 5");
            }
         }

        while(a<15){
            a++;
            System.out.println(a + "...we didn´t get yet");
        }
        System.out.println("Let´s start a do-while");
        a=0;
        do {

            System.out.println(a + "...we didn´t get yet");
            a++;
        }while(a<15);
    }
    }
