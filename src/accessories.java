// credit : comment by chatGpt
public interface accessories {
    /** PrintStatus method
     *returns: Outputs the status information of the accessory, such as additional damage and defense values.
     *effects: May involve console output or logging but should not modify the internal state of the accessory.
     */
    public void PrintStatus();

    /** addDEF method
     *returns: Returns the additional defense value provided by the accessory.
     */
    public double addDEF();

    /** addDMG method
     *returns: Returns the additional damage value provided by the accessory.
     */
    public double addDMG();
}
