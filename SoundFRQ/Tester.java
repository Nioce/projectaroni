package SoundFRQ;
import java.util.Arrays;
/**
 * Souds 1 is the set array
 * And in this we test and cut it with trim and set the amp
 * and then 
 */
public class Tester
{
    public static void main(String[] args){
        int[] Sounds1 = {0,0,0,0,0,0,0,0,50,20,80,64,0,0,0,0,0,0,0,80,64,80,64,80,64,620,250,732,733,602,-352,-272,-20};
        Sound r1 = new Sound(Sounds1);
        System.out.println(r1.limitAmplitude(200));
        r1.trimSilence();
        System.out.println(Arrays.toString(r1.samples));
    }
}
