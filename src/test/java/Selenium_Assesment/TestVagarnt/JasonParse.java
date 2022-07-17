package Selenium_Assesment.TestVagarnt;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
public class JasonParse {
	JsonPath js = new JsonPath(payload.Players());
	int count = js.getInt("player.size()");	
@Test
	public void f_players() {
		int foreign = 0;
		for(int i=0;i<count;i++) {
			String country = js.get("player["+i+"].country");
			if(!country.equals("India")){
				foreign = foreign+1;
				//System.out.println(foreign);
				//System.out.println(country);
			}
		}
		Assert.assertEquals(foreign,4);
}

@Test
	public void v_wicketkeeper() {
	boolean flag=false;
	for(int i=0;i<count;i++) {
		String role = js.get("player["+i+"].role");
		if(role.equals("Wicket-keeper")){
			flag=true;
			break;
		}
	}
	Assert.assertTrue(flag);
			

}


}
