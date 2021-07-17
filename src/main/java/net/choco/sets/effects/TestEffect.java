package net.choco.sets.effects;

import net.choco.advancedsets.Core;
import net.choco.advancedsets.handlers.SetEventHandler;
import net.choco.advancedsets.sets.SetEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TestEffect implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        String set = Core.getSetsManager().getSet(p.getUniqueId());
        if (set == null)
            return;

        SetEventHandler seh = new SetEventHandler(p, null, set, SetEvent.blockbreak, false, e);
        seh.runHandler();
        p.sendMessage("Test!");
    }
}
