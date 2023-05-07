package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount = 0;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
            hitCount = -1;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
            hitCount = 0;
        }
        else if (hitCount == 4) {
            hitCount = 2;
            attackedBodyPart = BodyPart.CHEST;
        }

        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
            hitCount = 2;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
            hitCount = 0;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        }
        else if (hitCount == 4) {
            defendedBodyPart = BodyPart.CHEST;
            hitCount = 1;
        }
        return defendedBodyPart;
    }
}
