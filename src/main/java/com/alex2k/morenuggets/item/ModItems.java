package com.alex2k.morenuggets.item;

import com.alex2k.morenuggets.MoreNuggets;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard",
            new Item(new FabricItemSettings()));
    public static final Item EMERALD_SHARD = registerItem("emerald_shard",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreNuggets.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, DIAMOND_SHARD);
        addToItemGroup(ItemGroups.INGREDIENTS, EMERALD_SHARD);
        addToItemGroup(ItemGroups.INGREDIENTS, COPPER_NUGGET);
        addToItemGroup(ItemGroups.INGREDIENTS, NETHERITE_NUGGET);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        MoreNuggets.LOGGER.info("Registering Mod Items for " + MoreNuggets.MOD_ID);

        addItemsToItemGroup();
    }
}
