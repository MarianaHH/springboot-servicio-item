package com.mariana.springboot.app.item.models;

import com.mariana.springboot.app.commons.models.entity.Producto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
	private Producto producto;
	private Integer cantidad;

	public Item() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Item(Producto producto, Integer cantidad) {
		// super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
}
