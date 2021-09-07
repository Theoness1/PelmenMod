package ru.theoness.pelmenmod.registry;

import net.minecraft.item.Items;
import ru.theoness.pelmenmod.item.PelmenBowl;
import ru.theoness.pelmenmod.item.PelmenItem;
import ru.theoness.pelmenmod.PelmenMain;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PelmenRegistry {

  public static final Item TESTO_FOR_PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*15), 0.45f).build()));
  public static final Item MEAT_BALL = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*10), 0.35f).build()));
  public static final Item PELMEN_NEGOTOVIY = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*10), 0.55f).build()));
  public static final Item PELMENI_NAVARKU = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(1));
  public static final Item VARENIE_PELMENI = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(1).recipeRemainder(Items.BUCKET));
  public static final Item PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()));
  public static final Item TARELKA_PELMENEI = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build()));
  public static final Item FRIED_PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
  public static final Item TARELKA_FRIED_PELMEN = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build()));


    public static void reg_items() {

      Registry.register(Registry.ITEM, new Identifier("pelmenid", "testo_for_pelmen"), TESTO_FOR_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "meat_ball"), MEAT_BALL);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmen_negotoviy"), PELMEN_NEGOTOVIY);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmeni_navarku"), PELMENI_NAVARKU);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "varenie_pelmeni"), VARENIE_PELMENI);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmen"), PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "tarelka_pelmenei"), TARELKA_PELMENEI);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "fried_pelmen"), FRIED_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "tarelka_fried_pelmen"), TARELKA_FRIED_PELMEN);
    }
}
