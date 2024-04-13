package me.stylescraft.mixin;

import me.stylescraft.StylesCraft;
import net.minecraft.entity.InventoryOwner;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.GameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameMode.class)
public abstract class DefaultMixin {

	/*
	@Shadow
    private int sleepTimer;

	@Inject(method = "tick()V", at = @At("HEAD"))
	public void pickup(CallbackInfo ci){
		PlayerEntity player = (PlayerEntity) (Object) this;
		if(player.isSleeping() & sleepTimer < 50) {
			sleepTimer = 90;
		}
	}
	*/

	//@Shadow
    //private int sleepTimer;
}