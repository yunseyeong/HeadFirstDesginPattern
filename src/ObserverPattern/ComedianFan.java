package ObserverPattern;

public class ComedianFan implements Fan {
    private String name;

    public ComedianFan(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void hear(String voice) {
        System.out.println(name + "는" + voice + "라는 소리를 들었습니다.");
    }
}
