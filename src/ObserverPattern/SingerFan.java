package ObserverPattern;

public class SingerFan implements Fan {
    private String name;

    public SingerFan(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void hear(String voice) {
        System.out.println(name + "은 \"" + voice + "\"를 들었습니다!" );
    }
}
