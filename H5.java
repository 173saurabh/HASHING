//Find Itinerary from a given list of tickets
import java.util.*;
public class H5 
{
	static void printResult(Map<String,String> map)
	{
		Map<String,String> reverseMap=new HashMap<String,String>();
		for(Map.Entry<String,String> entry: map.entrySet())
			reverseMap.put(entry.getValue(),entry.getKey());
		String start=null;
		for(Map.Entry<String,String> entry: map.entrySet())
		{
			if(!reverseMap.containsKey(entry.getKey()))
			{
				start=entry.getKey();
				break;
			}
		}
		if(start==null)
		{
			System.out.println("Invalid input");
			return;
		}	
		String to=map.get(start);
		while(to!=null)
		{
			System.out.print(start+"->"+to+", ");
			start=to;
			to=map.get(start);
		}
	}
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Chennai","Bangalore");
		map.put("Bombay","Delhi");
		map.put("Goa","Chennai");
		map.put("Delhi","Goa");
		printResult(map);
	}
}
