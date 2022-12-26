package Abstraction;

public class Main {
  public static void main(String[] args) {
    PasswordChangeEvent eventOne = new PasswordChangeEvent("2323232323");
    AccountTransferEvent eventTwo = new AccountTransferEvent(id:"546456456464");
    MissedPaymentEvent eventthree = new MissedPaymentEvent(id:"45433654645646");

    Event[] events = {eventOne, eventTwo, eventthree};

    for(Event e : events){
      System.out.println(e.getTimeStamp());
      e.process();
      System.out.println();
    }
  }
}
