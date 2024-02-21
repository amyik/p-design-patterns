package behavior.bridge.after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AdvancedRemoteVer2 extends BasicRemote{

  public AdvancedRemoteVer2(Device device) {
    super.device = device;
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setVolume(0);
  }

  public void buzz() {
    System.out.println("buzzzzzzzing!");
  }
}
