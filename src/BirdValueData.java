import java.util.*;
/*
 * BirdValueData.java
 * Holds the simulation data for each bird card in the simplified Wingspan game.
 * Stores average total score for each bird based on when it was played (by round and turn).
 * Used by the AI to decide which birds are most valuable to play or draw at different points in the game.
 */

public class BirdValueData {

    public static class BirdTurnValue {
        public double averageScore;

        public BirdTurnValue( double averageScore) {
            this.averageScore = averageScore;

        }
    }

    public static Map<String, BirdTurnValue[][]> getMap() {
        Map<String, BirdTurnValue[][]> map = new HashMap<>();


        BirdTurnValue[][] acorn = new BirdTurnValue[5][9];

        acorn[1][1] = new BirdTurnValue(52.24);
        acorn[1][2] = new BirdTurnValue(54.64);
        acorn[1][3] = new BirdTurnValue(53.56);
        acorn[1][4] = new BirdTurnValue(53.05);
        acorn[1][5] = new BirdTurnValue(52.44);
        acorn[1][6] = new BirdTurnValue(51.66);
        acorn[1][7] = new BirdTurnValue(49.67);
        acorn[1][8] = new BirdTurnValue(49.69);
        acorn[2][1] = new BirdTurnValue(49.45);
        acorn[2][2] = new BirdTurnValue(49.07);
        acorn[2][3] = new BirdTurnValue(48.96);
        acorn[2][4] = new BirdTurnValue(48.20);
        acorn[2][5] = new BirdTurnValue(48.22);
        acorn[2][6] = new BirdTurnValue(48.34);
        acorn[2][7] = new BirdTurnValue(47.70);
        acorn[3][1] = new BirdTurnValue( 48.37);
        acorn[3][2] = new BirdTurnValue(47.64);
        acorn[3][3] = new BirdTurnValue(47.56);
        acorn[3][4] = new BirdTurnValue(47.45);
        acorn[3][5] = new BirdTurnValue(47.76);
        acorn[3][6] = new BirdTurnValue(47.12);
        acorn[4][1] = new BirdTurnValue(47.00);
        acorn[4][2] = new BirdTurnValue(46.69);
        acorn[4][3] = new BirdTurnValue(47.27);
        acorn[4][4] = new BirdTurnValue( 45.36);
        acorn[4][5] = new BirdTurnValue(44.86);

        map.put("Acorn Woodpecker", acorn);
    BirdTurnValue[][] owl = new BirdTurnValue[5][9];
owl[1][1] = new BirdTurnValue(53.74);
owl[1][2] = new BirdTurnValue(55.98);
owl[1][3] = new BirdTurnValue(55.85);
owl[1][4] = new BirdTurnValue(55.12);
owl[1][5] = new BirdTurnValue(54.19);
owl[1][6] = new BirdTurnValue(53.41);
owl[1][7] = new BirdTurnValue(52.04);
owl[1][8] = new BirdTurnValue(51.04);
owl[2][1] = new BirdTurnValue(51.04);
owl[2][2] = new BirdTurnValue(50.36);
owl[2][3] = new BirdTurnValue(50.41);
owl[2][4] = new BirdTurnValue(50.21);
owl[2][5] = new BirdTurnValue(49.31);
owl[2][6] = new BirdTurnValue(49.50);
owl[2][7] = new BirdTurnValue(49.25);
owl[3][1] = new BirdTurnValue(48.77);
owl[3][2] = new BirdTurnValue(48.26);
owl[3][3] = new BirdTurnValue(48.71);
owl[3][4] = new BirdTurnValue(48.08);
owl[3][5] = new BirdTurnValue(48.78);
owl[3][6] = new BirdTurnValue(48.54);
owl[4][1] = new BirdTurnValue(47.91);
owl[4][2] = new BirdTurnValue(47.84);
owl[4][3] = new BirdTurnValue(48.16);
owl[4][4] = new BirdTurnValue(46.46);
owl[4][5] = new BirdTurnValue(45.72);
map.put("Great Horned Owl", owl);

BirdTurnValue[][] coot = new BirdTurnValue[5][9];
coot[1][1] = new BirdTurnValue(46.16);
coot[1][2] = new BirdTurnValue(47.29);
coot[1][3] = new BirdTurnValue(48.00);
coot[1][4] = new BirdTurnValue(47.59);
coot[1][5] = new BirdTurnValue(47.04);
coot[1][6] = new BirdTurnValue(46.79);
coot[1][7] = new BirdTurnValue(46.68);
coot[1][8] = new BirdTurnValue(46.28);
coot[2][1] = new BirdTurnValue(46.25);
coot[2][2] = new BirdTurnValue(46.94);
coot[2][3] = new BirdTurnValue( 46.26);
coot[2][4] = new BirdTurnValue(46.67);
coot[2][5] = new BirdTurnValue(46.70);
coot[2][6] = new BirdTurnValue(46.44);
coot[2][7] = new BirdTurnValue(46.65);
coot[3][1] = new BirdTurnValue( 46.52);
coot[3][2] = new BirdTurnValue( 46.68);
coot[3][3] = new BirdTurnValue(46.71);
coot[3][4] = new BirdTurnValue(47.04);
coot[3][5] = new BirdTurnValue(46.63);
coot[3][6] = new BirdTurnValue(46.32);
coot[4][1] = new BirdTurnValue(45.64);
coot[4][2] = new BirdTurnValue(46.20);
coot[4][3] = new BirdTurnValue(46.61);
coot[4][4] = new BirdTurnValue(45.24);
coot[4][5] = new BirdTurnValue(44.83);
map.put("American Coot", coot);
BirdTurnValue[][] crow = new BirdTurnValue[5][9];
crow[1][1] = new BirdTurnValue(47.29);
crow[1][2] = new BirdTurnValue(47.44);
crow[1][3] = new BirdTurnValue(47.03);
crow[1][4] = new BirdTurnValue(47.42);
crow[1][5] = new BirdTurnValue(47.48);
crow[1][6] = new BirdTurnValue(47.41);
crow[1][7] = new BirdTurnValue(47.99);
crow[1][8] = new BirdTurnValue(47.42);
crow[2][1] = new BirdTurnValue(47.82);
crow[2][2] = new BirdTurnValue( 47.91);
crow[2][3] = new BirdTurnValue(47.34);
crow[2][4] = new BirdTurnValue(47.73);
crow[2][5] = new BirdTurnValue(47.28);
crow[2][6] = new BirdTurnValue(47.28);
crow[2][7] = new BirdTurnValue(46.21);
crow[3][1] = new BirdTurnValue(46.17);
crow[3][2] = new BirdTurnValue(46.06);
crow[3][3] = new BirdTurnValue(45.79);
crow[3][4] = new BirdTurnValue(45.66);
crow[3][5] = new BirdTurnValue(45.34);
crow[3][6] = new BirdTurnValue(44.94);
crow[4][1] = new BirdTurnValue(44.77);
crow[4][2] = new BirdTurnValue(44.11);
crow[4][3] = new BirdTurnValue(45.04);
crow[4][4] = new BirdTurnValue(43.54);
crow[4][5] = new BirdTurnValue(43.16);
map.put("American Crow", crow);

BirdTurnValue[][] goldfinch = new BirdTurnValue[5][9];
goldfinch[1][1] = new BirdTurnValue( 51.72);
goldfinch[1][2] = new BirdTurnValue(52.85);
goldfinch[1][3] = new BirdTurnValue(51.98);
goldfinch[1][4] = new BirdTurnValue(51.80);
goldfinch[1][5] = new BirdTurnValue(50.98);
goldfinch[1][6] = new BirdTurnValue(50.49);
goldfinch[1][7] = new BirdTurnValue(50.14);
goldfinch[1][8] = new BirdTurnValue(49.88);
goldfinch[2][1] = new BirdTurnValue(50.01);
goldfinch[2][2] = new BirdTurnValue(49.94);
goldfinch[2][3] = new BirdTurnValue(49.43);
goldfinch[2][4] = new BirdTurnValue(49.33);
goldfinch[2][5] = new BirdTurnValue(49.13);
goldfinch[2][6] = new BirdTurnValue(49.59);
goldfinch[2][7] = new BirdTurnValue(48.53);
goldfinch[3][1] = new BirdTurnValue(48.85);
goldfinch[3][2] = new BirdTurnValue(48.71);
goldfinch[3][3] = new BirdTurnValue(48.30);
goldfinch[3][4] = new BirdTurnValue(48.59);
goldfinch[3][5] = new BirdTurnValue(48.14);
goldfinch[3][6] = new BirdTurnValue(47.65);
goldfinch[4][1] = new BirdTurnValue(47.66);
goldfinch[4][2] = new BirdTurnValue(47.64);
goldfinch[4][3] = new BirdTurnValue(46.71);
goldfinch[4][4] = new BirdTurnValue(45.64);
goldfinch[4][5] = new BirdTurnValue(45.04);
map.put("American Goldfinch", goldfinch);
BirdTurnValue[][] kestrel = new BirdTurnValue[5][9];
kestrel[1][1] = new BirdTurnValue(51.08);
kestrel[1][2] = new BirdTurnValue( 51.92);
kestrel[1][3] = new BirdTurnValue(52.44);
kestrel[1][4] = new BirdTurnValue(51.74);
kestrel[1][5] = new BirdTurnValue(51.27);
kestrel[1][6] = new BirdTurnValue(50.28);
kestrel[1][7] = new BirdTurnValue(51.09);
kestrel[1][8] = new BirdTurnValue(50.40);
kestrel[2][1] = new BirdTurnValue(50.27);
kestrel[2][2] = new BirdTurnValue(50.26);
kestrel[2][3] = new BirdTurnValue(49.98);
kestrel[2][4] = new BirdTurnValue(49.95);
kestrel[2][5] = new BirdTurnValue(49.99);
kestrel[2][6] = new BirdTurnValue(49.88);
kestrel[2][7] = new BirdTurnValue(49.69);
kestrel[3][1] = new BirdTurnValue( 49.12);
kestrel[3][2] = new BirdTurnValue(49.40);
kestrel[3][3] = new BirdTurnValue(49.51);
kestrel[3][4] = new BirdTurnValue(48.76);
kestrel[3][5] = new BirdTurnValue(48.96);
kestrel[3][6] = new BirdTurnValue( 48.61);
kestrel[4][1] = new BirdTurnValue(48.42);
kestrel[4][2] = new BirdTurnValue(48.33);
kestrel[4][3] = new BirdTurnValue(48.64);
kestrel[4][4] = new BirdTurnValue(46.45);
kestrel[4][5] = new BirdTurnValue(45.73);
map.put("American Kestrel", kestrel);

BirdTurnValue[][] pelican = new BirdTurnValue[5][9];
pelican[1][1] = new BirdTurnValue(49.63);
pelican[1][2] = new BirdTurnValue(51.50);
pelican[1][3] = new BirdTurnValue( 51.66);
pelican[1][4] = new BirdTurnValue( 51.43);
pelican[1][5] = new BirdTurnValue(51.05);
pelican[1][6] = new BirdTurnValue(50.15);
pelican[1][7] = new BirdTurnValue(50.24);
pelican[1][8] = new BirdTurnValue(49.57);
pelican[2][1] = new BirdTurnValue(49.18);
pelican[2][2] = new BirdTurnValue(49.09);
pelican[2][3] = new BirdTurnValue(48.66);
pelican[2][4] = new BirdTurnValue(48.47);
pelican[2][5] = new BirdTurnValue(48.20);
pelican[2][6] = new BirdTurnValue(48.09);
pelican[2][7] = new BirdTurnValue(48.30);
pelican[3][1] = new BirdTurnValue(48.20);
pelican[3][2] = new BirdTurnValue(48.60);
pelican[3][3] = new BirdTurnValue(47.71);
pelican[3][4] = new BirdTurnValue(47.25);
pelican[3][5] = new BirdTurnValue(47.23);
pelican[3][6] = new BirdTurnValue(47.59);
pelican[4][1] = new BirdTurnValue(46.52);
pelican[4][2] = new BirdTurnValue(47.08);
pelican[4][3] = new BirdTurnValue(47.57);
pelican[4][4] = new BirdTurnValue(46.14);
pelican[4][5] = new BirdTurnValue(45.94);
map.put("American White Pelican", pelican);
BirdTurnValue[][] woodcock = new BirdTurnValue[5][9];
woodcock[1][1] = new BirdTurnValue(48.74);
woodcock[1][2] = new BirdTurnValue(51.12);
woodcock[1][3] = new BirdTurnValue(51.26);
woodcock[1][4] = new BirdTurnValue(51.60);
woodcock[1][5] = new BirdTurnValue(51.62);
woodcock[1][6] = new BirdTurnValue(50.34);
woodcock[1][7] = new BirdTurnValue(50.37);
woodcock[1][8] = new BirdTurnValue(50.03);
woodcock[2][1] = new BirdTurnValue(49.86);
woodcock[2][2] = new BirdTurnValue(49.68);
woodcock[2][3] = new BirdTurnValue(50.28);
woodcock[2][4] = new BirdTurnValue(49.43);
woodcock[2][5] = new BirdTurnValue(48.99);
woodcock[2][6] = new BirdTurnValue(49.11);
woodcock[2][7] = new BirdTurnValue(48.92);
woodcock[3][1] = new BirdTurnValue(49.37);
woodcock[3][2] = new BirdTurnValue(49.06);
woodcock[3][3] = new BirdTurnValue(49.47);
woodcock[3][4] = new BirdTurnValue(48.82);
woodcock[3][5] = new BirdTurnValue(48.60);
woodcock[3][6] = new BirdTurnValue(48.10);
woodcock[4][1] = new BirdTurnValue(48.21);
woodcock[4][2] = new BirdTurnValue(48.33);
woodcock[4][3] = new BirdTurnValue(48.67);
woodcock[4][4] = new BirdTurnValue(47.12);
woodcock[4][5] = new BirdTurnValue(47.24);
map.put("American Woodcock", woodcock);

BirdTurnValue[][] anhiga = new BirdTurnValue[5][9];
anhiga[1][1] = new BirdTurnValue(51.30);
anhiga[1][2] = new BirdTurnValue(52.31);
anhiga[1][3] = new BirdTurnValue(51.85);
anhiga[1][4] = new BirdTurnValue(51.95);
anhiga[1][5] = new BirdTurnValue(51.44);
anhiga[1][6] = new BirdTurnValue(50.56);
anhiga[1][7] = new BirdTurnValue(50.74);
anhiga[1][8] = new BirdTurnValue( 49.95);
anhiga[2][1] = new BirdTurnValue(49.88);
anhiga[2][2] = new BirdTurnValue(49.39);
anhiga[2][3] = new BirdTurnValue(49.64);
anhiga[2][4] = new BirdTurnValue( 49.30);
anhiga[2][5] = new BirdTurnValue( 49.08);
anhiga[2][6] = new BirdTurnValue( 49.12);
anhiga[2][7] = new BirdTurnValue(48.36);
anhiga[3][1] = new BirdTurnValue(48.72);
anhiga[3][2] = new BirdTurnValue(48.18);
anhiga[3][3] = new BirdTurnValue(48.16);
anhiga[3][4] = new BirdTurnValue(47.99);
anhiga[3][5] = new BirdTurnValue(47.75);
anhiga[3][6] = new BirdTurnValue(47.89);
anhiga[4][1] = new BirdTurnValue(47.73);
anhiga[4][2] = new BirdTurnValue(47.58);
anhiga[4][3] = new BirdTurnValue(47.86);
anhiga[4][4] = new BirdTurnValue(46.79);
anhiga[4][5] = new BirdTurnValue(46.10);
map.put("Anhiga", anhiga);

BirdTurnValue[][] sparrow = new BirdTurnValue[5][9];
sparrow[1][1] = new BirdTurnValue( 46.51);
sparrow[1][2] = new BirdTurnValue( 47.84);
sparrow[1][3] = new BirdTurnValue( 47.99);
sparrow[1][4] = new BirdTurnValue( 48.07);
sparrow[1][5] = new BirdTurnValue(47.17);
sparrow[1][6] = new BirdTurnValue( 47.74);
sparrow[1][7] = new BirdTurnValue( 47.59);
sparrow[1][8] = new BirdTurnValue( 47.63);
sparrow[2][1] = new BirdTurnValue(47.51);
sparrow[2][2] = new BirdTurnValue( 47.72);
sparrow[2][3] = new BirdTurnValue( 48.22);
sparrow[2][4] = new BirdTurnValue(47.70);
sparrow[2][5] = new BirdTurnValue(47.69);
sparrow[2][6] = new BirdTurnValue(47.52);
sparrow[2][7] = new BirdTurnValue( 47.64);
sparrow[3][1] = new BirdTurnValue( 47.52);
sparrow[3][2] = new BirdTurnValue(47.07);
sparrow[3][3] = new BirdTurnValue(47.82);
sparrow[3][4] = new BirdTurnValue(47.91);
sparrow[3][5] = new BirdTurnValue(47.73);
sparrow[3][6] = new BirdTurnValue(47.34);
sparrow[4][1] = new BirdTurnValue(47.24);
sparrow[4][2] = new BirdTurnValue(46.43);
sparrow[4][3] = new BirdTurnValue(47.99);
sparrow[4][4] = new BirdTurnValue(46.48);
sparrow[4][5] = new BirdTurnValue(45.48);
map.put("Baird’s Sparrow", sparrow);
BirdTurnValue[][] barnOwl = new BirdTurnValue[5][9];
barnOwl[1][1] = new BirdTurnValue(53.29);
barnOwl[1][2] = new BirdTurnValue(52.63);
barnOwl[1][3] = new BirdTurnValue(52.83);
barnOwl[1][4] = new BirdTurnValue(52.70);
barnOwl[1][5] = new BirdTurnValue( 51.80);
barnOwl[1][6] = new BirdTurnValue(50.88);
barnOwl[1][7] = new BirdTurnValue(50.80);
barnOwl[1][8] = new BirdTurnValue( 50.89);
barnOwl[2][1] = new BirdTurnValue(50.88);
barnOwl[2][2] = new BirdTurnValue(50.42);
barnOwl[2][3] = new BirdTurnValue( 51.01);
barnOwl[2][4] = new BirdTurnValue(50.01);
barnOwl[2][5] = new BirdTurnValue( 50.46);
barnOwl[2][6] = new BirdTurnValue( 49.67);
barnOwl[2][7] = new BirdTurnValue(50.22);
barnOwl[3][1] = new BirdTurnValue(49.34);
barnOwl[3][2] = new BirdTurnValue(49.04);
barnOwl[3][3] = new BirdTurnValue(48.75);
barnOwl[3][4] = new BirdTurnValue(48.42);
barnOwl[3][5] = new BirdTurnValue(48.69);
barnOwl[3][6] = new BirdTurnValue(48.47);
barnOwl[4][1] = new BirdTurnValue(48.10);
barnOwl[4][2] = new BirdTurnValue( 47.34);
barnOwl[4][3] = new BirdTurnValue (47.68);
barnOwl[4][4] = new BirdTurnValue( 46.84);
barnOwl[4][5] = new BirdTurnValue(45.57);
map.put("Barn Owl", barnOwl);

BirdTurnValue[][] barnSwallow = new BirdTurnValue[5][9];
barnSwallow[1][1] = new BirdTurnValue( 46.98);
barnSwallow[1][2] = new BirdTurnValue( 47.13);
barnSwallow[1][3] = new BirdTurnValue( 47.10);
barnSwallow[1][4] = new BirdTurnValue( 46.92);
barnSwallow[1][5] = new BirdTurnValue( 46.25);
barnSwallow[1][6] = new BirdTurnValue(46.28);
barnSwallow[1][7] = new BirdTurnValue( 46.88);
barnSwallow[1][8] = new BirdTurnValue( 46.46);
barnSwallow[2][1] = new BirdTurnValue( 46.03);
barnSwallow[2][2] = new BirdTurnValue(46.17);
barnSwallow[2][3] = new BirdTurnValue( 45.88);
barnSwallow[2][4] = new BirdTurnValue(45.49);
barnSwallow[2][5] = new BirdTurnValue( 45.48);
barnSwallow[2][6] = new BirdTurnValue(45.45);
barnSwallow[2][7] = new BirdTurnValue(44.87);
barnSwallow[3][1] = new BirdTurnValue(45.11);
barnSwallow[3][2] = new BirdTurnValue(44.44);
barnSwallow[3][3] = new BirdTurnValue(44.36);
barnSwallow[3][4] = new BirdTurnValue(43.47);
barnSwallow[3][5] = new BirdTurnValue(43.28);
barnSwallow[3][6] = new BirdTurnValue(43.37);
barnSwallow[4][1] = new BirdTurnValue(42.81);
barnSwallow[4][2] = new BirdTurnValue(42.13);
barnSwallow[4][3] = new BirdTurnValue(43.62);
barnSwallow[4][4] = new BirdTurnValue(42.30);
barnSwallow[4][5] = new BirdTurnValue(41.13);
map.put("Barn Swallow", barnSwallow);
BirdTurnValue[][] bewickWren = new BirdTurnValue[5][9];

bewickWren[1][1] = new BirdTurnValue(43.75);
bewickWren[1][2] = new BirdTurnValue(45.91);
bewickWren[1][3] = new BirdTurnValue(46.31);
bewickWren[1][4] = new BirdTurnValue(46.54);
bewickWren[1][5] = new BirdTurnValue(46.60);
bewickWren[1][6] = new BirdTurnValue(45.64);
bewickWren[1][7] = new BirdTurnValue(45.48);
bewickWren[1][8] = new BirdTurnValue(45.96);

bewickWren[2][1] = new BirdTurnValue(45.98);
bewickWren[2][2] = new BirdTurnValue(46.15);
bewickWren[2][3] = new BirdTurnValue(46.42);
bewickWren[2][4] = new BirdTurnValue(46.33);
bewickWren[2][5] = new BirdTurnValue(46.05);
bewickWren[2][6] = new BirdTurnValue(46.75);
bewickWren[2][7] = new BirdTurnValue(46.37);

bewickWren[3][1] = new BirdTurnValue(46.31);
bewickWren[3][2] = new BirdTurnValue(46.70);
bewickWren[3][3] = new BirdTurnValue(46.41);
bewickWren[3][4] = new BirdTurnValue(46.85);
bewickWren[3][5] = new BirdTurnValue(47.17);
bewickWren[3][6] = new BirdTurnValue(46.78);

bewickWren[4][1] = new BirdTurnValue( 46.48);
bewickWren[4][2] = new BirdTurnValue(46.74);
bewickWren[4][3] = new BirdTurnValue(47.07);
bewickWren[4][4] = new BirdTurnValue(45.79);
bewickWren[4][5] = new BirdTurnValue(45.24);

map.put("Bewick’s Wren", bewickWren);

BirdTurnValue[][] blackSkimmer = new BirdTurnValue[5][9];

blackSkimmer[1][1] = new BirdTurnValue(51.65);
blackSkimmer[1][2] = new BirdTurnValue(52.42);
blackSkimmer[1][3] = new BirdTurnValue(52.69);
blackSkimmer[1][4] = new BirdTurnValue(51.88);
blackSkimmer[1][5] = new BirdTurnValue(51.58);
blackSkimmer[1][6] = new BirdTurnValue(50.93);
blackSkimmer[1][7] = new BirdTurnValue(50.28);
blackSkimmer[1][8] = new BirdTurnValue(49.98);


blackSkimmer[2][1] = new BirdTurnValue(50.13);
blackSkimmer[2][2] = new BirdTurnValue(49.38);
blackSkimmer[2][3] = new BirdTurnValue(50.31);
blackSkimmer[2][4] = new BirdTurnValue(49.28);
blackSkimmer[2][5] = new BirdTurnValue(48.86);
blackSkimmer[2][6] = new BirdTurnValue(48.93);
blackSkimmer[2][7] = new BirdTurnValue(48.56);
 
blackSkimmer[3][1] = new BirdTurnValue(48.64);
blackSkimmer[3][2] = new BirdTurnValue(48.42);
blackSkimmer[3][3] = new BirdTurnValue(48.33);
blackSkimmer[3][4] = new BirdTurnValue(47.96);
blackSkimmer[3][5] = new BirdTurnValue(48.00);
blackSkimmer[3][6] = new BirdTurnValue(47.70);


blackSkimmer[4][1] = new BirdTurnValue(47.96);
blackSkimmer[4][2] = new BirdTurnValue(47.81);
blackSkimmer[4][3] = new BirdTurnValue(47.72);
blackSkimmer[4][4] = new BirdTurnValue(46.53);
blackSkimmer[4][5] = new BirdTurnValue(45.90);

map.put("Black Skimmer", blackSkimmer);
BirdTurnValue[][] blackTern = new BirdTurnValue[5][9];


blackTern[1][1] = new BirdTurnValue(42.41);
blackTern[1][2] = new BirdTurnValue(42.86);
blackTern[1][3] = new BirdTurnValue(43.08);
blackTern[1][4] = new BirdTurnValue(43.65);
blackTern[1][5] = new BirdTurnValue(43.99);
blackTern[1][6] = new BirdTurnValue(44.46);
blackTern[1][7] = new BirdTurnValue(44.86);
blackTern[1][8] = new BirdTurnValue(45.51);


blackTern[2][1] = new BirdTurnValue( 45.59);
blackTern[2][2] = new BirdTurnValue(45.24);
blackTern[2][3] = new BirdTurnValue(45.60);
blackTern[2][4] = new BirdTurnValue(46.09);
blackTern[2][5] = new BirdTurnValue(46.14);
blackTern[2][6] = new BirdTurnValue(46.02);
blackTern[2][7] = new BirdTurnValue(45.61);


blackTern[3][1] = new BirdTurnValue( 45.78);
blackTern[3][2] = new BirdTurnValue(45.39);
blackTern[3][3] = new BirdTurnValue(45.25);
blackTern[3][4] = new BirdTurnValue(45.04);
blackTern[3][5] = new BirdTurnValue(44.92);
blackTern[3][6] = new BirdTurnValue(44.74);


blackTern[4][1] = new BirdTurnValue(44.44);
blackTern[4][2] = new BirdTurnValue(43.75);
blackTern[4][3] = new BirdTurnValue(44.71);
blackTern[4][4] = new BirdTurnValue(43.12);
blackTern[4][5] = new BirdTurnValue(42.33);

map.put("Black Tern", blackTern);

BirdTurnValue[][] blackBelliedWhistlingDuck = new BirdTurnValue[5][9];

blackBelliedWhistlingDuck[1][1] = new BirdTurnValue(44.09);
blackBelliedWhistlingDuck[1][2] = new BirdTurnValue( 45.71);
blackBelliedWhistlingDuck[1][3] = new BirdTurnValue(45.47);
blackBelliedWhistlingDuck[1][4] = new BirdTurnValue(45.89);
blackBelliedWhistlingDuck[1][5] = new BirdTurnValue(45.98);
blackBelliedWhistlingDuck[1][6] = new BirdTurnValue(45.78);
blackBelliedWhistlingDuck[1][7] = new BirdTurnValue(45.71);
blackBelliedWhistlingDuck[1][8] = new BirdTurnValue( 45.59);


blackBelliedWhistlingDuck[2][1] = new BirdTurnValue(45.70);
blackBelliedWhistlingDuck[2][2] = new BirdTurnValue(45.78);
blackBelliedWhistlingDuck[2][3] = new BirdTurnValue(45.56);
blackBelliedWhistlingDuck[2][4] = new BirdTurnValue(45.58);
blackBelliedWhistlingDuck[2][5] = new BirdTurnValue(46.10);
blackBelliedWhistlingDuck[2][6] = new BirdTurnValue(45.49);
blackBelliedWhistlingDuck[2][7] = new BirdTurnValue(45.80);


blackBelliedWhistlingDuck[3][1] = new BirdTurnValue(46.31);
blackBelliedWhistlingDuck[3][2] = new BirdTurnValue(45.48);
blackBelliedWhistlingDuck[3][3] = new BirdTurnValue(46.04);
blackBelliedWhistlingDuck[3][4] = new BirdTurnValue(46.14);
blackBelliedWhistlingDuck[3][5] = new BirdTurnValue(45.96);
blackBelliedWhistlingDuck[3][6] = new BirdTurnValue(46.73);


blackBelliedWhistlingDuck[4][1] = new BirdTurnValue( 45.43);
blackBelliedWhistlingDuck[4][2] = new BirdTurnValue(45.76);
blackBelliedWhistlingDuck[4][3] = new BirdTurnValue(46.40);
blackBelliedWhistlingDuck[4][4] = new BirdTurnValue(44.92);
blackBelliedWhistlingDuck[4][5] = new BirdTurnValue(44.54);

map.put("Black-Bellied Whistling-Duck", blackBelliedWhistlingDuck);
BirdTurnValue[][] blackCrownedNightHeron = new BirdTurnValue[5][9];


blackCrownedNightHeron[1][1] = new BirdTurnValue(48.01);
blackCrownedNightHeron[1][2] = new BirdTurnValue(50.64);
blackCrownedNightHeron[1][3] = new BirdTurnValue(50.55);
blackCrownedNightHeron[1][4] = new BirdTurnValue( 50.77);
blackCrownedNightHeron[1][5] = new BirdTurnValue( 50.67);
blackCrownedNightHeron[1][6] = new BirdTurnValue( 49.68);
blackCrownedNightHeron[1][7] = new BirdTurnValue( 49.47);
blackCrownedNightHeron[1][8] = new BirdTurnValue( 49.22);


blackCrownedNightHeron[2][1] = new BirdTurnValue(49.02);
blackCrownedNightHeron[2][2] = new BirdTurnValue(49.11);
blackCrownedNightHeron[2][3] = new BirdTurnValue(49.37);
blackCrownedNightHeron[2][4] = new BirdTurnValue(49.01);
blackCrownedNightHeron[2][5] = new BirdTurnValue(48.82);
blackCrownedNightHeron[2][6] = new BirdTurnValue(48.59);
blackCrownedNightHeron[2][7] = new BirdTurnValue(48.58);


blackCrownedNightHeron[3][1] = new BirdTurnValue(48.54);
blackCrownedNightHeron[3][2] = new BirdTurnValue(48.57);
blackCrownedNightHeron[3][3] = new BirdTurnValue(48.28);
blackCrownedNightHeron[3][4] = new BirdTurnValue(48.37);
blackCrownedNightHeron[3][5] = new BirdTurnValue(48.79);
blackCrownedNightHeron[3][6] = new BirdTurnValue(48.08);


blackCrownedNightHeron[4][1] = new BirdTurnValue( 47.83);
blackCrownedNightHeron[4][2] = new BirdTurnValue(48.45);
blackCrownedNightHeron[4][3] = new BirdTurnValue(49.03);
blackCrownedNightHeron[4][4] = new BirdTurnValue(46.91);
blackCrownedNightHeron[4][5] = new BirdTurnValue(46.59);

map.put("Black-Crowned Night-Heron", blackCrownedNightHeron);
BirdTurnValue[][] blackNeckedStilt = new BirdTurnValue[5][9];


blackNeckedStilt[1][1] = new BirdTurnValue(49.41);
blackNeckedStilt[1][2] = new BirdTurnValue(50.81);
blackNeckedStilt[1][3] = new BirdTurnValue(50.17);
blackNeckedStilt[1][4] = new BirdTurnValue( 49.86);
blackNeckedStilt[1][5] = new BirdTurnValue( 49.36);
blackNeckedStilt[1][6] = new BirdTurnValue(49.46);
blackNeckedStilt[1][7] = new BirdTurnValue(48.82);
blackNeckedStilt[1][8] = new BirdTurnValue(49.18);


blackNeckedStilt[2][1] = new BirdTurnValue(48.91);
blackNeckedStilt[2][2] = new BirdTurnValue(48.91);
blackNeckedStilt[2][3] = new BirdTurnValue(48.26);
blackNeckedStilt[2][4] = new BirdTurnValue(48.25);
blackNeckedStilt[2][5] = new BirdTurnValue(48.21);
blackNeckedStilt[2][6] = new BirdTurnValue(47.41);
blackNeckedStilt[2][7] = new BirdTurnValue(46.99);


blackNeckedStilt[3][1] = new BirdTurnValue( 46.74);
blackNeckedStilt[3][2] = new BirdTurnValue(47.13);
blackNeckedStilt[3][3] = new BirdTurnValue(46.38);
blackNeckedStilt[3][4] = new BirdTurnValue(46.28);
blackNeckedStilt[3][5] = new BirdTurnValue(46.19);
blackNeckedStilt[3][6] = new BirdTurnValue(46.23);

blackNeckedStilt[4][1] = new BirdTurnValue( 45.88);
blackNeckedStilt[4][2] = new BirdTurnValue( 45.98);
blackNeckedStilt[4][3] = new BirdTurnValue( 46.81);
blackNeckedStilt[4][4] = new BirdTurnValue(46.00);
blackNeckedStilt[4][5] = new BirdTurnValue(45.38);

map.put("Black-necked Stilt", blackNeckedStilt);



BirdTurnValue[][] blueGrosbeak = new BirdTurnValue[5][9];
blueGrosbeak[1][1] = new BirdTurnValue(43.48);
blueGrosbeak[1][2] = new BirdTurnValue(45.91);
blueGrosbeak[1][3] = new BirdTurnValue(46.15);
blueGrosbeak[1][4] = new BirdTurnValue(46.54);
blueGrosbeak[1][5] = new BirdTurnValue(45.68);
blueGrosbeak[1][6] = new BirdTurnValue(45.35);
blueGrosbeak[1][7] = new BirdTurnValue(45.59);
blueGrosbeak[1][8] = new BirdTurnValue(45.48);
blueGrosbeak[2][1] = new BirdTurnValue(45.98);
blueGrosbeak[2][2] = new BirdTurnValue(46.36);
blueGrosbeak[2][3] = new BirdTurnValue(46.50);
blueGrosbeak[2][4] = new BirdTurnValue(46.72);
blueGrosbeak[2][5] = new BirdTurnValue(46.37);
blueGrosbeak[2][6] = new BirdTurnValue(46.33);
blueGrosbeak[2][7] = new BirdTurnValue(46.75);
blueGrosbeak[3][1] = new BirdTurnValue(46.57);
blueGrosbeak[3][2] = new BirdTurnValue(46.73);
blueGrosbeak[3][3] = new BirdTurnValue(46.73);
blueGrosbeak[3][4] = new BirdTurnValue(46.49);
blueGrosbeak[3][5] = new BirdTurnValue(47.08);
blueGrosbeak[3][6] = new BirdTurnValue(47.00);
blueGrosbeak[4][1] = new BirdTurnValue(46.33);
blueGrosbeak[4][2] = new BirdTurnValue(46.65);
blueGrosbeak[4][3] = new BirdTurnValue(47.01);
blueGrosbeak[4][4] = new BirdTurnValue(45.67);
blueGrosbeak[4][5] = new BirdTurnValue(45.35);
map.put("Blue Grosbeak", blueGrosbeak);
BirdTurnValue[][] blueJay = new BirdTurnValue[5][9];


blueJay[1][1] = new BirdTurnValue(51.55);
blueJay[1][2] = new BirdTurnValue(52.83);
blueJay[1][3] = new BirdTurnValue(51.97);
blueJay[1][4] = new BirdTurnValue(51.20);
blueJay[1][5] = new BirdTurnValue( 51.76);
blueJay[1][6] = new BirdTurnValue (50.62);
blueJay[1][7] = new BirdTurnValue( 50.26);
blueJay[1][8] = new BirdTurnValue(49.65);


blueJay[2][1] = new BirdTurnValue(49.91);
blueJay[2][2] = new BirdTurnValue(49.82);
blueJay[2][3] = new BirdTurnValue(48.96);
blueJay[2][4] = new BirdTurnValue(49.26);
blueJay[2][5] = new BirdTurnValue(48.52);
blueJay[2][6] = new BirdTurnValue(48.32);
blueJay[2][7] = new BirdTurnValue(48.33);


blueJay[3][1] = new BirdTurnValue(47.90);
blueJay[3][2] = new BirdTurnValue(48.44);
blueJay[3][3] = new BirdTurnValue(47.86);
blueJay[3][4] = new BirdTurnValue(47.10);
blueJay[3][5] = new BirdTurnValue(47.42);
blueJay[3][6] = new BirdTurnValue(46.99);


blueJay[4][1] = new BirdTurnValue( 46.66);
blueJay[4][2] = new BirdTurnValue( 46.13);
blueJay[4][3] = new BirdTurnValue(46.72);
blueJay[4][4] = new BirdTurnValue( 45.60);
blueJay[4][5] = new BirdTurnValue( 44.57);
map.put("Blue Jay", blueJay);

BirdTurnValue[][] blueGrayGnatcatcherValues = new BirdTurnValue[5][9];
blueGrayGnatcatcherValues[1][1] = new BirdTurnValue(48.66);
blueGrayGnatcatcherValues[1][2] = new BirdTurnValue(48.99);
blueGrayGnatcatcherValues[1][3] = new BirdTurnValue(49.19);
blueGrayGnatcatcherValues[1][4] = new BirdTurnValue(48.74);
blueGrayGnatcatcherValues[1][5] = new BirdTurnValue(48.97);
blueGrayGnatcatcherValues[1][6] = new BirdTurnValue(48.41);
blueGrayGnatcatcherValues[1][7] = new BirdTurnValue(49.01);
blueGrayGnatcatcherValues[1][8] = new BirdTurnValue(48.34);
blueGrayGnatcatcherValues[2][1] = new BirdTurnValue(48.15);
blueGrayGnatcatcherValues[2][2] = new BirdTurnValue(47.34);
blueGrayGnatcatcherValues[2][3] = new BirdTurnValue(46.78);
blueGrayGnatcatcherValues[2][4] = new BirdTurnValue(46.48);
blueGrayGnatcatcherValues[2][5] = new BirdTurnValue( 46.29);
blueGrayGnatcatcherValues[2][6] = new BirdTurnValue(46.17);
blueGrayGnatcatcherValues[2][7] = new BirdTurnValue(45.76);
blueGrayGnatcatcherValues[3][1] = new BirdTurnValue(44.84);
blueGrayGnatcatcherValues[3][2] = new BirdTurnValue(44.55);
blueGrayGnatcatcherValues[3][3] = new BirdTurnValue(44.22);
blueGrayGnatcatcherValues[3][4] = new BirdTurnValue(44.02);
blueGrayGnatcatcherValues[3][5] = new BirdTurnValue( 44.01);
blueGrayGnatcatcherValues[3][6] = new BirdTurnValue(43.76);
blueGrayGnatcatcherValues[4][1] = new BirdTurnValue( 42.82);
blueGrayGnatcatcherValues[4][2] = new BirdTurnValue( 43.14);
blueGrayGnatcatcherValues[4][3] = new BirdTurnValue( 42.50);
blueGrayGnatcatcherValues[4][4] = new BirdTurnValue(41.47);
blueGrayGnatcatcherValues[4][5] = new BirdTurnValue(41.05);
map.put("Blue-Gray Gnatcatcher", blueGrayGnatcatcherValues);

BirdTurnValue[][] blueWingedWarblerValues = new BirdTurnValue[5][9];
blueWingedWarblerValues[1][1] = new BirdTurnValue(49.45);
blueWingedWarblerValues[1][2] = new BirdTurnValue(50.38);
blueWingedWarblerValues[1][3] = new BirdTurnValue(50.30);
blueWingedWarblerValues[1][4] = new BirdTurnValue(51.44);
blueWingedWarblerValues[1][5] = new BirdTurnValue(50.94);
blueWingedWarblerValues[1][6] = new BirdTurnValue(50.70);
blueWingedWarblerValues[1][7] = new BirdTurnValue(50.32);
blueWingedWarblerValues[1][8] = new BirdTurnValue(50.18);
blueWingedWarblerValues[2][1] = new BirdTurnValue(50.32);
blueWingedWarblerValues[2][2] = new BirdTurnValue(50.29);
blueWingedWarblerValues[2][3] = new BirdTurnValue(50.44);
blueWingedWarblerValues[2][4] = new BirdTurnValue(50.28);
blueWingedWarblerValues[2][5] = new BirdTurnValue(49.55);
blueWingedWarblerValues[2][6] = new BirdTurnValue(50.09);
blueWingedWarblerValues[2][7] = new BirdTurnValue(49.42);
blueWingedWarblerValues[3][1] = new BirdTurnValue(49.93);
blueWingedWarblerValues[3][2] = new BirdTurnValue( 49.56);
blueWingedWarblerValues[3][3] = new BirdTurnValue(49.58);
blueWingedWarblerValues[3][4] = new BirdTurnValue(49.25);
blueWingedWarblerValues[3][5] = new BirdTurnValue(49.23);
blueWingedWarblerValues[3][6] = new BirdTurnValue(48.99);
blueWingedWarblerValues[4][1] = new BirdTurnValue(48.75);
blueWingedWarblerValues[4][2] = new BirdTurnValue(48.59);
blueWingedWarblerValues[4][3] = new BirdTurnValue(48.89);
blueWingedWarblerValues[4][4] = new BirdTurnValue(47.56);
blueWingedWarblerValues[4][5] = new BirdTurnValue(47.64);
map.put("Blue-Winged Warbler", blueWingedWarblerValues);

BirdTurnValue[][] brewersBlackbirdValues = new BirdTurnValue[5][9];
brewersBlackbirdValues[1][1] = new BirdTurnValue(45.22);
brewersBlackbirdValues[1][2] = new BirdTurnValue(46.01);
brewersBlackbirdValues[1][3] = new BirdTurnValue(46.31);
brewersBlackbirdValues[1][4] = new BirdTurnValue(46.56);
brewersBlackbirdValues[1][5] = new BirdTurnValue(46.39);
brewersBlackbirdValues[1][6] = new BirdTurnValue(46.48);
brewersBlackbirdValues[1][7] = new BirdTurnValue(46.40);
brewersBlackbirdValues[1][8] = new BirdTurnValue(46.77);
brewersBlackbirdValues[2][1] = new BirdTurnValue(46.78);
brewersBlackbirdValues[2][2] = new BirdTurnValue(46.71);
brewersBlackbirdValues[2][3] = new BirdTurnValue(46.61);
brewersBlackbirdValues[2][4] = new BirdTurnValue(47.14);
brewersBlackbirdValues[2][5] = new BirdTurnValue(47.07);
brewersBlackbirdValues[2][6] = new BirdTurnValue(47.00);
brewersBlackbirdValues[2][7] = new BirdTurnValue(46.72);
brewersBlackbirdValues[3][1] = new BirdTurnValue( 47.39);
brewersBlackbirdValues[3][2] = new BirdTurnValue( 47.58);
brewersBlackbirdValues[3][3] = new BirdTurnValue(47.13);
brewersBlackbirdValues[3][4] = new BirdTurnValue( 47.06);
brewersBlackbirdValues[3][5] = new BirdTurnValue(48.26);
brewersBlackbirdValues[3][6] = new BirdTurnValue(47.46);
brewersBlackbirdValues[4][1] = new BirdTurnValue(46.79);
brewersBlackbirdValues[4][2] = new BirdTurnValue(47.33);
brewersBlackbirdValues[4][3] = new BirdTurnValue(47.70);
brewersBlackbirdValues[4][4] = new BirdTurnValue(46.35);
brewersBlackbirdValues[4][5] = new BirdTurnValue(45.62);
map.put("Brewer’s Blackbird", brewersBlackbirdValues);
BirdTurnValue[][] brownPelican = new BirdTurnValue[5][9];
brownPelican[1][1] = new BirdTurnValue(52.71);
brownPelican[1][2] = new BirdTurnValue(52.79);
brownPelican[1][3] = new BirdTurnValue(52.14);
brownPelican[1][4] = new BirdTurnValue(52.05);
brownPelican[1][5] = new BirdTurnValue(51.71);
brownPelican[1][6] = new BirdTurnValue(51.01);
brownPelican[1][7] = new BirdTurnValue(50.94);
brownPelican[1][8] = new BirdTurnValue(50.56);
brownPelican[2][1] = new BirdTurnValue(50.39);
brownPelican[2][2] = new BirdTurnValue(50.33);
brownPelican[2][3] = new BirdTurnValue(50.04);
brownPelican[2][4] = new BirdTurnValue(49.46);
brownPelican[2][5] = new BirdTurnValue(49.44);
brownPelican[2][6] = new BirdTurnValue(49.66);
brownPelican[2][7] = new BirdTurnValue(49.58);
brownPelican[3][1] = new BirdTurnValue(49.04);
brownPelican[3][2] = new BirdTurnValue(48.48);
brownPelican[3][3] = new BirdTurnValue(48.20);
brownPelican[3][4] = new BirdTurnValue(48.74);
brownPelican[3][5] = new BirdTurnValue(48.27);
brownPelican[3][6] = new BirdTurnValue(47.41);
brownPelican[4][1] = new BirdTurnValue(47.02);
brownPelican[4][2] = new BirdTurnValue(47.17);
brownPelican[4][3] = new BirdTurnValue(46.74);
brownPelican[4][4] = new BirdTurnValue(45.47);
brownPelican[4][5] = new BirdTurnValue(45.20);
map.put("Brown Pelican", brownPelican);
BirdTurnValue[][] burrowingOwl = new BirdTurnValue[5][9];
burrowingOwl[1][1] = new BirdTurnValue(51.00);
burrowingOwl[1][2] = new BirdTurnValue(51.78);
burrowingOwl[1][3] = new BirdTurnValue(51.91);
burrowingOwl[1][4] = new BirdTurnValue(51.86);
burrowingOwl[1][5] = new BirdTurnValue( 51.40);
burrowingOwl[1][6] = new BirdTurnValue( 50.46);
burrowingOwl[1][7] = new BirdTurnValue( 50.42);
burrowingOwl[1][8] = new BirdTurnValue(49.99);
burrowingOwl[2][1] = new BirdTurnValue(49.96);
burrowingOwl[2][2] = new BirdTurnValue(49.77);
burrowingOwl[2][3] = new BirdTurnValue(50.06);
burrowingOwl[2][4] = new BirdTurnValue(50.05);
burrowingOwl[2][5] = new BirdTurnValue(50.08);
burrowingOwl[2][6] = new BirdTurnValue(49.74);
burrowingOwl[2][7] = new BirdTurnValue(49.71);
burrowingOwl[3][1] = new BirdTurnValue(49.40);
burrowingOwl[3][2] = new BirdTurnValue (49.60);
burrowingOwl[3][3] = new BirdTurnValue( 49.11);
burrowingOwl[3][4] = new BirdTurnValue( 49.29);
burrowingOwl[3][5] = new BirdTurnValue( 48.76);
burrowingOwl[3][6] = new BirdTurnValue( 48.60);
burrowingOwl[4][1] = new BirdTurnValue( 48.30);
burrowingOwl[4][2] = new BirdTurnValue( 48.00);
burrowingOwl[4][3] = new BirdTurnValue( 48.94);
burrowingOwl[4][4] = new BirdTurnValue( 47.11);
burrowingOwl[4][5] = new BirdTurnValue(45.90);
map.put("Burrowing Owl", burrowingOwl);
BirdTurnValue[][] bushtit = new BirdTurnValue[5][9];
bushtit[1][1] = new BirdTurnValue(44.22);
bushtit[1][2] = new BirdTurnValue(45.00);
bushtit[1][3] = new BirdTurnValue(45.19);
bushtit[1][4] = new BirdTurnValue(45.40);
bushtit[1][5] = new BirdTurnValue(45.09);
bushtit[1][6] = new BirdTurnValue(44.98);
bushtit[1][7] = new BirdTurnValue(45.79);
bushtit[1][8] = new BirdTurnValue(46.00);
bushtit[2][1] = new BirdTurnValue(46.36);
bushtit[2][2] = new BirdTurnValue(46.02);
bushtit[2][3] = new BirdTurnValue(46.19);
bushtit[2][4] = new BirdTurnValue(46.21);
bushtit[2][5] = new BirdTurnValue(46.36);
bushtit[2][6] = new BirdTurnValue(46.73);
bushtit[2][7] = new BirdTurnValue(46.17);
bushtit[3][1] = new BirdTurnValue(46.17);
bushtit[3][2] = new BirdTurnValue(46.58);
bushtit[3][3] = new BirdTurnValue(46.66);
bushtit[3][4] = new BirdTurnValue(46.96);
bushtit[3][5] = new BirdTurnValue(46.64);
bushtit[3][6] = new BirdTurnValue(47.18);
bushtit[4][1] = new BirdTurnValue(46.68);
bushtit[4][2] = new BirdTurnValue(45.96);
bushtit[4][3] = new BirdTurnValue(46.80);
bushtit[4][4] = new BirdTurnValue(45.52);
bushtit[4][5] = new BirdTurnValue(45.05);
map.put("Bushtit", bushtit);
BirdTurnValue[][] quail = new BirdTurnValue[5][9];
quail[1][1] = new BirdTurnValue(48.53);
quail[1][2] = new BirdTurnValue(49.36);
quail[1][3] = new BirdTurnValue(49.57);
quail[1][4] = new BirdTurnValue(49.93);
quail[1][5] = new BirdTurnValue(49.08);
quail[1][6] = new BirdTurnValue(48.65);
quail[1][7] = new BirdTurnValue(47.92);
quail[1][8] = new BirdTurnValue(47.92);
quail[2][1] = new BirdTurnValue(47.56);
quail[2][2] = new BirdTurnValue(47.77);
quail[2][3] = new BirdTurnValue(47.67);
quail[2][4] = new BirdTurnValue(47.70);
quail[2][5] = new BirdTurnValue(47.19);
quail[2][6] = new BirdTurnValue(47.56);
quail[2][7] = new BirdTurnValue(47.07);
quail[3][1] = new BirdTurnValue(47.28);
quail[3][2] = new BirdTurnValue(47.17);
quail[3][3] = new BirdTurnValue(46.89);
quail[3][4] = new BirdTurnValue(47.24);
quail[3][5] = new BirdTurnValue(46.69);
quail[3][6] = new BirdTurnValue(47.00);
quail[4][1] = new BirdTurnValue( 47.05);
quail[4][2] = new BirdTurnValue( 46.65);
quail[4][3] = new BirdTurnValue( 47.13);
quail[4][4] = new BirdTurnValue( 45.97);
quail[4][5] = new BirdTurnValue(45.42);
map.put("California Quail", quail);
BirdTurnValue[][] goose = new BirdTurnValue[5][9];
goose[1][1] = new BirdTurnValue(48.62);
goose[1][2] = new BirdTurnValue(48.90);
goose[1][3] = new BirdTurnValue(48.81);
goose[1][4] = new BirdTurnValue(49.12);
goose[1][5] = new BirdTurnValue(48.84);
goose[1][6] = new BirdTurnValue(48.30);
goose[1][7] = new BirdTurnValue(48.16);
goose[1][8] = new BirdTurnValue(48.40);
goose[2][1] = new BirdTurnValue(48.49);
goose[2][2] = new BirdTurnValue(48.52);
goose[2][3] = new BirdTurnValue(48.21);
goose[2][4] = new BirdTurnValue(48.29);
goose[2][5] = new BirdTurnValue(48.16);
goose[2][6] = new BirdTurnValue(47.68);
goose[2][7] = new BirdTurnValue(47.53);
goose[3][1] = new BirdTurnValue(47.74);
goose[3][2] = new BirdTurnValue(47.52);
goose[3][3] = new BirdTurnValue(47.78);
goose[3][4] = new BirdTurnValue(47.27);
goose[3][5] = new BirdTurnValue(47.76);
goose[3][6] = new BirdTurnValue(47.21);
goose[4][1] = new BirdTurnValue(46.90);
goose[4][2] = new BirdTurnValue(46.56);
goose[4][3] = new BirdTurnValue(47.14);
goose[4][4] = new BirdTurnValue(45.49);
goose[4][5] = new BirdTurnValue(45.00);
map.put("Canada Goose", goose);
BirdTurnValue[][] chickadee = new BirdTurnValue[5][9];
chickadee[1][1] = new BirdTurnValue(55.01);
chickadee[1][2] = new BirdTurnValue(55.05);
chickadee[1][3] = new BirdTurnValue(54.96);
chickadee[1][4] = new BirdTurnValue(54.71);
chickadee[1][5] = new BirdTurnValue(54.38);
chickadee[1][6] = new BirdTurnValue(53.97);
chickadee[1][7] = new BirdTurnValue(53.39);
chickadee[1][8] = new BirdTurnValue(53.15);
chickadee[2][1] = new BirdTurnValue(52.43);
chickadee[2][2] = new BirdTurnValue(52.17);
chickadee[2][3] = new BirdTurnValue(51.22);
chickadee[2][4] = new BirdTurnValue(50.63);
chickadee[2][5] = new BirdTurnValue(50.01);
chickadee[2][6] = new BirdTurnValue(48.94);
chickadee[2][7] = new BirdTurnValue(48.68);
chickadee[3][1] = new BirdTurnValue(48.37);
chickadee[3][2] = new BirdTurnValue(47.42);
chickadee[3][3] = new BirdTurnValue(47.02);
chickadee[3][4] = new BirdTurnValue(46.42);
chickadee[3][5] = new BirdTurnValue(45.49);
chickadee[3][6] = new BirdTurnValue( 44.55);
chickadee[4][1] = new BirdTurnValue( 44.44);
chickadee[4][2] = new BirdTurnValue(44.07);
chickadee[4][3] = new BirdTurnValue(43.55);
chickadee[4][4] = new BirdTurnValue(42.78);
chickadee[4][5] = new BirdTurnValue(42.08);
map.put("Carolina Chickadee", chickadee);

BirdTurnValue[][] wren = new BirdTurnValue[5][9];
wren[1][1] = new BirdTurnValue(48.62);
wren[1][2] = new BirdTurnValue(49.34);
wren[1][3] = new BirdTurnValue(50.38);
wren[1][4] = new BirdTurnValue(50.27);
wren[1][5] = new BirdTurnValue(49.52);
wren[1][6] = new BirdTurnValue(49.35);
wren[1][7] = new BirdTurnValue(48.94);
wren[1][8] = new BirdTurnValue(48.39);
wren[2][1] = new BirdTurnValue(48.15);
wren[2][2] = new BirdTurnValue(47.62);
wren[2][3] = new BirdTurnValue(46.54);
wren[2][4] = new BirdTurnValue(45.62);
wren[2][5] = new BirdTurnValue(45.00);
wren[2][6] = new BirdTurnValue(44.89);
wren[2][7] = new BirdTurnValue(43.64);
wren[3][1] = new BirdTurnValue( 43.41);
wren[3][2] = new BirdTurnValue(43.10);
wren[3][3] = new BirdTurnValue(43.42);
wren[3][4] = new BirdTurnValue(42.40);
wren[3][5] = new BirdTurnValue(42.27);
wren[3][6] = new BirdTurnValue(41.95);
wren[4][1] = new BirdTurnValue(41.29);
wren[4][2] = new BirdTurnValue(41.67);
wren[4][3] = new BirdTurnValue(42.42);
wren[4][4] = new BirdTurnValue(41.61);
wren[4][5] = new BirdTurnValue(40.99);
map.put("California Wren", wren);

BirdTurnValue[][] cassinsSparrow = new BirdTurnValue[5][9];
cassinsSparrow[1][1] = new BirdTurnValue(46.44);
cassinsSparrow[1][2] = new BirdTurnValue(47.83);
cassinsSparrow[1][3] = new BirdTurnValue(47.81);
cassinsSparrow[1][4] = new BirdTurnValue(48.08);
cassinsSparrow[1][5] = new BirdTurnValue(47.21);
cassinsSparrow[1][6] = new BirdTurnValue(47.36);
cassinsSparrow[1][7] = new BirdTurnValue(47.30);
cassinsSparrow[1][8] = new BirdTurnValue(47.95);
cassinsSparrow[2][1] = new BirdTurnValue(47.55);
cassinsSparrow[2][2] = new BirdTurnValue(47.80);
cassinsSparrow[2][3] = new BirdTurnValue(47.94);
cassinsSparrow[2][4] = new BirdTurnValue(47.92);
cassinsSparrow[2][5] = new BirdTurnValue(47.45);
cassinsSparrow[2][6] = new BirdTurnValue(47.81);
cassinsSparrow[2][7] = new BirdTurnValue(47.88);
cassinsSparrow[3][1] = new BirdTurnValue(47.81);
cassinsSparrow[3][2] = new BirdTurnValue(47.83);
cassinsSparrow[3][3] = new BirdTurnValue(47.60);
cassinsSparrow[3][4] = new BirdTurnValue(47.64);
cassinsSparrow[3][5] = new BirdTurnValue( 47.92);
cassinsSparrow[3][6] = new BirdTurnValue (47.66);
cassinsSparrow[4][1] = new BirdTurnValue(46.84);
cassinsSparrow[4][2] = new BirdTurnValue( 47.46);
cassinsSparrow[4][3] = new BirdTurnValue( 47.71);
cassinsSparrow[4][4] = new BirdTurnValue( 45.86);
cassinsSparrow[4][5] = new BirdTurnValue(45.45);
map.put("Cassin’s Sparrow", cassinsSparrow);

BirdTurnValue[][] cedarWaxing = new BirdTurnValue[5][9];
cedarWaxing[1][1] = new BirdTurnValue(47.13);
cedarWaxing[1][2] = new BirdTurnValue(48.47);
cedarWaxing[1][3] = new BirdTurnValue(48.48);
cedarWaxing[1][4] = new BirdTurnValue( 48.41);
cedarWaxing[1][5] = new BirdTurnValue(47.84);
cedarWaxing[1][6] = new BirdTurnValue(47.96);
cedarWaxing[1][7] = new BirdTurnValue(47.81);
cedarWaxing[1][8] = new BirdTurnValue(47.49);
cedarWaxing[2][1] = new BirdTurnValue( 47.29);
cedarWaxing[2][2] = new BirdTurnValue(47.76);
cedarWaxing[2][3] = new BirdTurnValue(47.82);
cedarWaxing[2][4] = new BirdTurnValue( 47.47);
cedarWaxing[2][5] = new BirdTurnValue( 47.64);
cedarWaxing[2][6] = new BirdTurnValue(47.23);
cedarWaxing[2][7] = new BirdTurnValue(47.58);
cedarWaxing[3][1] = new BirdTurnValue(47.18);
cedarWaxing[3][2] = new BirdTurnValue(47.57);
cedarWaxing[3][3] = new BirdTurnValue(47.66);
cedarWaxing[3][4] = new BirdTurnValue(47.55);
cedarWaxing[3][5] = new BirdTurnValue(46.94);
cedarWaxing[3][6] = new BirdTurnValue( 47.67);
cedarWaxing[4][1] = new BirdTurnValue( 47.34);
cedarWaxing[4][2] = new BirdTurnValue( 47.44);
cedarWaxing[4][3] = new BirdTurnValue( 46.86);
cedarWaxing[4][4] = new BirdTurnValue( 45.76);
cedarWaxing[4][5] = new BirdTurnValue(45.43);
map.put("Cedar Waxing", cedarWaxing);

BirdTurnValue[][] chihuahuanRaven = new BirdTurnValue[5][9];
chihuahuanRaven[1][1] = new BirdTurnValue(44.56);
chihuahuanRaven[1][2] = new BirdTurnValue(47.30);
chihuahuanRaven[1][3] = new BirdTurnValue(47.02);
chihuahuanRaven[1][4] = new BirdTurnValue(47.12);
chihuahuanRaven[1][5] = new BirdTurnValue(47.26);
chihuahuanRaven[1][6] = new BirdTurnValue(46.59);
chihuahuanRaven[1][7] = new BirdTurnValue(46.25);
chihuahuanRaven[1][8] = new BirdTurnValue(46.32);
chihuahuanRaven[2][1] = new BirdTurnValue(46.08);
chihuahuanRaven[2][2] = new BirdTurnValue(46.26);
chihuahuanRaven[2][3] = new BirdTurnValue(46.35);
chihuahuanRaven[2][4] = new BirdTurnValue(46.27);
chihuahuanRaven[2][5] = new BirdTurnValue(46.13);
chihuahuanRaven[2][6] = new BirdTurnValue(46.24);
chihuahuanRaven[2][7] = new BirdTurnValue( 46.76);
chihuahuanRaven[3][1] = new BirdTurnValue( 46.79);
chihuahuanRaven[3][2] = new BirdTurnValue( 46.63);
chihuahuanRaven[3][3] = new BirdTurnValue(46.34);
chihuahuanRaven[3][4] = new BirdTurnValue(46.82);
chihuahuanRaven[3][5] = new BirdTurnValue(46.52);
chihuahuanRaven[3][6] = new BirdTurnValue(46.83);
chihuahuanRaven[4][1] = new BirdTurnValue(46.79);
chihuahuanRaven[4][2] = new BirdTurnValue(47.42);
chihuahuanRaven[4][3] = new BirdTurnValue(47.39);
chihuahuanRaven[4][4] = new BirdTurnValue( 46.51);
chihuahuanRaven[4][5] = new BirdTurnValue(45.32);
map.put("Chihuahuan Raven", chihuahuanRaven);

BirdTurnValue[][] chimneySwiftValues = new BirdTurnValue[5][9];
chimneySwiftValues[1][1] = new BirdTurnValue(44.87)
;
chimneySwiftValues[1][2] = new BirdTurnValue(45.04)
;
chimneySwiftValues[1][3] = new BirdTurnValue(45.73)
;
chimneySwiftValues[1][4] = new BirdTurnValue(45.61)
;
chimneySwiftValues[1][5] = new BirdTurnValue(45.49)
;
chimneySwiftValues[1][6] = new BirdTurnValue(45.54)
;
chimneySwiftValues[1][7] = new BirdTurnValue(45.97)
;
chimneySwiftValues[1][8] = new BirdTurnValue(46.01)
;
chimneySwiftValues[2][1] = new BirdTurnValue(46.60)
;
chimneySwiftValues[2][2] = new BirdTurnValue(46.54)
;
chimneySwiftValues[2][3] = new BirdTurnValue(46.39)
;
chimneySwiftValues[2][4] = new BirdTurnValue(46.38)
;
chimneySwiftValues[2][5] = new BirdTurnValue(46.70)
;
chimneySwiftValues[2][6] = new BirdTurnValue(47.22)
;
chimneySwiftValues[2][7] = new BirdTurnValue(46.89)
;
chimneySwiftValues[3][1] = new BirdTurnValue(47.06)
;
chimneySwiftValues[3][2] = new BirdTurnValue(46.85)
;
chimneySwiftValues[3][3] = new BirdTurnValue(46.33)
;
chimneySwiftValues[3][4] = new BirdTurnValue(46.93)
;
chimneySwiftValues[3][5] = new BirdTurnValue(46.75)
;
chimneySwiftValues[3][6] = new BirdTurnValue(46.64)
;
chimneySwiftValues[4][1] = new BirdTurnValue(46.30)
;
chimneySwiftValues[4][2] = new BirdTurnValue(46.23)
;
chimneySwiftValues[4][3] = new BirdTurnValue(46.88)
;
chimneySwiftValues[4][4] = new BirdTurnValue(45.64)
;
chimneySwiftValues[4][5] = new BirdTurnValue(45.13)
;
map.put("Chimney Swift", chimneySwiftValues);

BirdTurnValue[][] chippingSparrowValues = new BirdTurnValue[5][9];
chippingSparrowValues[1][1] = new BirdTurnValue(47.84)
;
chippingSparrowValues[1][2] = new BirdTurnValue(47.53)
;
chippingSparrowValues[1][3] = new BirdTurnValue(48.07)
;
chippingSparrowValues[1][4] = new BirdTurnValue(47.79)
;
chippingSparrowValues[1][5] = new BirdTurnValue(48.44)
;
chippingSparrowValues[1][6] = new BirdTurnValue(47.53)
;
chippingSparrowValues[1][7] = new BirdTurnValue(48.15)
;
chippingSparrowValues[1][8] = new BirdTurnValue(48.19)
;
chippingSparrowValues[2][1] = new BirdTurnValue(47.80)
;
chippingSparrowValues[2][2] = new BirdTurnValue(47.98)
;
chippingSparrowValues[2][3] = new BirdTurnValue(47.66)
;
chippingSparrowValues[2][4] = new BirdTurnValue(47.45)
;
chippingSparrowValues[2][5] = new BirdTurnValue(47.00)
;
chippingSparrowValues[2][6] = new BirdTurnValue(46.46)
;
chippingSparrowValues[2][7] = new BirdTurnValue(46.26)
;
chippingSparrowValues[3][1] = new BirdTurnValue(46.13)
;
chippingSparrowValues[3][2] = new BirdTurnValue(45.29)
;
chippingSparrowValues[3][3] = new BirdTurnValue(44.47)
;
chippingSparrowValues[3][4] = new BirdTurnValue(44.57)
;
chippingSparrowValues[3][5] = new BirdTurnValue(44.32)
;
chippingSparrowValues[3][6] = new BirdTurnValue(44.17)
;
chippingSparrowValues[4][1] = new BirdTurnValue(43.98)
;
chippingSparrowValues[4][2] = new BirdTurnValue(42.76)
;
chippingSparrowValues[4][3] = new BirdTurnValue(44.14)
;
chippingSparrowValues[4][4] = new BirdTurnValue(43.30)
;
chippingSparrowValues[4][5] = new BirdTurnValue(41.17)
;
map.put("Chipping Sparrow", chippingSparrowValues);

BirdTurnValue[][] clarksGrebeValues = new BirdTurnValue[5][9];
clarksGrebeValues[1][1] = new BirdTurnValue(43.73);
clarksGrebeValues[1][2] = new BirdTurnValue(44.12);
clarksGrebeValues[1][3] = new BirdTurnValue(44.53)
;
clarksGrebeValues[1][4] = new BirdTurnValue(44.66)
;
clarksGrebeValues[1][5] = new BirdTurnValue(44.88)
;
clarksGrebeValues[1][6] = new BirdTurnValue(45.43)
;
clarksGrebeValues[1][7] = new BirdTurnValue(45.43)
;
clarksGrebeValues[1][8] = new BirdTurnValue(45.68)
;
clarksGrebeValues[2][1] = new BirdTurnValue(46.21)
;
clarksGrebeValues[2][2] = new BirdTurnValue(46.34)
;
clarksGrebeValues[2][3] = new BirdTurnValue(46.95)
;
clarksGrebeValues[2][4] = new BirdTurnValue(46.87)
;
clarksGrebeValues[2][5] = new BirdTurnValue(46.82)
;
clarksGrebeValues[2][6] = new BirdTurnValue(46.75)
;
clarksGrebeValues[2][7] = new BirdTurnValue(46.17)
;
clarksGrebeValues[3][1] = new BirdTurnValue(47.01)
;
clarksGrebeValues[3][2] = new BirdTurnValue(46.53)
;
clarksGrebeValues[3][3] = new BirdTurnValue(46.11)
;
clarksGrebeValues[3][4] = new BirdTurnValue(45.43)
;
clarksGrebeValues[3][5] = new BirdTurnValue(45.76)
;
clarksGrebeValues[3][6] = new BirdTurnValue(45.82)
;
clarksGrebeValues[4][1] = new BirdTurnValue(45.64)
;
clarksGrebeValues[4][2] = new BirdTurnValue(44.61)
;
clarksGrebeValues[4][3] = new BirdTurnValue(45.44)
;
clarksGrebeValues[4][4] = new BirdTurnValue(44.24)
;
clarksGrebeValues[4][5] = new BirdTurnValue(43.09)
;
map.put("Clark’s Grebe", clarksGrebeValues);


BirdTurnValue[][] clarksNutcrackerValues = new BirdTurnValue[5][9];
clarksNutcrackerValues[1][1] = new BirdTurnValue(52.08)
;
clarksNutcrackerValues[1][2] = new BirdTurnValue(54.71)
;
clarksNutcrackerValues[1][3] = new BirdTurnValue(53.90)
;
clarksNutcrackerValues[1][4] = new BirdTurnValue(53.49)
;
clarksNutcrackerValues[1][5] = new BirdTurnValue(52.57)
;
clarksNutcrackerValues[1][6] = new BirdTurnValue(51.15)
;
clarksNutcrackerValues[1][7] = new BirdTurnValue(50.42)
;
clarksNutcrackerValues[1][8] = new BirdTurnValue(49.35)
;
clarksNutcrackerValues[2][1] = new BirdTurnValue(49.43)
;
clarksNutcrackerValues[2][2] = new BirdTurnValue(49.07)
;
clarksNutcrackerValues[2][3] = new BirdTurnValue(49.13)
;
clarksNutcrackerValues[2][4] = new BirdTurnValue(48.09)
;
clarksNutcrackerValues[2][5] = new BirdTurnValue(47.89)
;
clarksNutcrackerValues[2][6] = new BirdTurnValue(47.26)
;
clarksNutcrackerValues[2][7] = new BirdTurnValue(47.48)
;
clarksNutcrackerValues[3][1] = new BirdTurnValue(47.79)
;
clarksNutcrackerValues[3][2] = new BirdTurnValue(48.03)
;
clarksNutcrackerValues[3][3] = new BirdTurnValue(47.28)
;
clarksNutcrackerValues[3][4] = new BirdTurnValue(47.12)
;
clarksNutcrackerValues[3][5] = new BirdTurnValue(47.30)
;
clarksNutcrackerValues[3][6] = new BirdTurnValue(47.42)
;
clarksNutcrackerValues[4][1] = new BirdTurnValue(46.51)
;
clarksNutcrackerValues[4][2] = new BirdTurnValue(46.97)
;
clarksNutcrackerValues[4][3] = new BirdTurnValue(46.67)
;
clarksNutcrackerValues[4][4] = new BirdTurnValue(45.43)
;
clarksNutcrackerValues[4][5] = new BirdTurnValue(45.44)
;
map.put("Clark’s Nutcracker", clarksNutcrackerValues);

BirdTurnValue[][] commonGrackleValues = new BirdTurnValue[5][9];
commonGrackleValues[1][1] = new BirdTurnValue(45.03);
commonGrackleValues[1][2] = new BirdTurnValue(45.89);
commonGrackleValues[1][3] = new BirdTurnValue(45.92)
;
commonGrackleValues[1][4] = new BirdTurnValue(45.78)
;
commonGrackleValues[1][5] = new BirdTurnValue(46.39)
;
commonGrackleValues[1][6] = new BirdTurnValue(45.59)
;
commonGrackleValues[1][7] = new BirdTurnValue(46.45)
;
commonGrackleValues[1][8] = new BirdTurnValue(46.74)
;
commonGrackleValues[2][1] = new BirdTurnValue(46.57)
;
commonGrackleValues[2][2] = new BirdTurnValue(46.60)
;
commonGrackleValues[2][3] = new BirdTurnValue(47.27)
;
commonGrackleValues[2][4] = new BirdTurnValue(46.89)
;
commonGrackleValues[2][5] = new BirdTurnValue(46.79)
;
commonGrackleValues[2][6] = new BirdTurnValue(46.97)
;
commonGrackleValues[2][7] = new BirdTurnValue(47.10)
;
commonGrackleValues[3][1] = new BirdTurnValue(46.58)
;
commonGrackleValues[3][2] = new BirdTurnValue(47.15)
;
commonGrackleValues[3][3] = new BirdTurnValue(47.49)
;
commonGrackleValues[3][4] = new BirdTurnValue(46.62)
;
commonGrackleValues[3][5] = new BirdTurnValue(47.14)
;
commonGrackleValues[3][6] = new BirdTurnValue(47.06)
;
commonGrackleValues[4][1] = new BirdTurnValue(46.44)
;
commonGrackleValues[4][2] = new BirdTurnValue(46.50)
;
commonGrackleValues[4][3] = new BirdTurnValue(47.07)
;
commonGrackleValues[4][4] = new BirdTurnValue(45.44)
;
commonGrackleValues[4][5] = new BirdTurnValue(45.07)
;
map.put("Common Grackle", commonGrackleValues);

BirdTurnValue[][] commonMerganserValues = new BirdTurnValue[5][9];
commonMerganserValues[1][1] = new BirdTurnValue(50.28)
;
commonMerganserValues[1][2] = new BirdTurnValue(51.31)
;
commonMerganserValues[1][3] = new BirdTurnValue(51.00)
;
commonMerganserValues[1][4] = new BirdTurnValue(51.45)
;
commonMerganserValues[1][5] = new BirdTurnValue(50.72)
;
commonMerganserValues[1][6] = new BirdTurnValue(50.41)
;
commonMerganserValues[1][7] = new BirdTurnValue(49.97)
;
commonMerganserValues[1][8] = new BirdTurnValue(49.38)
;
commonMerganserValues[2][1] = new BirdTurnValue(49.13)
;
commonMerganserValues[2][2] = new BirdTurnValue(48.98)
;
commonMerganserValues[2][3] = new BirdTurnValue(48.51)
;
commonMerganserValues[2][4] = new BirdTurnValue(48.65)
;
commonMerganserValues[2][5] = new BirdTurnValue(48.06)
;
commonMerganserValues[2][6] = new BirdTurnValue(48.22)
;
commonMerganserValues[2][7] = new BirdTurnValue(48.29)
;
commonMerganserValues[3][1] = new BirdTurnValue(48.27)
;
commonMerganserValues[3][2] = new BirdTurnValue(47.95)
;
commonMerganserValues[3][3] = new BirdTurnValue(47.89)
;
commonMerganserValues[3][4] = new BirdTurnValue(47.53)
;
commonMerganserValues[3][5] = new BirdTurnValue(47.77)
;
commonMerganserValues[3][6] = new BirdTurnValue(47.30)
;
commonMerganserValues[4][1] = new BirdTurnValue(47.19)
;
commonMerganserValues[4][2] = new BirdTurnValue(46.95)
;
commonMerganserValues[4][3] = new BirdTurnValue(47.29)
;
commonMerganserValues[4][4] = new BirdTurnValue(46.54)
;
commonMerganserValues[4][5] = new BirdTurnValue(46.06)
;
map.put("Common Merganser", commonMerganserValues);

BirdTurnValue[][] commonNighthawkValues = new BirdTurnValue[5][9];
commonNighthawkValues[1][1] = new BirdTurnValue(44.48)
;
commonNighthawkValues[1][2] = new BirdTurnValue(45.58)
;
commonNighthawkValues[1][3] = new BirdTurnValue(45.48)
;
commonNighthawkValues[1][4] = new BirdTurnValue(45.59)
;
commonNighthawkValues[1][5] = new BirdTurnValue(45.71)
;
commonNighthawkValues[1][6] = new BirdTurnValue(45.53)
;
commonNighthawkValues[1][7] = new BirdTurnValue(46.73)
;
commonNighthawkValues[1][8] = new BirdTurnValue(45.95)
;
commonNighthawkValues[2][1] = new BirdTurnValue(46.10)
;
commonNighthawkValues[2][2] = new BirdTurnValue(46.28)
;
commonNighthawkValues[2][3] = new BirdTurnValue(46.90)
;
commonNighthawkValues[2][4] = new BirdTurnValue(46.66)
;
commonNighthawkValues[2][5] = new BirdTurnValue(47.73)
;
commonNighthawkValues[2][6] = new BirdTurnValue(46.66)
;
commonNighthawkValues[2][7] = new BirdTurnValue(46.92)
;
commonNighthawkValues[3][1] = new BirdTurnValue(46.84)
;
commonNighthawkValues[3][2] = new BirdTurnValue(46.82)
;
commonNighthawkValues[3][3] = new BirdTurnValue(47.03)
;
commonNighthawkValues[3][4] = new BirdTurnValue(46.79)
;
commonNighthawkValues[3][5] = new BirdTurnValue(47.02)
;
commonNighthawkValues[3][6] = new BirdTurnValue(46.85)
;
commonNighthawkValues[4][1] = new BirdTurnValue(46.20)
;
commonNighthawkValues[4][2] = new BirdTurnValue(45.95)
;
commonNighthawkValues[4][3] = new BirdTurnValue(46.81)
;
commonNighthawkValues[4][4] = new BirdTurnValue(45.42)
;
commonNighthawkValues[4][5] = new BirdTurnValue(45.15)
;
map.put("Common Nighthawk", commonNighthawkValues);

// Common Raven
BirdTurnValue[][] commonRavenValues = new BirdTurnValue[5][9];
commonRavenValues[1][1] = new BirdTurnValue(46.09)
;
commonRavenValues[1][2] = new BirdTurnValue(48.24)
;
commonRavenValues[1][3] = new BirdTurnValue(47.76)
;
commonRavenValues[1][4] = new BirdTurnValue(48.15)
;
commonRavenValues[1][5] = new BirdTurnValue(48.36)
;
commonRavenValues[1][6] = new BirdTurnValue(48.08)
;
commonRavenValues[1][7] = new BirdTurnValue(47.40)
;
commonRavenValues[1][8] = new BirdTurnValue(47.52)
;
commonRavenValues[2][1] = new BirdTurnValue(47.32)
;
commonRavenValues[2][2] = new BirdTurnValue(47.20)
;
commonRavenValues[2][3] = new BirdTurnValue(47.39)
;
commonRavenValues[2][4] = new BirdTurnValue(47.44)
;
commonRavenValues[2][5] = new BirdTurnValue(47.07)
;
commonRavenValues[2][6] = new BirdTurnValue(47.21)
;
commonRavenValues[2][7] = new BirdTurnValue(47.21)
;
commonRavenValues[3][1] = new BirdTurnValue(47.15)
;
commonRavenValues[3][2] = new BirdTurnValue(47.93)
;
commonRavenValues[3][3] = new BirdTurnValue(46.81)
;
commonRavenValues[3][4] = new BirdTurnValue(46.97)
;
commonRavenValues[3][5] = new BirdTurnValue(47.33)
;
commonRavenValues[3][6] = new BirdTurnValue(46.66)
;
commonRavenValues[4][1] = new BirdTurnValue(47.03)
;
commonRavenValues[4][2] = new BirdTurnValue(47.07)
;
commonRavenValues[4][3] = new BirdTurnValue(47.07)
;
commonRavenValues[4][4] = new BirdTurnValue(45.88)
;
commonRavenValues[4][5] = new BirdTurnValue(45.58)
;
map.put("Common Raven", commonRavenValues);

// Common Yellowthroat
BirdTurnValue[][] commonYellowthroatValues = new BirdTurnValue[5][9];
commonYellowthroatValues[1][1] = new BirdTurnValue(39.34)
;
commonYellowthroatValues[1][2] = new BirdTurnValue(39.81)
;
commonYellowthroatValues[1][3] = new BirdTurnValue(40.98)
;
commonYellowthroatValues[1][4] = new BirdTurnValue(40.26)
;
commonYellowthroatValues[1][5] = new BirdTurnValue(41.25)
;
commonYellowthroatValues[1][6] = new BirdTurnValue(42.09)
;
commonYellowthroatValues[1][7] = new BirdTurnValue(42.23)
;
commonYellowthroatValues[1][8] = new BirdTurnValue(42.75)
;
commonYellowthroatValues[2][1] = new BirdTurnValue(42.54)
;
commonYellowthroatValues[2][2] = new BirdTurnValue(43.06)
;
commonYellowthroatValues[2][3] = new BirdTurnValue(43.00)
;
commonYellowthroatValues[2][4] = new BirdTurnValue(43.03)
;
commonYellowthroatValues[2][5] = new BirdTurnValue(43.70)
;
commonYellowthroatValues[2][6] = new BirdTurnValue(43.41)
;
commonYellowthroatValues[2][7] = new BirdTurnValue(43.19)
;
commonYellowthroatValues[3][1] = new BirdTurnValue(43.67)
;
commonYellowthroatValues[3][2] = new BirdTurnValue(42.99)
;
commonYellowthroatValues[3][3] = new BirdTurnValue(42.45)
;
commonYellowthroatValues[3][4] = new BirdTurnValue(42.81)
;
commonYellowthroatValues[3][5] = new BirdTurnValue(42.62)
;
commonYellowthroatValues[3][6] = new BirdTurnValue(42.37)
;
commonYellowthroatValues[4][1] = new BirdTurnValue(42.16)
;
commonYellowthroatValues[4][2] = new BirdTurnValue(41.52)
;
commonYellowthroatValues[4][3] = new BirdTurnValue(42.45)
;
commonYellowthroatValues[4][4] = new BirdTurnValue(41.22)
;
commonYellowthroatValues[4][5] = new BirdTurnValue(40.36)
;
map.put("Common Yellowthroat", commonYellowthroatValues);

 // Cooper’s Hawk
BirdTurnValue[][] coopersHawkValues = new BirdTurnValue[5][9];
coopersHawkValues[1][1] = new BirdTurnValue(50.37)
;
coopersHawkValues[1][2] = new BirdTurnValue(51.61)
;
coopersHawkValues[1][3] = new BirdTurnValue(51.51)
;
coopersHawkValues[1][4] = new BirdTurnValue(51.50)
;
coopersHawkValues[1][5] = new BirdTurnValue(51.07)
;
coopersHawkValues[1][6] = new BirdTurnValue(51.13)
;
coopersHawkValues[1][7] = new BirdTurnValue(50.95)
;
coopersHawkValues[1][8] = new BirdTurnValue(50.53)
;
coopersHawkValues[2][1] = new BirdTurnValue(50.50)
;
coopersHawkValues[2][2] = new BirdTurnValue(49.46)
;
coopersHawkValues[2][3] = new BirdTurnValue(49.52)
;
coopersHawkValues[2][4] = new BirdTurnValue(48.92)
;
coopersHawkValues[2][5] = new BirdTurnValue(48.31)
;
coopersHawkValues[2][6] = new BirdTurnValue(48.15)
;
coopersHawkValues[2][7] = new BirdTurnValue(47.60)
;
coopersHawkValues[3][1] = new BirdTurnValue(47.54)
;
coopersHawkValues[3][2] = new BirdTurnValue(46.67)
;
coopersHawkValues[3][3] = new BirdTurnValue(46.17)
;
coopersHawkValues[3][4] = new BirdTurnValue(45.70)
;
coopersHawkValues[3][5] = new BirdTurnValue(45.46)
;
coopersHawkValues[3][6] = new BirdTurnValue(44.59)
;
coopersHawkValues[4][1] = new BirdTurnValue(44.80)
;
coopersHawkValues[4][2] = new BirdTurnValue(44.25)
;
coopersHawkValues[4][3] = new BirdTurnValue(44.30)
;
coopersHawkValues[4][4] = new BirdTurnValue(42.75)
;
coopersHawkValues[4][5] = new BirdTurnValue(42.22)
;
map.put("Cooper’s Hawk", coopersHawkValues);

// Dark-Eyed Junco
BirdTurnValue[][] darkEyedJuncoValues = new BirdTurnValue[5][9];
darkEyedJuncoValues[1][1] = new BirdTurnValue(47.40)
;
darkEyedJuncoValues[1][2] = new BirdTurnValue(48.85)
;
darkEyedJuncoValues[1][3] = new BirdTurnValue(48.74)
;
darkEyedJuncoValues[1][4] = new BirdTurnValue(48.72)
;
darkEyedJuncoValues[1][5] = new BirdTurnValue(47.89)
;
darkEyedJuncoValues[1][6] = new BirdTurnValue(47.41)
;
darkEyedJuncoValues[1][7] = new BirdTurnValue(47.48)
;
darkEyedJuncoValues[1][8] = new BirdTurnValue(47.53)
;
darkEyedJuncoValues[2][1] = new BirdTurnValue(47.86)
;
darkEyedJuncoValues[2][2] = new BirdTurnValue(47.56)
;
darkEyedJuncoValues[2][3] = new BirdTurnValue(48.01)
;
darkEyedJuncoValues[2][4] = new BirdTurnValue(47.18)
;
darkEyedJuncoValues[2][5] = new BirdTurnValue(47.38)
;
darkEyedJuncoValues[2][6] = new BirdTurnValue(47.77)
;
darkEyedJuncoValues[2][7] = new BirdTurnValue(47.64)
;
darkEyedJuncoValues[3][1] = new BirdTurnValue(47.38)
;
darkEyedJuncoValues[3][2] = new BirdTurnValue(47.55)
;
darkEyedJuncoValues[3][3] = new BirdTurnValue(47.74)
;
darkEyedJuncoValues[3][4] = new BirdTurnValue(47.47)
;
darkEyedJuncoValues[3][5] = new BirdTurnValue(47.36)
;
darkEyedJuncoValues[3][6] = new BirdTurnValue(47.38)
;
darkEyedJuncoValues[4][1] = new BirdTurnValue(47.44)
;
darkEyedJuncoValues[4][2] = new BirdTurnValue(47.36)
;
darkEyedJuncoValues[4][3] = new BirdTurnValue(47.29)
;
darkEyedJuncoValues[4][4] = new BirdTurnValue(46.02)
;
darkEyedJuncoValues[4][5] = new BirdTurnValue(45.48)
;
map.put("Dark-Eyed Junco", darkEyedJuncoValues);

// Dickcissel
BirdTurnValue[][] dickcisselValues = new BirdTurnValue[5][9];
dickcisselValues[1][1] = new BirdTurnValue(44.29)
;
dickcisselValues[1][2] = new BirdTurnValue(46.52)
;
dickcisselValues[1][3] = new BirdTurnValue(47.09)
;
dickcisselValues[1][4] = new BirdTurnValue(47.32)
;
dickcisselValues[1][5] = new BirdTurnValue(47.33)
;
dickcisselValues[1][6] = new BirdTurnValue(46.44)
;
dickcisselValues[1][7] = new BirdTurnValue(46.22)
;
dickcisselValues[1][8] = new BirdTurnValue(46.48)
;
dickcisselValues[2][1] = new BirdTurnValue(46.62)
;
dickcisselValues[2][2] = new BirdTurnValue(46.42)
;
dickcisselValues[2][3] = new BirdTurnValue(46.58)
;
dickcisselValues[2][4] = new BirdTurnValue(46.86)
;
dickcisselValues[2][5] = new BirdTurnValue(46.66)
;
dickcisselValues[2][6] = new BirdTurnValue(46.26)
;
dickcisselValues[2][7] = new BirdTurnValue(46.78)
;
dickcisselValues[3][1] = new BirdTurnValue(46.26)
;
dickcisselValues[3][2] = new BirdTurnValue(46.80)
;
dickcisselValues[3][3] = new BirdTurnValue(46.94)
;
dickcisselValues[3][4] = new BirdTurnValue(46.96)
;
dickcisselValues[3][5] = new BirdTurnValue(47.76)
;
dickcisselValues[3][6] = new BirdTurnValue(46.96)
;
dickcisselValues[4][1] = new BirdTurnValue(46.95)
;
dickcisselValues[4][2] = new BirdTurnValue(47.08)
;
dickcisselValues[4][3] = new BirdTurnValue(47.39)
;
dickcisselValues[4][4] = new BirdTurnValue(45.91)
;
dickcisselValues[4][5] = new BirdTurnValue(45.36)
;
map.put("Dickcissel", dickcisselValues);

// Double-Crested Cormorant
BirdTurnValue[][] doubleCrestedCormorantValues = new BirdTurnValue[5][9];
doubleCrestedCormorantValues[1][1] = new BirdTurnValue(45.40)
;
doubleCrestedCormorantValues[1][2] = new BirdTurnValue(46.29)
;
doubleCrestedCormorantValues[1][3] = new BirdTurnValue(46.97)
;
doubleCrestedCormorantValues[1][4] = new BirdTurnValue(46.81)
;
doubleCrestedCormorantValues[1][5] = new BirdTurnValue(47.16)
;
doubleCrestedCormorantValues[1][6] = new BirdTurnValue(46.16)
;
doubleCrestedCormorantValues[1][7] = new BirdTurnValue(46.51)
;
doubleCrestedCormorantValues[1][8] = new BirdTurnValue(46.24)
;
doubleCrestedCormorantValues[2][1] = new BirdTurnValue(45.98)
;
doubleCrestedCormorantValues[2][2] = new BirdTurnValue(46.47)
;
doubleCrestedCormorantValues[2][3] = new BirdTurnValue(46.11)
;
doubleCrestedCormorantValues[2][4] = new BirdTurnValue(45.98)
;
doubleCrestedCormorantValues[2][5] = new BirdTurnValue(47.07)
;
doubleCrestedCormorantValues[2][6] = new BirdTurnValue(46.78)
;
doubleCrestedCormorantValues[2][7] = new BirdTurnValue(46.47)
;
doubleCrestedCormorantValues[3][1] = new BirdTurnValue(46.83)
;
doubleCrestedCormorantValues[3][2] = new BirdTurnValue(46.39)
;
doubleCrestedCormorantValues[3][3] = new BirdTurnValue(46.38)
;
doubleCrestedCormorantValues[3][4] = new BirdTurnValue(46.19)
;
doubleCrestedCormorantValues[3][5] = new BirdTurnValue(46.37)
;
doubleCrestedCormorantValues[3][6] = new BirdTurnValue(46.52)
;
doubleCrestedCormorantValues[4][1] = new BirdTurnValue(46.28)
;
doubleCrestedCormorantValues[4][2] = new BirdTurnValue(46.32)
;
doubleCrestedCormorantValues[4][3] = new BirdTurnValue(46.39)
;
doubleCrestedCormorantValues[4][4] = new BirdTurnValue(45.22)
;
doubleCrestedCormorantValues[4][5] = new BirdTurnValue(44.82)
;
map.put("Double-Crested Cormorant", doubleCrestedCormorantValues);

// Downy Woodpecker
BirdTurnValue[][] downyWoodpeckerValues = new BirdTurnValue[5][9];
downyWoodpeckerValues[1][1] = new BirdTurnValue(46.00)
;
downyWoodpeckerValues[1][2] = new BirdTurnValue(47.70)
;
downyWoodpeckerValues[1][3] = new BirdTurnValue(48.00)
;
downyWoodpeckerValues[1][4] = new BirdTurnValue(47.80)
;
downyWoodpeckerValues[1][5] = new BirdTurnValue(47.86)
;
downyWoodpeckerValues[1][6] = new BirdTurnValue(48.25)
;
downyWoodpeckerValues[1][7] = new BirdTurnValue(47.84)
;
downyWoodpeckerValues[1][8] = new BirdTurnValue(47.95)
;
downyWoodpeckerValues[2][1] = new BirdTurnValue(47.59)
;
downyWoodpeckerValues[2][2] = new BirdTurnValue(47.47)
;
downyWoodpeckerValues[2][3] = new BirdTurnValue(47.12)
;
downyWoodpeckerValues[2][4] = new BirdTurnValue(46.75)
;
downyWoodpeckerValues[2][5] = new BirdTurnValue(46.03)
;
downyWoodpeckerValues[2][6] = new BirdTurnValue(46.43)
;
downyWoodpeckerValues[2][7] = new BirdTurnValue(46.19)
;
downyWoodpeckerValues[3][1] = new BirdTurnValue(46.07)
;
downyWoodpeckerValues[3][2] = new BirdTurnValue(45.59)
;
downyWoodpeckerValues[3][3] = new BirdTurnValue(45.37)
;
downyWoodpeckerValues[3][4] = new BirdTurnValue(44.90)
;
downyWoodpeckerValues[3][5] = new BirdTurnValue(44.39)
;
downyWoodpeckerValues[3][6] = new BirdTurnValue(45.19)
;
downyWoodpeckerValues[4][1] = new BirdTurnValue(44.36)
;
downyWoodpeckerValues[4][2] = new BirdTurnValue(43.87)
;
downyWoodpeckerValues[4][3] = new BirdTurnValue(44.39)
;
downyWoodpeckerValues[4][4] = new BirdTurnValue(43.31)
;
downyWoodpeckerValues[4][5] = new BirdTurnValue(42.38)
;
map.put("Downy Woodpecker", downyWoodpeckerValues);

// Eastern Bluebird
BirdTurnValue[][] easternBluebirdValues = new BirdTurnValue[5][9];
easternBluebirdValues[1][1] = new BirdTurnValue(44.89)
;
easternBluebirdValues[1][2] = new BirdTurnValue(46.07)
;
easternBluebirdValues[1][3] = new BirdTurnValue(46.38)
;
easternBluebirdValues[1][4] = new BirdTurnValue(46.22)
;
easternBluebirdValues[1][5] = new BirdTurnValue(46.58)
;
easternBluebirdValues[1][6] = new BirdTurnValue(46.47)
;
easternBluebirdValues[1][7] = new BirdTurnValue(46.44)
;
easternBluebirdValues[1][8] = new BirdTurnValue(46.83)
;
easternBluebirdValues[2][1] = new BirdTurnValue(46.54)
;
easternBluebirdValues[2][2] = new BirdTurnValue(46.65)
;
easternBluebirdValues[2][3] = new BirdTurnValue(46.74)
;
easternBluebirdValues[2][4] = new BirdTurnValue(46.85)
;
easternBluebirdValues[2][5] = new BirdTurnValue(46.72)
;
easternBluebirdValues[2][6] = new BirdTurnValue(47.16)
;
easternBluebirdValues[2][7] = new BirdTurnValue(47.39)
;
easternBluebirdValues[3][1] = new BirdTurnValue(47.20)
;
easternBluebirdValues[3][2] = new BirdTurnValue(47.14)
;
easternBluebirdValues[3][3] = new BirdTurnValue(47.36)
;
easternBluebirdValues[3][4] = new BirdTurnValue(47.50)
;
easternBluebirdValues[3][5] = new BirdTurnValue(47.35)
;
easternBluebirdValues[3][6] = new BirdTurnValue(47.41)
;
easternBluebirdValues[4][1] = new BirdTurnValue(47.43)
;
easternBluebirdValues[4][2] = new BirdTurnValue(47.13)
;
easternBluebirdValues[4][3] = new BirdTurnValue(47.56)
;
easternBluebirdValues[4][4] = new BirdTurnValue(45.69)
;
easternBluebirdValues[4][5] = new BirdTurnValue(45.44)
;
map.put("Eastern Bluebird", easternBluebirdValues);

// Eastern Screech Owl
BirdTurnValue[][] easternScreechOwlValues = new BirdTurnValue[5][9];
easternScreechOwlValues[1][1] = new BirdTurnValue(53.12)
;
easternScreechOwlValues[1][2] = new BirdTurnValue(53.92)
;
easternScreechOwlValues[1][3] = new BirdTurnValue(54.07)
;
easternScreechOwlValues[1][4] = new BirdTurnValue(54.09)
;
easternScreechOwlValues[1][5] = new BirdTurnValue(53.89)
;
easternScreechOwlValues[1][6] = new BirdTurnValue(53.23)
;
easternScreechOwlValues[1][7] = new BirdTurnValue(53.05)
;
easternScreechOwlValues[1][8] = new BirdTurnValue(52.85)
;
easternScreechOwlValues[2][1] = new BirdTurnValue(52.44)
;
easternScreechOwlValues[2][2] = new BirdTurnValue(52.14)
;
easternScreechOwlValues[2][3] = new BirdTurnValue(51.42)
;
easternScreechOwlValues[2][4] = new BirdTurnValue(50.71)
;
easternScreechOwlValues[2][5] = new BirdTurnValue(50.19)
;
easternScreechOwlValues[2][6] = new BirdTurnValue(49.15)
;
easternScreechOwlValues[2][7] = new BirdTurnValue(49.14)
;
easternScreechOwlValues[3][1] = new BirdTurnValue(48.73)
;
easternScreechOwlValues[3][2] = new BirdTurnValue(48.29)
;
easternScreechOwlValues[3][3] = new BirdTurnValue(47.37)
;
easternScreechOwlValues[3][4] = new BirdTurnValue(46.91)
;
easternScreechOwlValues[3][5] = new BirdTurnValue(46.31)
;
easternScreechOwlValues[3][6] = new BirdTurnValue(46.05)
;
easternScreechOwlValues[4][1] = new BirdTurnValue(46.14)
;
easternScreechOwlValues[4][2] = new BirdTurnValue(44.68)
;
easternScreechOwlValues[4][3] = new BirdTurnValue(44.86)
;
easternScreechOwlValues[4][4] = new BirdTurnValue(44.19)
;
easternScreechOwlValues[4][5] = new BirdTurnValue(43.25)
;
map.put("Eastern Screech Owl", easternScreechOwlValues);

// Ferruginous Hawk
BirdTurnValue[][] ferruginousHawkValues = new BirdTurnValue[5][9];
ferruginousHawkValues[1][1] = new BirdTurnValue(52.31)
;
ferruginousHawkValues[1][2] = new BirdTurnValue(52.93)
;
ferruginousHawkValues[1][3] = new BirdTurnValue(53.04)
;
ferruginousHawkValues[1][4] = new BirdTurnValue(52.47)
;
ferruginousHawkValues[1][5] = new BirdTurnValue(52.03)
;
ferruginousHawkValues[1][6] = new BirdTurnValue(51.41)
;
ferruginousHawkValues[1][7] = new BirdTurnValue(51.32)
;
ferruginousHawkValues[1][8] = new BirdTurnValue(51.61)
;
ferruginousHawkValues[2][1] = new BirdTurnValue(50.96)
;
ferruginousHawkValues[2][2] = new BirdTurnValue(50.83)
;
ferruginousHawkValues[2][3] = new BirdTurnValue(50.59)
;
ferruginousHawkValues[2][4] = new BirdTurnValue(50.21)
;
ferruginousHawkValues[2][5] = new BirdTurnValue(50.54)
;
ferruginousHawkValues[2][6] = new BirdTurnValue(50.60)
;
ferruginousHawkValues[2][7] = new BirdTurnValue(50.22)
;
ferruginousHawkValues[3][1] = new BirdTurnValue(50.49)
;
ferruginousHawkValues[3][2] = new BirdTurnValue(50.12)
;
ferruginousHawkValues[3][3] = new BirdTurnValue(49.57)
;
ferruginousHawkValues[3][4] = new BirdTurnValue(49.51)
;
ferruginousHawkValues[3][5] = new BirdTurnValue(49.61)
;
ferruginousHawkValues[3][6] = new BirdTurnValue(48.73)
;
ferruginousHawkValues[4][1] = new BirdTurnValue(48.68)
;
ferruginousHawkValues[4][2] = new BirdTurnValue(48.42)
;
ferruginousHawkValues[4][3] = new BirdTurnValue(49.63)
;
ferruginousHawkValues[4][4] = new BirdTurnValue(46.88)
;
ferruginousHawkValues[4][5] = new BirdTurnValue(46.51)
;
map.put("Ferruginous Hawk", ferruginousHawkValues);

// Fish Crow
BirdTurnValue[][] fishCrowValues = new BirdTurnValue[5][9];
fishCrowValues[1][1] = new BirdTurnValue(47.25)
;
fishCrowValues[1][2] = new BirdTurnValue(48.22)
;
fishCrowValues[1][3] = new BirdTurnValue(48.17)
;
fishCrowValues[1][4] = new BirdTurnValue(48.56)
;
fishCrowValues[1][5] = new BirdTurnValue(48.24)
;
fishCrowValues[1][6] = new BirdTurnValue(48.44)
;
fishCrowValues[1][7] = new BirdTurnValue(48.75)
;
fishCrowValues[1][8] = new BirdTurnValue(48.69)
;
fishCrowValues[2][1] = new BirdTurnValue(48.53)
;
fishCrowValues[2][2] = new BirdTurnValue(48.73)
;
fishCrowValues[2][3] = new BirdTurnValue(49.21)
;
fishCrowValues[2][4] = new BirdTurnValue(48.53)
;
fishCrowValues[2][5] = new BirdTurnValue(48.67)
;
fishCrowValues[2][6] = new BirdTurnValue(48.68)
;
fishCrowValues[2][7] = new BirdTurnValue(48.63)
;
fishCrowValues[3][1] = new BirdTurnValue(48.11)
;
fishCrowValues[3][2] = new BirdTurnValue(48.84)
;
fishCrowValues[3][3] = new BirdTurnValue(48.52)
;
fishCrowValues[3][4] = new BirdTurnValue(47.92)
;
fishCrowValues[3][5] = new BirdTurnValue(48.55)
;
fishCrowValues[3][6] = new BirdTurnValue(47.94)
;
fishCrowValues[4][1] = new BirdTurnValue(48.09)
;
fishCrowValues[4][2] = new BirdTurnValue(47.87)
;
fishCrowValues[4][3] = new BirdTurnValue(48.05)
;
fishCrowValues[4][4] = new BirdTurnValue(46.38)
;
fishCrowValues[4][5] = new BirdTurnValue(46.05)
;
map.put("Fish Crow", fishCrowValues);

// Forster’s Tern
BirdTurnValue[][] forstersTernValues = new BirdTurnValue[5][9];
forstersTernValues[1][1] = new BirdTurnValue(42.63)
;
forstersTernValues[1][2] = new BirdTurnValue(42.88)
;
forstersTernValues[1][3] = new BirdTurnValue(43.12)
;
forstersTernValues[1][4] = new BirdTurnValue(43.68)
;
forstersTernValues[1][5] = new BirdTurnValue(43.98)
;
forstersTernValues[1][6] = new BirdTurnValue(44.25)
;
forstersTernValues[1][7] = new BirdTurnValue(45.47)
;
forstersTernValues[1][8] = new BirdTurnValue(44.90)
;
forstersTernValues[2][1] = new BirdTurnValue(45.59)
;
forstersTernValues[2][2] = new BirdTurnValue(45.76)
;
forstersTernValues[2][3] = new BirdTurnValue(45.83)
;
forstersTernValues[2][4] = new BirdTurnValue(45.45)
;
forstersTernValues[2][5] = new BirdTurnValue(46.31)
;
forstersTernValues[2][6] = new BirdTurnValue(45.93)
;
forstersTernValues[2][7] = new BirdTurnValue(46.03)
;
forstersTernValues[3][1] = new BirdTurnValue(45.58)
;
forstersTernValues[3][2] = new BirdTurnValue(45.24)
;
forstersTernValues[3][3] = new BirdTurnValue(45.85)
;
forstersTernValues[3][4] = new BirdTurnValue(45.20)
;
forstersTernValues[3][5] = new BirdTurnValue(44.78)
;
forstersTernValues[3][6] = new BirdTurnValue(44.53)
;
forstersTernValues[4][1] = new BirdTurnValue(44.70)
;
forstersTernValues[4][2] = new BirdTurnValue(44.09)
;
forstersTernValues[4][3] = new BirdTurnValue(44.78)
;
forstersTernValues[4][4] = new BirdTurnValue(43.78)
;
forstersTernValues[4][5] = new BirdTurnValue(42.35)
;
map.put("Forster’s Tern", forstersTernValues);

// Franklin’s Gull
BirdTurnValue[][] franklinsGullValues = new BirdTurnValue[5][9];
franklinsGullValues[1][1] = new BirdTurnValue(40.31)
;
franklinsGullValues[1][2] = new BirdTurnValue(41.99)
;
franklinsGullValues[1][3] = new BirdTurnValue(42.71)
;
franklinsGullValues[1][4] = new BirdTurnValue(42.82)
;
franklinsGullValues[1][5] = new BirdTurnValue(43.40)
;
franklinsGullValues[1][6] = new BirdTurnValue(43.69)
;
franklinsGullValues[1][7] = new BirdTurnValue(43.52)
;
franklinsGullValues[1][8] = new BirdTurnValue(43.55)
;
franklinsGullValues[2][1] = new BirdTurnValue(43.79)
;
franklinsGullValues[2][2] = new BirdTurnValue(43.98)
;
franklinsGullValues[2][3] = new BirdTurnValue(44.14)
;
franklinsGullValues[2][4] = new BirdTurnValue(44.21)
;
franklinsGullValues[2][5] = new BirdTurnValue(45.01)
;
franklinsGullValues[2][6] = new BirdTurnValue(44.87)
;
franklinsGullValues[2][7] = new BirdTurnValue(45.34)
;
franklinsGullValues[3][1] = new BirdTurnValue(45.04)
;
franklinsGullValues[3][2] = new BirdTurnValue(45.03)
;
franklinsGullValues[3][3] = new BirdTurnValue(45.24)
;
franklinsGullValues[3][4] = new BirdTurnValue(45.25)
;
franklinsGullValues[3][5] = new BirdTurnValue(45.26)
;
franklinsGullValues[3][6] = new BirdTurnValue(45.64)
;
franklinsGullValues[4][1] = new BirdTurnValue(45.88)
;
franklinsGullValues[4][2] = new BirdTurnValue(46.25)
;
franklinsGullValues[4][3] = new BirdTurnValue(46.15)
;
franklinsGullValues[4][4] = new BirdTurnValue(45.36)
;
franklinsGullValues[4][5] = new BirdTurnValue(45.78)
;
map.put("Franklin’s Gull", franklinsGullValues);

// Golden Eagle
BirdTurnValue[][] goldenEagleValues = new BirdTurnValue[5][9];
goldenEagleValues[1][1] = new BirdTurnValue(50.89)
;
goldenEagleValues[1][2] = new BirdTurnValue(53.74)
;
goldenEagleValues[1][3] = new BirdTurnValue(53.42)
;
goldenEagleValues[1][4] = new BirdTurnValue(53.28)
;
goldenEagleValues[1][5] = new BirdTurnValue(53.08)
;
goldenEagleValues[1][6] = new BirdTurnValue(51.58)
;
goldenEagleValues[1][7] = new BirdTurnValue(51.35)
;
goldenEagleValues[1][8] = new BirdTurnValue(50.42)
;
goldenEagleValues[2][1] = new BirdTurnValue(51.00)
;
goldenEagleValues[2][2] = new BirdTurnValue(50.22)
;
goldenEagleValues[2][3] = new BirdTurnValue(50.18)
;
goldenEagleValues[2][4] = new BirdTurnValue(50.13)
;
goldenEagleValues[2][5] = new BirdTurnValue(49.57)
;
goldenEagleValues[2][6] = new BirdTurnValue(49.39)
;
goldenEagleValues[2][7] = new BirdTurnValue(49.28)
;
goldenEagleValues[3][1] = new BirdTurnValue(49.46)
;
goldenEagleValues[3][2] = new BirdTurnValue(48.91)
;
goldenEagleValues[3][3] = new BirdTurnValue(49.20)
;
goldenEagleValues[3][4] = new BirdTurnValue(49.02)
;
goldenEagleValues[3][5] = new BirdTurnValue(48.83)
;
goldenEagleValues[3][6] = new BirdTurnValue(47.81)
;
goldenEagleValues[4][1] = new BirdTurnValue(47.61)
;
goldenEagleValues[4][2] = new BirdTurnValue(48.09)
;
goldenEagleValues[4][3] = new BirdTurnValue(48.51)
;
goldenEagleValues[4][4] = new BirdTurnValue(46.90)
;
goldenEagleValues[4][5] = new BirdTurnValue(46.27)
;
map.put("Golden Eagle", goldenEagleValues);

// Grasshopper Sparrow
BirdTurnValue[][] grasshopperSparrowValues = new BirdTurnValue[5][9];
grasshopperSparrowValues[1][1] = new BirdTurnValue(47.32)
;
grasshopperSparrowValues[1][2] = new BirdTurnValue(47.37)
;
grasshopperSparrowValues[1][3] = new BirdTurnValue(48.15)
;
grasshopperSparrowValues[1][4] = new BirdTurnValue(47.85)
;
grasshopperSparrowValues[1][5] = new BirdTurnValue(47.70)
;
grasshopperSparrowValues[1][6] = new BirdTurnValue(48.16)
;
grasshopperSparrowValues[1][7] = new BirdTurnValue(47.91)
;
grasshopperSparrowValues[1][8] = new BirdTurnValue(48.11)
;
grasshopperSparrowValues[2][1] = new BirdTurnValue(47.42)
;
grasshopperSparrowValues[2][2] = new BirdTurnValue(47.54)
;
grasshopperSparrowValues[2][3] = new BirdTurnValue(47.76)
;
grasshopperSparrowValues[2][4] = new BirdTurnValue(47.76)
;
grasshopperSparrowValues[2][5] = new BirdTurnValue(47.38)
;
grasshopperSparrowValues[2][6] = new BirdTurnValue(46.92)
;
grasshopperSparrowValues[2][7] = new BirdTurnValue(46.88)
;
grasshopperSparrowValues[3][1] = new BirdTurnValue(46.44)
;
grasshopperSparrowValues[3][2] = new BirdTurnValue(46.59)
;
grasshopperSparrowValues[3][3] = new BirdTurnValue(46.49)
;
grasshopperSparrowValues[3][4] = new BirdTurnValue(45.70)
;
grasshopperSparrowValues[3][5] = new BirdTurnValue(45.90)
;
grasshopperSparrowValues[3][6] = new BirdTurnValue(45.79)
;
grasshopperSparrowValues[4][1] = new BirdTurnValue(45.35)
;
grasshopperSparrowValues[4][2] = new BirdTurnValue(44.48)
;
grasshopperSparrowValues[4][3] = new BirdTurnValue(46.33)
;
grasshopperSparrowValues[4][4] = new BirdTurnValue(43.93)
;
grasshopperSparrowValues[4][5] = new BirdTurnValue(42.55)
;
map.put("Grasshopper Sparrow", grasshopperSparrowValues);

// Great Blue Heron
BirdTurnValue[][] greatBlueHeronValues = new BirdTurnValue[5][9];
greatBlueHeronValues[1][1] = new BirdTurnValue(45.71)
;
greatBlueHeronValues[1][2] = new BirdTurnValue(46.42)
;
greatBlueHeronValues[1][3] = new BirdTurnValue(46.71)
;
greatBlueHeronValues[1][4] = new BirdTurnValue(47.14)
;
greatBlueHeronValues[1][5] = new BirdTurnValue(46.63)
;
greatBlueHeronValues[1][6] = new BirdTurnValue(46.75)
;
greatBlueHeronValues[1][7] = new BirdTurnValue(46.72)
;
greatBlueHeronValues[1][8] = new BirdTurnValue(46.47)
;
greatBlueHeronValues[2][1] = new BirdTurnValue(46.78)
;
greatBlueHeronValues[2][2] = new BirdTurnValue(46.92)
;
greatBlueHeronValues[2][3] = new BirdTurnValue(46.65)
;
greatBlueHeronValues[2][4] = new BirdTurnValue(47.18)
;
greatBlueHeronValues[2][5] = new BirdTurnValue(47.50)
;
greatBlueHeronValues[2][6] = new BirdTurnValue(47.69)
;
greatBlueHeronValues[2][7] = new BirdTurnValue(47.42)
;
greatBlueHeronValues[3][1] = new BirdTurnValue(47.51)
;
greatBlueHeronValues[3][2] = new BirdTurnValue(47.31)
;
greatBlueHeronValues[3][3] = new BirdTurnValue(47.40)
;
greatBlueHeronValues[3][4] = new BirdTurnValue(47.13)
;
greatBlueHeronValues[3][5] = new BirdTurnValue(47.12)
;
greatBlueHeronValues[3][6] = new BirdTurnValue(47.44)
;
greatBlueHeronValues[4][1] = new BirdTurnValue(46.87)
;
greatBlueHeronValues[4][2] = new BirdTurnValue(46.54)
;
greatBlueHeronValues[4][3] = new BirdTurnValue(47.35)
;
greatBlueHeronValues[4][4] = new BirdTurnValue(46.30)
;
greatBlueHeronValues[4][5] = new BirdTurnValue(45.64)
;
map.put("Great Blue Heron", greatBlueHeronValues);

// Great Crested Fly-Catcher
BirdTurnValue[][] greatCrestedFlyCatcherValues = new BirdTurnValue[5][9];
greatCrestedFlyCatcherValues[1][1] = new BirdTurnValue(51.66)
;
greatCrestedFlyCatcherValues[1][2] = new BirdTurnValue(53.04)
;
greatCrestedFlyCatcherValues[1][3] = new BirdTurnValue(52.70)
;
greatCrestedFlyCatcherValues[1][4] = new BirdTurnValue(52.65)
;
greatCrestedFlyCatcherValues[1][5] = new BirdTurnValue(52.00)
;
greatCrestedFlyCatcherValues[1][6] = new BirdTurnValue(51.70)
;
greatCrestedFlyCatcherValues[1][7] = new BirdTurnValue(50.45)
;
greatCrestedFlyCatcherValues[1][8] = new BirdTurnValue(49.88)
;
greatCrestedFlyCatcherValues[2][1] = new BirdTurnValue(50.16)
;
greatCrestedFlyCatcherValues[2][2] = new BirdTurnValue(49.88)
;
greatCrestedFlyCatcherValues[2][3] = new BirdTurnValue(49.59)
;
greatCrestedFlyCatcherValues[2][4] = new BirdTurnValue(49.46)
;
greatCrestedFlyCatcherValues[2][5] = new BirdTurnValue(48.98)
;
greatCrestedFlyCatcherValues[2][6] = new BirdTurnValue(48.65)
;
greatCrestedFlyCatcherValues[2][7] = new BirdTurnValue(48.15)
;
greatCrestedFlyCatcherValues[3][1] = new BirdTurnValue(48.31)
;
greatCrestedFlyCatcherValues[3][2] = new BirdTurnValue(47.90)
;
greatCrestedFlyCatcherValues[3][3] = new BirdTurnValue(48.25)
;
greatCrestedFlyCatcherValues[3][4] = new BirdTurnValue(47.98)
;
greatCrestedFlyCatcherValues[3][5] = new BirdTurnValue(47.87)
;
greatCrestedFlyCatcherValues[3][6] = new BirdTurnValue(48.10)
;
greatCrestedFlyCatcherValues[4][1] = new BirdTurnValue(47.52)
;
greatCrestedFlyCatcherValues[4][2] = new BirdTurnValue(47.24)
;
greatCrestedFlyCatcherValues[4][3] = new BirdTurnValue(47.40)
;
greatCrestedFlyCatcherValues[4][4] = new BirdTurnValue(46.24)
;
greatCrestedFlyCatcherValues[4][5] = new BirdTurnValue(45.61)
;
map.put("Great Crested Fly-Catcher", greatCrestedFlyCatcherValues);

// Great Egret
BirdTurnValue[][] greatEgretValues = new BirdTurnValue[5][9];
greatEgretValues[1][1] = new BirdTurnValue(45.62)
;
greatEgretValues[1][2] = new BirdTurnValue(48.93)
;
greatEgretValues[1][3] = new BirdTurnValue(48.15)
;
greatEgretValues[1][4] = new BirdTurnValue(48.95)
;
greatEgretValues[1][5] = new BirdTurnValue(48.10)
;
greatEgretValues[1][6] = new BirdTurnValue(48.07)
;
greatEgretValues[1][7] = new BirdTurnValue(47.42)
;
greatEgretValues[1][8] = new BirdTurnValue(47.42)
;
greatEgretValues[2][1] = new BirdTurnValue(47.36)
;
greatEgretValues[2][2] = new BirdTurnValue(47.57)
;
greatEgretValues[2][3] = new BirdTurnValue(47.33)
;
greatEgretValues[2][4] = new BirdTurnValue(47.31)
;
greatEgretValues[2][5] = new BirdTurnValue(47.36)
;
greatEgretValues[2][6] = new BirdTurnValue(47.27)
;
greatEgretValues[2][7] = new BirdTurnValue(47.26)
;
greatEgretValues[3][1] = new BirdTurnValue(47.35)
;
greatEgretValues[3][2] = new BirdTurnValue(47.43)
;
greatEgretValues[3][3] = new BirdTurnValue(47.75)
;
greatEgretValues[3][4] = new BirdTurnValue(47.61)
;
greatEgretValues[3][5] = new BirdTurnValue(47.74)
;
greatEgretValues[3][6] = new BirdTurnValue(47.63)
;
greatEgretValues[4][1] = new BirdTurnValue(47.01)
;
greatEgretValues[4][2] = new BirdTurnValue(47.64)
;
greatEgretValues[4][3] = new BirdTurnValue(48.15)
;
greatEgretValues[4][4] = new BirdTurnValue(46.42)
;
greatEgretValues[4][5] = new BirdTurnValue(45.68)
;
map.put("Great Egret", greatEgretValues);

// Greater Roadrunner
BirdTurnValue[][] greaterRoadrunnerValues = new BirdTurnValue[5][9];
greaterRoadrunnerValues[1][1] = new BirdTurnValue(49.33)
;
greaterRoadrunnerValues[1][2] = new BirdTurnValue(51.72)
;
greaterRoadrunnerValues[1][3] = new BirdTurnValue(51.16)
;
greaterRoadrunnerValues[1][4] = new BirdTurnValue(51.80)
;
greaterRoadrunnerValues[1][5] = new BirdTurnValue(51.42)
;
greaterRoadrunnerValues[1][6] = new BirdTurnValue(50.54)
;
greaterRoadrunnerValues[1][7] = new BirdTurnValue(49.88)
;
greaterRoadrunnerValues[1][8] = new BirdTurnValue(49.21)
;
greaterRoadrunnerValues[2][1] = new BirdTurnValue(49.18)
;
greaterRoadrunnerValues[2][2] = new BirdTurnValue(49.41)
;
greaterRoadrunnerValues[2][3] = new BirdTurnValue(49.27)
;
greaterRoadrunnerValues[2][4] = new BirdTurnValue(48.96)
;
greaterRoadrunnerValues[2][5] = new BirdTurnValue(48.75)
;
greaterRoadrunnerValues[2][6] = new BirdTurnValue(48.97)
;
greaterRoadrunnerValues[2][7] = new BirdTurnValue(48.79)
;
greaterRoadrunnerValues[3][1] = new BirdTurnValue(48.66)
;
greaterRoadrunnerValues[3][2] = new BirdTurnValue(48.71)
;
greaterRoadrunnerValues[3][3] = new BirdTurnValue(48.49)
;
greaterRoadrunnerValues[3][4] = new BirdTurnValue(48.44)
;
greaterRoadrunnerValues[3][5] = new BirdTurnValue(48.73)
;
greaterRoadrunnerValues[3][6] = new BirdTurnValue(48.54)
;
greaterRoadrunnerValues[4][1] = new BirdTurnValue(48.09)
;
greaterRoadrunnerValues[4][2] = new BirdTurnValue(47.98)
;
greaterRoadrunnerValues[4][3] = new BirdTurnValue(48.45)
;
greaterRoadrunnerValues[4][4] = new BirdTurnValue(46.97)
;
greaterRoadrunnerValues[4][5] = new BirdTurnValue(46.19)
;
map.put("Greater Roadrunner", greaterRoadrunnerValues);

// Hooded Warbler
BirdTurnValue[][] hoodedWarblerValues = new BirdTurnValue[5][9];
hoodedWarblerValues[1][1] = new BirdTurnValue(48.74)
;
hoodedWarblerValues[1][2] = new BirdTurnValue(50.62)
;
hoodedWarblerValues[1][3] = new BirdTurnValue(50.66)
;
hoodedWarblerValues[1][4] = new BirdTurnValue(50.83)
;
hoodedWarblerValues[1][5] = new BirdTurnValue(50.69)
;
hoodedWarblerValues[1][6] = new BirdTurnValue(50.21)
;
hoodedWarblerValues[1][7] = new BirdTurnValue(50.04)
;
hoodedWarblerValues[1][8] = new BirdTurnValue(50.17)
;
hoodedWarblerValues[2][1] = new BirdTurnValue(50.06)
;
hoodedWarblerValues[2][2] = new BirdTurnValue(49.43)
;
hoodedWarblerValues[2][3] = new BirdTurnValue(49.70)
;
hoodedWarblerValues[2][4] = new BirdTurnValue(48.94)
;
hoodedWarblerValues[2][5] = new BirdTurnValue(49.26)
;
hoodedWarblerValues[2][6] = new BirdTurnValue(49.32)
;
hoodedWarblerValues[2][7] = new BirdTurnValue(48.75)
;
hoodedWarblerValues[3][1] = new BirdTurnValue(48.87)
;
hoodedWarblerValues[3][2] = new BirdTurnValue(48.55)
;
hoodedWarblerValues[3][3] = new BirdTurnValue(48.36)
;
hoodedWarblerValues[3][4] = new BirdTurnValue(48.65)
;
hoodedWarblerValues[3][5] = new BirdTurnValue(48.01)
;
hoodedWarblerValues[3][6] = new BirdTurnValue(48.39)
;
hoodedWarblerValues[4][1] = new BirdTurnValue(48.21)
;
hoodedWarblerValues[4][2] = new BirdTurnValue(47.69)
;
hoodedWarblerValues[4][3] = new BirdTurnValue(48.23)
;
hoodedWarblerValues[4][4] = new BirdTurnValue(47.07)
;
hoodedWarblerValues[4][5] = new BirdTurnValue(46.18)
;
map.put("Hooded Warbler", hoodedWarblerValues);

// House Finch
BirdTurnValue[][] houseFinchValues = new BirdTurnValue[5][9];
houseFinchValues[1][1] = new BirdTurnValue(47.58)
;
houseFinchValues[1][2] = new BirdTurnValue(48.15)
;
houseFinchValues[1][3] = new BirdTurnValue(48.65)
;
houseFinchValues[1][4] = new BirdTurnValue(48.20)
;
houseFinchValues[1][5] = new BirdTurnValue(47.84)
;
houseFinchValues[1][6] = new BirdTurnValue(47.28)
;
houseFinchValues[1][7] = new BirdTurnValue(47.35)
;
houseFinchValues[1][8] = new BirdTurnValue(47.40)
;
houseFinchValues[2][1] = new BirdTurnValue(47.33)
;
houseFinchValues[2][2] = new BirdTurnValue(47.62)
;
houseFinchValues[2][3] = new BirdTurnValue(47.08)
;
houseFinchValues[2][4] = new BirdTurnValue(47.63)
;
houseFinchValues[2][5] = new BirdTurnValue(47.08)
;
houseFinchValues[2][6] = new BirdTurnValue(47.33)
;
houseFinchValues[2][7] = new BirdTurnValue(47.10)
;
houseFinchValues[3][1] = new BirdTurnValue(47.16)
;
houseFinchValues[3][2] = new BirdTurnValue(47.24)
;
houseFinchValues[3][3] = new BirdTurnValue(47.07)
;
houseFinchValues[3][4] = new BirdTurnValue(47.12)
;
houseFinchValues[3][5] = new BirdTurnValue(46.81)
;
houseFinchValues[3][6] = new BirdTurnValue(46.57)
;
houseFinchValues[4][1] = new BirdTurnValue(46.70)
;
houseFinchValues[4][2] = new BirdTurnValue(46.05)
;
houseFinchValues[4][3] = new BirdTurnValue(46.89)
;
houseFinchValues[4][4] = new BirdTurnValue(45.32)
;
houseFinchValues[4][5] = new BirdTurnValue(45.40)
;
map.put("House Finch", houseFinchValues);

// House Wren
BirdTurnValue[][] houseWrenValues = new BirdTurnValue[5][9];
houseWrenValues[1][1] = new BirdTurnValue(44.41)
;
houseWrenValues[1][2] = new BirdTurnValue(44.28)
;
houseWrenValues[1][3] = new BirdTurnValue(44.75)
;
houseWrenValues[1][4] = new BirdTurnValue(44.59)
;
houseWrenValues[1][5] = new BirdTurnValue(45.78)
;
houseWrenValues[1][6] = new BirdTurnValue(45.53)
;
houseWrenValues[1][7] = new BirdTurnValue(45.70)
;
houseWrenValues[1][8] = new BirdTurnValue(45.89)
;
houseWrenValues[2][1] = new BirdTurnValue(45.88)
;
houseWrenValues[2][2] = new BirdTurnValue(46.17)
;
houseWrenValues[2][3] = new BirdTurnValue(45.57)
;
houseWrenValues[2][4] = new BirdTurnValue(44.78)
;
houseWrenValues[2][5] = new BirdTurnValue(45.07)
;
houseWrenValues[2][6] = new BirdTurnValue(44.83)
;
houseWrenValues[2][7] = new BirdTurnValue(44.53)
;
houseWrenValues[3][1] = new BirdTurnValue(44.70)
;
houseWrenValues[3][2] = new BirdTurnValue(44.33)
;
houseWrenValues[3][3] = new BirdTurnValue(44.15)
;
houseWrenValues[3][4] = new BirdTurnValue(43.86)
;
houseWrenValues[3][5] = new BirdTurnValue(43.51)
;
houseWrenValues[3][6] = new BirdTurnValue(43.44)
;
houseWrenValues[4][1] = new BirdTurnValue(43.30)
;
houseWrenValues[4][2] = new BirdTurnValue(43.16)
;
houseWrenValues[4][3] = new BirdTurnValue(43.90)
;
houseWrenValues[4][4] = new BirdTurnValue(42.34)
;
houseWrenValues[4][5] = new BirdTurnValue(41.63)
;
map.put("House Wren", houseWrenValues);

// Indigo Bunting
BirdTurnValue[][] indigoBuntingValues = new BirdTurnValue[5][9];
indigoBuntingValues[1][1] = new BirdTurnValue(51.48)
;
indigoBuntingValues[1][2] = new BirdTurnValue(51.10)
;
indigoBuntingValues[1][3] = new BirdTurnValue(51.22)
;
indigoBuntingValues[1][4] = new BirdTurnValue(51.11)
;
indigoBuntingValues[1][5] = new BirdTurnValue(50.39)
;
indigoBuntingValues[1][6] = new BirdTurnValue(49.35)
;
indigoBuntingValues[1][7] = new BirdTurnValue(48.65)
;
indigoBuntingValues[1][8] = new BirdTurnValue(48.18)
;
indigoBuntingValues[2][1] = new BirdTurnValue(48.25)
;
indigoBuntingValues[2][2] = new BirdTurnValue(48.47)
;
indigoBuntingValues[2][3] = new BirdTurnValue(48.41)
;
indigoBuntingValues[2][4] = new BirdTurnValue(47.95)
;
indigoBuntingValues[2][5] = new BirdTurnValue(48.01)
;
indigoBuntingValues[2][6] = new BirdTurnValue(47.66)
;
indigoBuntingValues[2][7] = new BirdTurnValue(47.85)
;
indigoBuntingValues[3][1] = new BirdTurnValue(47.62)
;
indigoBuntingValues[3][2] = new BirdTurnValue(47.56)
;
indigoBuntingValues[3][3] = new BirdTurnValue(46.92)
;
indigoBuntingValues[3][4] = new BirdTurnValue(47.41)
;
indigoBuntingValues[3][5] = new BirdTurnValue(47.18)
;
indigoBuntingValues[3][6] = new BirdTurnValue(47.28)
;
indigoBuntingValues[4][1] = new BirdTurnValue(47.00)
;
indigoBuntingValues[4][2] = new BirdTurnValue(46.85)
;
indigoBuntingValues[4][3] = new BirdTurnValue(47.51)
;
indigoBuntingValues[4][4] = new BirdTurnValue(46.00)
;
indigoBuntingValues[4][5] = new BirdTurnValue(45.34)
;
map.put("Indigo Bunting", indigoBuntingValues);

// Juniper Titmouse
BirdTurnValue[][] juniperTitmouseValues = new BirdTurnValue[5][9];
juniperTitmouseValues[1][1] = new BirdTurnValue(56.51)
;
juniperTitmouseValues[1][2] = new BirdTurnValue(56.92)
;
juniperTitmouseValues[1][3] = new BirdTurnValue(56.16)
;
juniperTitmouseValues[1][4] = new BirdTurnValue(55.41)
;
juniperTitmouseValues[1][5] = new BirdTurnValue(54.36)
;
juniperTitmouseValues[1][6] = new BirdTurnValue(53.70)
;
juniperTitmouseValues[1][7] = new BirdTurnValue(53.15)
;
juniperTitmouseValues[1][8] = new BirdTurnValue(52.60)
;
juniperTitmouseValues[2][1] = new BirdTurnValue(52.02)
;
juniperTitmouseValues[2][2] = new BirdTurnValue(51.77)
;
juniperTitmouseValues[2][3] = new BirdTurnValue(51.31)
;
juniperTitmouseValues[2][4] = new BirdTurnValue(51.03)
;
juniperTitmouseValues[2][5] = new BirdTurnValue(50.54)
;
juniperTitmouseValues[2][6] = new BirdTurnValue(49.75)
;
juniperTitmouseValues[2][7] = new BirdTurnValue(48.98)
;
juniperTitmouseValues[3][1] = new BirdTurnValue(49.10)
;
juniperTitmouseValues[3][2] = new BirdTurnValue(49.03)
;
juniperTitmouseValues[3][3] = new BirdTurnValue(49.05)
;
juniperTitmouseValues[3][4] = new BirdTurnValue(48.97)
;
juniperTitmouseValues[3][5] = new BirdTurnValue(48.30)
;
juniperTitmouseValues[3][6] = new BirdTurnValue(48.45)
;
juniperTitmouseValues[4][1] = new BirdTurnValue(47.63)
;
juniperTitmouseValues[4][2] = new BirdTurnValue(46.99)
;
juniperTitmouseValues[4][3] = new BirdTurnValue(46.84)
;
juniperTitmouseValues[4][4] = new BirdTurnValue(46.06)
;
juniperTitmouseValues[4][5] = new BirdTurnValue(45.71)
;
map.put("Juniper Titmouse", juniperTitmouseValues);

// Killdeer
BirdTurnValue[][] killdeerValues = new BirdTurnValue[5][9];
killdeerValues[1][1] = new BirdTurnValue(40.68)
;
killdeerValues[1][2] = new BirdTurnValue(41.05)
;
killdeerValues[1][3] = new BirdTurnValue(41.22)
;
killdeerValues[1][4] = new BirdTurnValue(41.49)
;
killdeerValues[1][5] = new BirdTurnValue(42.06)
;
killdeerValues[1][6] = new BirdTurnValue(42.02)
;
killdeerValues[1][7] = new BirdTurnValue(41.54)
;
killdeerValues[1][8] = new BirdTurnValue(41.67)
;
killdeerValues[2][1] = new BirdTurnValue(42.15)
;
killdeerValues[2][2] = new BirdTurnValue(41.59)
;
killdeerValues[2][3] = new BirdTurnValue(42.11)
;
killdeerValues[2][4] = new BirdTurnValue(41.60)
;
killdeerValues[2][5] = new BirdTurnValue(41.34)
;
killdeerValues[2][6] = new BirdTurnValue(41.91)
;
killdeerValues[2][7] = new BirdTurnValue(42.11)
;
killdeerValues[3][1] = new BirdTurnValue(41.67)
;
killdeerValues[3][2] = new BirdTurnValue(41.37)
;
killdeerValues[3][3] = new BirdTurnValue(41.49)
;
killdeerValues[3][4] = new BirdTurnValue(41.50)
;
killdeerValues[3][5] = new BirdTurnValue(41.69)
;
killdeerValues[3][6] = new BirdTurnValue(42.04)
;
killdeerValues[4][1] = new BirdTurnValue(42.16)
;
killdeerValues[4][2] = new BirdTurnValue(41.94)
;
killdeerValues[4][3] = new BirdTurnValue(42.79)
;
killdeerValues[4][4] = new BirdTurnValue(41.39)
;
killdeerValues[4][5] = new BirdTurnValue(41.81)
;
map.put("Killdeer", killdeerValues);

// Lincoln’s Sparrow
BirdTurnValue[][] lincolnsSparrowValues = new BirdTurnValue[5][9];
lincolnsSparrowValues[1][1] = new BirdTurnValue(44.53)
;
lincolnsSparrowValues[1][2] = new BirdTurnValue(45.38)
;
lincolnsSparrowValues[1][3] = new BirdTurnValue(45.29)
;
lincolnsSparrowValues[1][4] = new BirdTurnValue(45.55)
;
lincolnsSparrowValues[1][5] = new BirdTurnValue(45.81)
;
lincolnsSparrowValues[1][6] = new BirdTurnValue(45.69)
;
lincolnsSparrowValues[1][7] = new BirdTurnValue(45.95)
;
lincolnsSparrowValues[1][8] = new BirdTurnValue(46.39)
;
lincolnsSparrowValues[2][1] = new BirdTurnValue(46.14)
;
lincolnsSparrowValues[2][2] = new BirdTurnValue(46.74)
;
lincolnsSparrowValues[2][3] = new BirdTurnValue(46.72)
;
lincolnsSparrowValues[2][4] = new BirdTurnValue(46.69)
;
lincolnsSparrowValues[2][5] = new BirdTurnValue(47.19)
;
lincolnsSparrowValues[2][6] = new BirdTurnValue(46.91)
;
lincolnsSparrowValues[2][7] = new BirdTurnValue(46.75)
;
lincolnsSparrowValues[3][1] = new BirdTurnValue(46.97)
;
lincolnsSparrowValues[3][2] = new BirdTurnValue(46.82)
;
lincolnsSparrowValues[3][3] = new BirdTurnValue(46.55)
;
lincolnsSparrowValues[3][4] = new BirdTurnValue(46.51)
;
lincolnsSparrowValues[3][5] = new BirdTurnValue(46.34)
;
lincolnsSparrowValues[3][6] = new BirdTurnValue(47.14)
;
lincolnsSparrowValues[4][1] = new BirdTurnValue(46.68)
;
lincolnsSparrowValues[4][2] = new BirdTurnValue(46.50)
;
lincolnsSparrowValues[4][3] = new BirdTurnValue(47.22)
;
lincolnsSparrowValues[4][4] = new BirdTurnValue(45.72)
;
lincolnsSparrowValues[4][5] = new BirdTurnValue(45.09)
;
map.put("Lincoln’s Sparrow", lincolnsSparrowValues);

// Mallard
BirdTurnValue[][] mallardValues = new BirdTurnValue[5][9];
mallardValues[1][1] = new BirdTurnValue(46.13)
;
mallardValues[1][2] = new BirdTurnValue(46.51)
;
mallardValues[1][3] = new BirdTurnValue(46.05)
;
mallardValues[1][4] = new BirdTurnValue(45.77)
;
mallardValues[1][5] = new BirdTurnValue(45.75)
;
mallardValues[1][6] = new BirdTurnValue(45.37)
;
mallardValues[1][7] = new BirdTurnValue(44.98)
;
mallardValues[1][8] = new BirdTurnValue(45.17)
;
mallardValues[2][1] = new BirdTurnValue(44.55)
;
mallardValues[2][2] = new BirdTurnValue(44.98)
;
mallardValues[2][3] = new BirdTurnValue(44.33)
;
mallardValues[2][4] = new BirdTurnValue(44.45)
;
mallardValues[2][5] = new BirdTurnValue(43.73)
;
mallardValues[2][6] = new BirdTurnValue(43.54)
;
mallardValues[2][7] = new BirdTurnValue(42.97)
;
mallardValues[3][1] = new BirdTurnValue(43.44)
;
mallardValues[3][2] = new BirdTurnValue(42.63)
;
mallardValues[3][3] = new BirdTurnValue(42.17)
;
mallardValues[3][4] = new BirdTurnValue(42.13)
;
mallardValues[3][5] = new BirdTurnValue(41.93)
;
mallardValues[3][6] = new BirdTurnValue(41.98)
;
mallardValues[4][1] = new BirdTurnValue(41.71)
;
mallardValues[4][2] = new BirdTurnValue(40.70)
;
mallardValues[4][3] = new BirdTurnValue(41.61)
;
mallardValues[4][4] = new BirdTurnValue(40.86)
;
mallardValues[4][5] = new BirdTurnValue(40.34)
;
map.put("Mallard", mallardValues);

// Mississippi Kite
BirdTurnValue[][] mississippiKiteValues = new BirdTurnValue[5][9];
mississippiKiteValues[1][1] = new BirdTurnValue(53.03)
;
mississippiKiteValues[1][2] = new BirdTurnValue(52.51)
;
mississippiKiteValues[1][3] = new BirdTurnValue(53.09)
;
mississippiKiteValues[1][4] = new BirdTurnValue(52.78)
;
mississippiKiteValues[1][5] = new BirdTurnValue(52.65)
;
mississippiKiteValues[1][6] = new BirdTurnValue(52.76)
;
mississippiKiteValues[1][7] = new BirdTurnValue(52.73)
;
mississippiKiteValues[1][8] = new BirdTurnValue(52.11)
;
mississippiKiteValues[2][1] = new BirdTurnValue(52.33)
;
mississippiKiteValues[2][2] = new BirdTurnValue(52.07)
;
mississippiKiteValues[2][3] = new BirdTurnValue(51.52)
;
mississippiKiteValues[2][4] = new BirdTurnValue(51.04)
;
mississippiKiteValues[2][5] = new BirdTurnValue(50.81)
;
mississippiKiteValues[2][6] = new BirdTurnValue(49.93)
;
mississippiKiteValues[2][7] = new BirdTurnValue(50.02)
;
mississippiKiteValues[3][1] = new BirdTurnValue(49.15)
;
mississippiKiteValues[3][2] = new BirdTurnValue(48.76)
;
mississippiKiteValues[3][3] = new BirdTurnValue(47.83)
;
mississippiKiteValues[3][4] = new BirdTurnValue(47.90)
;
mississippiKiteValues[3][5] = new BirdTurnValue(46.84)
;
mississippiKiteValues[3][6] = new BirdTurnValue(46.62)
;
mississippiKiteValues[4][1] = new BirdTurnValue(46.30)
;
mississippiKiteValues[4][2] = new BirdTurnValue(45.37)
;
mississippiKiteValues[4][3] = new BirdTurnValue(46.34)
;
mississippiKiteValues[4][4] = new BirdTurnValue(44.80)
;
mississippiKiteValues[4][5] = new BirdTurnValue(43.88)
;
map.put("Mississippi Kite", mississippiKiteValues);

// Mountain Bluebird
BirdTurnValue[][] mountainBluebirdValues = new BirdTurnValue[5][9];
mountainBluebirdValues[1][1] = new BirdTurnValue(44.94)
;
mountainBluebirdValues[1][2] = new BirdTurnValue(46.09)
;
mountainBluebirdValues[1][3] = new BirdTurnValue(46.33)
;
mountainBluebirdValues[1][4] = new BirdTurnValue(46.27)
;
mountainBluebirdValues[1][5] = new BirdTurnValue(45.94)
;
mountainBluebirdValues[1][6] = new BirdTurnValue(46.37)
;
mountainBluebirdValues[1][7] = new BirdTurnValue(46.17)
;
mountainBluebirdValues[1][8] = new BirdTurnValue(46.59)
;
mountainBluebirdValues[2][1] = new BirdTurnValue(46.75)
;
mountainBluebirdValues[2][2] = new BirdTurnValue(47.10)
;
mountainBluebirdValues[2][3] = new BirdTurnValue(46.93)
;
mountainBluebirdValues[2][4] = new BirdTurnValue(47.00)
;
mountainBluebirdValues[2][5] = new BirdTurnValue(47.16)
;
mountainBluebirdValues[2][6] = new BirdTurnValue(47.21)
;
mountainBluebirdValues[2][7] = new BirdTurnValue(47.13)
;
mountainBluebirdValues[3][1] = new BirdTurnValue(47.39)
;
mountainBluebirdValues[3][2] = new BirdTurnValue(47.46)
;
mountainBluebirdValues[3][3] = new BirdTurnValue(47.18)
;
mountainBluebirdValues[3][4] = new BirdTurnValue(47.43)
;
mountainBluebirdValues[3][5] = new BirdTurnValue(47.18)
;
mountainBluebirdValues[3][6] = new BirdTurnValue(47.04)
;
mountainBluebirdValues[4][1] = new BirdTurnValue(47.42)
;
mountainBluebirdValues[4][2] = new BirdTurnValue(47.47)
;
mountainBluebirdValues[4][3] = new BirdTurnValue(47.58)
;
mountainBluebirdValues[4][4] = new BirdTurnValue(45.49)
;
mountainBluebirdValues[4][5] = new BirdTurnValue(45.46)
;
map.put("Mountain Bluebird", mountainBluebirdValues);

// Mountain Chickadee
BirdTurnValue[][] mountainChickadeeValues = new BirdTurnValue[5][9];
mountainChickadeeValues[1][1] = new BirdTurnValue(55.14)
;
mountainChickadeeValues[1][2] = new BirdTurnValue(55.16)
;
mountainChickadeeValues[1][3] = new BirdTurnValue(55.08)
;
mountainChickadeeValues[1][4] = new BirdTurnValue(54.34)
;
mountainChickadeeValues[1][5] = new BirdTurnValue(54.24)
;
mountainChickadeeValues[1][6] = new BirdTurnValue(53.83)
;
mountainChickadeeValues[1][7] = new BirdTurnValue(53.22)
;
mountainChickadeeValues[1][8] = new BirdTurnValue(52.86)
;
mountainChickadeeValues[2][1] = new BirdTurnValue(52.08)
;
mountainChickadeeValues[2][2] = new BirdTurnValue(51.49)
;
mountainChickadeeValues[2][3] = new BirdTurnValue(51.40)
;
mountainChickadeeValues[2][4] = new BirdTurnValue(50.82)
;
mountainChickadeeValues[2][5] = new BirdTurnValue(50.41)
;
mountainChickadeeValues[2][6] = new BirdTurnValue(49.24)
;
mountainChickadeeValues[2][7] = new BirdTurnValue(48.74)
;
mountainChickadeeValues[3][1] = new BirdTurnValue(47.94)
;
mountainChickadeeValues[3][2] = new BirdTurnValue(47.73)
;
mountainChickadeeValues[3][3] = new BirdTurnValue(47.00)
;
mountainChickadeeValues[3][4] = new BirdTurnValue(46.06)
;
mountainChickadeeValues[3][5] = new BirdTurnValue(45.83)
;
mountainChickadeeValues[3][6] = new BirdTurnValue(45.23)
;
mountainChickadeeValues[4][1] = new BirdTurnValue(45.28)
;
mountainChickadeeValues[4][2] = new BirdTurnValue(43.90)
;
mountainChickadeeValues[4][3] = new BirdTurnValue(44.00)
;
mountainChickadeeValues[4][4] = new BirdTurnValue(42.94)
;
mountainChickadeeValues[4][5] = new BirdTurnValue(42.49)
;
map.put("Mountain Chickadee", mountainChickadeeValues);

// Mourning Dove
BirdTurnValue[][] mourningDoveValues = new BirdTurnValue[5][9];
mourningDoveValues[1][1] = new BirdTurnValue(47.23)
;
mourningDoveValues[1][2] = new BirdTurnValue(47.05)
;
mourningDoveValues[1][3] = new BirdTurnValue(47.23)
;
mourningDoveValues[1][4] = new BirdTurnValue(46.59)
;
mourningDoveValues[1][5] = new BirdTurnValue(46.67)
;
mourningDoveValues[1][6] = new BirdTurnValue(46.45)
;
mourningDoveValues[1][7] = new BirdTurnValue(46.70)
;
mourningDoveValues[1][8] = new BirdTurnValue(46.41)
;
mourningDoveValues[2][1] = new BirdTurnValue(46.31)
;
mourningDoveValues[2][2] = new BirdTurnValue(46.33)
;
mourningDoveValues[2][3] = new BirdTurnValue(46.58)
;
mourningDoveValues[2][4] = new BirdTurnValue(45.84)
;
mourningDoveValues[2][5] = new BirdTurnValue(45.92)
;
mourningDoveValues[2][6] = new BirdTurnValue(45.19)
;
mourningDoveValues[2][7] = new BirdTurnValue(45.29)
;
mourningDoveValues[3][1] = new BirdTurnValue(44.40)
;
mourningDoveValues[3][2] = new BirdTurnValue(44.17)
;
mourningDoveValues[3][3] = new BirdTurnValue(44.60)
;
mourningDoveValues[3][4] = new BirdTurnValue(43.11)
;
mourningDoveValues[3][5] = new BirdTurnValue(43.35)
;
mourningDoveValues[3][6] = new BirdTurnValue(43.14)
;
mourningDoveValues[4][1] = new BirdTurnValue(42.71)
;
mourningDoveValues[4][2] = new BirdTurnValue(41.70)
;
mourningDoveValues[4][3] = new BirdTurnValue(43.04)
;
mourningDoveValues[4][4] = new BirdTurnValue(41.34)
;
mourningDoveValues[4][5] = new BirdTurnValue(40.58)
;
map.put("Mourning Dove", mourningDoveValues);



// Northern Bobwhite
BirdTurnValue[][] northernBobwhiteValues = new BirdTurnValue[5][9];
northernBobwhiteValues[1][1] = new BirdTurnValue(47.94)
;
northernBobwhiteValues[1][2] = new BirdTurnValue(51.15)
;
northernBobwhiteValues[1][3] = new BirdTurnValue(51.01)
;
northernBobwhiteValues[1][4] = new BirdTurnValue(51.04)
;
northernBobwhiteValues[1][5] = new BirdTurnValue(50.44)
;
northernBobwhiteValues[1][6] = new BirdTurnValue(49.64)
;
northernBobwhiteValues[1][7] = new BirdTurnValue(48.78)
;
northernBobwhiteValues[1][8] = new BirdTurnValue(48.88)
;
northernBobwhiteValues[2][1] = new BirdTurnValue(48.50)
;
northernBobwhiteValues[2][2] = new BirdTurnValue(48.84)
;
northernBobwhiteValues[2][3] = new BirdTurnValue(48.48)
;
northernBobwhiteValues[2][4] = new BirdTurnValue(48.50)
;
northernBobwhiteValues[2][5] = new BirdTurnValue(47.85)
;
northernBobwhiteValues[2][6] = new BirdTurnValue(48.54)
;
northernBobwhiteValues[2][7] = new BirdTurnValue(48.14)
;
northernBobwhiteValues[3][1] = new BirdTurnValue(48.18)
;
northernBobwhiteValues[3][2] = new BirdTurnValue(48.18)
;
northernBobwhiteValues[3][3] = new BirdTurnValue(48.47)
;
northernBobwhiteValues[3][4] = new BirdTurnValue(47.96)
;
northernBobwhiteValues[3][5] = new BirdTurnValue(47.95)
;
northernBobwhiteValues[3][6] = new BirdTurnValue(47.94)
;
northernBobwhiteValues[4][1] = new BirdTurnValue(47.80)
;
northernBobwhiteValues[4][2] = new BirdTurnValue(48.55)
;
northernBobwhiteValues[4][3] = new BirdTurnValue(48.54)
;
northernBobwhiteValues[4][4] = new BirdTurnValue(46.89)
;
northernBobwhiteValues[4][5] = new BirdTurnValue(45.72)
;
map.put("Northern Bobwhite", northernBobwhiteValues);

// Northern Cardinal
BirdTurnValue[][] northernCardinalValues = new BirdTurnValue[5][9];
northernCardinalValues[1][1] = new BirdTurnValue(49.82)
;
northernCardinalValues[1][2] = new BirdTurnValue(51.21)
;
northernCardinalValues[1][3] = new BirdTurnValue(50.41)
;
northernCardinalValues[1][4] = new BirdTurnValue(50.30)
;
northernCardinalValues[1][5] = new BirdTurnValue(49.32)
;
northernCardinalValues[1][6] = new BirdTurnValue(49.28)
;
northernCardinalValues[1][7] = new BirdTurnValue(48.83)
;
northernCardinalValues[1][8] = new BirdTurnValue(48.56)
;
northernCardinalValues[2][1] = new BirdTurnValue(48.46)
;
northernCardinalValues[2][2] = new BirdTurnValue(48.22)
;
northernCardinalValues[2][3] = new BirdTurnValue(48.06)
;
northernCardinalValues[2][4] = new BirdTurnValue(47.68)
;
northernCardinalValues[2][5] = new BirdTurnValue(47.93)
;
northernCardinalValues[2][6] = new BirdTurnValue(47.28)
;
northernCardinalValues[2][7] = new BirdTurnValue(46.97)
;
northernCardinalValues[3][1] = new BirdTurnValue(47.58)
;
northernCardinalValues[3][2] = new BirdTurnValue(47.37)
;
northernCardinalValues[3][3] = new BirdTurnValue(47.26)
;
northernCardinalValues[3][4] = new BirdTurnValue(47.06)
;
northernCardinalValues[3][5] = new BirdTurnValue(47.08)
;
northernCardinalValues[3][6] = new BirdTurnValue(46.47)
;
northernCardinalValues[4][1] = new BirdTurnValue(46.44)
;
northernCardinalValues[4][2] = new BirdTurnValue(46.19)
;
northernCardinalValues[4][3] = new BirdTurnValue(46.47)
;
northernCardinalValues[4][4] = new BirdTurnValue(45.38)
;
northernCardinalValues[4][5] = new BirdTurnValue(45.14)
;
map.put("Northern Cardinal", northernCardinalValues);

// Northern Flicker
BirdTurnValue[][] northernFlickerValues = new BirdTurnValue[5][9];
northernFlickerValues[1][1] = new BirdTurnValue(52.01)
;
northernFlickerValues[1][2] = new BirdTurnValue(52.02)
;
northernFlickerValues[1][3] = new BirdTurnValue(51.89)
;
northernFlickerValues[1][4] = new BirdTurnValue(51.93)
;
northernFlickerValues[1][5] = new BirdTurnValue(50.80)
;
northernFlickerValues[1][6] = new BirdTurnValue(50.86)
;
northernFlickerValues[1][7] = new BirdTurnValue(51.04)
;
northernFlickerValues[1][8] = new BirdTurnValue(50.68)
;
northernFlickerValues[2][1] = new BirdTurnValue(50.47)
;
northernFlickerValues[2][2] = new BirdTurnValue(49.95)
;
northernFlickerValues[2][3] = new BirdTurnValue(49.54)
;
northernFlickerValues[2][4] = new BirdTurnValue(48.91)
;
northernFlickerValues[2][5] = new BirdTurnValue(49.05)
;
northernFlickerValues[2][6] = new BirdTurnValue(48.19)
;
northernFlickerValues[2][7] = new BirdTurnValue(48.48)
;
northernFlickerValues[3][1] = new BirdTurnValue(47.55)
;
northernFlickerValues[3][2] = new BirdTurnValue(47.33)
;
northernFlickerValues[3][3] = new BirdTurnValue(46.61)
;
northernFlickerValues[3][4] = new BirdTurnValue(46.82)
;
northernFlickerValues[3][5] = new BirdTurnValue(45.83)
;
northernFlickerValues[3][6] = new BirdTurnValue(44.78)
;
northernFlickerValues[4][1] = new BirdTurnValue(44.16)
;
northernFlickerValues[4][2] = new BirdTurnValue(43.85)
;
northernFlickerValues[4][3] = new BirdTurnValue(43.63)
;
northernFlickerValues[4][4] = new BirdTurnValue(42.11)
;
northernFlickerValues[4][5] = new BirdTurnValue(42.17)
;
map.put("Northern Flicker", northernFlickerValues);

// Northern Harrier
BirdTurnValue[][] northernHarrierValues = new BirdTurnValue[5][9];
northernHarrierValues[1][1] = new BirdTurnValue(49.67)
;
northernHarrierValues[1][2] = new BirdTurnValue(49.25)
;
northernHarrierValues[1][3] = new BirdTurnValue(49.96)
;
northernHarrierValues[1][4] = new BirdTurnValue(49.83)
;
northernHarrierValues[1][5] = new BirdTurnValue(49.39)
;
northernHarrierValues[1][6] = new BirdTurnValue(48.98)
;
northernHarrierValues[1][7] = new BirdTurnValue(48.95)
;
northernHarrierValues[1][8] = new BirdTurnValue(48.93)
;
northernHarrierValues[2][1] = new BirdTurnValue(48.60)
;
northernHarrierValues[2][2] = new BirdTurnValue(48.67)
;
northernHarrierValues[2][3] = new BirdTurnValue(48.38)
;
northernHarrierValues[2][4] = new BirdTurnValue(48.13)
;
northernHarrierValues[2][5] = new BirdTurnValue(47.40)
;
northernHarrierValues[2][6] = new BirdTurnValue(48.05)
;
northernHarrierValues[2][7] = new BirdTurnValue(47.40)
;
northernHarrierValues[3][1] = new BirdTurnValue(46.16)
;
northernHarrierValues[3][2] = new BirdTurnValue(46.48)
;
northernHarrierValues[3][3] = new BirdTurnValue(46.11)
;
northernHarrierValues[3][4] = new BirdTurnValue(45.99)
;
northernHarrierValues[3][5] = new BirdTurnValue(46.04)
;
northernHarrierValues[3][6] = new BirdTurnValue(45.11)
;
northernHarrierValues[4][1] = new BirdTurnValue(44.48)
;
northernHarrierValues[4][2] = new BirdTurnValue(43.73)
;
northernHarrierValues[4][3] = new BirdTurnValue(44.95)
;
northernHarrierValues[4][4] = new BirdTurnValue(43.83)
;
northernHarrierValues[4][5] = new BirdTurnValue(42.35)
;
map.put("Northern Harrier", northernHarrierValues);

// Peregrine Falcon
BirdTurnValue[][] peregrineFalconValues = new BirdTurnValue[5][9];
peregrineFalconValues[1][1] = new BirdTurnValue(49.74)
;
peregrineFalconValues[1][2] = new BirdTurnValue(51.32)
;
peregrineFalconValues[1][3] = new BirdTurnValue(51.01)
;
peregrineFalconValues[1][4] = new BirdTurnValue(50.61)
;
peregrineFalconValues[1][5] = new BirdTurnValue(50.66)
;
peregrineFalconValues[1][6] = new BirdTurnValue(50.03)
;
peregrineFalconValues[1][7] = new BirdTurnValue(50.25)
;
peregrineFalconValues[1][8] = new BirdTurnValue(49.79)
;
peregrineFalconValues[2][1] = new BirdTurnValue(49.51)
;
peregrineFalconValues[2][2] = new BirdTurnValue(49.77)
;
peregrineFalconValues[2][3] = new BirdTurnValue(49.16)
;
peregrineFalconValues[2][4] = new BirdTurnValue(49.10)
;
peregrineFalconValues[2][5] = new BirdTurnValue(49.58)
;
peregrineFalconValues[2][6] = new BirdTurnValue(49.19)
;
peregrineFalconValues[2][7] = new BirdTurnValue(48.81)
;
peregrineFalconValues[3][1] = new BirdTurnValue(49.26)
;
peregrineFalconValues[3][2] = new BirdTurnValue(48.85)
;
peregrineFalconValues[3][3] = new BirdTurnValue(48.72)
;
peregrineFalconValues[3][4] = new BirdTurnValue(48.25)
;
peregrineFalconValues[3][5] = new BirdTurnValue(47.95)
;
peregrineFalconValues[3][6] = new BirdTurnValue(48.05)
;
peregrineFalconValues[4][1] = new BirdTurnValue(47.47)
;
peregrineFalconValues[4][2] = new BirdTurnValue(47.86)
;
peregrineFalconValues[4][3] = new BirdTurnValue(48.20)
;
peregrineFalconValues[4][4] = new BirdTurnValue(46.33)
;
peregrineFalconValues[4][5] = new BirdTurnValue(46.35)
;
map.put("Peregrine Falcon", peregrineFalconValues);

// Pied-billed Grebe
BirdTurnValue[][] piedBilledGrebeValues = new BirdTurnValue[5][9];
piedBilledGrebeValues[1][1] = new BirdTurnValue(38.84)
;
piedBilledGrebeValues[1][2] = new BirdTurnValue(39.15)
;
piedBilledGrebeValues[1][3] = new BirdTurnValue(38.89)
;
piedBilledGrebeValues[1][4] = new BirdTurnValue(39.64)
;
piedBilledGrebeValues[1][5] = new BirdTurnValue(40.12)
;
piedBilledGrebeValues[1][6] = new BirdTurnValue(40.95)
;
piedBilledGrebeValues[1][7] = new BirdTurnValue(41.40)
;
piedBilledGrebeValues[1][8] = new BirdTurnValue(41.51)
;
piedBilledGrebeValues[2][1] = new BirdTurnValue(41.97)
;
piedBilledGrebeValues[2][2] = new BirdTurnValue(42.27)
;
piedBilledGrebeValues[2][3] = new BirdTurnValue(42.40)
;
piedBilledGrebeValues[2][4] = new BirdTurnValue(42.01)
;
piedBilledGrebeValues[2][5] = new BirdTurnValue(42.63)
;
piedBilledGrebeValues[2][6] = new BirdTurnValue(42.42)
;
piedBilledGrebeValues[2][7] = new BirdTurnValue(42.65)
;
piedBilledGrebeValues[3][1] = new BirdTurnValue(42.62)
;
piedBilledGrebeValues[3][2] = new BirdTurnValue(42.30)
;
piedBilledGrebeValues[3][3] = new BirdTurnValue(42.14)
;
piedBilledGrebeValues[3][4] = new BirdTurnValue(42.13)
;
piedBilledGrebeValues[3][5] = new BirdTurnValue(42.25)
;
piedBilledGrebeValues[3][6] = new BirdTurnValue(41.68)
;
piedBilledGrebeValues[4][1] = new BirdTurnValue(41.42)
;
piedBilledGrebeValues[4][2] = new BirdTurnValue(41.88)
;
piedBilledGrebeValues[4][3] = new BirdTurnValue(41.95)
;
piedBilledGrebeValues[4][4] = new BirdTurnValue(41.60)
;
piedBilledGrebeValues[4][5] = new BirdTurnValue(40.07)
;
map.put("Pied-billed Grebe", piedBilledGrebeValues);

// Pine Siskin
BirdTurnValue[][] pineSiskinValues = new BirdTurnValue[5][9];
pineSiskinValues[1][1] = new BirdTurnValue(47.43)
;
pineSiskinValues[1][2] = new BirdTurnValue(48.08)
;
pineSiskinValues[1][3] = new BirdTurnValue(48.20)
;
pineSiskinValues[1][4] = new BirdTurnValue(47.69)
;
pineSiskinValues[1][5] = new BirdTurnValue(47.43)
;
pineSiskinValues[1][6] = new BirdTurnValue(47.18)
;
pineSiskinValues[1][7] = new BirdTurnValue(47.05)
;
pineSiskinValues[1][8] = new BirdTurnValue(47.04)
;
pineSiskinValues[2][1] = new BirdTurnValue(46.65)
;
pineSiskinValues[2][2] = new BirdTurnValue(46.34)
;
pineSiskinValues[2][3] = new BirdTurnValue(46.57)
;
pineSiskinValues[2][4] = new BirdTurnValue(46.84)
;
pineSiskinValues[2][5] = new BirdTurnValue(46.86)
;
pineSiskinValues[2][6] = new BirdTurnValue(47.06)
;
pineSiskinValues[2][7] = new BirdTurnValue(46.99)
;
pineSiskinValues[3][1] = new BirdTurnValue(46.54)
;
pineSiskinValues[3][2] = new BirdTurnValue(46.84)
;
pineSiskinValues[3][3] = new BirdTurnValue(46.41)
;
pineSiskinValues[3][4] = new BirdTurnValue(46.56)
;
pineSiskinValues[3][5] = new BirdTurnValue(46.68)
;
pineSiskinValues[3][6] = new BirdTurnValue(46.53)
;
pineSiskinValues[4][1] = new BirdTurnValue(47.01)
;
pineSiskinValues[4][2] = new BirdTurnValue(47.02)
;
pineSiskinValues[4][3] = new BirdTurnValue(46.78)
;
pineSiskinValues[4][4] = new BirdTurnValue(45.51)
;
pineSiskinValues[4][5] = new BirdTurnValue(45.03)
;
map.put("Pine Siskin", pineSiskinValues);

// Prothonotary Warbler
BirdTurnValue[][] prothonotaryWarblerValues = new BirdTurnValue[5][9];
prothonotaryWarblerValues[1][1] = new BirdTurnValue(47.68)
;
prothonotaryWarblerValues[1][2] = new BirdTurnValue(49.84)
;
prothonotaryWarblerValues[1][3] = new BirdTurnValue(49.93)
;
prothonotaryWarblerValues[1][4] = new BirdTurnValue(50.32)
;
prothonotaryWarblerValues[1][5] = new BirdTurnValue(50.00)
;
prothonotaryWarblerValues[1][6] = new BirdTurnValue(49.75)
;
prothonotaryWarblerValues[1][7] = new BirdTurnValue(49.04)
;
prothonotaryWarblerValues[1][8] = new BirdTurnValue(48.90)
;
prothonotaryWarblerValues[2][1] = new BirdTurnValue(48.65)
;
prothonotaryWarblerValues[2][2] = new BirdTurnValue(48.54)
;
prothonotaryWarblerValues[2][3] = new BirdTurnValue(48.69)
;
prothonotaryWarblerValues[2][4] = new BirdTurnValue(48.75)
;
prothonotaryWarblerValues[2][5] = new BirdTurnValue(48.45)
;
prothonotaryWarblerValues[2][6] = new BirdTurnValue(48.34)
;
prothonotaryWarblerValues[2][7] = new BirdTurnValue(48.42)
;
prothonotaryWarblerValues[3][1] = new BirdTurnValue(48.21)
;
prothonotaryWarblerValues[3][2] = new BirdTurnValue(47.75)
;
prothonotaryWarblerValues[3][3] = new BirdTurnValue(48.29)
;
prothonotaryWarblerValues[3][4] = new BirdTurnValue(48.00)
;
prothonotaryWarblerValues[3][5] = new BirdTurnValue(48.00)
;
prothonotaryWarblerValues[3][6] = new BirdTurnValue(47.96)
;
prothonotaryWarblerValues[4][1] = new BirdTurnValue(47.76)
;
prothonotaryWarblerValues[4][2] = new BirdTurnValue(47.90)
;
prothonotaryWarblerValues[4][3] = new BirdTurnValue(47.72)
;
prothonotaryWarblerValues[4][4] = new BirdTurnValue(46.95)
;
prothonotaryWarblerValues[4][5] = new BirdTurnValue(46.45)
;
map.put("Prothonotary Warbler", prothonotaryWarblerValues);

// Purple Martin
BirdTurnValue[][] purpleMartinValues = new BirdTurnValue[5][9];
purpleMartinValues[1][1] = new BirdTurnValue(47.88)
;
purpleMartinValues[1][2] = new BirdTurnValue(47.89)
;
purpleMartinValues[1][3] = new BirdTurnValue(48.24)
;
purpleMartinValues[1][4] = new BirdTurnValue(48.10)
;
purpleMartinValues[1][5] = new BirdTurnValue(47.78)
;
purpleMartinValues[1][6] = new BirdTurnValue(47.55)
;
purpleMartinValues[1][7] = new BirdTurnValue(47.48)
;
purpleMartinValues[1][8] = new BirdTurnValue(47.14)
;
purpleMartinValues[2][1] = new BirdTurnValue(47.48)
;
purpleMartinValues[2][2] = new BirdTurnValue(47.27)
;
purpleMartinValues[2][3] = new BirdTurnValue(47.31)
;
purpleMartinValues[2][4] = new BirdTurnValue(46.47)
;
purpleMartinValues[2][5] = new BirdTurnValue(46.09)
;
purpleMartinValues[2][6] = new BirdTurnValue(46.27)
;
purpleMartinValues[2][7] = new BirdTurnValue(46.42)
;
purpleMartinValues[3][1] = new BirdTurnValue(46.01)
;
purpleMartinValues[3][2] = new BirdTurnValue(45.16)
;
purpleMartinValues[3][3] = new BirdTurnValue(45.17)
;
purpleMartinValues[3][4] = new BirdTurnValue(44.99)
;
purpleMartinValues[3][5] = new BirdTurnValue(44.30)
;
purpleMartinValues[3][6] = new BirdTurnValue(43.91)
;
purpleMartinValues[4][1] = new BirdTurnValue(44.24)
;
purpleMartinValues[4][2] = new BirdTurnValue(42.91)
;
purpleMartinValues[4][3] = new BirdTurnValue(44.85)
;
purpleMartinValues[4][4] = new BirdTurnValue(42.95)
;
purpleMartinValues[4][5] = new BirdTurnValue(41.75)
;
map.put("Purple Martin", purpleMartinValues);

// Pygmy Nuthatch
BirdTurnValue[][] pygmyNuthatchValues = new BirdTurnValue[5][9];
pygmyNuthatchValues[1][1] = new BirdTurnValue(46.50)
;
pygmyNuthatchValues[1][2] = new BirdTurnValue(46.43)
;
pygmyNuthatchValues[1][3] = new BirdTurnValue(46.82)
;
pygmyNuthatchValues[1][4] = new BirdTurnValue(47.06)
;
pygmyNuthatchValues[1][5] = new BirdTurnValue(47.17)
;
pygmyNuthatchValues[1][6] = new BirdTurnValue(46.11)
;
pygmyNuthatchValues[1][7] = new BirdTurnValue(45.95)
;
pygmyNuthatchValues[1][8] = new BirdTurnValue(46.22)
;
pygmyNuthatchValues[2][1] = new BirdTurnValue(45.95)
;
pygmyNuthatchValues[2][2] = new BirdTurnValue(45.71)
;
pygmyNuthatchValues[2][3] = new BirdTurnValue(46.08)
;
pygmyNuthatchValues[2][4] = new BirdTurnValue(46.01)
;
pygmyNuthatchValues[2][5] = new BirdTurnValue(46.12)
;
pygmyNuthatchValues[2][6] = new BirdTurnValue(46.02)
;
pygmyNuthatchValues[2][7] = new BirdTurnValue(45.97)
;
pygmyNuthatchValues[3][1] = new BirdTurnValue(45.34)
;
pygmyNuthatchValues[3][2] = new BirdTurnValue(46.11)
;
pygmyNuthatchValues[3][3] = new BirdTurnValue(46.07)
;
pygmyNuthatchValues[3][4] = new BirdTurnValue(46.20)
;
pygmyNuthatchValues[3][5] = new BirdTurnValue(46.32)
;
pygmyNuthatchValues[3][6] = new BirdTurnValue(46.53)
;
pygmyNuthatchValues[4][1] = new BirdTurnValue(46.80)
;
pygmyNuthatchValues[4][2] = new BirdTurnValue(46.11)
;
pygmyNuthatchValues[4][3] = new BirdTurnValue(46.49)
;
pygmyNuthatchValues[4][4] = new BirdTurnValue(45.09)
;
pygmyNuthatchValues[4][5] = new BirdTurnValue(44.46)
;
map.put("Pygmy Nuthatch", pygmyNuthatchValues);

// Red-Bellied Woodpecker
BirdTurnValue[][] redBelliedWoodpeckerValues = new BirdTurnValue[5][9];
redBelliedWoodpeckerValues[1][1] = new BirdTurnValue(50.23)
;
redBelliedWoodpeckerValues[1][2] = new BirdTurnValue(51.15)
;
redBelliedWoodpeckerValues[1][3] = new BirdTurnValue(51.51)
;
redBelliedWoodpeckerValues[1][4] = new BirdTurnValue(51.27)
;
redBelliedWoodpeckerValues[1][5] = new BirdTurnValue(50.22)
;
redBelliedWoodpeckerValues[1][6] = new BirdTurnValue(50.39)
;
redBelliedWoodpeckerValues[1][7] = new BirdTurnValue(50.38)
;
redBelliedWoodpeckerValues[1][8] = new BirdTurnValue(50.13)
;
redBelliedWoodpeckerValues[2][1] = new BirdTurnValue(49.34)
;
redBelliedWoodpeckerValues[2][2] = new BirdTurnValue(48.64)
;
redBelliedWoodpeckerValues[2][3] = new BirdTurnValue(48.40)
;
redBelliedWoodpeckerValues[2][4] = new BirdTurnValue(48.20)
;
redBelliedWoodpeckerValues[2][5] = new BirdTurnValue(47.55)
;
redBelliedWoodpeckerValues[2][6] = new BirdTurnValue(46.94)
;
redBelliedWoodpeckerValues[2][7] = new BirdTurnValue(46.30)
;
redBelliedWoodpeckerValues[3][1] = new BirdTurnValue(46.00)
;
redBelliedWoodpeckerValues[3][2] = new BirdTurnValue(45.86)
;
redBelliedWoodpeckerValues[3][3] = new BirdTurnValue(45.37)
;
redBelliedWoodpeckerValues[3][4] = new BirdTurnValue(44.67)
;
redBelliedWoodpeckerValues[3][5] = new BirdTurnValue(44.17)
;
redBelliedWoodpeckerValues[3][6] = new BirdTurnValue(43.27)
;
redBelliedWoodpeckerValues[4][1] = new BirdTurnValue(43.43)
;
redBelliedWoodpeckerValues[4][2] = new BirdTurnValue(43.09)
;
redBelliedWoodpeckerValues[4][3] = new BirdTurnValue(43.05)
;
redBelliedWoodpeckerValues[4][4] = new BirdTurnValue(41.76)
;
redBelliedWoodpeckerValues[4][5] = new BirdTurnValue(40.95)
;
map.put("Red-Bellied Woodpecker", redBelliedWoodpeckerValues);

// Red-breasted Nuthatch
BirdTurnValue[][] redBreastedNuthatchValues = new BirdTurnValue[5][9];
redBreastedNuthatchValues[1][1] = new BirdTurnValue(51.25)
;
redBreastedNuthatchValues[1][2] = new BirdTurnValue(52.35)
;
redBreastedNuthatchValues[1][3] = new BirdTurnValue(52.36)
;
redBreastedNuthatchValues[1][4] = new BirdTurnValue(52.12)
;
redBreastedNuthatchValues[1][5] = new BirdTurnValue(51.66)
;
redBreastedNuthatchValues[1][6] = new BirdTurnValue(51.72)
;
redBreastedNuthatchValues[1][7] = new BirdTurnValue(51.36)
;
redBreastedNuthatchValues[1][8] = new BirdTurnValue(50.16)
;
redBreastedNuthatchValues[2][1] = new BirdTurnValue(50.09)
;
redBreastedNuthatchValues[2][2] = new BirdTurnValue(49.49)
;
redBreastedNuthatchValues[2][3] = new BirdTurnValue(49.91)
;
redBreastedNuthatchValues[2][4] = new BirdTurnValue(49.11)
;
redBreastedNuthatchValues[2][5] = new BirdTurnValue(47.80)
;
redBreastedNuthatchValues[2][6] = new BirdTurnValue(47.87)
;
redBreastedNuthatchValues[2][7] = new BirdTurnValue(47.56)
;
redBreastedNuthatchValues[3][1] = new BirdTurnValue(46.98)
;
redBreastedNuthatchValues[3][2] = new BirdTurnValue(46.04)
;
redBreastedNuthatchValues[3][3] = new BirdTurnValue(46.25)
;
redBreastedNuthatchValues[3][4] = new BirdTurnValue(45.32)
;
redBreastedNuthatchValues[3][5] = new BirdTurnValue(45.31)
;
redBreastedNuthatchValues[3][6] = new BirdTurnValue(44.43)
;
redBreastedNuthatchValues[4][1] = new BirdTurnValue(44.05)
;
redBreastedNuthatchValues[4][2] = new BirdTurnValue(43.46)
;
redBreastedNuthatchValues[4][3] = new BirdTurnValue(43.41)
;
redBreastedNuthatchValues[4][4] = new BirdTurnValue(42.40)
;
redBreastedNuthatchValues[4][5] = new BirdTurnValue(41.58)
;
map.put("Red-breasted Nuthatch", redBreastedNuthatchValues);

// Red-Eyed Vireo
BirdTurnValue[][] redEyedVireoValues = new BirdTurnValue[5][9];
redEyedVireoValues[1][1] = new BirdTurnValue(46.18)
;
redEyedVireoValues[1][2] = new BirdTurnValue(47.75)
;
redEyedVireoValues[1][3] = new BirdTurnValue(47.74)
;
redEyedVireoValues[1][4] = new BirdTurnValue(47.96)
;
redEyedVireoValues[1][5] = new BirdTurnValue(48.11)
;
redEyedVireoValues[1][6] = new BirdTurnValue(48.06)
;
redEyedVireoValues[1][7] = new BirdTurnValue(47.78)
;
redEyedVireoValues[1][8] = new BirdTurnValue(48.03)
;
redEyedVireoValues[2][1] = new BirdTurnValue(47.47)
;
redEyedVireoValues[2][2] = new BirdTurnValue(47.25)
;
redEyedVireoValues[2][3] = new BirdTurnValue(47.15)
;
redEyedVireoValues[2][4] = new BirdTurnValue(47.00)
;
redEyedVireoValues[2][5] = new BirdTurnValue(46.66)
;
redEyedVireoValues[2][6] = new BirdTurnValue(46.01)
;
redEyedVireoValues[2][7] = new BirdTurnValue(46.17)
;
redEyedVireoValues[3][1] = new BirdTurnValue(45.67)
;
redEyedVireoValues[3][2] = new BirdTurnValue(44.88)
;
redEyedVireoValues[3][3] = new BirdTurnValue(45.47)
;
redEyedVireoValues[3][4] = new BirdTurnValue(44.76)
;
redEyedVireoValues[3][5] = new BirdTurnValue(44.94)
;
redEyedVireoValues[3][6] = new BirdTurnValue(44.48)
;
redEyedVireoValues[4][1] = new BirdTurnValue(44.14)
;
redEyedVireoValues[4][2] = new BirdTurnValue(43.69)
;
redEyedVireoValues[4][3] = new BirdTurnValue(44.43)
;
redEyedVireoValues[4][4] = new BirdTurnValue(43.18)
;
redEyedVireoValues[4][5] = new BirdTurnValue(42.04)
;
map.put("Red-Eyed Vireo", redEyedVireoValues);

// Red-Headed Woodpecker
BirdTurnValue[][] redHeadedWoodpeckerValues = new BirdTurnValue[5][9];
redHeadedWoodpeckerValues[1][1] = new BirdTurnValue(51.21)
;
redHeadedWoodpeckerValues[1][2] = new BirdTurnValue(52.15)
;
redHeadedWoodpeckerValues[1][3] = new BirdTurnValue(51.79)
;
redHeadedWoodpeckerValues[1][4] = new BirdTurnValue(51.25)
;
redHeadedWoodpeckerValues[1][5] = new BirdTurnValue(50.51)
;
redHeadedWoodpeckerValues[1][6] = new BirdTurnValue(50.00)
;
redHeadedWoodpeckerValues[1][7] = new BirdTurnValue(49.03)
;
redHeadedWoodpeckerValues[1][8] = new BirdTurnValue(48.39)
;
redHeadedWoodpeckerValues[2][1] = new BirdTurnValue(48.23)
;
redHeadedWoodpeckerValues[2][2] = new BirdTurnValue(48.49)
;
redHeadedWoodpeckerValues[2][3] = new BirdTurnValue(47.90)
;
redHeadedWoodpeckerValues[2][4] = new BirdTurnValue(48.50)
;
redHeadedWoodpeckerValues[2][5] = new BirdTurnValue(48.26)
;
redHeadedWoodpeckerValues[2][6] = new BirdTurnValue(48.45)
;
redHeadedWoodpeckerValues[2][7] = new BirdTurnValue(47.50)
;
redHeadedWoodpeckerValues[3][1] = new BirdTurnValue(47.59)
;
redHeadedWoodpeckerValues[3][2] = new BirdTurnValue(47.77)
;
redHeadedWoodpeckerValues[3][3] = new BirdTurnValue(47.49)
;
redHeadedWoodpeckerValues[3][4] = new BirdTurnValue(47.64)
;
redHeadedWoodpeckerValues[3][5] = new BirdTurnValue(47.33)
;
redHeadedWoodpeckerValues[3][6] = new BirdTurnValue(46.79)
;
redHeadedWoodpeckerValues[4][1] = new BirdTurnValue(46.80)
;
redHeadedWoodpeckerValues[4][2] = new BirdTurnValue(47.26)
;
redHeadedWoodpeckerValues[4][3] = new BirdTurnValue(47.01)
;
redHeadedWoodpeckerValues[4][4] = new BirdTurnValue(45.75)
;
redHeadedWoodpeckerValues[4][5] = new BirdTurnValue(45.13)
;
map.put("Red-Headed Woodpecker", redHeadedWoodpeckerValues);

// Red-Shouldered Hawk
BirdTurnValue[][] redShoulderedHawkValues = new BirdTurnValue[5][9];
redShoulderedHawkValues[1][1] = new BirdTurnValue(50.27)
;
redShoulderedHawkValues[1][2] = new BirdTurnValue(51.22)
;
redShoulderedHawkValues[1][3] = new BirdTurnValue(51.49)
;
redShoulderedHawkValues[1][4] = new BirdTurnValue(51.88)
;
redShoulderedHawkValues[1][5] = new BirdTurnValue(51.00)
;
redShoulderedHawkValues[1][6] = new BirdTurnValue(51.15)
;
redShoulderedHawkValues[1][7] = new BirdTurnValue(50.83)
;
redShoulderedHawkValues[1][8] = new BirdTurnValue(50.56)
;
redShoulderedHawkValues[2][1] = new BirdTurnValue(50.26)
;
redShoulderedHawkValues[2][2] = new BirdTurnValue(50.01)
;
redShoulderedHawkValues[2][3] = new BirdTurnValue(49.22)
;
redShoulderedHawkValues[2][4] = new BirdTurnValue(49.09)
;
redShoulderedHawkValues[2][5] = new BirdTurnValue(48.53)
;
redShoulderedHawkValues[2][6] = new BirdTurnValue(48.35)
;
redShoulderedHawkValues[2][7] = new BirdTurnValue(47.37)
;
redShoulderedHawkValues[3][1] = new BirdTurnValue(47.16)
;
redShoulderedHawkValues[3][2] = new BirdTurnValue(46.70)
;
redShoulderedHawkValues[3][3] = new BirdTurnValue(46.67)
;
redShoulderedHawkValues[3][4] = new BirdTurnValue(46.11)
;
redShoulderedHawkValues[3][5] = new BirdTurnValue(45.80)
;
redShoulderedHawkValues[3][6] = new BirdTurnValue(44.40)
;
redShoulderedHawkValues[4][1] = new BirdTurnValue(45.35)
;
redShoulderedHawkValues[4][2] = new BirdTurnValue(44.42)
;
redShoulderedHawkValues[4][3] = new BirdTurnValue(44.29)
;
redShoulderedHawkValues[4][4] = new BirdTurnValue(42.78)
;
redShoulderedHawkValues[4][5] = new BirdTurnValue(42.45)
;
map.put("Red-Shouldered Hawk", redShoulderedHawkValues);

// Red-Tailed Hawk
BirdTurnValue[][] redTailedHawkValues = new BirdTurnValue[5][9];
redTailedHawkValues[1][1] = new BirdTurnValue(51.40)
;
redTailedHawkValues[1][2] = new BirdTurnValue(51.23)
;
redTailedHawkValues[1][3] = new BirdTurnValue(51.00)
;
redTailedHawkValues[1][4] = new BirdTurnValue(51.29)
;
redTailedHawkValues[1][5] = new BirdTurnValue(50.71)
;
redTailedHawkValues[1][6] = new BirdTurnValue(49.53)
;
redTailedHawkValues[1][7] = new BirdTurnValue(50.10)
;
redTailedHawkValues[1][8] = new BirdTurnValue(50.03)
;
redTailedHawkValues[2][1] = new BirdTurnValue(49.93)
;
redTailedHawkValues[2][2] = new BirdTurnValue(50.10)
;
redTailedHawkValues[2][3] = new BirdTurnValue(49.25)
;
redTailedHawkValues[2][4] = new BirdTurnValue(49.34)
;
redTailedHawkValues[2][5] = new BirdTurnValue(49.66)
;
redTailedHawkValues[2][6] = new BirdTurnValue(49.15)
;
redTailedHawkValues[2][7] = new BirdTurnValue(49.01)
;
redTailedHawkValues[3][1] = new BirdTurnValue(48.55)
;
redTailedHawkValues[3][2] = new BirdTurnValue(48.88)
;
redTailedHawkValues[3][3] = new BirdTurnValue(48.58)
;
redTailedHawkValues[3][4] = new BirdTurnValue(48.37)
;
redTailedHawkValues[3][5] = new BirdTurnValue(48.60)
;
redTailedHawkValues[3][6] = new BirdTurnValue(48.14)
;
redTailedHawkValues[4][1] = new BirdTurnValue(47.48)
;
redTailedHawkValues[4][2] = new BirdTurnValue(47.26)
;
redTailedHawkValues[4][3] = new BirdTurnValue(48.29)
;
redTailedHawkValues[4][4] = new BirdTurnValue(46.58)
;
redTailedHawkValues[4][5] = new BirdTurnValue(46.07)
;
map.put("Red-Tailed Hawk", redTailedHawkValues);

// Red-Winged Bluebird
BirdTurnValue[][] redWingedBluebirdValues = new BirdTurnValue[5][9];
redWingedBluebirdValues[1][1] = new BirdTurnValue(45.63)
;
redWingedBluebirdValues[1][2] = new BirdTurnValue(45.51)
;
redWingedBluebirdValues[1][3] = new BirdTurnValue(45.81)
;
redWingedBluebirdValues[1][4] = new BirdTurnValue(45.25)
;
redWingedBluebirdValues[1][5] = new BirdTurnValue(45.48)
;
redWingedBluebirdValues[1][6] = new BirdTurnValue(46.22)
;
redWingedBluebirdValues[1][7] = new BirdTurnValue(45.84)
;
redWingedBluebirdValues[1][8] = new BirdTurnValue(45.90)
;
redWingedBluebirdValues[2][1] = new BirdTurnValue(45.85)
;
redWingedBluebirdValues[2][2] = new BirdTurnValue(46.17)
;
redWingedBluebirdValues[2][3] = new BirdTurnValue(45.93)
;
redWingedBluebirdValues[2][4] = new BirdTurnValue(45.95)
;
redWingedBluebirdValues[2][5] = new BirdTurnValue(45.98)
;
redWingedBluebirdValues[2][6] = new BirdTurnValue(45.65)
;
redWingedBluebirdValues[2][7] = new BirdTurnValue(45.68)
;
redWingedBluebirdValues[3][1] = new BirdTurnValue(45.53)
;
redWingedBluebirdValues[3][2] = new BirdTurnValue(45.76)
;
redWingedBluebirdValues[3][3] = new BirdTurnValue(45.28)
;
redWingedBluebirdValues[3][4] = new BirdTurnValue(44.98)
;
redWingedBluebirdValues[3][5] = new BirdTurnValue(45.15)
;
redWingedBluebirdValues[3][6] = new BirdTurnValue(44.61)
;
redWingedBluebirdValues[4][1] = new BirdTurnValue(44.40)
;
redWingedBluebirdValues[4][2] = new BirdTurnValue(43.44)
;
redWingedBluebirdValues[4][3] = new BirdTurnValue(45.92)
;
redWingedBluebirdValues[4][4] = new BirdTurnValue(43.25)
;
redWingedBluebirdValues[4][5] = new BirdTurnValue(41.66)
;
map.put("Red-Winged Bluebird", redWingedBluebirdValues);

// Ring-Billed Gull
BirdTurnValue[][] ringBilledGullValues = new BirdTurnValue[5][9];
ringBilledGullValues[1][1] = new BirdTurnValue(47.76)
;
ringBilledGullValues[1][2] = new BirdTurnValue(48.54)
;
ringBilledGullValues[1][3] = new BirdTurnValue(48.63)
;
ringBilledGullValues[1][4] = new BirdTurnValue(48.32)
;
ringBilledGullValues[1][5] = new BirdTurnValue(47.82)
;
ringBilledGullValues[1][6] = new BirdTurnValue(47.71)
;
ringBilledGullValues[1][7] = new BirdTurnValue(47.29)
;
ringBilledGullValues[1][8] = new BirdTurnValue(47.57)
;
ringBilledGullValues[2][1] = new BirdTurnValue(47.46)
;
ringBilledGullValues[2][2] = new BirdTurnValue(47.47)
;
ringBilledGullValues[2][3] = new BirdTurnValue(47.46)
;
ringBilledGullValues[2][4] = new BirdTurnValue(47.28)
;
ringBilledGullValues[2][5] = new BirdTurnValue(47.30)
;
ringBilledGullValues[2][6] = new BirdTurnValue(47.33)
;
ringBilledGullValues[2][7] = new BirdTurnValue(47.38)
;
ringBilledGullValues[3][1] = new BirdTurnValue(47.24)
;
ringBilledGullValues[3][2] = new BirdTurnValue(47.60)
;
ringBilledGullValues[3][3] = new BirdTurnValue(46.81)
;
ringBilledGullValues[3][4] = new BirdTurnValue(47.23)
;
ringBilledGullValues[3][5] = new BirdTurnValue(46.66)
;
ringBilledGullValues[3][6] = new BirdTurnValue(47.24)
;
ringBilledGullValues[4][1] = new BirdTurnValue(46.62)
;
ringBilledGullValues[4][2] = new BirdTurnValue(46.69)
;
ringBilledGullValues[4][3] = new BirdTurnValue(47.40)
;
ringBilledGullValues[4][4] = new BirdTurnValue(45.68)
;
ringBilledGullValues[4][5] = new BirdTurnValue(45.65)
;
map.put("Ring-Billed Gull", ringBilledGullValues);

// Rose-breasted Grosbeak
BirdTurnValue[][] roseBreastedGrosbeakValues = new BirdTurnValue[5][9];
roseBreastedGrosbeakValues[1][1] = new BirdTurnValue(52.96)
;
roseBreastedGrosbeakValues[1][2] = new BirdTurnValue(55.87)
;
roseBreastedGrosbeakValues[1][3] = new BirdTurnValue(55.29)
;
roseBreastedGrosbeakValues[1][4] = new BirdTurnValue(54.35)
;
roseBreastedGrosbeakValues[1][5] = new BirdTurnValue(53.49)
;
roseBreastedGrosbeakValues[1][6] = new BirdTurnValue(52.93)
;
roseBreastedGrosbeakValues[1][7] = new BirdTurnValue(51.62)
;
roseBreastedGrosbeakValues[1][8] = new BirdTurnValue(50.56)
;
roseBreastedGrosbeakValues[2][1] = new BirdTurnValue(50.32)
;
roseBreastedGrosbeakValues[2][2] = new BirdTurnValue(50.16)
;
roseBreastedGrosbeakValues[2][3] = new BirdTurnValue(49.21)
;
roseBreastedGrosbeakValues[2][4] = new BirdTurnValue(48.99)
;
roseBreastedGrosbeakValues[2][5] = new BirdTurnValue(48.16)
;
roseBreastedGrosbeakValues[2][6] = new BirdTurnValue(48.97)
;
roseBreastedGrosbeakValues[2][7] = new BirdTurnValue(48.98)
;
roseBreastedGrosbeakValues[3][1] = new BirdTurnValue(47.84)
;
roseBreastedGrosbeakValues[3][2] = new BirdTurnValue(48.44)
;
roseBreastedGrosbeakValues[3][3] = new BirdTurnValue(47.74)
;
roseBreastedGrosbeakValues[3][4] = new BirdTurnValue(47.83)
;
roseBreastedGrosbeakValues[3][5] = new BirdTurnValue(47.65)
;
roseBreastedGrosbeakValues[3][6] = new BirdTurnValue(47.65)
;
roseBreastedGrosbeakValues[4][1] = new BirdTurnValue(47.06)
;
roseBreastedGrosbeakValues[4][2] = new BirdTurnValue(47.09)
;
roseBreastedGrosbeakValues[4][3] = new BirdTurnValue(47.63)
;
roseBreastedGrosbeakValues[4][4] = new BirdTurnValue(46.05)
;
roseBreastedGrosbeakValues[4][5] = new BirdTurnValue(45.47)
;
map.put("Rose-breasted Grosbeak", roseBreastedGrosbeakValues);

// Ruby-Crowned Kinglet
BirdTurnValue[][] rubyCrownedKingletValues = new BirdTurnValue[5][9];
rubyCrownedKingletValues[1][1] = new BirdTurnValue(45.14)
;
rubyCrownedKingletValues[1][2] = new BirdTurnValue(46.68)
;
rubyCrownedKingletValues[1][3] = new BirdTurnValue(47.03)
;
rubyCrownedKingletValues[1][4] = new BirdTurnValue(46.78)
;
rubyCrownedKingletValues[1][5] = new BirdTurnValue(46.87)
;
rubyCrownedKingletValues[1][6] = new BirdTurnValue(47.24)
;
rubyCrownedKingletValues[1][7] = new BirdTurnValue(46.74)
;
rubyCrownedKingletValues[1][8] = new BirdTurnValue(46.53)
;
rubyCrownedKingletValues[2][1] = new BirdTurnValue(46.54)
;
rubyCrownedKingletValues[2][2] = new BirdTurnValue(46.06)
;
rubyCrownedKingletValues[2][3] = new BirdTurnValue(46.15)
;
rubyCrownedKingletValues[2][4] = new BirdTurnValue(45.75)
;
rubyCrownedKingletValues[2][5] = new BirdTurnValue(45.54)
;
rubyCrownedKingletValues[2][6] = new BirdTurnValue(45.84)
;
rubyCrownedKingletValues[2][7] = new BirdTurnValue(45.28)
;
rubyCrownedKingletValues[3][1] = new BirdTurnValue(45.03)
;
rubyCrownedKingletValues[3][2] = new BirdTurnValue(44.78)
;
rubyCrownedKingletValues[3][3] = new BirdTurnValue(44.12)
;
rubyCrownedKingletValues[3][4] = new BirdTurnValue(44.11)
;
rubyCrownedKingletValues[3][5] = new BirdTurnValue(44.27)
;
rubyCrownedKingletValues[3][6] = new BirdTurnValue(44.12)
;
rubyCrownedKingletValues[4][1] = new BirdTurnValue(43.95)
;
rubyCrownedKingletValues[4][2] = new BirdTurnValue(42.74)
;
rubyCrownedKingletValues[4][3] = new BirdTurnValue(43.93)
;
rubyCrownedKingletValues[4][4] = new BirdTurnValue(42.87)
;
rubyCrownedKingletValues[4][5] = new BirdTurnValue(41.29)
;
map.put("Ruby-Crowned Kinglet", rubyCrownedKingletValues);

// Rudy Duck
BirdTurnValue[][] rudyDuckValues = new BirdTurnValue[5][9];
rudyDuckValues[1][1] = new BirdTurnValue(38.43)
;
rudyDuckValues[1][2] = new BirdTurnValue(38.81)
;
rudyDuckValues[1][3] = new BirdTurnValue(39.20)
;
rudyDuckValues[1][4] = new BirdTurnValue(39.47)
;
rudyDuckValues[1][5] = new BirdTurnValue(40.15)
;
rudyDuckValues[1][6] = new BirdTurnValue(40.39)
;
rudyDuckValues[1][7] = new BirdTurnValue(41.26)
;
rudyDuckValues[1][8] = new BirdTurnValue(41.90)
;
rudyDuckValues[2][1] = new BirdTurnValue(41.67)
;
rudyDuckValues[2][2] = new BirdTurnValue(42.21)
;
rudyDuckValues[2][3] = new BirdTurnValue(42.58)
;
rudyDuckValues[2][4] = new BirdTurnValue(42.95)
;
rudyDuckValues[2][5] = new BirdTurnValue(42.50)
;
rudyDuckValues[2][6] = new BirdTurnValue(42.68)
;
rudyDuckValues[2][7] = new BirdTurnValue(42.46)
;
rudyDuckValues[3][1] = new BirdTurnValue(42.46)
;
rudyDuckValues[3][2] = new BirdTurnValue(42.57)
;
rudyDuckValues[3][3] = new BirdTurnValue(42.25)
;
rudyDuckValues[3][4] = new BirdTurnValue(42.38)
;
rudyDuckValues[3][5] = new BirdTurnValue(42.01)
;
rudyDuckValues[3][6] = new BirdTurnValue(42.27)
;
rudyDuckValues[4][1] = new BirdTurnValue(41.41)
;
rudyDuckValues[4][2] = new BirdTurnValue(41.48)
;
rudyDuckValues[4][3] = new BirdTurnValue(42.39)
;
rudyDuckValues[4][4] = new BirdTurnValue(40.72)
;
rudyDuckValues[4][5] = new BirdTurnValue(40.78)
;
map.put("Rudy Duck", rudyDuckValues);

// Sandhill Crane
BirdTurnValue[][] sandhillCraneValues = new BirdTurnValue[5][9];
sandhillCraneValues[1][1] = new BirdTurnValue(48.58)
;
sandhillCraneValues[1][2] = new BirdTurnValue(51.53)
;
sandhillCraneValues[1][3] = new BirdTurnValue(50.76)
;
sandhillCraneValues[1][4] = new BirdTurnValue(50.77)
;
sandhillCraneValues[1][5] = new BirdTurnValue(50.21)
;
sandhillCraneValues[1][6] = new BirdTurnValue(49.18)
;
sandhillCraneValues[1][7] = new BirdTurnValue(48.67)
;
sandhillCraneValues[1][8] = new BirdTurnValue(48.48)
;
sandhillCraneValues[2][1] = new BirdTurnValue(48.59)
;
sandhillCraneValues[2][2] = new BirdTurnValue(48.50)
;
sandhillCraneValues[2][3] = new BirdTurnValue(48.28)
;
sandhillCraneValues[2][4] = new BirdTurnValue(48.35)
;
sandhillCraneValues[2][5] = new BirdTurnValue(48.23)
;
sandhillCraneValues[2][6] = new BirdTurnValue(47.93)
;
sandhillCraneValues[2][7] = new BirdTurnValue(48.43)
;
sandhillCraneValues[3][1] = new BirdTurnValue(47.79)
;
sandhillCraneValues[3][2] = new BirdTurnValue(47.81)
;
sandhillCraneValues[3][3] = new BirdTurnValue(47.99)
;
sandhillCraneValues[3][4] = new BirdTurnValue(47.92)
;
sandhillCraneValues[3][5] = new BirdTurnValue(48.12)
;
sandhillCraneValues[3][6] = new BirdTurnValue(47.47)
;
sandhillCraneValues[4][1] = new BirdTurnValue(47.14)
;
sandhillCraneValues[4][2] = new BirdTurnValue(47.32)
;
sandhillCraneValues[4][3] = new BirdTurnValue(47.64)
;
sandhillCraneValues[4][4] = new BirdTurnValue(45.96)
;
sandhillCraneValues[4][5] = new BirdTurnValue(45.81)
;
map.put("Sandhill Crane", sandhillCraneValues);

// Savannah Sparrow
BirdTurnValue[][] savannahSparrowValues = new BirdTurnValue[5][9];
savannahSparrowValues[1][1] = new BirdTurnValue(44.67)
;
savannahSparrowValues[1][2] = new BirdTurnValue(45.03)
;
savannahSparrowValues[1][3] = new BirdTurnValue(45.39)
;
savannahSparrowValues[1][4] = new BirdTurnValue(45.26)
;
savannahSparrowValues[1][5] = new BirdTurnValue(45.58)
;
savannahSparrowValues[1][6] = new BirdTurnValue(45.80)
;
savannahSparrowValues[1][7] = new BirdTurnValue(45.17)
;
savannahSparrowValues[1][8] = new BirdTurnValue(45.62)
;
savannahSparrowValues[2][1] = new BirdTurnValue(45.97)
;
savannahSparrowValues[2][2] = new BirdTurnValue(45.97)
;
savannahSparrowValues[2][3] = new BirdTurnValue(45.81)
;
savannahSparrowValues[2][4] = new BirdTurnValue(45.82)
;
savannahSparrowValues[2][5] = new BirdTurnValue(45.27)
;
savannahSparrowValues[2][6] = new BirdTurnValue(45.46)
;
savannahSparrowValues[2][7] = new BirdTurnValue(45.14)
;
savannahSparrowValues[3][1] = new BirdTurnValue(44.77)
;
savannahSparrowValues[3][2] = new BirdTurnValue(45.24)
;
savannahSparrowValues[3][3] = new BirdTurnValue(45.27)
;
savannahSparrowValues[3][4] = new BirdTurnValue(44.97)
;
savannahSparrowValues[3][5] = new BirdTurnValue(45.03)
;
savannahSparrowValues[3][6] = new BirdTurnValue(44.55)
;
savannahSparrowValues[4][1] = new BirdTurnValue(44.20)
;
savannahSparrowValues[4][2] = new BirdTurnValue(43.88)
;
savannahSparrowValues[4][3] = new BirdTurnValue(44.81)
;
savannahSparrowValues[4][4] = new BirdTurnValue(43.44)
;
savannahSparrowValues[4][5] = new BirdTurnValue(42.53)
;
map.put("Savannah Sparrow", savannahSparrowValues);

// Snowy Egret
BirdTurnValue[][] snowyEgretValues = new BirdTurnValue[5][9];
snowyEgretValues[1][1] = new BirdTurnValue(51.37)
;
snowyEgretValues[1][2] = new BirdTurnValue(51.30)
;
snowyEgretValues[1][3] = new BirdTurnValue(51.37)
;
snowyEgretValues[1][4] = new BirdTurnValue(50.78)
;
snowyEgretValues[1][5] = new BirdTurnValue(50.50)
;
snowyEgretValues[1][6] = new BirdTurnValue(49.86)
;
snowyEgretValues[1][7] = new BirdTurnValue(49.21)
;
snowyEgretValues[1][8] = new BirdTurnValue(48.74)
;
snowyEgretValues[2][1] = new BirdTurnValue(49.15)
;
snowyEgretValues[2][2] = new BirdTurnValue(48.38)
;
snowyEgretValues[2][3] = new BirdTurnValue(48.00)
;
snowyEgretValues[2][4] = new BirdTurnValue(47.99)
;
snowyEgretValues[2][5] = new BirdTurnValue(47.50)
;
snowyEgretValues[2][6] = new BirdTurnValue(47.11)
;
snowyEgretValues[2][7] = new BirdTurnValue(46.67)
;
snowyEgretValues[3][1] = new BirdTurnValue(46.63)
;
snowyEgretValues[3][2] = new BirdTurnValue(46.59)
;
snowyEgretValues[3][3] = new BirdTurnValue(46.19)
;
snowyEgretValues[3][4] = new BirdTurnValue(45.55)
;
snowyEgretValues[3][5] = new BirdTurnValue(45.66)
;
snowyEgretValues[3][6] = new BirdTurnValue(45.10)
;
snowyEgretValues[4][1] = new BirdTurnValue(44.57)
;
snowyEgretValues[4][2] = new BirdTurnValue(44.12)
;
snowyEgretValues[4][3] = new BirdTurnValue(44.92)
;
snowyEgretValues[4][4] = new BirdTurnValue(43.58)
;
snowyEgretValues[4][5] = new BirdTurnValue(42.36)
;
map.put("Snowy Egret", snowyEgretValues);

// Song Sparrow
BirdTurnValue[][] songSparrowValues = new BirdTurnValue[5][9];
songSparrowValues[1][1] = new BirdTurnValue(43.06)
;
songSparrowValues[1][2] = new BirdTurnValue(43.41)
;
songSparrowValues[1][3] = new BirdTurnValue(43.21)
;
songSparrowValues[1][4] = new BirdTurnValue(43.63)
;
songSparrowValues[1][5] = new BirdTurnValue(43.87)
;
songSparrowValues[1][6] = new BirdTurnValue(43.94)
;
songSparrowValues[1][7] = new BirdTurnValue(43.87)
;
songSparrowValues[1][8] = new BirdTurnValue(44.46)
;
songSparrowValues[2][1] = new BirdTurnValue(43.78)
;
songSparrowValues[2][2] = new BirdTurnValue(44.25)
;
songSparrowValues[2][3] = new BirdTurnValue(44.46)
;
songSparrowValues[2][4] = new BirdTurnValue(44.30)
;
songSparrowValues[2][5] = new BirdTurnValue(44.35)
;
songSparrowValues[2][6] = new BirdTurnValue(43.16)
;
songSparrowValues[2][7] = new BirdTurnValue(43.39)
;
songSparrowValues[3][1] = new BirdTurnValue(43.73)
;
songSparrowValues[3][2] = new BirdTurnValue(43.57)
;
songSparrowValues[3][3] = new BirdTurnValue(42.54)
;
songSparrowValues[3][4] = new BirdTurnValue(43.07)
;
songSparrowValues[3][5] = new BirdTurnValue(42.52)
;
songSparrowValues[3][6] = new BirdTurnValue(42.34)
;
songSparrowValues[4][1] = new BirdTurnValue(41.94)
;
songSparrowValues[4][2] = new BirdTurnValue(42.05)
;
songSparrowValues[4][3] = new BirdTurnValue(42.82)
;
songSparrowValues[4][4] = new BirdTurnValue(41.28)
;
songSparrowValues[4][5] = new BirdTurnValue(40.56)
;
map.put("Song Sparrow", songSparrowValues);

// Spotted Towhee
BirdTurnValue[][] spottedTowheeValues = new BirdTurnValue[5][9];
spottedTowheeValues[1][1] = new BirdTurnValue(47.69)
;
spottedTowheeValues[1][2] = new BirdTurnValue(47.41)
;
spottedTowheeValues[1][3] = new BirdTurnValue(47.28)
;
spottedTowheeValues[1][4] = new BirdTurnValue(47.68)
;
spottedTowheeValues[1][5] = new BirdTurnValue(47.65)
;
spottedTowheeValues[1][6] = new BirdTurnValue(47.11)
;
spottedTowheeValues[1][7] = new BirdTurnValue(47.49)
;
spottedTowheeValues[1][8] = new BirdTurnValue(47.09)
;
spottedTowheeValues[2][1] = new BirdTurnValue(46.44)
;
spottedTowheeValues[2][2] = new BirdTurnValue(46.28)
;
spottedTowheeValues[2][3] = new BirdTurnValue(46.06)
;
spottedTowheeValues[2][4] = new BirdTurnValue(46.24)
;
spottedTowheeValues[2][5] = new BirdTurnValue(46.12)
;
spottedTowheeValues[2][6] = new BirdTurnValue(45.13)
;
spottedTowheeValues[2][7] = new BirdTurnValue(45.16)
;
spottedTowheeValues[3][1] = new BirdTurnValue(44.79)
;
spottedTowheeValues[3][2] = new BirdTurnValue(44.48)
;
spottedTowheeValues[3][3] = new BirdTurnValue(43.46)
;
spottedTowheeValues[3][4] = new BirdTurnValue(43.41)
;
spottedTowheeValues[3][5] = new BirdTurnValue(42.76)
;
spottedTowheeValues[3][6] = new BirdTurnValue(43.25)
;
spottedTowheeValues[4][1] = new BirdTurnValue(42.93)
;
spottedTowheeValues[4][2] = new BirdTurnValue(41.86)
;
spottedTowheeValues[4][3] = new BirdTurnValue(42.22)
;
spottedTowheeValues[4][4] = new BirdTurnValue(41.87)
;
spottedTowheeValues[4][5] = new BirdTurnValue(41.12)
;
map.put("Spotted Towhee", spottedTowheeValues);

// Steller’s Jay
BirdTurnValue[][] stellersJayValues = new BirdTurnValue[5][9];
stellersJayValues[1][1] = new BirdTurnValue(52.26)
;
stellersJayValues[1][2] = new BirdTurnValue(54.79)
;
stellersJayValues[1][3] = new BirdTurnValue(53.96)
;
stellersJayValues[1][4] = new BirdTurnValue(53.59)
;
stellersJayValues[1][5] = new BirdTurnValue(52.52)
;
stellersJayValues[1][6] = new BirdTurnValue(51.82)
;
stellersJayValues[1][7] = new BirdTurnValue(50.20)
;
stellersJayValues[1][8] = new BirdTurnValue(50.18)
;
stellersJayValues[2][1] = new BirdTurnValue(49.26)
;
stellersJayValues[2][2] = new BirdTurnValue(48.73)
;
stellersJayValues[2][3] = new BirdTurnValue(48.94)
;
stellersJayValues[2][4] = new BirdTurnValue(48.46)
;
stellersJayValues[2][5] = new BirdTurnValue(47.75)
;
stellersJayValues[2][6] = new BirdTurnValue(48.30)
;
stellersJayValues[2][7] = new BirdTurnValue(47.79)
;
stellersJayValues[3][1] = new BirdTurnValue(47.37)
;
stellersJayValues[3][2] = new BirdTurnValue(47.81)
;
stellersJayValues[3][3] = new BirdTurnValue(47.96)
;
stellersJayValues[3][4] = new BirdTurnValue(46.88)
;
stellersJayValues[3][5] = new BirdTurnValue(47.15)
;
stellersJayValues[3][6] = new BirdTurnValue(47.28)
;
stellersJayValues[4][1] = new BirdTurnValue(47.08)
;
stellersJayValues[4][2] = new BirdTurnValue(46.78)
;
stellersJayValues[4][3] = new BirdTurnValue(46.80)
;
stellersJayValues[4][4] = new BirdTurnValue(45.44)
;
stellersJayValues[4][5] = new BirdTurnValue(45.39)
;
map.put("Steller’s Jay", stellersJayValues);

// Swainson’s Hawk
BirdTurnValue[][] swainsonsHawkValues = new BirdTurnValue[5][9];
swainsonsHawkValues[1][1] = new BirdTurnValue(49.59)
;
swainsonsHawkValues[1][2] = new BirdTurnValue(50.71)
;
swainsonsHawkValues[1][3] = new BirdTurnValue(50.47)
;
swainsonsHawkValues[1][4] = new BirdTurnValue(50.47)
;
swainsonsHawkValues[1][5] = new BirdTurnValue(50.08)
;
swainsonsHawkValues[1][6] = new BirdTurnValue(50.07)
;
swainsonsHawkValues[1][7] = new BirdTurnValue(49.40)
;
swainsonsHawkValues[1][8] = new BirdTurnValue(49.99)
;
swainsonsHawkValues[2][1] = new BirdTurnValue(49.74)
;
swainsonsHawkValues[2][2] = new BirdTurnValue(49.27)
;
swainsonsHawkValues[2][3] = new BirdTurnValue(49.88)
;
swainsonsHawkValues[2][4] = new BirdTurnValue(49.64)
;
swainsonsHawkValues[2][5] = new BirdTurnValue(48.77)
;
swainsonsHawkValues[2][6] = new BirdTurnValue(49.49)
;
swainsonsHawkValues[2][7] = new BirdTurnValue(49.00)
;
swainsonsHawkValues[3][1] = new BirdTurnValue(48.84)
;
swainsonsHawkValues[3][2] = new BirdTurnValue(49.23)
;
swainsonsHawkValues[3][3] = new BirdTurnValue(49.17)
;
swainsonsHawkValues[3][4] = new BirdTurnValue(48.39)
;
swainsonsHawkValues[3][5] = new BirdTurnValue(48.51)
;
swainsonsHawkValues[3][6] = new BirdTurnValue(48.55)
;
swainsonsHawkValues[4][1] = new BirdTurnValue(48.22)
;
swainsonsHawkValues[4][2] = new BirdTurnValue(47.70)
;
swainsonsHawkValues[4][3] = new BirdTurnValue(48.93)
;
swainsonsHawkValues[4][4] = new BirdTurnValue(46.90)
;
swainsonsHawkValues[4][5] = new BirdTurnValue(45.93)
;
map.put("Swainson’s Hawk", swainsonsHawkValues);

// Tree Swallow
BirdTurnValue[][] treeSwallowValues = new BirdTurnValue[5][9];
treeSwallowValues[1][1] = new BirdTurnValue(46.86)
;
treeSwallowValues[1][2] = new BirdTurnValue(47.41)
;
treeSwallowValues[1][3] = new BirdTurnValue(47.69)
;
treeSwallowValues[1][4] = new BirdTurnValue(47.81)
;
treeSwallowValues[1][5] = new BirdTurnValue(47.38)
;
treeSwallowValues[1][6] = new BirdTurnValue(46.70)
;
treeSwallowValues[1][7] = new BirdTurnValue(46.87)
;
treeSwallowValues[1][8] = new BirdTurnValue(46.52)
;
treeSwallowValues[2][1] = new BirdTurnValue(46.43)
;
treeSwallowValues[2][2] = new BirdTurnValue(47.10)
;
treeSwallowValues[2][3] = new BirdTurnValue(46.66)
;
treeSwallowValues[2][4] = new BirdTurnValue(47.13)
;
treeSwallowValues[2][5] = new BirdTurnValue(46.86)
;
treeSwallowValues[2][6] = new BirdTurnValue(46.59)
;
treeSwallowValues[2][7] = new BirdTurnValue(46.71)
;
treeSwallowValues[3][1] = new BirdTurnValue(46.98)
;
treeSwallowValues[3][2] = new BirdTurnValue(46.57)
;
treeSwallowValues[3][3] = new BirdTurnValue(46.45)
;
treeSwallowValues[3][4] = new BirdTurnValue(46.57)
;
treeSwallowValues[3][5] = new BirdTurnValue(46.37)
;
treeSwallowValues[3][6] = new BirdTurnValue(46.76)
;
treeSwallowValues[4][1] = new BirdTurnValue(46.40)
;
treeSwallowValues[4][2] = new BirdTurnValue(46.35)
;
treeSwallowValues[4][3] = new BirdTurnValue(46.40)
;
treeSwallowValues[4][4] = new BirdTurnValue(44.84)
;
treeSwallowValues[4][5] = new BirdTurnValue(45.01)
;
map.put("Tree Swallow", treeSwallowValues);

// Trumpeter Swan
BirdTurnValue[][] trumpeterSwanValues = new BirdTurnValue[5][9];
trumpeterSwanValues[1][1] = new BirdTurnValue(47.19)
;
trumpeterSwanValues[1][2] = new BirdTurnValue(50.53)
;
trumpeterSwanValues[1][3] = new BirdTurnValue(50.13)
;
trumpeterSwanValues[1][4] = new BirdTurnValue(50.20)
;
trumpeterSwanValues[1][5] = new BirdTurnValue(50.56)
;
trumpeterSwanValues[1][6] = new BirdTurnValue(49.59)
;
trumpeterSwanValues[1][7] = new BirdTurnValue(48.99)
;
trumpeterSwanValues[1][8] = new BirdTurnValue(48.83)
;
trumpeterSwanValues[2][1] = new BirdTurnValue(48.50)
;
trumpeterSwanValues[2][2] = new BirdTurnValue(49.24)
;
trumpeterSwanValues[2][3] = new BirdTurnValue(48.98)
;
trumpeterSwanValues[2][4] = new BirdTurnValue(48.66)
;
trumpeterSwanValues[2][5] = new BirdTurnValue(48.79)
;
trumpeterSwanValues[2][6] = new BirdTurnValue(48.62)
;
trumpeterSwanValues[2][7] = new BirdTurnValue(48.04)
;
trumpeterSwanValues[3][1] = new BirdTurnValue(48.02)
;
trumpeterSwanValues[3][2] = new BirdTurnValue(48.71)
;
trumpeterSwanValues[3][3] = new BirdTurnValue(48.29)
;
trumpeterSwanValues[3][4] = new BirdTurnValue(48.13)
;
trumpeterSwanValues[3][5] = new BirdTurnValue(48.06)
;
trumpeterSwanValues[3][6] = new BirdTurnValue(48.41)
;
trumpeterSwanValues[4][1] = new BirdTurnValue(48.39)
;
trumpeterSwanValues[4][2] = new BirdTurnValue(47.97)
;
trumpeterSwanValues[4][3] = new BirdTurnValue(48.14)
;
trumpeterSwanValues[4][4] = new BirdTurnValue(46.86)
;
trumpeterSwanValues[4][5] = new BirdTurnValue(46.55)
;
map.put("Trumpeter Swan", trumpeterSwanValues);

// Tufted Titmouse
BirdTurnValue[][] tuftedTitmouseValues = new BirdTurnValue[5][9];
tuftedTitmouseValues[1][1] = new BirdTurnValue(45.66)
;
tuftedTitmouseValues[1][2] = new BirdTurnValue(46.16)
;
tuftedTitmouseValues[1][3] = new BirdTurnValue(46.65)
;
tuftedTitmouseValues[1][4] = new BirdTurnValue(46.98)
;
tuftedTitmouseValues[1][5] = new BirdTurnValue(47.27)
;
tuftedTitmouseValues[1][6] = new BirdTurnValue(47.47)
;
tuftedTitmouseValues[1][7] = new BirdTurnValue(47.34)
;
tuftedTitmouseValues[1][8] = new BirdTurnValue(47.06)
;
tuftedTitmouseValues[2][1] = new BirdTurnValue(46.99)
;
tuftedTitmouseValues[2][2] = new BirdTurnValue(46.58)
;
tuftedTitmouseValues[2][3] = new BirdTurnValue(46.32)
;
tuftedTitmouseValues[2][4] = new BirdTurnValue(45.66)
;
tuftedTitmouseValues[2][5] = new BirdTurnValue(45.87)
;
tuftedTitmouseValues[2][6] = new BirdTurnValue(45.58)
;
tuftedTitmouseValues[2][7] = new BirdTurnValue(45.27)
;
tuftedTitmouseValues[3][1] = new BirdTurnValue(45.27)
;
tuftedTitmouseValues[3][2] = new BirdTurnValue(45.05)
;
tuftedTitmouseValues[3][3] = new BirdTurnValue(44.54)
;
tuftedTitmouseValues[3][4] = new BirdTurnValue(44.22)
;
tuftedTitmouseValues[3][5] = new BirdTurnValue(44.01)
;
tuftedTitmouseValues[3][6] = new BirdTurnValue(43.57)
;
tuftedTitmouseValues[4][1] = new BirdTurnValue(43.77)
;
tuftedTitmouseValues[4][2] = new BirdTurnValue(43.07)
;
tuftedTitmouseValues[4][3] = new BirdTurnValue(44.04)
;
tuftedTitmouseValues[4][4] = new BirdTurnValue(42.47)
;
tuftedTitmouseValues[4][5] = new BirdTurnValue(41.87)
;
map.put("Tufted Titmouse", tuftedTitmouseValues);

// Violet Green-Swallow
BirdTurnValue[][] violetGreenSwallowValues = new BirdTurnValue[5][9];
violetGreenSwallowValues[1][1] = new BirdTurnValue(47.75)
;
violetGreenSwallowValues[1][2] = new BirdTurnValue(48.08)
;
violetGreenSwallowValues[1][3] = new BirdTurnValue(48.41)
;
violetGreenSwallowValues[1][4] = new BirdTurnValue(48.53)
;
violetGreenSwallowValues[1][5] = new BirdTurnValue(47.51)
;
violetGreenSwallowValues[1][6] = new BirdTurnValue(47.45)
;
violetGreenSwallowValues[1][7] = new BirdTurnValue(47.28)
;
violetGreenSwallowValues[1][8] = new BirdTurnValue(47.28)
;
violetGreenSwallowValues[2][1] = new BirdTurnValue(47.44)
;
violetGreenSwallowValues[2][2] = new BirdTurnValue(47.63)
;
violetGreenSwallowValues[2][3] = new BirdTurnValue(47.28)
;
violetGreenSwallowValues[2][4] = new BirdTurnValue(47.44)
;
violetGreenSwallowValues[2][5] = new BirdTurnValue(47.08)
;
violetGreenSwallowValues[2][6] = new BirdTurnValue(47.60)
;
violetGreenSwallowValues[2][7] = new BirdTurnValue(47.61)
;
violetGreenSwallowValues[3][1] = new BirdTurnValue(47.07)
;
violetGreenSwallowValues[3][2] = new BirdTurnValue(47.46)
;
violetGreenSwallowValues[3][3] = new BirdTurnValue(46.94)
;
violetGreenSwallowValues[3][4] = new BirdTurnValue(47.47)
;
violetGreenSwallowValues[3][5] = new BirdTurnValue(47.10)
;
violetGreenSwallowValues[3][6] = new BirdTurnValue(47.41)
;
violetGreenSwallowValues[4][1] = new BirdTurnValue(46.40)
;
violetGreenSwallowValues[4][2] = new BirdTurnValue(46.57)
;
violetGreenSwallowValues[4][3] = new BirdTurnValue(47.00)
;
violetGreenSwallowValues[4][4] = new BirdTurnValue(45.45)
;
violetGreenSwallowValues[4][5] = new BirdTurnValue(45.01)
;
map.put("Violet Green-Swallow", violetGreenSwallowValues);

// White-breasted Nuthatch
BirdTurnValue[][] whiteBreastedNuthatchValues = new BirdTurnValue[5][9];
whiteBreastedNuthatchValues[1][1] = new BirdTurnValue(51.47)
;
whiteBreastedNuthatchValues[1][2] = new BirdTurnValue(51.56)
;
whiteBreastedNuthatchValues[1][3] = new BirdTurnValue(52.52)
;
whiteBreastedNuthatchValues[1][4] = new BirdTurnValue(52.17)
;
whiteBreastedNuthatchValues[1][5] = new BirdTurnValue(51.71)
;
whiteBreastedNuthatchValues[1][6] = new BirdTurnValue(51.59)
;
whiteBreastedNuthatchValues[1][7] = new BirdTurnValue(50.57)
;
whiteBreastedNuthatchValues[1][8] = new BirdTurnValue(50.82)
;
whiteBreastedNuthatchValues[2][1] = new BirdTurnValue(50.59)
;
whiteBreastedNuthatchValues[2][2] = new BirdTurnValue(50.24)
;
whiteBreastedNuthatchValues[2][3] = new BirdTurnValue(49.43)
;
whiteBreastedNuthatchValues[2][4] = new BirdTurnValue(48.59)
;
whiteBreastedNuthatchValues[2][5] = new BirdTurnValue(48.51)
;
whiteBreastedNuthatchValues[2][6] = new BirdTurnValue(47.69)
;
whiteBreastedNuthatchValues[2][7] = new BirdTurnValue(46.78)
;
whiteBreastedNuthatchValues[3][1] = new BirdTurnValue(47.11)
;
whiteBreastedNuthatchValues[3][2] = new BirdTurnValue(46.51)
;
whiteBreastedNuthatchValues[3][3] = new BirdTurnValue(45.82)
;
whiteBreastedNuthatchValues[3][4] = new BirdTurnValue(45.59)
;
whiteBreastedNuthatchValues[3][5] = new BirdTurnValue(45.49)
;
whiteBreastedNuthatchValues[3][6] = new BirdTurnValue(45.12)
;
whiteBreastedNuthatchValues[4][1] = new BirdTurnValue(43.89)
;
whiteBreastedNuthatchValues[4][2] = new BirdTurnValue(43.08)
;
whiteBreastedNuthatchValues[4][3] = new BirdTurnValue(43.91)
;
whiteBreastedNuthatchValues[4][4] = new BirdTurnValue(42.67)
;
whiteBreastedNuthatchValues[4][5] = new BirdTurnValue(42.33)
;
map.put("White-breasted Nuthatch", whiteBreastedNuthatchValues);

// White-Crowned Sparrow
BirdTurnValue[][] whiteCrownedSparrowValues = new BirdTurnValue[5][9];
whiteCrownedSparrowValues[1][1] = new BirdTurnValue(44.11)
;
whiteCrownedSparrowValues[1][2] = new BirdTurnValue(44.13)
;
whiteCrownedSparrowValues[1][3] = new BirdTurnValue(44.70)
;
whiteCrownedSparrowValues[1][4] = new BirdTurnValue(44.68)
;
whiteCrownedSparrowValues[1][5] = new BirdTurnValue(44.50)
;
whiteCrownedSparrowValues[1][6] = new BirdTurnValue(44.77)
;
whiteCrownedSparrowValues[1][7] = new BirdTurnValue(45.06)
;
whiteCrownedSparrowValues[1][8] = new BirdTurnValue(45.93)
;
whiteCrownedSparrowValues[2][1] = new BirdTurnValue(45.95)
;
whiteCrownedSparrowValues[2][2] = new BirdTurnValue(46.52)
;
whiteCrownedSparrowValues[2][3] = new BirdTurnValue(45.72)
;
whiteCrownedSparrowValues[2][4] = new BirdTurnValue(46.47)
;
whiteCrownedSparrowValues[2][5] = new BirdTurnValue(45.94)
;
whiteCrownedSparrowValues[2][6] = new BirdTurnValue(46.30)
;
whiteCrownedSparrowValues[2][7] = new BirdTurnValue(46.15)
;
whiteCrownedSparrowValues[3][1] = new BirdTurnValue(46.38)
;
whiteCrownedSparrowValues[3][2] = new BirdTurnValue(46.24)
;
whiteCrownedSparrowValues[3][3] = new BirdTurnValue(46.01)
;
whiteCrownedSparrowValues[3][4] = new BirdTurnValue(46.15)
;
whiteCrownedSparrowValues[3][5] = new BirdTurnValue(46.38)
;
whiteCrownedSparrowValues[3][6] = new BirdTurnValue(46.17)
;
whiteCrownedSparrowValues[4][1] = new BirdTurnValue(45.99)
;
whiteCrownedSparrowValues[4][2] = new BirdTurnValue(45.55)
;
whiteCrownedSparrowValues[4][3] = new BirdTurnValue(46.74)
;
whiteCrownedSparrowValues[4][4] = new BirdTurnValue(45.13)
;
whiteCrownedSparrowValues[4][5] = new BirdTurnValue(45.01)
;
map.put("White-Crowned Sparrow", whiteCrownedSparrowValues);

// White-Faced Ibis
BirdTurnValue[][] whiteFacedIbisValues = new BirdTurnValue[5][9];
whiteFacedIbisValues[1][1] = new BirdTurnValue(51.36)
;
whiteFacedIbisValues[1][2] = new BirdTurnValue(54.65)
;
whiteFacedIbisValues[1][3] = new BirdTurnValue(54.02)
;
whiteFacedIbisValues[1][4] = new BirdTurnValue(54.52)
;
whiteFacedIbisValues[1][5] = new BirdTurnValue(54.05)
;
whiteFacedIbisValues[1][6] = new BirdTurnValue(52.92)
;
whiteFacedIbisValues[1][7] = new BirdTurnValue(52.37)
;
whiteFacedIbisValues[1][8] = new BirdTurnValue(50.96)
;
whiteFacedIbisValues[2][1] = new BirdTurnValue(50.18)
;
whiteFacedIbisValues[2][2] = new BirdTurnValue(50.29)
;
whiteFacedIbisValues[2][3] = new BirdTurnValue(50.07)
;
whiteFacedIbisValues[2][4] = new BirdTurnValue(49.52)
;
whiteFacedIbisValues[2][5] = new BirdTurnValue(49.45)
;
whiteFacedIbisValues[2][6] = new BirdTurnValue(49.05)
;
whiteFacedIbisValues[2][7] = new BirdTurnValue(48.96)
;
whiteFacedIbisValues[3][1] = new BirdTurnValue(48.40)
;
whiteFacedIbisValues[3][2] = new BirdTurnValue(48.86)
;
whiteFacedIbisValues[3][3] = new BirdTurnValue(48.58)
;
whiteFacedIbisValues[3][4] = new BirdTurnValue(48.18)
;
whiteFacedIbisValues[3][5] = new BirdTurnValue(48.28)
;
whiteFacedIbisValues[3][6] = new BirdTurnValue(48.49)
;
whiteFacedIbisValues[4][1] = new BirdTurnValue(47.34)
;
whiteFacedIbisValues[4][2] = new BirdTurnValue(47.49)
;
whiteFacedIbisValues[4][3] = new BirdTurnValue(47.74)
;
whiteFacedIbisValues[4][4] = new BirdTurnValue(46.60)
;
whiteFacedIbisValues[4][5] = new BirdTurnValue(46.22)
;
map.put("White-Faced Ibis", whiteFacedIbisValues);

// Wild Turkey
BirdTurnValue[][] wildTurkeyValues = new BirdTurnValue[5][9];
wildTurkeyValues[1][1] = new BirdTurnValue(47.87)
;
wildTurkeyValues[1][2] = new BirdTurnValue(50.05)
;
wildTurkeyValues[1][3] = new BirdTurnValue(50.37)
;
wildTurkeyValues[1][4] = new BirdTurnValue(50.63)
;
wildTurkeyValues[1][5] = new BirdTurnValue(50.63)
;
wildTurkeyValues[1][6] = new BirdTurnValue(50.21)
;
wildTurkeyValues[1][7] = new BirdTurnValue(48.65)
;
wildTurkeyValues[1][8] = new BirdTurnValue(49.02)
;
wildTurkeyValues[2][1] = new BirdTurnValue(49.49)
;
wildTurkeyValues[2][2] = new BirdTurnValue(48.74)
;
wildTurkeyValues[2][3] = new BirdTurnValue(48.94)
;
wildTurkeyValues[2][4] = new BirdTurnValue(48.98)
;
wildTurkeyValues[2][5] = new BirdTurnValue(48.36)
;
wildTurkeyValues[2][6] = new BirdTurnValue(48.96)
;
wildTurkeyValues[2][7] = new BirdTurnValue(48.68)
;
wildTurkeyValues[3][1] = new BirdTurnValue(48.13)
;
wildTurkeyValues[3][2] = new BirdTurnValue(48.12)
;
wildTurkeyValues[3][3] = new BirdTurnValue(48.85)
;
wildTurkeyValues[3][4] = new BirdTurnValue(48.74)
;
wildTurkeyValues[3][5] = new BirdTurnValue(48.11)
;
wildTurkeyValues[3][6] = new BirdTurnValue(48.37)
;
wildTurkeyValues[4][1] = new BirdTurnValue(47.96)
;
wildTurkeyValues[4][2] = new BirdTurnValue(47.72)
;
wildTurkeyValues[4][3] = new BirdTurnValue(48.19)
;
wildTurkeyValues[4][4] = new BirdTurnValue(46.36)
;
wildTurkeyValues[4][5] = new BirdTurnValue(45.88)
;
map.put("Wild Turkey", wildTurkeyValues);

// Willet
BirdTurnValue[][] willetValues = new BirdTurnValue[5][9];
willetValues[1][1] = new BirdTurnValue(51.05)
;
willetValues[1][2] = new BirdTurnValue(51.19)
;
willetValues[1][3] = new BirdTurnValue(51.78)
;
willetValues[1][4] = new BirdTurnValue(50.66)
;
willetValues[1][5] = new BirdTurnValue(50.13)
;
willetValues[1][6] = new BirdTurnValue(49.41)
;
willetValues[1][7] = new BirdTurnValue(49.05)
;
willetValues[1][8] = new BirdTurnValue(48.92)
;
willetValues[2][1] = new BirdTurnValue(48.50)
;
willetValues[2][2] = new BirdTurnValue(48.87)
;
willetValues[2][3] = new BirdTurnValue(48.42)
;
willetValues[2][4] = new BirdTurnValue(47.81)
;
willetValues[2][5] = new BirdTurnValue(47.32)
;
willetValues[2][6] = new BirdTurnValue(47.10)
;
willetValues[2][7] = new BirdTurnValue(47.12)
;
willetValues[3][1] = new BirdTurnValue(46.92)
;
willetValues[3][2] = new BirdTurnValue(46.07)
;
willetValues[3][3] = new BirdTurnValue(45.66)
;
willetValues[3][4] = new BirdTurnValue(45.71)
;
willetValues[3][5] = new BirdTurnValue(45.31)
;
willetValues[3][6] = new BirdTurnValue(44.37)
;
willetValues[4][1] = new BirdTurnValue(44.61)
;
willetValues[4][2] = new BirdTurnValue(44.12)
;
willetValues[4][3] = new BirdTurnValue(45.30)
;
willetValues[4][4] = new BirdTurnValue(43.69)
;
willetValues[4][5] = new BirdTurnValue(42.34)
;
map.put("Willet", willetValues);

// Wood Duck
BirdTurnValue[][] woodDuckValues = new BirdTurnValue[5][9];
woodDuckValues[1][1] = new BirdTurnValue(40.20)
;
woodDuckValues[1][2] = new BirdTurnValue(42.58)
;
woodDuckValues[1][3] = new BirdTurnValue(42.38)
;
woodDuckValues[1][4] = new BirdTurnValue(43.59)
;
woodDuckValues[1][5] = new BirdTurnValue(43.67)
;
woodDuckValues[1][6] = new BirdTurnValue(43.14)
;
woodDuckValues[1][7] = new BirdTurnValue(43.11)
;
woodDuckValues[1][8] = new BirdTurnValue(43.74)
;
woodDuckValues[2][1] = new BirdTurnValue(43.89)
;
woodDuckValues[2][2] = new BirdTurnValue(44.24)
;
woodDuckValues[2][3] = new BirdTurnValue(44.41)
;
woodDuckValues[2][4] = new BirdTurnValue(44.59)
;
woodDuckValues[2][5] = new BirdTurnValue(44.67)
;
woodDuckValues[2][6] = new BirdTurnValue(45.07)
;
woodDuckValues[2][7] = new BirdTurnValue(45.74)
;
woodDuckValues[3][1] = new BirdTurnValue(45.45)
;
woodDuckValues[3][2] = new BirdTurnValue(45.75)
;
woodDuckValues[3][3] = new BirdTurnValue(46.03)
;
woodDuckValues[3][4] = new BirdTurnValue(45.90)
;
woodDuckValues[3][5] = new BirdTurnValue(46.31)
;
woodDuckValues[3][6] = new BirdTurnValue(46.61)
;
woodDuckValues[4][1] = new BirdTurnValue(46.20)
;
woodDuckValues[4][2] = new BirdTurnValue(46.39)
;
woodDuckValues[4][3] = new BirdTurnValue(46.70)
;
woodDuckValues[4][4] = new BirdTurnValue(45.65)
;
woodDuckValues[4][5] = new BirdTurnValue(45.60)
;
map.put("Wood Duck", woodDuckValues);

// Yellow-Bellied Sapsucker
BirdTurnValue[][] yellowBelliedSapsuckerValues = new BirdTurnValue[5][9];
yellowBelliedSapsuckerValues[1][1] = new BirdTurnValue(50.22)
;
yellowBelliedSapsuckerValues[1][2] = new BirdTurnValue(51.16)
;
yellowBelliedSapsuckerValues[1][3] = new BirdTurnValue(50.15)
;
yellowBelliedSapsuckerValues[1][4] = new BirdTurnValue(50.32)
;
yellowBelliedSapsuckerValues[1][5] = new BirdTurnValue(49.80)
;
yellowBelliedSapsuckerValues[1][6] = new BirdTurnValue(48.98)
;
yellowBelliedSapsuckerValues[1][7] = new BirdTurnValue(49.57)
;
yellowBelliedSapsuckerValues[1][8] = new BirdTurnValue(48.95)
;
yellowBelliedSapsuckerValues[2][1] = new BirdTurnValue(48.65)
;
yellowBelliedSapsuckerValues[2][2] = new BirdTurnValue(48.03)
;
yellowBelliedSapsuckerValues[2][3] = new BirdTurnValue(47.65)
;
yellowBelliedSapsuckerValues[2][4] = new BirdTurnValue(48.09)
;
yellowBelliedSapsuckerValues[2][5] = new BirdTurnValue(47.41)
;
yellowBelliedSapsuckerValues[2][6] = new BirdTurnValue(47.49)
;
yellowBelliedSapsuckerValues[2][7] = new BirdTurnValue(47.61)
;
yellowBelliedSapsuckerValues[3][1] = new BirdTurnValue(47.28)
;
yellowBelliedSapsuckerValues[3][2] = new BirdTurnValue(47.34)
;
yellowBelliedSapsuckerValues[3][3] = new BirdTurnValue(46.86)
;
yellowBelliedSapsuckerValues[3][4] = new BirdTurnValue(46.73)
;
yellowBelliedSapsuckerValues[3][5] = new BirdTurnValue(46.62)
;
yellowBelliedSapsuckerValues[3][6] = new BirdTurnValue(46.55)
;
yellowBelliedSapsuckerValues[4][1] = new BirdTurnValue(46.49)
;
yellowBelliedSapsuckerValues[4][2] = new BirdTurnValue(46.21)
;
yellowBelliedSapsuckerValues[4][3] = new BirdTurnValue(46.14)
;
yellowBelliedSapsuckerValues[4][4] = new BirdTurnValue(45.04)
;
yellowBelliedSapsuckerValues[4][5] = new BirdTurnValue(45.00)
;
map.put("Yellow-Bellied Sapsucker", yellowBelliedSapsuckerValues);

// Yellow-Breasted Chat
BirdTurnValue[][] yellowBreastedChatValues = new BirdTurnValue[5][9];
yellowBreastedChatValues[1][1] = new BirdTurnValue(44.79)
;
yellowBreastedChatValues[1][2] = new BirdTurnValue(47.09)
;
yellowBreastedChatValues[1][3] = new BirdTurnValue(47.03)
;
yellowBreastedChatValues[1][4] = new BirdTurnValue(47.22)
;
yellowBreastedChatValues[1][5] = new BirdTurnValue(47.42)
;
yellowBreastedChatValues[1][6] = new BirdTurnValue(46.69)
;
yellowBreastedChatValues[1][7] = new BirdTurnValue(46.54)
;
yellowBreastedChatValues[1][8] = new BirdTurnValue(46.28)
;
yellowBreastedChatValues[2][1] = new BirdTurnValue(47.21)
;
yellowBreastedChatValues[2][2] = new BirdTurnValue(46.84)
;
yellowBreastedChatValues[2][3] = new BirdTurnValue(46.91)
;
yellowBreastedChatValues[2][4] = new BirdTurnValue(47.06)
;
yellowBreastedChatValues[2][5] = new BirdTurnValue(46.90)
;
yellowBreastedChatValues[2][6] = new BirdTurnValue(47.32)
;
yellowBreastedChatValues[2][7] = new BirdTurnValue(47.10)
;
yellowBreastedChatValues[3][1] = new BirdTurnValue(47.15)
;
yellowBreastedChatValues[3][2] = new BirdTurnValue(47.16)
;
yellowBreastedChatValues[3][3] = new BirdTurnValue(47.18)
;
yellowBreastedChatValues[3][4] = new BirdTurnValue(46.87)
;
yellowBreastedChatValues[3][5] = new BirdTurnValue(47.37)
;
yellowBreastedChatValues[3][6] = new BirdTurnValue(47.02)
;
yellowBreastedChatValues[4][1] = new BirdTurnValue(47.28)
;
yellowBreastedChatValues[4][2] = new BirdTurnValue(46.69)
;
yellowBreastedChatValues[4][3] = new BirdTurnValue(47.25)
;
yellowBreastedChatValues[4][4] = new BirdTurnValue(45.35)
;
yellowBreastedChatValues[4][5] = new BirdTurnValue(45.85)
;
map.put("Yellow-Breasted Chat", yellowBreastedChatValues);

// Yellow-Headed Blackbird
BirdTurnValue[][] yellowHeadedBlackbirdValues = new BirdTurnValue[5][9];
yellowHeadedBlackbirdValues[1][1] = new BirdTurnValue(44.93)
;
yellowHeadedBlackbirdValues[1][2] = new BirdTurnValue(46.33)
;
yellowHeadedBlackbirdValues[1][3] = new BirdTurnValue(46.04)
;
yellowHeadedBlackbirdValues[1][4] = new BirdTurnValue(46.33)
;
yellowHeadedBlackbirdValues[1][5] = new BirdTurnValue(46.14)
;
yellowHeadedBlackbirdValues[1][6] = new BirdTurnValue(45.80)
;
yellowHeadedBlackbirdValues[1][7] = new BirdTurnValue(46.27)
;
yellowHeadedBlackbirdValues[1][8] = new BirdTurnValue(46.33)
;
yellowHeadedBlackbirdValues[2][1] = new BirdTurnValue(46.06)
;
yellowHeadedBlackbirdValues[2][2] = new BirdTurnValue(46.56)
;
yellowHeadedBlackbirdValues[2][3] = new BirdTurnValue(46.47)
;
yellowHeadedBlackbirdValues[2][4] = new BirdTurnValue(45.98)
;
yellowHeadedBlackbirdValues[2][5] = new BirdTurnValue(46.64)
;
yellowHeadedBlackbirdValues[2][6] = new BirdTurnValue(46.46)
;
yellowHeadedBlackbirdValues[2][7] = new BirdTurnValue(46.47)
;
yellowHeadedBlackbirdValues[3][1] = new BirdTurnValue(47.12)
;
yellowHeadedBlackbirdValues[3][2] = new BirdTurnValue(47.36)
;
yellowHeadedBlackbirdValues[3][3] = new BirdTurnValue(46.81)
;
yellowHeadedBlackbirdValues[3][4] = new BirdTurnValue(47.02)
;
yellowHeadedBlackbirdValues[3][5] = new BirdTurnValue(46.38)
;
yellowHeadedBlackbirdValues[3][6] = new BirdTurnValue(47.07)
;
yellowHeadedBlackbirdValues[4][1] = new BirdTurnValue(46.61)
;
yellowHeadedBlackbirdValues[4][2] = new BirdTurnValue(46.74)
;
yellowHeadedBlackbirdValues[4][3] = new BirdTurnValue(47.03)
;
yellowHeadedBlackbirdValues[4][4] = new BirdTurnValue(45.71)
;
yellowHeadedBlackbirdValues[4][5] = new BirdTurnValue(45.14)
;
map.put("Yellow-Headed Blackbird", yellowHeadedBlackbirdValues);

// Yellow-Rumped Warbler
BirdTurnValue[][] yellowRumpedWarblerValues = new BirdTurnValue[5][9];
yellowRumpedWarblerValues[1][1] = new BirdTurnValue(46.13)
;
yellowRumpedWarblerValues[1][2] = new BirdTurnValue(48.20)
;
yellowRumpedWarblerValues[1][3] = new BirdTurnValue(47.39)
;
yellowRumpedWarblerValues[1][4] = new BirdTurnValue(47.43)
;
yellowRumpedWarblerValues[1][5] = new BirdTurnValue(47.28)
;
yellowRumpedWarblerValues[1][6] = new BirdTurnValue(47.26)
;
yellowRumpedWarblerValues[1][7] = new BirdTurnValue(46.84)
;
yellowRumpedWarblerValues[1][8] = new BirdTurnValue(46.67)
;
yellowRumpedWarblerValues[2][1] = new BirdTurnValue(46.22)
;
yellowRumpedWarblerValues[2][2] = new BirdTurnValue(46.17)
;
yellowRumpedWarblerValues[2][3] = new BirdTurnValue(45.84)
;
yellowRumpedWarblerValues[2][4] = new BirdTurnValue(45.77)
;
yellowRumpedWarblerValues[2][5] = new BirdTurnValue(45.45)
;
yellowRumpedWarblerValues[2][6] = new BirdTurnValue(44.98)
;
yellowRumpedWarblerValues[2][7] = new BirdTurnValue(44.70)
;
yellowRumpedWarblerValues[3][1] = new BirdTurnValue(44.48)
;
yellowRumpedWarblerValues[3][2] = new BirdTurnValue(44.36)
;
yellowRumpedWarblerValues[3][3] = new BirdTurnValue(43.61)
;
yellowRumpedWarblerValues[3][4] = new BirdTurnValue(43.90)
;
yellowRumpedWarblerValues[3][5] = new BirdTurnValue(43.18)
;
yellowRumpedWarblerValues[3][6] = new BirdTurnValue(42.95)
;
yellowRumpedWarblerValues[4][1] = new BirdTurnValue(42.98)
;
yellowRumpedWarblerValues[4][2] = new BirdTurnValue(42.35)
;
yellowRumpedWarblerValues[4][3] = new BirdTurnValue(42.47)
;
yellowRumpedWarblerValues[4][4] = new BirdTurnValue(41.83)
;
yellowRumpedWarblerValues[4][5] = new BirdTurnValue(41.11)
;
map.put("Yellow-Rumped Warbler", yellowRumpedWarblerValues);


        return map;
    }
}
