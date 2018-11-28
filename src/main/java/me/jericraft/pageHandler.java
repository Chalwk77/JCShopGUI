package me.jericraft;

import org.bukkit.entity.Player;

import static me.jericraft.category_Food.*;
import static me.jericraft.category_Tools.*;
import static me.jericraft.category_Combat.*;
import static me.jericraft.category_Brewing.*;
import static me.jericraft.category_Redstone.*;
import static me.jericraft.category_Transport.*;
import static me.jericraft.category_Miscellaneous.*;
import static me.jericraft.category_BuildingBlocks.*;
import static me.jericraft.category_DecorationBlocks.*;


public class pageHandler {
    public static void openMainMenu(Player p, Boolean bool) {
        if (bool == true) {
            p.closeInventory();
        }
        p.openInventory(me.jericraft.main_menu.menu);
        return;
    }

    public static void openBuildingBlocksGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(buildingBlocks_1);
        } else if (page_num == 2) {
            p.openInventory(buildingBlocks_2);
        } else if (page_num == 3) {
            p.openInventory(buildingBlocks_3);
        } else if (page_num == 4) {
            p.openInventory(buildingBlocks_4);
        } else if (page_num == 5) {
            p.openInventory(buildingBlocks_5);
        } else if (page_num == 6) {
            p.openInventory(buildingBlocks_6);
        }
        return;
    }

    public static void openDecorationGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(decorationBlocks_1);
        } else if (page_num == 2) {
            p.openInventory(decorationBlocks_2);
        } else if (page_num == 3) {
            p.openInventory(decorationBlocks_3);
        } else if (page_num == 4) {
            p.openInventory(decorationBlocks_4);
        } else if (page_num == 5) {
            p.openInventory(decorationBlocks_5);
        }
        return;
    }

    public static void openRedstoneGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(redstone_1);
        } else if (page_num == 2) {
            p.openInventory(redstone_2);
        }
        return;
    }

    public static void openTransportGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(transport_1);
        }
        return;
    }

    public static void openMiscellaneousGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(miscellaneous_1);
        } else if (page_num == 2) {
            p.openInventory(miscellaneous_2);
        } else if (page_num == 3) {
            p.openInventory(miscellaneous_3);
        } else if (page_num == 4) {
            p.openInventory(miscellaneous_4);
        }
        return;
    }

    public static void openFoodGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(food_1);
        }
        return;
    }

    public static void openToolsGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(tools_1);
        }
        return;
    }

    public static void openCombatGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(combat_1);
        }
        return;
    }

    public static void openBrewingGUI(Player p, int page_num) {
        p.closeInventory();
        if (page_num == 1) {
            p.openInventory(brewing_1);
        }
        return;
    }
}
