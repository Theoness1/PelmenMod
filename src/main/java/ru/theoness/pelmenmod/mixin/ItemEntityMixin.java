package ru.theoness.pelmenmod.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.theoness.pelmenmod.registry.PelmenRegistry;

@Mixin(ItemEntity.class)
abstract class ItemEntityMixin extends Entity {


    public ItemEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Shadow public abstract ItemStack getStack();

    @Shadow public abstract void setStack(ItemStack stack);

    @Inject(at = @At("HEAD"), method = "tick")

    private void tick(CallbackInfo ci) {

        if(this.getStack().isOf(PelmenRegistry.PELMEN) && this.isTouchingWater()) {

            world.playSound(null, getBlockPos(), SoundEvents.AMBIENT_UNDERWATER_ENTER, SoundCategory.BLOCKS, 2, 1);

            this.setStack(new ItemStack(PelmenRegistry.WATER_PELMEN, getStack().getCount()));
        }

        if(this.getStack().isOf(PelmenRegistry.KETCHUP_ZAGATOVKA) && this.isInLava()) {

            world.playSound(null, getBlockPos(), SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 2, 1);

            this.setStack(PelmenRegistry.KETCHUP.getDefaultStack());

        }

        if(this.getStack().isOf(PelmenRegistry.PELMEN) && this.isInLava()) {

            world.playSound(null, getBlockPos(), SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 2, 1);

            this.setStack(new ItemStack(PelmenRegistry.LAVA_PELMEN, getStack().getCount()));

        }

    }




}
