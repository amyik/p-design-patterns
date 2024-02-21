package behavior.bridge.after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AdvancedRemote extends BasicRemote{

  public AdvancedRemote(Device device) {
    super.device = device;
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setVolume(0);
  }
}
