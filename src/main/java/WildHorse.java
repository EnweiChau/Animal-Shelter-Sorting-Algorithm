public class WildHorse implements Animal {
    // Color
    private Color color;

    public WildHorse(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void play() {
        System.out.println("this horse is roaming the mountain");
    }
    @Override
    public boolean equals(Object anotherHorse) {
        if (this == anotherHorse) {
            return true;
        }
        if (anotherHorse == null || getClass() != anotherHorse.getClass()) {
            return false;
        }
        WildHorse horse = (WildHorse) anotherHorse;

        return this.color.equals(horse.color);
    }
}
