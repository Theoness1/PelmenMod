package ru.theoness.pelmenmod.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.LavaCauldronBlock;
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

@Mixin(LavaCauldronBlock.class)
public class LavaCauldronBlockMixin {

    @Inject(at = @At("HEAD"), method = "onEntityCollision")

    private void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, CallbackInfo ci) {

        if(!world.isClient && entity instanceof ItemEntity itemEntity) {

            if(itemEntity.getStack().isOf(PelmenRegistry.KETCHUP_ZAGATOVKA)) {

                world.playSound(null, itemEntity.getBlockPos(), SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 2, 1);

                itemEntity.setStack(PelmenRegistry.KETCHUP.getDefaultStack());
            }

            if(itemEntity.getStack().isOf(PelmenRegistry.PELMEN)) {

                world.playSound(null, itemEntity.getBlockPos(), SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 2, 1);

                itemEntity.setStack(PelmenRegistry.LAVA_PELMEN.getDefaultStack());
            }
        }

    }

}
