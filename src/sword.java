// credit : comment by chatGpt
public class sword implements accessories{
    protected double atk = 10;
    protected double def = 10;

    /** PrintStatus method
     *returns: Outputs the status of the sword, including additional damage (atk) and defense (def) values.
     *effects: Outputs information to the console but does not modify the internal state of the sword.
     */
    public void PrintStatus(){
        System.out.println("add damage :"+ atk);
        System.out.println("add defend :"+ def);
    }

    /** addDEF method
     *returns: Returns the defense value (def) of the sword.
     */
    public double addDEF(){
        return def;
    }

    /** addDMG method
     *returns: Returns the additional damage value (atk) of the sword.
     */
    public double addDMG(){
        return atk;
    }
}

/* 2.
คิดว่าน่าจะทำแยกออกมาเป็น Class PrintStatus() ออกมาเลยน่าจะดูใช้งานง่ายกว่า จะได้ไม่ต้องมาเพิ่มclass PrintStatus() ในทุกๆ Role ใหม่

 */