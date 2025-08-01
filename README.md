# Solo Wingspan Board Game

This is a simplified, single-player Java version of the board game **Wingspan**.  
It can be played as a human or watch an AI play the game.

![Wingspan Board Game](https://i.imgur.com/7QDiFcF.png)

---

## Game Overview
---
Wingspan is a card based engine-building game. The game runs for  26 turns, across 4 rounds:

On each turn, the player (human or AI) can choose one of the main actions:  
**Play a Bird**, **Gain Food**, **Lay Eggs**, or **Draw a Bird**.

Birds have special powers that activate either when played or when a habitat action is taken. The goal is to finish the game with the highest score possible based on:

- Bird points
- Eggs
- Cached food
- Tucked cards
  
This simplified version removes some advanced mechanics (like round goals, bonus cards, powers that depend on other players) to focus on solo gameplay and achieve the best AI strategy.

---

## AI Strategies Used
---
We have tested several strategies to guide the AI toward smarter decisions.

1- **Random bird selection** — AI played any bird that it could afford. (Too simple)

2- **Highest-point birds** — Focused on playing birds with the highest points. (Too expensive to play at first)

3- **Lowest-cost birds** — Focused on playing cheap birds to increase speed. (Too many low-impact birds)

## Best Value Strategy — Final Strategy Used
- Simulated **1000 games** for each bird at every possible turn in which it forces to play this bird on that exact turn.
  
- Calculated the **average score** each bird produced depending on when it was played.
  
- Used this simulation data to:
  
  - Pick the best bird **to play** based on current bird cards in hand and resources.
    
  - Choose the most valuable bird **to draw** when selecting from face-up cards.

This strategy improved the AI performance and led to a higher score on average.

---

## Modes Available

You can run the game in one of three modes:

| Mode         | Description |
|--------------|-------------|
| `human`      | Play the game manually as a human player. |
| `ai`         | Run one full AI game using a strategy based on bird value. |
| `sim`        | Run 1000 AI games and print out average scores and statistics. |

---

## How to Run

Make sure compile all .java files into bin/ first:

```bash
javac -d bin src/*.java
```
Run the program from bin/ with one of the options:
```bash
java -cp bin Main human   
java -cp bin Main ai      
java -cp bin Main sim      
```

## Presentation

[View full presentation (PDF)](Presentation/Simulating%20and%20Optimizing%20AI%20Strategies%20in%20a%20Simplified%20Wingspan%20Game.pdf)
















