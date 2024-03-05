package structural.bridge.after;

import lombok.Data;

@Data
public class Radio implements Device{

  private boolean on = false;
  private int volume = 30;
  private int channel = 1;

  @Override
  public boolean isEnabled() {
    return this.on;
  }

  @Override
  public void enable() {
    this.on = true;
  }

  @Override
  public void disable() {
    this.on = false;
  }

  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm radio.");
    System.out.println("| I'm " + (on ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + volume + "%");
    System.out.println("| Current channel is " + channel);
    System.out.println("------------------------------------\n");
  }
}
