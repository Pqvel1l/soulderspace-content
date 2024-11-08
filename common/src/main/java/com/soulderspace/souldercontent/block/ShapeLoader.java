package com.soulderspace.souldercontent.block;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class ShapeLoader {
    private static final String MOD_ID = "souldercontent";

    public static VoxelShape loadShape(ResourceManager resourceManager, String modelName) {
        VoxelShape shape = VoxelShapes.empty();
        Identifier modelPath = new Identifier(MOD_ID, "models/block/" + modelName + ".json");

        try {
            // Загружаем JSON файл модели
            Optional<Resource> optionalResource = resourceManager.getResource(modelPath);
            if (optionalResource.isPresent()) {
                Resource resource = optionalResource.get();
                JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(resource.getInputStream())).getAsJsonObject();
                JsonArray elements = jsonObject.getAsJsonArray("elements");

                // Создаем хитбокс на основе данных из JSON
                for (JsonElement element : elements) {
                    JsonObject box = element.getAsJsonObject();
                    JsonArray from = box.getAsJsonArray("from");
                    JsonArray to = box.getAsJsonArray("to");

                    double x1 = from.get(0).getAsDouble() / 16.0;
                    double y1 = from.get(1).getAsDouble() / 16.0;
                    double z1 = from.get(2).getAsDouble() / 16.0;
                    double x2 = to.get(0).getAsDouble() / 16.0;
                    double y2 = to.get(1).getAsDouble() / 16.0;
                    double z2 = to.get(2).getAsDouble() / 16.0;

                    shape = VoxelShapes.union(shape, VoxelShapes.cuboid(x1, y1, z1, x2, y2, z2));
                }
            } else {
                System.err.println("Model file not found: " + modelPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return shape;
    }
}
