
public class Date {
	private int year,month,day;

Date(int year,int month,int day){
	this.year=year;
	this.month=month;
	this.day=day;
}


//Setters and Getters
public int getYear() {
	return this.getYear();
}
public int getMonth() {
	return this.month;
}
public int getDay() {
	return this.day;
}
public void setYear(int year) {
	this.year = year;
}
public void setMonth(int month) {
	this.month = month;
}
public void setDay(int day) {
	this.day = day;
}
//toString()method
public String toStromg() {
	//built - in function String.formate() to form a formatted String
	//Specifier "0" to print leading zeros
	return String.format("%02d/%02d%4d", month,day,year);
}
public void setDate(int year,int month,int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}
}