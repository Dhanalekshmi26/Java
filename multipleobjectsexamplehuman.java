public class multipleobjectsexamplehuman {
    String color ;
    public static void main(String[] args) {
        multipleobjectsexamplehuman hand = new multipleobjectsexamplehuman();
        multipleobjectsexamplehuman leg = new multipleobjectsexamplehuman();
        multipleobjectsexamplehuman eyes = new multipleobjectsexamplehuman();
        multipleobjectsexamplehuman body = new multipleobjectsexamplehuman();
        multipleobjectsexamplehuman hair = new multipleobjectsexamplehuman();
        String Hand = hand.color = "skin";
        String Leg = leg.color = "skin";
        String Body = body.color = "skin";
        String Eyes = eyes.color = "black";
        String Hair = hair.color = "black";
        System.out.println("my hand color is: "+Hand);
        System.out.println("my leg color is: "+Leg);
        System.out.println("my eye color is: "+Eyes);
        System.out.println("my body color is: "+Body);
        System.out.println("my hair color is: "+Hair);
        



    }
}
