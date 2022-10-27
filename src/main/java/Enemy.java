public class Enemy implements Mortal{
    protected int health;

    public Enemy(int health) {
        if(health < 0){
            throw new IllegalArgumentException("health must be > 0");
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            throw new IllegalArgumentException("health must be > 0");
        }
        this.health = health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
