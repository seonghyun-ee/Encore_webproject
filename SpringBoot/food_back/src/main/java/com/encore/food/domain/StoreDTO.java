package com.encore.food.domain;

import org.apache.ibatis.type.Alias;

@Alias("store")
public class StoreDTO {
	private int store_id;
	private String store_img;
	private String store_address;
	private String store_phone;
	private String category;
	private String parking;
	private String opentime;
	private String closetime;
	private String dayoff;
	private String store_name;
	private String id;
	private double score_avg;
	
	public StoreDTO() {
		
	}

	public StoreDTO(int store_id, String store_img, String store_address, String store_phone, String category,
			String parking, String opentime, String closetime, String dayoff, String store_name, String id,
			double score_avg) {
		super();
		this.store_id = store_id;
		this.store_img = store_img;
		this.store_address = store_address;
		this.store_phone = store_phone;
		this.category = category;
		this.parking = parking;
		this.opentime = opentime;
		this.closetime = closetime;
		this.dayoff = dayoff;
		this.store_name = store_name;
		this.id = id;
		this.score_avg = score_avg;
	}
	
	public double getScore_avg() {
		return score_avg;
	}
	
	public void setScore_avg(double score_avg) {
		this.score_avg = score_avg;
	}
	
	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public String getStore_img() {
		return store_img;
	}

	public void setStore_img(String store_img) {
		this.store_img = store_img;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public String getStore_phone() {
		return store_phone;
	}

	public void setStore_phone(String store_phone) {
		this.store_phone = store_phone;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public String getDayoff() {
		return dayoff;
	}

	public void setDayoff(String dayoff) {
		this.dayoff = dayoff;
	}
	
	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "StoreDto [store_id=" + store_id + ", store_img=" + store_img + ", store_address=" + store_address
				+ ", store_phone=" + store_phone + ", category=" + category + ", parking=" + parking + ", opentime="
				+ opentime + ", closetime=" + closetime + ", dayoff=" + dayoff + ", store_name=" + store_name + ", id="
				+ id + ", score_avg=" + score_avg + "]";
	}
}