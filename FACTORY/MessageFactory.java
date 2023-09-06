public class MessageFactory {
    public static AMessage getShape(String name){
        if(name.equals("SMS")){
            return new SMS();
        }
        if(name.equals("Email")){
            return new Email();
        }
        if(name.equals("WhatsApp")){
            return new WhatsApp();
        }

        return null;
    }
}