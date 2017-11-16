package a;


/**
 * Write a description of class Sound here.
 *
 * @Andrew WIlomovsky  (your name)
 * @11/16
 */
public class Sound
{
    public int[] samples;
    // instance variables - replace the example below with your own
    public Sound(int[] samples){
        this.samples = samples;
    }
    
     /** 
     * This sets the apmlitude and sets the current soundd byte to the limited amp
     */
    
    public int limitAmplitude(int limit){
        int ns = 0;
           for(int i=0; samples.length-1>= i; i++){
               if(samples[i] <= -1 * limit){
                   samples[i] = -1 * limit;
                   ns++;
               }
               if(samples[i] >= limit){
                   samples[i] = limit;
                   ns++;
                }
           }
        return ns;
    }
    
    /** 
     * This trims the white space aka 0's at the beggining of a sound byte 
     */
    
    public void trimSilence(){
        int ns=0;
        for(int i=0; samples.length >= i; i++){
           if(samples[i] != 0){
               i+=samples.length+1;
           }
           else{
               ns +=1;
           }
        }
        int[] cutsound= new int[samples.length - ns];
        for(int i=0; cutsound.length > i; i++){
            cutsound [i ] += samples [ i+ns ];
        }
        samples = cutsound; 
    }
    
}
