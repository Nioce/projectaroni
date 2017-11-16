
/**
 * Write a description of class ScoreTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScoreTester
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        //StudentRecord input = new StudentRecord();
        //int[] studentrecord = input.readArray[]
        int[] Scores1 = {50,50,80,53,20};
        int[] Scores2 = {50,20,80,64,80,64,80,64,80,64};
        int[] Scores3 = {52,82,72,77,27,83,73};
        int[] Scores4 = {20,50,50,53,80};
        int[] Scores5 = {20,50,50,80};
        
        StudentRecord r1 = new StudentRecord(Scores1);
        StudentRecord r2 = new StudentRecord(Scores2);
        StudentRecord r3 = new StudentRecord(Scores3);
        StudentRecord r4 = new StudentRecord(Scores4);
        StudentRecord r5 = new StudentRecord(Scores5);
        
        System.out.println(r1.finalAverage());
        System.out.println(r2.finalAverage());
        System.out.println(r3.finalAverage());
        System.out.println(r4.finalAverage());
        System.out.println(r5.finalAverage());
    }
}
