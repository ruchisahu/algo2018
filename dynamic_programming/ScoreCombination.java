import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ScoreCombination {
  // @include
  public static int numCombinationsForFinalScore( int finalScore, List<Integer> individualPlayScores) 
  {
    int[][] numCombinationsForScore = new int[individualPlayScores.size()][finalScore + 1];
    for (int i = 0; i < individualPlayScores.size(); ++i) 
    {
      numCombinationsForScore[i][0] = 1; // One way to reach 0.
      for (int j = 1; j <= finalScore; ++j)
      {
        int withoutThisPlay  = i - 1 >= 0 ? numCombinationsForScore[i - 1][j] : 0;
        
        int withThisPlay  = j >= individualPlayScores.get(i)
                  ? numCombinationsForScore[i][j - individualPlayScores.get(i)]
                  : 0;
        numCombinationsForScore[i][j] = withoutThisPlay + withThisPlay;
      }
    }
    return numCombinationsForScore[individualPlayScores.size() - 1][finalScore];
  }
  

  public static void main(String[] args) {
   
      int k;
    Set<Integer> individualPlayScoresSet = new HashSet<Integer>();
    
      k = 12;
      
       individualPlayScoresSet.add(2);
        individualPlayScoresSet.add(3);
         individualPlayScoresSet.add(7);
      
   
    List<Integer> individualPlayScores
        = new ArrayList<Integer>(individualPlayScoresSet);
    System.out.println(numCombinationsForFinalScore(k, individualPlayScores));
    
  }
}
