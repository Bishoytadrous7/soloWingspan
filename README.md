# Solo Wingspan Board Game

This is a simplified, single-player Java version of the board game **Wingspan**.  
The game can be played as a human or watch an AI play the game automatically using strategy and simulation.

---

## 🎮 Game Overview

Wingspan is a card-based engine-building game where you play bird cards to earn points through:

- Bird card points
- Laid eggs
- Cached food
- Tucked cards

This simplified version removes some advanced mechanics (like round goals, bonus cards, powers that depend on other players) to focus on solo gameplay and AI strategy.

---

## 🧠 Modes Available

You can run the game in one of three modes:

| Mode         | Description |
|--------------|-------------|
| `human`      | Play the game manually as a human player. |
| `ai`         | Run one full AI game using a strategy based on bird value. |
| `sim`        | Run 1000 AI games and print out average scores and statistics. |

---

## ▶️ How to Run

Make sure you compile the Java files first:

```bash
cd src
javac Main.java

Run the game in one of the following modes:

java Main human  
java Main ai      
java Main sim     



