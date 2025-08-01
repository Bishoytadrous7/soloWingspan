/*
 * Bird.java
 * Represents a bird card in the simplified Wingspan game.
 * Each bird has a name, point value, egg capacity, habitats it can live in,
 * food cost, and powers like cached food or tucked cards.
 */
public class Bird {
    // Enum to define the type of power a bird can have
    public enum PowerType {
    NONE, // No power
    ACTIVATED, // Triggers when player activates a habitat
    ON_PLAY // Triggers when a bird card is played
    }
    // Bird Attributes 
    private String name;
    private int points;
    private int eggLimit;
    private boolean habitatForest;
    private boolean habitatGrassland;
    private boolean habitatWetland;
    private PowerType powerType; 
    private Powers power;
    private int foodCost;
    private int sizeCm;
    // In-game stats
    private int eggs = 0;
    private int tuckedCards = 0;
    private int cachedFood = 0;

   public Bird(String name, int points, int eggLimit, boolean forest, boolean grassland, boolean wetland,
            PowerType powerType, Powers power, int foodCost, int sizeCm) {
    this.name = name;
    this.points = points;
    this.eggLimit = eggLimit;
    this.habitatForest = forest;
    this.habitatGrassland = grassland;
    this.habitatWetland = wetland;
    this.powerType = powerType;

    // Use given power or default to NoPower to avoid null errors
    if (power != null) {
    this.power = power;
    } else {
        this.power = new NoPower(); 
    }

    this.foodCost = foodCost;
    this.sizeCm = sizeCm;
}

    // Accessing bird's info (getters)
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getEggLimit() {
        return eggLimit;
    }

    public int getEggs() {
        return eggs;
    }

    public int getTuckedCards() {
        return tuckedCards;
    }

    public int getCachedFood() {
        return cachedFood;
    }

    public Powers getPower() {
        return power;
    }
    public PowerType getPowerType() {
        return powerType;
    }
    public int getSizeCm() {
        return sizeCm;
    }

    public int getFoodCost() {
        return foodCost;
    }
    public boolean isHabitatForest() {
        return habitatForest;
    }

    public boolean isHabitatGrassland() {
        return habitatGrassland;
    }

    public boolean isHabitatWetland() {
        return habitatWetland;
    }



    // Game Actions
    
    // Checks if the bird still has room to lay eggs.
    public boolean canLayEgg() {
        return eggs < eggLimit;
    }
    // Add an egg if space is available
    public void layEgg() {
        if (canLayEgg()) {
            eggs++;
        }
    }
    // Remove an egg if any exist
    public void removeEgg() {
    if (eggs > 0) {
        eggs--;
    }
    }

    public void tuckCard() {
        tuckedCards++;
    }

    public void cacheFood() {
        cachedFood++;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public String getPowerName() {
    if (this.getPowerType() == PowerType.NONE) {
        return "None";
    } else {
        return this.getPower().getClass().getSimpleName();
    }
}


   @Override
   public String toString() {
    return name + " (Pts: " + points + ", Eggs: " + eggs + "/" + eggLimit + ", FoodCost: " + foodCost + ", Power: " + getPowerName() + ")";
}
}
