package me.stylescraft.assets;

import me.stylescraft.StylesCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    public static final Item ROCK = addItem("rock", new Item(new Item.Settings()));
    
    public static final Item addItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(StylesCraft.MOD_ID, name), item);
    }

    public static final void registerItems(){
        StylesCraft.LOGGER.info("Loading Items from: " + StylesCraft.MOD_ID);
    }
}
