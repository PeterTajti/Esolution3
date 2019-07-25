package Pirates;

public class Captain extends Pirate {

    public Captain(String name, int gold) {
        super(name, gold);
    }

    @Override
    public void work() {
        this.gold += 10;
        this.hitpoints -= 5;
    }

    @Override
    public void party() {
        this.hitpoints += 10;
    }
}