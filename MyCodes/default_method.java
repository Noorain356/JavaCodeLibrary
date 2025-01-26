package MyCodes;
interface MyCamera {
  void takeSnap();
  void recordVideo();

  private void greet() {
      System.out.println("Good morning");
  }

  default void record4kVideo() {
      greet();
      System.out.println("Recording in 4K");
  }
}

interface MyWifi {
  String[] getNetworks();
  void connectToNetwork(String network);
}

class MyCellPhone {
  void callNumber(int phoneNumber) {
      System.out.println("Calling " + phoneNumber);
  }

  void pickCall() {
      System.out.println("Connecting...");
  }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
  public void takeSnap() {
      System.out.println("Taking snap");
  }

  public void recordVideo() {
      System.out.println("Recording video");
  }

  // No need to override record4kVideo unless you want custom behavior.
  // The default implementation from MyCamera will be used if not overridden.

  public String[] getNetworks() {
      System.out.println("Getting list of networks");
      String[] networkList = { "Harry", "Prashanth", "Anjali" };
      return networkList;
  }

  public void connectToNetwork(String network) {
      System.out.println("Connecting to " + network);
  }
}

public class default_method {
  public static void main(String[] args) {
      MySmartPhone mySmartPhone = new MySmartPhone();

      // Demonstrating methods from MyCellPhone
      mySmartPhone.callNumber(123456789);
      mySmartPhone.pickCall();

      // Demonstrating methods from MyCamera
      mySmartPhone.takeSnap();
      mySmartPhone.recordVideo();
      mySmartPhone.record4kVideo();

      // Demonstrating methods from MyWifi
      String[] networks = mySmartPhone.getNetworks();
      for (String network : networks) {
          System.out.println(network);
      }
      mySmartPhone.connectToNetwork("Harry");
  }
}