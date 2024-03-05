package structural.bridge.before;

import lombok.Data;

@Data
public class AdvancedRemoteWithRadio extends BasicRemoteWithRadio{
  public void mute() {
    super.setVolume(0);
  }

}
