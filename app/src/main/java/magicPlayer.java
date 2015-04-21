/**
 * Created by Preston Dang on 4/20/15.
 */
public class magicPlayer {
    private int lifeTotal;

    public magicPlayer() {
        this.lifeTotal = 5;
    }

    public int getLife() {
        return lifeTotal;
    }

    public int setLife(int life) {
        return lifeTotal + life;
    }
}
