package org.demurestpie.rottenflesh2leather;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class RottenFlesh2Leather extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        FileConfiguration config = getConfig();

        if (config.getBoolean("recipes.allowFurnace")) {
            addFurnaceRecipe(config.getDouble("xp_amount"), config.getInt("cooking-time.furnaceCookingTime"));
        }

        if (config.getBoolean("recipes.allowSmoker")) {
            addSmokerRecipe(config.getDouble("xp_amount"), config.getInt("cooking-time.smokerCookingTime"));
        }

        if (config.getBoolean("recipes.allowCampfire")) {
            addCampfireRecipe(config.getDouble("xp_amount"), config.getInt("cooking-time.campfireCookingTime"));
        }
    }

    private void addFurnaceRecipe(double xpAmount, int cookingTime) {
        // Result from cooking rotten flesh
        ItemStack result = new ItemStack(Material.LEATHER);

        // Add furnace recipe
        FurnaceRecipe furnace_leather_recipe = new FurnaceRecipe(new NamespacedKey(this, "furnace_RF2L"), result, Material.ROTTEN_FLESH, (float) xpAmount, cookingTime);
        getServer().addRecipe(furnace_leather_recipe);
    }

    private void addSmokerRecipe(double xpAmount, int cookingTime) {
        // Result from cooking rotten flesh
        ItemStack result = new ItemStack(Material.LEATHER);

        // Add smoker recipe
        SmokingRecipe smoker_leather_recipe = new SmokingRecipe(new NamespacedKey(this, "smoker_RF2L"), result, Material.ROTTEN_FLESH, (float) xpAmount, cookingTime);
        getServer().addRecipe(smoker_leather_recipe);
    }

    private void addCampfireRecipe(double xpAmount, int cookingTime) {
        // Result from cooking rotten flesh
        ItemStack result = new ItemStack(Material.LEATHER);

        // Add campfire recipe
        CampfireRecipe campfire_leather_recipe = new CampfireRecipe(new NamespacedKey(this, "campfire_RF2L"), result, Material.ROTTEN_FLESH, (float) xpAmount, cookingTime);
        getServer().addRecipe(campfire_leather_recipe);
    }
}

