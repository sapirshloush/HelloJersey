package db;

import java.util.List;

import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;





@Entity(name = "Solutions")
public class SolutionTable 
{
	@Id
	@Column(name = "Level_Name")
	private String levelName;
	
	@Column(name = "Solution")
	private String solution;
	
	
	public SolutionTable(){}
	
	public SolutionTable(String levelName, String solution)
	{
		this.levelName = levelName;
		this.solution = solution;
	}
	

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	@Override
	public String toString() {
		return "Solution for: " + levelName + "\n";
	}
}
