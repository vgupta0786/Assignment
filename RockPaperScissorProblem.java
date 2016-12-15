package exercise1;

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
        
        return result;
    }
}
