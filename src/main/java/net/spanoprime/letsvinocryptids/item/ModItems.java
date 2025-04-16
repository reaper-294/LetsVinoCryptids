package net.spanoprime.letsvinocryptids.item;

import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MagmaBlock;
import net.minecraft.world.level.block.StonecutterBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.redstone.Redstone;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spanoprime.letsvinocryptids.LetsVinoCryptids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LetsVinoCryptids.MOD_ID);

    public static final RegistryObject<Item> APPALACHIAN_MAP_PIECE = ITEMS.register("appalachian_map_piece",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPIRITS_MAP_PIECE = ITEMS.register("spirits_map_piece",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> APPALACHIAN_FOREST_MAP = ITEMS.register("appalachian_forest_map",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPIRITS_FOREST_MAP = ITEMS.register("spirits_forest_map",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TALES_OF_FOLKLORE = ITEMS.register("tales_of_folklore",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
