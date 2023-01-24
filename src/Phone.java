public interface Phone {

    void powerOn();
    void callNumber(String PhoneNo);
    void receiveCall(String PhoneNo);
    boolean answerCall();
    boolean isRinging();

}
