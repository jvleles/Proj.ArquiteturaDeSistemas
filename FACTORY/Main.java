public class Main {
    public static void main(String[] args) {
        AMessage sms = MessageFactory.getShape("SMS");
        sms.message();

        AMessage email = MessageFactory.getShape("Email");
        email.message();

        AMessage wpp = MessageFactory.getShape("WhatsApp");
        wpp.message();
    }
}