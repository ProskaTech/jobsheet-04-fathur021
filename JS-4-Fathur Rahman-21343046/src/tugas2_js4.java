/*
 * created by 21343046_fathur rahman
 */
public class tugas2_js4 {
    public static void main(String[] args){
        int x=10;
        int y=23;
        int z=5;
        int a;

        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);

        //mencari nilai dengan operator kondisi
        a=(y>=x)? y:x;
        a=(z>=a)?z:a;
        System.out.println("Nilai tertinggi adalah = "+a);
    }
}
