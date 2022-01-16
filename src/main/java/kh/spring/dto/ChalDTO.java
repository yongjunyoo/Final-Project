package kh.spring.dto;

import java.sql.Timestamp;

public class ChalDTO {
	private int seq;
	private String chalName;
	private Timestamp startDate;
	private Timestamp endDate;
	private int personnel;
	private String chalInfo;
	private String tag;
	private String price;
	private String day;
	private String category;
	
	public ChalDTO() {}

	public ChalDTO(int seq, String chalName, Timestamp startDate, Timestamp endDate, int personnel, String chalInfo,
			String tag, String price, String day, String category) {
		super();
		this.seq = seq;
		this.chalName = chalName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.personnel = personnel;
		this.chalInfo = chalInfo;
		this.tag = tag;
		this.price = price;
		this.day = day;
		this.category = category;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getChalName() {
		return chalName;
	}
	public void setChalName(String chalName) {
		this.chalName = chalName;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public int getPersonnel() {
		return personnel;
	}
	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}
	public String getChalInfo() {
		return chalInfo;
	}
	public void setChalInfo(String chalInfo) {
		this.chalInfo = chalInfo;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
