package behavior.bridge.before;

import lombok.Data;

@Data
public class BasicRemoteWithTV {

  private boolean on = false;
  private int volume = 30;
  private int channel = 1;

  void power() {
    this.on = !this.on;
  }
  public void volumeDown() {
    System.out.println("Remote: volume down");
    this.volume -= 10;
  }

  public void volumeUp() {
    System.out.println("Remote: volume up");
    this.volume += 10;
  }

  public void channelDown() {
    System.out.println("Remote: channel down");
    this.channel--;
  }

  public void channelUp() {
    System.out.println("Remote: channel up");
    this.channel++;
  }

  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm TV set.");
    System.out.println("| I'm " + (on ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + volume + "%");
    System.out.println("| Current channel is " + channel);
    System.out.println("------------------------------------\n");
  }

}
