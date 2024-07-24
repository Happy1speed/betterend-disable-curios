package net.happyspeed.betterenddisablecurios.mixin;

import net.fabricmc.fabric.api.entity.event.v1.FabricElytraItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.betterx.betterend.integration.trinkets.Elytra;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.betterx.bclib.items.elytra.BCLElytraItem;
import org.betterx.bclib.items.elytra.BCLElytraUtils;

@Mixin(Elytra.class)
public class DisableElytraMixin {
	@Inject(at = @At("HEAD"), method = "register", cancellable = true, remap = false)
	private static void reg(CallbackInfo ci) {
		ci.cancel();
	}
}