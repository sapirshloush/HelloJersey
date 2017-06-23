package services;



import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import db.PersPlayer;
import db.QueryResultSet;

@Path("hello")
public class HelloWorldService {
	private String string;
	private QueryResultSet qrs=new QueryResultSet();
			
	@GET
	public String getMessages() {
	
		return this.string;
	}
	
	@POST
	public void addMessage(String msg) 
	{
		String[] arr=msg.split(" ");
		String[] detailes=arr[1].split(",");
		
		if(arr[0].toLowerCase().equals("worldrecord"))
		{
			PersPlayer player=new PersPlayer(detailes[0],detailes[1],Integer.parseInt(detailes[2]),Integer.parseInt(detailes[3]));
			qrs.addNewEntry(player);
			
		}
		else
		{
			qrs.getSolutionByLevelName(detailes[0]);
			
			if(qrs.getSolutionTableResultSet()!=null)
			{
				this.string=qrs.getSolutionTableResultSet().get(0).getSolution();
			}
			else
				this.string="Solution Not Found";
		}
		
	}
	
}
