package by.bellhard.j24.homeworks;

public class barca {

    public static void main(String[] args) {
        int a = 2000;
        int b = 126;
        double c = (a / b);

        System.out.println(c);
        System.out.println(a >= c);

        byte a1 = 12;
        System.out.println(a1 - 10 * 4);

        System.out.println();

        int r = 5;
        double p = 3.14;
        double S = 2 * p * r * r;
        if (S > 0) ;
        {
            System.out.println(S > 0);
            System.out.println(S);
            System.out.println(2 * p * r);
        }


        System.out.println();


        int temperature = 20;
        if (temperature < 10) {
            System.out.println("jaket");
        } else if (temperature <= 15) {
            System.out.println("windbreaker");
        } else if (temperature <= 19) {
            System.out.println("sweater");
        } else if (temperature <= 29) {
            System.out.println("t-short");
        } else if (temperature >= 30) {
            System.out.println("nothing");
        }
        System.out.println();

        int salary1 = 1000;
        int salary2 = 800;
        int salary3 = 600;

        if (salary1 > salary2 && salary2 > salary3){
            System.out.println(salary1 - salary3);
        }else
            if (salary2 > salary1 && salary1 > salary3){
                System.out.println(salary2 - salary3);
            }else
                if (salary2 > salary3 && salary3 > salary1){
                    System.out.println(salary2 - salary1);
                }else
                    if (salary3 > salary1 && salary1 > salary2){
                        System.out.println(salary3 - salary2);
                    }else
                        if (salary3 > salary2 && salary2 > salary1){
                            System.out.println(salary3 - salary1);
                        }

                        System.out.println();

                        int d = 1;
                        for (int i =0; i < 6; i++) {
                            d *= -2;
                        }
                            System.out.print(d);






    }
}