//EXAMPLE OF A BAD WAY
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(health <= 0){
            System.out.println("Player is done!");
        }
    }

    public int healthRemaining(){
        return health;
    }
}
//EXAMPLE OF A BAD WAY
