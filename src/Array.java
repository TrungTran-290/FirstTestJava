public class Array {
    public enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }

    public static final double PI =3.14159;
    public static final double E = 2.71828;
    public static void main(String[] args){
        Day today = Day.FRIDAY;
        double r=3;
        System.out.println("s="+r*r*PI);
        switch (today){
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
        }
        int[] array1 = {1,2,3,4,5};
        for (int i : array1){
            System.out.println(i);
        }
        int[][] array2 ={
                {1,2,3},{4,5,6},{7,8,9}
        };
        for (int i =0;i < array2.length ; i++){
            for (int j = 0; j < array2[i].length ; j++){
                System.out.println(array2[i][j] + " ");
            }
        }
        int tong = 0;
        for (int i = 0 ; i<array2.length;i++){
            tong += array2[i][i];
        }
        System.out.printf("Tong duong cheo chinh: %d",tong);
        System.out.println();
        int tong1 = 0;
        for (int i = 0 ; i<array2.length;i++){
            tong1 += array2[i][array2.length-i-1];
        }
        System.out.printf("Tong duong cheo phu: %d",tong1);
        HinhChuNhat a = new HinhChuNhat(4,3);
        System.out.println("chieu dai: " + a.dai);
        System.out.println("chieu dai: " + a.rong);
        System.out.printf("Chu vi: %f \n", a.chuvi());
        System.out.println("Dien Tich: " + a.dientich());
    }
}
