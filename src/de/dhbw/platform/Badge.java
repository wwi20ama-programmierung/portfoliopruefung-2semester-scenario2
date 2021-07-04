package de.dhbw.platform;

public enum Badge {
    NEWBIE(1),
    SUPPORTER(50),
    HOST(100);

    private int score;

    Badge(int score) {
        this.score = score;
    }

    int getScore() {
        return this.score;
    }
}
