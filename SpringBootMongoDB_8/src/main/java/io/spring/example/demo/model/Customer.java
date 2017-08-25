package io.spring.example.demo.model;

import java.io.Serializable;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hello")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String items;
	private String card;
	private Addresses addresses[];

	public Customer() {

	}

	public Customer(String id, String items, String card, Addresses[] addresses) {
		super();
		this.id = id;
		this.items = items;
		this.card = card;
		this.addresses = addresses;
	}

	public Addresses[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Addresses[] addresses) {
		this.addresses = addresses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", items=" + items + ", card=" + card + ", addresses="
				+ Arrays.toString(addresses) + "]";
	}

}
