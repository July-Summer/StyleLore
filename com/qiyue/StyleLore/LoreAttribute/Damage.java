package com.qiyue.StyleLore.LoreAttribute;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import com.qiyue.StyleLore.AttributeVac;
import com.qiyue.StyleLore.EntityItem;
import com.qiyue.StyleLore.Lore;
import com.qiyue.StyleLore.StyleAPI;
import com.qiyue.StyleLore.SetAttribute.AttributeEvent;
import com.qiyue.StyleLore.SetAttribute.GetAttributeVau;
import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;

public class Damage {

	public Damage(AttributeEvent event) {
		for(ItemStack item : EntityItem.getEq(event.getDamger())) {
		LivingEntity damger = (LivingEntity)event.getDamger();
		String lore = Lore.get(item, StyleAPI.getByName(AttributeMaterial.Damage));
		if(lore != null && lore.contains(" ")) {
			String s =  lore.replace(StyleAPI.getByName(AttributeMaterial.Damage), "");
			double data = AttributeVac.get(s);
			if(data != -2.0) {
				event.setAttribute(AttributeMaterial.Damage, GetAttributeVau.get(AttributeMaterial.Damage) + data);
			}
		}
	}
}
	
}