package model;

public class Students {
	String Classes;
	String id;
	String name;
	Double GPA;
	public String getClasses() {
		return Classes;
	}
	public void setClass(String classes) {
		Classes = classes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gPA) {
		GPA = gPA;
	}
	public Students(String classes, String id, String name, Double gPA) {
		super();
		Classes = classes;
		this.id = id;
		this.name = name;
		GPA = gPA;
	}
	public Students() {
		super();
	}	
	
	public String getHocLuc() {
		if(GPA == 10.0) {
			return "Outstanding";
		}else if(GPA < 10.0 &&  GPA >= 8.0) {
			return "Good";
		}
		else if(GPA <8 &&  GPA >= 5) {
			return "Fairly";
		}
		else if(GPA < 5 &&  GPA >= 3) {
			return "Average";
		}
		return "Poor";
	}
	
	@Override
	public String toString() {
		String infomation =  	"Class :" 	+ Classes + "\n" + 
								"Id :" 		+ id + "\n" + 
								"Name :" 	+ name + "\n" +
								"GPA :" 	+ GPA + "\n" +
								"Capacity:" 	+ getHocLuc() + "\n" ;
		System.out.println(infomation);
		return infomation;
	}
}
