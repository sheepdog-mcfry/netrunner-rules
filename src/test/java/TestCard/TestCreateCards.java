package TestCard;

import Card.Corporation.*;
import Card.Runner.*;
import Card.Card;
import org.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;
import static org.junit.matchers.JUnitMatchers.*;

/**
 * Created by Waseem Akbar on 11/06/2016.
 */
public class TestCreateCards {

  @Test
  public void testTest(){
    assertFalse("This should be false", false);
  }

  @Test
  public void testAgendaIsCard() {
    Agenda testAgenda = new Agenda();
    assertTrue(testAgenda instanceof Card);
  }

  @Test
  public void testAgendaIsRezzable() {
    Agenda testAgenda = new Agenda();
    assertTrue(testAgenda instanceof Rezzable);
  }

  @Test
  public void testAssetIsCard() {
    Asset testAsset = new Asset();
    assertTrue(testAsset instanceof Card);
  }

  @Test
  public void testAssetIsRezzable() {
    Asset testAsset = new Asset();
    assertTrue(testAsset instanceof Rezzable);
  }

  @Test
  public void testUpgradeIsCard() {
    Upgrade testUpgrade = new Upgrade();
    assertTrue(testUpgrade instanceof Card);
  }

  @Test
  public void testUpgradeIsRezzable() {
    Upgrade testUpgrade = new Upgrade();
    assertTrue(testUpgrade instanceof Rezzable);
  }

  @Test
  public void testICEIsCard() {
    ICE testICE = new ICE();
    assertTrue(testICE instanceof Card);
  }

  @Test
  public void testICEIsRezzable() {
    ICE testICE = new ICE();
    assertTrue(testICE instanceof Rezzable);
  }

  @Test
  public void testOperationIsCard() {
    Operation testOperation = new Operation();
    assertTrue(testOperation instanceof Card);
  }

  @Test
  public void testEventIsCard() {
    Event testEvent = new Event();
    assertTrue(testEvent instanceof Card);
  }

  @Test
  public void testHardwareIsCard() {
    Hardware testHardware = new Hardware();
    assertTrue(testHardware instanceof Card);
  }

  @Test
  public void testProgramIsCard() {
    Program testProgram = new Program();
    assertTrue(testProgram instanceof Card);
  }

  @Test
  public void testResourceIsCard() {
    Resource testResource = new Resource();
    assertTrue(testResource instanceof Card);
  }

}
