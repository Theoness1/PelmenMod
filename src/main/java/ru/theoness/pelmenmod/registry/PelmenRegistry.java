package ru.theoness.pelmenmod.registry;

import net.minecraft.item.Items;
import ru.theoness.pelmenmod.item.Drink_Item;
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

    //#1.0
  public static final Item TESTO_FOR_PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*15), 0.45f).build()));
  public static final Item MEAT_BALL = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*10), 0.35f).build()));
  public static final Item PELMEN_NEGOTOVIY = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*10), 0.55f).build()));
  public static final Item PELMENI_NAVARKU = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(1));
  public static final Item VARENIE_PELMENI = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(1).recipeRemainder(Items.BUCKET));
  public static final Item PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()));
  public static final Item TARELKA_PELMENEI = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build()));
  public static final Item FRIED_PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
  public static final Item TARELKA_FRIED_PELMEN = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build()));

     //#2.0
     public static final Item EMPT_BOTTLE = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP));
    public static final Item SOUR_CREAM_ZAGATOVKA = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(1).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()));
    public static final Item SOUR_CREAM_HALF = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).recipeRemainder(EMPT_BOTTLE).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()));
    public static final Item SOUR_CREAM = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).recipeRemainder(SOUR_CREAM_HALF).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item YOLK = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*20), 0.20f).snack().build()));
    public static final Item MAIONEZ_HALF = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).recipeRemainder(EMPT_BOTTLE).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()));
    public static final Item MAIONEZ = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).recipeRemainder(MAIONEZ_HALF).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item KETCHUP_ZAGATOVKA = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(1).fireproof().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20*40), 0.80f).build()));
    public static final Item KETCHUP_HALF = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).fireproof().recipeRemainder(EMPT_BOTTLE).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()));
    public static final Item KETCHUP = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).fireproof().recipeRemainder(KETCHUP_HALF).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item KETCHUNEZ_HALF = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).recipeRemainder(EMPT_BOTTLE).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build()));
    public static final Item KETCHUNEZ = new Drink_Item(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(4).recipeRemainder(KETCHUNEZ_HALF).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()));
    public static final Item PELMENI_W_SMETANA = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build()));
    public static final Item PELMENI_W_MAIONEZ = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build()));
    public static final Item PELMENI_W_KETCHUP = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build()));
    public static final Item PELMENI_W_KETCHUNEZ = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build()));
    public static final Item F_PELMEN_W_SMETANA = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).build()));
    public static final Item F_PELMEN_W_MAIONEZ = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build()));
    public static final Item F_PELMEN_W_KETCHUP = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build()));
    public static final Item F_PELMEN_W_KETCHUNEZ = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.1f).build()));
    public static final Item LAVA_PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(64).fireproof().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*6), 0.30f).build()));
    public static final Item WATER_PELMEN = new PelmenItem(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(64).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20*6), 0.30f).build()));
    public static final Item TARELKA_LAVA_PELMEN = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 15), 0.50f).build()));
    public static final Item TARELKA_WATER_PELMEN = new PelmenBowl(new Item.Settings().group(PelmenMain.PELMEN_GROUP).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20* 15), 0.50f).build()));


  public static void reg_items() {

      //#1.0
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "testo_for_pelmen"), TESTO_FOR_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "meat_ball"), MEAT_BALL);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmen_negotoviy"), PELMEN_NEGOTOVIY);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmeni_navarku"), PELMENI_NAVARKU);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "varenie_pelmeni"), VARENIE_PELMENI);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmen"), PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "tarelka_pelmenei"), TARELKA_PELMENEI);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "fried_pelmen"), FRIED_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "tarelka_fried_pelmen"), TARELKA_FRIED_PELMEN);

      //#2.0
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "sour_cream_zagatovka"), SOUR_CREAM_ZAGATOVKA);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "sour_cream_half"), SOUR_CREAM_HALF);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "sour_cream"), SOUR_CREAM);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "yolk"), YOLK);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "maionez"), MAIONEZ);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "maionez_half"), MAIONEZ_HALF);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "ketchup_zagatovka"), KETCHUP_ZAGATOVKA);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "ketchup_half"), KETCHUP_HALF);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "ketchup"), KETCHUP);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "ketchunez_half"), KETCHUNEZ_HALF);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "ketchunez"), KETCHUNEZ);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "empt_bottle"), EMPT_BOTTLE);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmeni_w_smetana"), PELMENI_W_SMETANA);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmeni_w_maionez"), PELMENI_W_MAIONEZ);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmeni_w_ketchup"), PELMENI_W_KETCHUP);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "pelmeni_w_ketchunez"), PELMENI_W_KETCHUNEZ);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "f_pelmen_w_smetana"), F_PELMEN_W_SMETANA);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "f_pelmen_w_maionez"), F_PELMEN_W_MAIONEZ);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "f_pelmen_w_ketchup"), F_PELMEN_W_KETCHUP);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "f_pelmen_w_ketchunez"), F_PELMEN_W_KETCHUNEZ);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "tarelka_lava_pelmen"), TARELKA_LAVA_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "tarelka_water_pelmen"), TARELKA_WATER_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "lava_pelmen"), LAVA_PELMEN);
      Registry.register(Registry.ITEM, new Identifier("pelmenid", "water_pelmen"), WATER_PELMEN);

  }
}
