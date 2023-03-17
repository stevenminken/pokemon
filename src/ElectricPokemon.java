public class ElectricPokemon extends Pokemon{

    private String color;
    private int voltage;
    public ElectricPokemon(String name, int level, int hp, int xp, int height, String food, String sound, boolean defence, boolean attack) {
        super(name, level, hp, xp, height, food, sound, defence, attack);
    }

    public ElectricPokemon(String name, int level, int hp, int xp, int height, String food, String sound, boolean defence, boolean attack ,String color, int voltage) {
        super(name, level, hp, xp, height, food, sound, defence, attack);
        this.color = color;
        this.voltage = voltage;
    }

    public String getColor() {
        return color;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public void setFood(String food) {
        food = "electric " + food;
    }
}
