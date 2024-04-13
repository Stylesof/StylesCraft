package me.stylescraft.assets.entities;

import me.stylescraft.assets.Blocks;
import me.stylescraft.assets.Entities;
import me.stylescraft.assets.Items;
import me.stylescraft.assets.items.Rock;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class RockEntity extends ThrownItemEntity {

    public RockEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public RockEntity(EntityType<? extends ThrownItemEntity> entityType, double d, double e, double f, World world) {
        super(entityType, d, e, f, world);
    }
    //---------------------------------------------------------------------------------------------------------------
    public RockEntity(World world, LivingEntity owner) {
        super(Entities.ROCK_PROJECTILE ,owner, world);
    }

    @Override
    protected Item getDefaultItem(){
        return Items.ROCK;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity Ehit = entityHitResult.getEntity();
        Ehit.damage(this.getDamageSources().thrown(this, this.getOwner()), 2.5f);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
        }
            //this.discard();
    }
}
