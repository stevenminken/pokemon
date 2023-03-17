public class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int xp;
    private int height;

    private String food;
    private String sound;
    private boolean defence;
    private boolean attack;

    public Pokemon(String name, int level, int hp, int xp, int height, String food, String sound, boolean defence, boolean attack) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.height = height;
        this.food = food;
        this.sound = sound;
        this.defence = defence;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public int getHeight() {
        return height;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public boolean isDefence() {
        return defence;
    }

    public boolean isAttack() {
        return attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setDefence(boolean defence) {
        this.defence = defence;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public String eats(String food) {
        return "I eat " + food;
    }

    public String speaks(String text) {
        return "I say " + text;
    }
}
