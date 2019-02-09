import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"montreal","toronto","vancouver","quebec","halifax","calgary"};
		String vowels = "aeiouy";
		
		for(int i =0; i<vowels.length(); i++) {
				ArrayList<String> v = new ArrayList<String>();
				String answer = "";
			for(int j=0; j<cities.length; j++) {
				for(int k=0; k<cities[j].length(); k++) {
					if(vowels.charAt(i) == cities[j].charAt(k)) {
						v.add(cities[j]);
						break;
					}
				}
			}

			for(String city:v) {
				answer += " " +city;
			}
			System.out.println(vowels.charAt(i)+ " have "+ answer);
		}
	}
}
		

	

