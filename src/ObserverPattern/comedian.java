package ObserverPattern;

import java.util.ArrayList;
import java.util.Random;

public class comedian implements Talent {
    private ArrayList<Fan> fanlist;
    public comedian(){
        fanlist = new ArrayList<Fan>();
    }
    @Override
    public void addFan(Fan o) {
        fanlist.add(o);
    }

    @Override
    public void deleteFan(Fan o) {
        if(!fanlist.isEmpty()) {
            fanlist.remove(o);
        }
    }

    @Override
    public void speak() {
        String[] voices = {"i'm comedian", "i hope you smile"};
        Random r = new Random();
        int index= r.nextInt(voices.length);
        for(int i=0; i<fanlist.size(); i++){
            Fan o = (Fan)fanlist.get(i);
            o.hear(voices[index]);
        }
    }
}
