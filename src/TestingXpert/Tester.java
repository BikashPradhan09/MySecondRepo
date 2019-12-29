package TestingXpert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Tester {

	public static void main(String[] args) {
		try {
			int a=5/0;
			
		}catch(Exception e) {
			System.out.println("Excpt is thrown in tester");
		}
	}

}

class AirJet extends AirPlane{
	public AirJet() throws IOException  {
		super();
		
		System.out.println("Airjet");
	
}}

class AirPlane{
	static void solve(int n, String[] s, int[] ar) {
        HashMap<String,Integer> hm= new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(s[i]))
            {
                hm.put(s[i],ar[i]);
            }
        }
        Iterator itr = hm.entrySet().iterator();
        
        while(itr.hasNext()) {
        	//Map.Entry<String, Integer> m = (Entry<String, Integer>) itr.next();
        	System.out.println(hm.keySet().toString());
        	
        }
        
    }
}
