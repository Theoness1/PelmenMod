package ru.theoness.pelmenmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import ru.theoness.pelmenmod.registry.PelmenRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PelmenMain implements ModInitializer {

	public static final ItemGroup PELMEN_GROUP = FabricItemGroupBuilder.create(
			new Identifier("pelmenmod", "items"))
			.icon(() -> new ItemStack(PelmenRegistry.PELMEN))
			.build();


	@Override
	public void onInitialize() {

		PelmenRegistry.reg_items();

	}
}
