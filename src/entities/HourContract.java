package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHouer;
	private Integer hours;
	
	public HourContract() {
		
	}
	
	public HourContract (Date date, Double valuePerHour, Integer Hours) {
		this.date = date;
		this.valuePerHouer = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHouer() {
		return valuePerHouer;
	}

	public void setValuePerHouer(Double valuePerHouer) {
		this.valuePerHouer = valuePerHouer;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue () {
		return valuePerHouer * hours;
	}
}
