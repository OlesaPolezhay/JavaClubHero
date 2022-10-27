abstract class Hero {
    protected String name;

    Hero(){};

    public Hero(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Field name is empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void attackEnemy(Enemy enemy);
}
