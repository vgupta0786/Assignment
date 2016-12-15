package exercise1;
/**
 * <p>
 * Enumeration having possible choices.
 * </p>
 * 
 * @author vgup77
 *
 */
public enum SelectionType {
    
    /**
     * enum representing different selections
     */
    ROCK("rock"),
    SCISSORS("scissors"),
    PAPER("paper");
    
    /**
     * instance variable
     */
    private String selectedName;

    /**
     * private method
     * 
     * @param selectedName
     */
    private SelectionType(String selectedName) {
        this.selectedName = selectedName;
    }

    /**
     * @return the selectedName
     */
    public String getSelectedName() {
        return selectedName;
    }
    
    
    /**
     * @param selectedName
     * @return
     */
    public static SelectionType getSelectedObjectByName(String selectedName){
        for(SelectionType choice: SelectionType.values()){
            if(choice.getSelectedName().equalsIgnoreCase(selectedName)){
                return choice;
            }
        }
        return null;
    }
}
