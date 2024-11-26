package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkSystem {
    //multiple keepers and lions
    private List<Lion> lions = new ArrayList<>();
    private List<Keeper> keepers = new ArrayList<>();

    public void addLion(Lion lion) {
        lions.add(lion);
    }

    public void addKeeper(Keeper keeper) {
        keepers.add(keeper);
    }

}
