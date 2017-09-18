package ObserverPattern;

public class main {
    public static void main(String[] args){
        Singer mc= new Singer();
        SingerFan person1 = new SingerFan("일반인1");
        SingerFan person2 = new SingerFan("일반인2");

        mc.addFan(person1);
        mc.addFan(person2);

        mc.speak();

        mc.deleteFan(person1);

        SingerFan person3 = new SingerFan("일반인3");
        mc.addFan(person3);

        mc.speak();

        comedian cm = new comedian();
        ComedianFan man1 = new ComedianFan("남자1");
        ComedianFan man2 = new ComedianFan("남자2");

        cm.addFan(man1);
        cm.addFan(man2);

        cm.speak();

        cm.deleteFan(man1);
        cm.speak();

        ComedianFan man3 = new ComedianFan("여자1");
        cm.addFan(man3);
        cm.speak();

        mc.addFan(man1);
        mc.speak();

        comedian cm2 = new comedian();
        cm2.addFan(person1);
        cm2.addFan(person3);
        cm2.speak();
    }
}
