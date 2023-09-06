# RottenFlesh2Leather

## About

Minecraft plugin that allows people to cook rotten flesh in a furnace or campfire to make leather.

## How to change settings in config.yml

Settings regarding disabling cooking methods, xp amounts, and cooking times are located in the config.yml file located in a folder called RottenFlesh2Leather inside of your plugin folder.

config.yml looks like the following:

```
# Enable or disable certain cooking methods (Default = true)
recipes:
  allowFurnace: true
  allowSmoker: true
  allowCampfire: true

# Change the amount of time it takes to cook in ticks (Default = 200, 100, 600)
cooking-time:
  furnaceCookingTime: 200
  smokerCookingTime: 100
  campfireCookingTime: 600

# Set custom xp level (Default = 1.0)
xp-level: 1.0
```

The recipes category allows you to disable certain methods of cooking. Simply changing the setting to false will disable the recipe.

The cooking-time category allows you to change the amount of time it takes to cook the item in ticks. Minecraft runs at 20 ticks per seconds which means that 100 = 5 seconds.

The xp-level setting allows you to change the amount of xp the user will receive after receiving the leather. This setting must be a decimal.
