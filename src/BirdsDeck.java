import java.util.*;
/*
 * BirdsDeck.java
 * Contains the full list of bird cards used in the simplified Wingspan game.
 * Each card includes all key attributes: name, point value, egg capacity, habitats, food cost,
 * power type, specific power implementation and bird size.
 */

public class BirdsDeck {
    //For bird cards value testing (for BirdValueTester.java)
    public static Bird getBirdByName(String name) {
    for (Bird b : createDeck()) {
        if (b.getName().equalsIgnoreCase(name)) {
            return b;
        }
    }
    return null;
}
    public static List<Bird> createDeck() {
        
        List<Bird> deck = new ArrayList<>();
        deck.add(new Bird("Great Horned Owl", 8, 2, true, false, false, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(100), 3, 112));
        deck.add(new Bird("Acorn Woodpecker", 5, 4, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 3, 46 ));
        deck.add(new Bird("American Coot", 3, 5, false, false, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 2, 61 ));
        deck.add(new Bird("American Crow", 4, 2, true, true, true, Bird.PowerType.ACTIVATED, new DiscardEggForFoodPower(1), 1, 99));
        deck.add(new Bird("American Goldfinch", 3, 3, false, true, false, Bird.PowerType.ON_PLAY, new GainFoodOnPlayPower(3), 2, 23));
        deck.add(new Bird("American Kestrel", 5, 3, false, true, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 56));
        deck.add(new Bird("American White Pelican", 5, 1, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 274));
        deck.add(new Bird("American Woodcock", 9, 2, true, true, false, Bird.PowerType.NONE, null, 3, 46));
        deck.add(new Bird("Anhinga", 6, 2, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 114));
        deck.add(new Bird("Baird’s Sparrow", 3, 2, false, true, false, Bird.PowerType.ACTIVATED, new LayEggPower(), 2, 23));
        deck.add(new Bird("Barn Owl", 5, 4, true, true, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 107));
        deck.add(new Bird("Barn Swallow", 1, 3, false, true, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 1, 38));
        deck.add(new Bird("Bewick’s Wren", 4, 3, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 3, 18));
        deck.add(new Bird("Black Skimmer", 6, 2, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 112));
        deck.add(new Bird("Black Tern", 4, 2, false, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(), 1, 61));
        deck.add(new Bird("Black-Bellied Whistling-Duck", 2, 5, false, false, true, Bird.PowerType.ACTIVATED, new DiscardFoodToTuckPower(2), 2, 76));
        deck.add(new Bird("Black-Crowned Night-Heron", 9, 2, false, false, true, Bird.PowerType.ACTIVATED, new DiscardEggForFoodPower(1), 3, 112));
        deck.add(new Bird("Black-necked Stilt", 4, 2, false, false, true, Bird.PowerType.ON_PLAY, new DrawCardOnPlayPower(2), 2, 74));
        deck.add(new Bird("Blue Grosbeak", 4, 3, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 3, 28));
        deck.add(new Bird("Blue Jay", 3, 2, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 41));
        deck.add(new Bird("Blue-Gray Gnatcatcher", 1, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainFoodPower(),1 , 15));
        deck.add(new Bird("Blue-Winged Warbler", 8, 2, true, true, false, Bird.PowerType.NONE, null, 2, 20));
        deck.add(new Bird("Brewer’s Blackbird", 3, 3, false, true, false, Bird.PowerType.ACTIVATED, new TuckAndLayEggPower(), 2, 41));
        deck.add(new Bird("Brown Pelican", 4, 2, false, false, true, Bird.PowerType.ON_PLAY, new GainFoodOnPlayPower(3), 2, 201));
        deck.add(new Bird("Burrowing Owl", 5, 4, false, true, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 53));
        deck.add(new Bird("Bushtit", 2, 5, true, true, true, Bird.PowerType.ACTIVATED, new TuckAndLayEggPower(), 2, 15));
        deck.add(new Bird("California Quail", 3, 6, true, true, false, Bird.PowerType.ACTIVATED, new LayEggOnSelfPower(), 3, 36));
        deck.add(new Bird("Canada Goose", 3, 3, false, true, true, Bird.PowerType.ACTIVATED, new DiscardFoodToTuckPower(2), 2, 132));
        deck.add(new Bird("Carolina Chickadee", 2, 3, true, false, false, Bird.PowerType.ACTIVATED, new CacheFoodFromSupplyPower(), 1, 20));
        deck.add(new Bird("Carolina Wren", 1, 15, true, false, false, Bird.PowerType.ON_PLAY, new DrawCardOnPlayPower(2), 1, 20));
        deck.add(new Bird("Cassin’s Sparrow", 3, 2, false, true, false, Bird.PowerType.ACTIVATED, new LayEggPower(), 2, 20));
        deck.add(new Bird("Cedar Waxwing", 3, 3, true, true, false, Bird.PowerType.ACTIVATED, new TuckGainFoodPower(), 2, 25));
        deck.add(new Bird("Chihuahuan Raven", 4, 3, false, true, false, Bird.PowerType.ACTIVATED, new DiscardEggForFoodPower(2), 3, 112));
        deck.add(new Bird("Chimney Swift", 3, 2, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 2, 36));
        deck.add(new Bird("Chipping Sparrow", 1, 3, true, true, false, Bird.PowerType.ACTIVATED, new LayEggPower(), 1, 23));
        deck.add(new Bird("Clark’s Grebe", 5, 2, false, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(), 1, 61));
        deck.add(new Bird("Clark’s Nutcracker", 5, 2, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 3, 61));
        deck.add(new Bird("Common Grackle", 3, 3, true, true, true, Bird.PowerType.ACTIVATED, new TuckAndLayEggPower(), 2, 43));
        deck.add(new Bird("Common Merganser", 5, 4, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 86));
        deck.add(new Bird("Common Nighthawk", 3, 2, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 2, 56));
        deck.add(new Bird("Common Raven", 5, 2, true, true, true, Bird.PowerType.ACTIVATED, new DiscardEggForFoodPower(2), 3, 135));
        deck.add(new Bird("Common Yellowthroat", 1, 4, false, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(2), 1, 18));
        deck.add(new Bird("Cooper’s Hawk", 3, 2, true, false, false, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(75), 1, 79));
        deck.add(new Bird("Dark-Eyed Junco", 3, 3, true, true, false, Bird.PowerType.ACTIVATED, new TuckGainFoodPower(), 2, 23));
        deck.add(new Bird("Dickcissel", 4, 3, false, true, false, Bird.PowerType.ACTIVATED, new TuckAndLayEggPower(), 3, 25));
        deck.add(new Bird("Double-Crested Cormorant", 3, 3, false, false, true, Bird.PowerType.ACTIVATED, new DiscardFoodToTuckPower(2), 2, 132));
        deck.add(new Bird("Downy Woodpecker", 3, 2, true, false, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("forest"), 1, 30));
        deck.add(new Bird("Eastern Bluebird", 4, 5, false, true, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("grassland"), 2, 33));
        deck.add(new Bird("Eastern Screech Owl", 4, 2, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 51));
        deck.add(new Bird("Ferruginous Hawk", 6, 2, false, true, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 2, 142));
        deck.add(new Bird("Fish Crow", 6, 2, true, true, true, Bird.PowerType.ACTIVATED, new DiscardEggForFoodPower(1), 2, 91));
        deck.add(new Bird("Forster’s Tern", 4, 2, false, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(), 1, 79));
        deck.add(new Bird("Franklin’s Gull", 3, 2, false, true, true, Bird.PowerType.ACTIVATED, new DiscardEggDrawCardsPower(2), 2, 91));
        deck.add(new Bird("Golden Eagle", 8, 1, false, true, true, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(100), 3, 201));
        deck.add(new Bird("Grasshopper Sparrow", 2, 2, false, true, false, Bird.PowerType.ACTIVATED, new LayEggPower(), 1, 20));
        deck.add(new Bird("Great Blue Heron", 5, 2, false, false, true, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("wetland"), 2, 183));
        deck.add(new Bird("Great Crested Flycatcher", 5, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainFoodPower(), 2, 33));
        deck.add(new Bird("Great Egret", 7, 3, false, false, true, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("wetland"), 3, 130));
        deck.add(new Bird("Greater Roadrunner", 7, 2, false, true, false, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(50), 3, 56));
        deck.add(new Bird("Hooded Warbler", 7, 3, true, false, false, Bird.PowerType.NONE, null, 2, 18));
        deck.add(new Bird("House Finch", 3, 6, true, true, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 2, 25));
        deck.add(new Bird("House Wren", 1, 5, true, true, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("grassland", "forest"), 1, 15));
        deck.add(new Bird("Indigo Bunting", 5, 3, true, true, false, Bird.PowerType.ACTIVATED, new GainFoodPower(), 3, 20));
        deck.add(new Bird("Juniper Titmouse", 4, 3, true, false, false, Bird.PowerType.ACTIVATED, new CacheFoodFromSupplyPower(), 2, 23));
        deck.add(new Bird("Killdeer", 1, 3, false, true, true, Bird.PowerType.ACTIVATED, new DiscardEggDrawCardsPower(2), 1, 46));
        deck.add(new Bird("Lincoln’s Sparrow", 3, 2, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 2, 20));
        deck.add(new Bird("Mallard", 0, 4, false, false, true, Bird.PowerType.ACTIVATED, new DrawCardPower(), 1, 89));
        deck.add(new Bird("Mississippi Kite", 4, 1, true, true, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 79));
        deck.add(new Bird("Mountain Bluebird", 4, 5, false, true, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("grassland"), 2, 36));
        deck.add(new Bird("Mountain Chickadee", 2, 3, true, false, false, Bird.PowerType.ACTIVATED, new CacheFoodFromSupplyPower(), 1, 23));
        deck.add(new Bird("Mourning Dove", 0, 5, true, true, true, Bird.PowerType.ACTIVATED, new LayEggPower(), 1, 46));
        deck.add(new Bird("Northern Bobwhite", 5, 6, false, true, false, Bird.PowerType.ACTIVATED, new LayEggOnSelfPower(), 3, 33));
        deck.add(new Bird("Northern Cardinal", 3, 5, true, false, false, Bird.PowerType.ACTIVATED, new GainFoodPower(), 2, 30));
        deck.add(new Bird("Northern Flicker", 2, 4, true, true, false, Bird.PowerType.ON_PLAY, new GainFoodOnPlayPower(3), 1, 51));
        deck.add(new Bird("Northern Harrier", 3, 2, false, true, true, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(75), 1, 109));
        deck.add(new Bird("Peregrine Falcon", 5, 2, false, true, true, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(100), 2, 104));
        deck.add(new Bird("Pied-billed Grebe", 0, 4, false, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(2), 1, 41));
        deck.add(new Bird("Pine Siskin", 3, 2, true, false, false, Bird.PowerType.ACTIVATED, new TuckGainFoodPower(), 2, 23));
        deck.add(new Bird("Prothonotary Warbler", 8, 4, true, false, true, Bird.PowerType.NONE, null, 3, 23));
        deck.add(new Bird("Purple Martin", 2, 3, false, true, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 1, 46));
        deck.add(new Bird("Pygmy Nuthatch", 2, 4, true, false, false, Bird.PowerType.ACTIVATED, new TuckGainFoodPower(), 2, 20));
        deck.add(new Bird("Red-Bellied Woodpecker", 1, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 41));
        deck.add(new Bird("Red-Breasted Nuthatch", 2, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 23));
        deck.add(new Bird("Red-Eyed Vireo", 3, 2, true, false, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("forest"), 1, 25));
        deck.add(new Bird("Red-Headed Woodpecker", 4, 3, true, true, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 3, 43));
        deck.add(new Bird("Red-Shouldered Hawk", 3, 2, true, false, false, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(75), 1, 102));
        deck.add(new Bird("Red-Tailed Hawk", 5, 2, true, true, true, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(75), 2, 124));
        deck.add(new Bird("Red-Winged Blackbird", 2, 3, false, true, true, Bird.PowerType.ACTIVATED, new TuckAndLayEggPower(), 1, 33));
        deck.add(new Bird("Ring-Billed Gull", 4, 2, false, false, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 2, 122));
        deck.add(new Bird("Rose-breasted Grosbeak", 6, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 3, 33));
        deck.add(new Bird("Ruby-crowned Kinglet", 2, 3, true, false, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("forest"), 1, 20));
        deck.add(new Bird("Ruddy Duck", 0, 5, false, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(2), 1, 48));
        deck.add(new Bird("Sandhill Crane", 5, 1, false, true, true, Bird.PowerType.ACTIVATED, new DiscardFoodToTuckPower(2), 3, 196));
        deck.add(new Bird("Savannah Sparrow", 2, 3, false, true, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("grassland"), 1, 18));
        deck.add(new Bird("Snowy Egret", 4, 2, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 104));
        deck.add(new Bird("Song Sparrow", 0, 5, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 1, 20));
        deck.add(new Bird("Spotted Towhee", 0, 4, true, true, false, Bird.PowerType.ACTIVATED, new GainFoodPower(), 1, 28));
        deck.add(new Bird("Steller’s Jay", 5, 2, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 3, 48));
        deck.add(new Bird("Swainson’s Hawk", 5, 2, false, true, false, Bird.PowerType.ACTIVATED, new TuckShortBirdPower(75), 2, 130));
        deck.add(new Bird("Tree Swallow", 3, 4, false, false, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 2, 38));
        deck.add(new Bird("Trumpeter Swan", 9, 2, false, false, true, Bird.PowerType.NONE, null, 3, 203));
        deck.add(new Bird("Tufted Titmouse", 2, 3, true, false, false, Bird.PowerType.ON_PLAY, new PlaySecondBirdPower("forest"), 1, 25));
        deck.add(new Bird("Violet-Green Swallow", 3, 3, true, true, true, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 2, 36));
        deck.add(new Bird("Western Tanager", 6, 2, true, false, false, Bird.PowerType.ACTIVATED, new GainFoodPower(), 3, 30));
        deck.add(new Bird("White-breasted Nuthatch", 2, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 28));
        deck.add(new Bird("White-Crowned Sparrow", 2, 5, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 2, 25));
        deck.add(new Bird("White-Faced Ibis", 8, 2, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 3, 91));
        deck.add(new Bird("Wild Turkey", 8, 5, true, true, false, Bird.PowerType.NONE, null, 3, 135 ));
        deck.add(new Bird("Willet", 4, 2, false, false, true, Bird.PowerType.ACTIVATED, new GainThenMaybeCachePower(), 1, 66));
        deck.add(new Bird("Wood Duck", 4, 4, true, false, true, Bird.PowerType.ACTIVATED, new DrawThenDiscardPower(2), 3, 76));
        deck.add(new Bird("Yellow-Bellied Sapsucker", 3, 3, true, false, false, Bird.PowerType.ACTIVATED, new GainFoodPower(), 2, 41));
        deck.add(new Bird("Yellow-Breasted Chat", 5, 3, true, true, true, Bird.PowerType.ACTIVATED, new MoveIfRightmostPower(), 3, 25));
        deck.add(new Bird("Yellow-Headed Blackbird", 4, 3, false, false, true, Bird.PowerType.ACTIVATED, new TuckAndLayEggPower(), 2, 38));
        deck.add(new Bird("Yellow-Rumped Warbler", 1, 4, true, false, false, Bird.PowerType.ACTIVATED, new TuckThenDrawPower(), 1, 23));

        return deck;
    }
}
