package org.demurestpie.rottenflesh2leather;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class RottenFlesh2Leather extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleCommandSender console = getServer().getConsoleSender();
        console.sendMessage("RottenFlesh2Leather Enabled");
        leatherRecipe();
    }
    @Override
    public void onDisable() {
        ConsoleCommandSender console = getServer().getConsoleSender();
        console.sendMessage("RottenFlesh2Leather Enabled");
    }

    private void leatherRecipe() {
        ItemStack result = new ItemStack(Material.LEATHER);
        FurnaceRecipe furnace_leather_recipe = new FurnaceRecipe(new NamespacedKey(this, "furnace_RFTL"), result, Material.ROTTEN_FLESH, 1.0f, 200);
        getServer().addRecipe(furnace_leather_recipe);
        CampfireRecipe campfire_leather_recipe = new CampfireRecipe(new NamespacedKey(this, "campfire_RFTL"), result, Material.ROTTEN_FLESH, 1.0f, 600);
        getServer().addRecipe(campfire_leather_recipe);
    }
}
