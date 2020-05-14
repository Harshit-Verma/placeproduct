package com.cg.placeproduct.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="placeproducts_tbl")
public class PlaceProduct {


	private int orderId;
	private String name;
	private int distributorId;
	private int quantityUnit;
	private Date dateOfOrder;
	private Date dateOfDelivery;
	private int pricePerUnit;
	private int totalPrice;
	private String deliveryStatus;
	private int warehouseId;
	public PlaceProduct() {
		
	}
	public PlaceProduct(int orderId, String name, int distributorId, int quantityUnit, Date dateOfOrder,
			Date dateOfDelivery, int pricePerUnit, int totalPrice, String deliveryStatus, int warehouseId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.distributorId = distributorId;
		this.quantityUnit = quantityUnit;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
		this.warehouseId = warehouseId;
	}
	@Id
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Column(name = "name", length = 15)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "distributorId", length = 15)
	public int getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}
	@Column(name = "quantityUnit", length = 15)
	public int getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	@Column(name = "dateOfOrder")
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	@Column(name = "dateOfDelivery")
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	@Column(name = "pricePerUnit", length = 15)
	public int getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	@Column(name = "totalPrice", length = 15)
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Column(name = "deliverystatus", length = 15)
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	@Column(name = "warehouseId", length = 15)
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	@Override
	public String toString() {
		return "PlaceProduct [orderId=" + orderId + ", name=" + name + ", distributorId=" + distributorId
				+ ", quantityUnit=" + quantityUnit + ", dateOfOrder=" + dateOfOrder + ", dateOfDelivery="
				+ dateOfDelivery + ", pricePerUnit=" + pricePerUnit + ", totalPrice=" + totalPrice + ", deliveryStatus="
				+ deliveryStatus + ", warehouseId=" + warehouseId + "]";
	}
	
}
