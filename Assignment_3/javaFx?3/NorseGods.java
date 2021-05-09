package One;

import java.util.ArrayList;

public class NorseGods {
	
private String Name;
private String race ;
private String desc;


public NorseGods() {
	
}
public NorseGods(String Name , String race ,String desc) {
	this.Name=Name ;
	this.race=race;
	this.desc=desc;
	
	
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getRace() {
	return race;
}
public void setRace(String race) {
	this.race = race;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

}

