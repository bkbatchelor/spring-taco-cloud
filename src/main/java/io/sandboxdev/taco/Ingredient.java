package io.sandboxdev.taco;

public record Ingredient(String id, String name, io.sandboxdev.taco.Ingredient.Type type) {
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
