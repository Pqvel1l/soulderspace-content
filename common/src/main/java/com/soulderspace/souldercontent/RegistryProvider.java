package com.soulderspace.souldercontent;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public abstract class RegistryProvider<R extends Registry<T>, K extends RegistryKey<R>, T> {
    public abstract R getRegistry();
    public abstract K getRegistryKey();
    protected final Map<Identifier, T> queue = new TreeMap<>();

    public final <E extends T> E add(String name , E entry) {
        Identifier id = new Identifier(SoulderContent.ID, name);
        queue.put(id, entry);
        return entry;
    }

    public final void register(BiConsumer<Identifier, T> consumer) {
        queue.forEach(consumer);
    }

    public final List<T> all() {
        return queue.values().stream().toList();
    }
}
