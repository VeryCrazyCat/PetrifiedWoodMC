package net.crazycat.petrifiedwood.block;

import net.crazycat.petrifiedwood.PetrifiedWood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PETRIFIED_OAK_PLANKS = registerBlock("petrified_oak_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_BIRCH_PLANKS = registerBlock("petrified_birch_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_BIRCH_SLAB = registerBlock("petrified_birch_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_SPRUCE_PLANKS = registerBlock("petrified_spruce_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_SPRUCE_SLAB = registerBlock("petrified_spruce_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_JUNGLE_PLANKS = registerBlock("petrified_jungle_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_JUNGLE_SLAB = registerBlock("petrified_jungle_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_ACACIA_PLANKS = registerBlock("petrified_acacia_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_ACACIA_SLAB = registerBlock("petrified_acacia_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_DARK_OAK_PLANKS = registerBlock("petrified_dark_oak_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_DARK_OAK_SLAB = registerBlock("petrified_dark_oak_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_MANGROVE_PLANKS = registerBlock("petrified_mangrove_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_MANGROVE_SLAB = registerBlock("petrified_mangrove_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_CRIMSON_PLANKS = registerBlock("petrified_crimson_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_CRIMSON_SLAB = registerBlock("petrified_crimson_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_WARPED_PLANKS = registerBlock("petrified_warped_planks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block PETRIFIED_WARPED_SLAB = registerBlock("petrified_warped_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2f).requiresTool().mapColor(MapColor.YELLOW).resistance(30f)), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK,new Identifier(PetrifiedWood.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(PetrifiedWood.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        PetrifiedWood.LOGGER.debug("Registering Mod Blocks for " + PetrifiedWood.MOD_ID);
    }
}
