public class Main {
    public static void main(String[] args) {
        //TODO call shouldWakeUp
        System.out.println(shouldWakeUp(true,1));
        //System.out.println(shouldWakeUp (false, 2));
        //System.out.println(shouldWakeUp (true, 8));

         //TODO call hasTeen
        System.out.println(hasTeen2(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        //System.out.println(hasTeen2(22, 23, 34));

        //TODO call isCatPlaying
        System.out.println(isCatPlaying(true, 10));
        //System.out.println(isCatPlaying(false, 36));
        //System.out.println(isCatPlaying(false, 35));

        //TODO call area
        System.out.println(area(5.0, 4.0));
        //System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        //System.out.println(area(-1));

    }

    public static boolean shouldWakeUp (boolean hav,int clock) {

        if (clock<0||clock>23 || !hav) return false;
        return clock<8||clock>=20;

        //if(hav&&(clock<25&&clock>=20)||(clock<=8&&clock>0)){
        //     return true;
         //} else if (!hav) {
         //   return false;

        //}
        //return false;
    }

    public static boolean hasTeen(int num1,int num2,int num3){
        System.out.println("1.fonksiyon çalıştı");
       return  ((num1>=13&&num1<=19)||(num2>=13&&num2<=19)||(num3>=13&&num3<=19)) ;

    }
    public  static boolean hasTeen2(int... ages){
        if(ages.length!=3){
            return  false;
        }
        for (int age:ages){
            if (age>=13&&age<=19){
                return true;
            }
        }
        return false;
    }
    public static boolean isCatPlaying(boolean season,int temp) {

        int limit = season ? 45 : 35;
        return temp >= 25 && temp <= limit;
    }

    public static double area(double shortEdge,double tallEdge){
         if(shortEdge<0||tallEdge<0){
              return -1;
         }
         return shortEdge*tallEdge;
    }

    public static double area (double radius ){
        if(radius <0){
            System.out.println("- değer girilemez");
            return -1;
        }
        return Math.pow(radius,2)*Math.PI;
    }
}