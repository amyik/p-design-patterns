package behavior.bridge.after;

import lombok.Data;

@Data
public class TV implements Device{
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

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm TV set.");
    System.out.println("| I'm " + (on ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + volume + "%");
    System.out.println("| Current channel is " + channel);
    System.out.println("------------------------------------\n");
  }

}
