package Card;

/**
 * Created by Waseem Akbar on 10/06/2016.
 */
public abstract class Card {
  int cost;
  boolean unique, faceDown;
  byte limit;
  String type;
  String[] subtypes;
  byte location; //1=Archives/Heap, 2=R&D/Stack, 3=HQ/Grip, 4=Installed

}
