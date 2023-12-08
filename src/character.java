// credit : comment by chatGpt
public interface character {
    /** attack method
     *requires: The current character invoking the method must have a valid reference (this).
     *          The enemy parameter must be a valid non-null reference to another character.
     *returns: The enemy character's Attacked method is called with the attack damage value
     *          from the invoking character (this).
     */
    default void attack(character enemy){
        enemy.Attacked(getAtkDmg());
    }

    /** Attacked method
     *requires: The Dmg parameter must be a valid non-negative double value.
     *returns: The Attacked method is executed, and the enemy character's state is updated based on the damage received.
     *effects: The state of the enemy character is modified according to the damage value received.
     */
    public void Attacked(double Dmg);

    /** getAtkDmg method
     *returns: Returns a valid non-negative double value representing the attack damage of the character.
     */
    public double getAtkDmg();

    /** PrintStatus method
     *returns: Outputs the current status of the character, which may include information such as health, attack damage, etc.
     *effects: May involve console output or logging but should not modify the internal state of the character.
     */
    public void PrintStatus();
}
