package ru.theoness.pelmenmod.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.theoness.pelmenmod.registry.PelmenRegistry;

@Mixin(PowderSnowBlock.class)
public class PowderSnowMixin {

    @Inject(at = @At("HEAD"), method = "onEntityCollision")

    private void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, CallbackInfo ci) {
        if(!world.isClient && entity instanceof ItemEntity itemEntity) {

            if(itemEntity.getStack().isOf(PelmenRegistry.SOUR_CREAM_ZAGATOVKA)) {

                world.playSound(null, itemEntity.getBlockPos(), SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.BLOCKS, 2, 1);

                itemEntity.setStack(PelmenRegistry.SOUR_CREAM.getDefaultStack());
            }
        }
    }
}
