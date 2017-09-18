package StatePattern;

public class StateContext {
    private State currentState;
    public StateContext(){
        currentState = State.getInitState();
    }
    public void processEvent(Action action){
        State next= currentState.act(action);
        if(next != null){
            currentState.onExit();
            System.out.println(action +"에 의해 State가 " +
                    currentState+"에서 "+next+"로 바뀜");
            currentState=next;
            currentState.onEntry();
            if(State.isFinalState(currentState)){
                System.out.println("i'm final State");
            }
        }else{
            System.out.println(action+"은 state가 " +currentState
            +"에서는 의미 없는 짓");
        }
    }
}
