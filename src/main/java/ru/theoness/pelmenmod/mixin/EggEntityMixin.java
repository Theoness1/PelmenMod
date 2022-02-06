package ru.theoness.pelmenmod.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.theoness.pelmenmod.registry.PelmenRegistry;

@Mixin(EggEntity.class)
 abstract class EggEntityMixin extends ThrownItemEntity {


    public EggEntityMixin(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(at = @At("HEAD"), method = "onCollision")

    private void onCollision(HitResult hitResult, CallbackInfo ci){

        if(!world.isClient) {

            BlockPos pos = this.getLandingPos();

            ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), PelmenRegistry.YOLK.getDefaultStack());

            itemEntity.world.spawnEntity(itemEntity);
        }

    }
}
