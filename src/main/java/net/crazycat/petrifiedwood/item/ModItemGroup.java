package net.crazycat.petrifiedwood.item;

import net.crazycat.petrifiedwood.PetrifiedWood;
import net.crazycat.petrifiedwood.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup PETRIFIED_WOOD;

    public static void registerModItemGroups() {
        PETRIFIED_WOOD = Registry.register(Registries.ITEM_GROUP, new Identifier(PetrifiedWood.MOD_ID, "petrified_wood"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.petrifiedWood"))
                        .icon(() -> new ItemStack(ModBlocks.PETRIFIED_OAK_PLANKS)).entries((displayContext, entries) -> {

                            entries.add(ModBlocks.PETRIFIED_ACACIA_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_ACACIA_SLAB);

                            entries.add(ModBlocks.PETRIFIED_OAK_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_OAK_SLAB);

                            entries.add(ModBlocks.PETRIFIED_BIRCH_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_BIRCH_SLAB);

                            entries.add(ModBlocks.PETRIFIED_CRIMSON_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_CRIMSON_SLAB);

                            entries.add(ModBlocks.PETRIFIED_DARK_OAK_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_DARK_OAK_SLAB);

                            entries.add(ModBlocks.PETRIFIED_JUNGLE_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_JUNGLE_SLAB);

                            entries.add(ModBlocks.PETRIFIED_MANGROVE_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_MANGROVE_SLAB);

                            entries.add(ModBlocks.PETRIFIED_SPRUCE_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_SPRUCE_SLAB);

                            entries.add(ModBlocks.PETRIFIED_WARPED_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_WARPED_SLAB);

                            entries.add(ModBlocks.PETRIFIED_CHERRY_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_CHERRY_SLAB);

                            entries.add(ModBlocks.PETRIFIED_BAMBOO_PLANKS);
                            entries.add(ModBlocks.PETRIFIED_BAMBOO_SLAB);
                        }).build());
    }

}
