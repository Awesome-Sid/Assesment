package Selenium_Assesment.TestVagarnt;
import io.restassured.path.json.JsonPath;
public class JasonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(payload.Players());
		int count = js.getInt("player.size()");
		//First Test Case
		System.out.println(count);
		//String country = js.get("player[0].country");
		//System.out.println(country);
		int foreign = 0;
		for(int i=0;i<count;i++) {
			String country = js.get("player["+i+"].country");
			if(!country.equals("India")){
				foreign = foreign+1;
				//System.out.println(foreign);
				//System.out.println(country);
			}
		}
		if(foreign==4) {
			System.out.println("There are  players");
		}
		//Second Test Case
		for(int i=0;i<count;i++) {
			String role = js.get("player["+i+"].role");
			if(role.equals("Wicket-keeper")){
				System.out.println("Atleast one Wicket-keeper is present");
				break;
			}
		}
		
				

	}

}
