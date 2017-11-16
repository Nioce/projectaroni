/** 
 * This will set the studentRecords and make it a public class
 */
public class StudentRecord{
    private int[] scores;
    public StudentRecord(int[] scores){
        this.scores = scores;
    }
    
     /** 
     * This creates the average of the scores
     */
    private double average(int first, int last){
        double sum = 0.0;
        for(int n=first; last>=n; n++){
            sum += scores[n];
        }
        return sum/(last-first+1);
    }
    
     /** 
     * This checks if the one in front of it is greater than and or equal to the prevoius one
     * If so it returns true
     */
    private boolean hasImproved(){
        int valueofnormality=0;
        for(int n=0; scores.length>n; n++){
            if((n != scores.length-1) && (scores[n]<=scores[n+1])){
                valueofnormality+= 1;
            }
        }
        if(valueofnormality==(scores.length-1)){
            System.out.println("WOrking");
            return true;
        }
        System.out.println("N ot WOrking");
        return false;
    }
    
     /** 
     * Finds the average of the scores by checking the final average. 
     */
    public double finalAverage(){
        int last = scores.length-1;
        int first = 0;
        
        if (hasImproved()) {
            first = scores.length / 2;
        }
        return average(first, last);
    
    }
}