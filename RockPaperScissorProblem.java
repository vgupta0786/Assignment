package exercise1;

public class RockPaperScissorProblem {

    public int compareChoices(String firstSelection, String secondSelection) {
        if(null==SelectionType.getSelectedObjectByName(firstSelection)||
        null==SelectionType.getSelectedObjectByName(secondSelection))
            throw new RuntimeException();
        
        
        return 1;
    }
}
