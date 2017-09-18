package templateMethodPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}
	@Override
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer = getUserInput();

		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}

	private String getUserInput(){
		String answer = null;

		System.out.println("would you like lemon with your tea (y/n) ?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch (Exception e) {
			// TODO: handle exception1
			System.err.println("IO error trying to read your answer");
		}

		if(answer==null){
			return "no";
		}
		return answer;
	}

}
