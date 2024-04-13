package me.stylescraft.assets.items;

import me.stylescraft.assets.entities.RockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Rock extends Item {
    public Rock(Settings settings) { super(settings); }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack item = user.getStackInHand(hand);
        if(!world.isClient()){
            RockEntity rock = new RockEntity(world, user);
            rock.setItem(item);
            rock.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.0f, 1.0f);
            world.spawnEntity(rock);
        }
        return TypedActionResult.success(item, world.isClient());
    }
}