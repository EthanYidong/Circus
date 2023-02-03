package circus.equipment;

import circus.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public int getValue() {
        return purchasePrice;
    }
}