// credit : comment by chatGpt
public class Assassin implements character{
    protected String playerName;
    protected int level;
    protected double hp;
    protected double max_hp;
    protected double mana;
    protected double max_mana;
    protected double dmg;
    protected double def;
    protected double base_dmg;
    protected double base_def;
    protected accessories Accessories;

    /** Assassin constructor
     *requires: playerName is a non-null string.
     *returns: Initializes the Assassin object with default values for various attributes.
     */
    public Assassin(String playerName){
        this.playerName = playerName;
        level = 1;
        hp = 80;
        max_hp = 80;
        mana = 50;
        max_mana = 50;
        base_dmg = 35;
        base_def = 20;
    }

    /** equipAccessories method
     *requires: Accessories is a non-null reference.
     *returns: If Accessories is an instance of sword, sets the Accessories field and updates the status. Otherwise, outputs a message indicating that the accessory cannot be equipped.
     *effects: May update the internal state of the Assassin object and print messages to the console.
     */
    public void equipAccessories(accessories Accessories){
        if(Accessories instanceof sword){
            this.Accessories = Accessories;
            updateStatus();
            System.out.println("สวมใส่อาวุธเรียบร้อย");
        }else{
            System.out.println("อาวุธนี้คุณใส่ไม่ได้");
        }
    }

    /**  updateStatus method
     *requires: The Accessories field is set to a valid non-null reference.
     *returns: Updates the base_def and base_dmg attributes based on the values provided by the equipped accessory.
     *effects: Modifies the internal state of the Assassin object.
     */
    public void updateStatus(){
        this.base_def += Accessories.addDEF();
        this.base_dmg += Accessories.addDMG();
    }

    /** PrintStatus method
     *returns: Outputs the status of the Assassin object, including player name, health points (hp), maximum health points (max_hp), mana, maximum mana (max_mana), base damage (base_dmg), and base defense (base_def).
     *effects: Outputs information to the console but does not modify the internal state of the Assassin object.
     */
    public void PrintStatus(){
        System.out.println("Role : Assassin");
        System.out.println("Player Name : " + playerName );
        System.out.println("HP : " + hp );
        System.out.println("MAX HP : " + max_hp );
        System.out.println("MANA : " + mana );
        System.out.println("MAX MANA : " + max_mana );
        System.out.println("BASE DAMAGE : " + base_dmg );
        System.out.println("BASE DEF : " + base_def );

    }

    /**  getAtkDmg method
     *returns: Returns the current base damage (base_dmg) of the Assassin object.
     */
    public double getAtkDmg(){
        return base_dmg;
    }

    /** Attacked method
     *requires: Dmg is a non-negative double value.
     *returns: If the incoming damage (Dmg) is greater than the base defense (base_def), reduces the health points (hp) accordingly.
     *effects: Modifies the internal state of the Assassin object based on the incoming damage.
     */

    public void Attacked(double Dmg){
        if( Dmg > base_def){
            hp = hp - (Dmg - base_def);
        }
    }
}

/* 2.
คิดว่าน่าจะทำแยกออกมาเป็น Class PrintStatus() ออกมาเลยน่าจะดูใช้งานง่ายกว่า จะได้ไม่ต้องมาเพิ่มclass PrintStatus() ในทุกๆ Role ใหม่

 */