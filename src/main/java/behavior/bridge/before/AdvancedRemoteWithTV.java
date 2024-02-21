package behavior.bridge.before;

import lombok.Data;

@Data
public class AdvancedRemoteWithTV extends BasicRemoteWithTV{

  public void mute() {
    super.setVolume(0);
  }
  /*
  2 * 2 = 4
  2 * 3 = 6
  2 * 4 = 8
  2 * 5 = 10
  */
}
