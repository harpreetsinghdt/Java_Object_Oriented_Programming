package Abstraction;

public class MissedPaymentEvent extends AbstractEvent {
  public MissedPaymentEvent(String id){
    super(id);
  }

  public void process(){
    System.out.println("Customer "+ id +" missed their payment." +
    " Sending a bill to the customer");
  }
}
