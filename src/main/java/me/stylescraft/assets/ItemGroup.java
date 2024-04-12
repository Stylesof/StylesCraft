package me.stylescraft.assets;

import me.stylescraft.StylesCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroup {

    //StylesCraft mod window
    @SuppressWarnings("unused")
    private static final net.minecraft.item.ItemGroup STYLESCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
    new Identifier(StylesCraft.MOD_ID, "sc"),
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + StylesCraft.MOD_ID + ".menu"))
    .icon(() -> new ItemStack(Items.ROCK)).entries((displayContext, entries) -> {
        
        //Items/Blocks to add
        //entries.add(Blocks.DAEDRIC_BLOCK);
        entries.add(Items.ROCK);

    }).build());

    public static final void registerItemGroup(){
        StylesCraft.LOGGER.info("Loading Item Group from: " + StylesCraft.MOD_ID);
    }
}
