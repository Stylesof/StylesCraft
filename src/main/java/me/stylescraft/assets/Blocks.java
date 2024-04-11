package me.stylescraft.assets;

import me.stylescraft.StylesCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Blocks {
    
    //BLOCKS
    public static final Block DAEDRIC_BLOCK = addBlock("daedric_block", new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));
    //BLOCKS

    //BLOCK FUNCTIONS ------------------------------------------------------------------------------------------------------------------------TEST
    public static final Block addBlock(String name, Block block){
            addBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StylesCraft.MOD_ID, name), block);
    }

    public static final BlockItem addBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(StylesCraft.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static final void registerModBlock(){
        StylesCraft.LOGGER.info("Loading blocks from: " + StylesCraft.MOD_ID);
    }
}
