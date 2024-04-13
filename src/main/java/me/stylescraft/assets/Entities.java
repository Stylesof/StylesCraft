package me.stylescraft.assets;

import me.stylescraft.StylesCraft;
import me.stylescraft.assets.entities.RockEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Entities {

    public static final EntityType<RockEntity> ROCK_PROJECTILE = Registry.register(Registries.ENTITY_TYPE, new Identifier(StylesCraft.MOD_ID, "rock_projectile"),
            FabricEntityTypeBuilder.<RockEntity>create(SpawnGroup.MISC, RockEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static void registerEntities(){
        StylesCraft.LOGGER.info("Loading Entities from: " + StylesCraft.MOD_ID);
    }
}