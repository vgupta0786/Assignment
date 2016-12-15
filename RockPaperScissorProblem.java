package exercise1;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissorProblem {

    public int compareChoices(String firstSelection, String secondSelection) {
        SelectionType firstChoice,secondChoice;
        int result=1;
        if(null==SelectionType.getSelectedObjectByName(firstSelection)||
        null==SelectionType.getSelectedObjectByName(secondSelection)){
            throw new RuntimeException("Please input correct parameters");
        }else{
             firstChoice=SelectionType.getSelectedObjectByName(firstSelection);
             secondChoice=SelectionType.getSelectedObjectByName(secondSelection);
        }
        if(firstChoice.equals(secondChoice))
            result=0;
        
        Map<SelectionType,SelectionType> hm=new HashMap<SelectionType,SelectionType>();
        hm.put(SelectionType.ROCK, SelectionType.SCISSORS);
        if(firstChoice != secondChoice)
            return hm.get(firstChoice) == secondChoice ? 1 : -1;
        
        return result;
    }
}
