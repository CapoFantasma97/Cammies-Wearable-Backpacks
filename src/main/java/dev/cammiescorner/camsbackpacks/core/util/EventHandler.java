package dev.cammiescorner.camsbackpacks.core.util;

import dev.cammiescorner.camsbackpacks.common.items.BackpackItem;
import eu.pb4.graves.event.PlayerGraveItemAddedEvent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.ActionResult;

public class EventHandler {
	public static void gravesEvents() {
		PlayerGraveItemAddedEvent.EVENT.register((player, stack) -> {
			if(stack.getItem() instanceof BackpackItem && stack.equals(player.getEquippedStack(EquipmentSlot.CHEST)))
				return ActionResult.FAIL;

			return ActionResult.PASS;
		});
	}
}
