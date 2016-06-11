package Servers;

import Card.Corporation.ICE;
import Card.Corporation.Rezzable;

import java.util.Arrays;

/**
 * Created by Waseem Akbar on 11/06/2016.
 */
public class Server {
  int serverId;
  boolean runOn = false;
  Rezzable[] installed;
  ICE[] protection;

  public boolean InstallRezzable(Rezzable card) {
    boolean installed = false;
    return installed;
  }
}
