/** SAMPLE INPUT
See files in inputdir/vertices and inputdir/edges
**/

// CONFIGURATION
// Configures the data loader to create the schema
config create_schema: false, load_new: true

// DATA INPUT
// Define the data input source using inputdir is the directory for the 
// input files that is specified in the config file

// *** REPLACE ALL vertices/ files with File.directory? ***
person = File.csv(inputdir + "vertices/" + "person.csv").delimiter(delimiter)
personCountry = File.csv(inputdir + "vertices/" + "personCountry.csv").delimiter(delimiter)
recipe = File.csv(inputdir + "vertices/" + "recipe.csv").delimiter(delimiter)
book = File.csv(inputdir + "vertices/" + "book.csv").delimiter(delimiter)
meal = File.csv(inputdir + "vertices/" + "meal.csv").delimiter(delimiter)
meal_item = File.csv(inputdir + "vertices/" + "meal_item.csv").delimiter(delimiter)
ingredient = File.csv(inputdir + "vertices/" + "ingredient.csv").delimiter(delimiter)
home = File.csv(inputdir + "vertices/" + "home.csv").delimiter(delimiter)
store = File.csv(inputdir + "vertices/" + "store.csv").delimiter(delimiter)
fridge_sensor = File.csv(inputdir + "vertices/" + "fridge_sensor.csv").delimiter(delimiter)
location = File.csv(inputdir + "vertices/" + "location.csv").delimiter(delimiter)
location_cartesian = File.csv(inputdir + "vertices/" + "location_cartesian.csv").delimiter(delimiter)

// *** REPLACE ALL edges/ files with File.directory? ***
ate = File.csv(inputdir + "edges/" + "ate.csv").delimiter(delimiter)
authored = File.csv(inputdir + "edges/" + "authored.csv").delimiter(delimiter)
contains = File.csv(inputdir + "edges/" + "contains.csv").delimiter(delimiter)
created = File.csv(inputdir + "edges/" + "created.csv").delimiter(delimiter)
includedIn_ingredient_recipe = File.csv(inputdir + "edges/" + "includedIn_ingredient_recipe.csv").delimiter(delimiter)
includedIn_meal_book = File.csv(inputdir + "edges/" + "includedIn_meal_book.csv").delimiter(delimiter)
includedIn_recipe_book = File.csv(inputdir + "edges/" + "includedIn_recipe_book.csv").delimiter(delimiter)
includedIn_recipe_meal = File.csv(inputdir + "edges/" + "include_recipe_meal.csv").delimiter(delimiter)
includes = File.csv(inputdir + "edges/" + "includes.csv").delimiter(delimiter)
isLocatedAt_fridge_sensor = File.csv(inputdir + "edges/" + "isLocatedAt_fridge_sensor.csv").delimiter(delimiter)
isLocatedAt_home = File.csv(inputdir + "edges/" + "isLocatedAt_home.csv").delimiter(delimiter)
isLocatedAt_store = File.csv(inputdir + "edges/" + "isLocatedAt_store.csv").delimiter(delimiter)
isStockedWith = File.csv(inputdir + "edges/" + "isStockedWith.csv").delimiter(delimiter)
knows = File.csv(inputdir + "edges/" + "knows.csv").delimiter(delimiter)
reviewed = File.csv(inputdir + "edges/" + "reviewed.csv").delimiter(delimiter)

//Specifies what data source to load using which mapper (as defined inline)
load(person).asVertices {
    label "person"
    key "personId"
}

load(personCountry).asVertices {
    label "person"
    key "personId"
    exists()
}

load(recipe).asVertices {
    label "recipe"
    key "recipeId"
}

load(book).asVertices {
    label "book"
    key "bookId"
}

load(meal).asVertices {
    label "meal"
    key "mealId"
}

load(meal_item).asVertices {
    label "meal_item"
    key "itemId"
}

load(ingredient).asVertices {
    label "ingredient"
    key "ingredId"
}

load(home).asVertices {
    label "home"
    key "homeId"
}

load(store).asVertices {
    label "store"
    key "storeId"
}

load(fridge_sensor).asVertices {
    label "fridge_sensor"
    key cityId: "cityId", sensorId: "sensorId"
}

load(location).asVertices {
    label "location"
    key "locId"
}

load(location_cartesian).asVertices {
    label "location"
    key "locId"
}

load(ate).asEdges {
    label "ate"
    inV "mealId", {
        label "meal"
        key "mealId"
        exists()
    }
    outV "personId", {
        label "person"
        key "personId"
        exists()
    }
}

load(authored).asEdges {
    label "authored"
    inV "bookId", {
        label "book"
        key "bookId"
        exists()
    }
    outV "personId", {
        label "person"
        key "personId"
        exists()
    }
}

load(contains).asEdges {
    label "ate"
    inV "ingredId", {
        label "ingredient"
        key "ingredId"
        exists()
    }
    outV "fridge_sensor" {
        label "fridge_sensor"
        key cityId: "cityId", sensorId: "sensorId"
        exists()
    }
}

load(created).asEdges {
    label "created"
    inV "recipeId", {
        label "recipe"
        key "recipeId"
        exists()
    }
    outV "personId", {
        label "person"
        key "personId"
        exists()
    }
}

load(includedIn_ingredient_recipe).asEdges {
    label "includedIn"
    inV "recipeId", {
        label "recipe"
        key "recipeId"
        exists()
    }
    outV "ingredId", {
        label "ingredient"
        key "ingredId"
        exists()
    }
}

load(includedIn_meal_book).asEdges {
    label "includedIn"
    inV "bookId", {
        label "book"
        key "bookId"
        exists()
    }
    outV "mealId", {
        label "meal"
        key "mealId"
        exists()
    }
}

load(includedIn_recipe_book).asEdges {
    label "includedIn"
    inV "bookId", {
        label "book"
        key "bookId"
        exists()
    }
    outV "recipeId", {
        label "recipe"
        key "recipeId"
        exists()
    }
}

load(includedIn_recipe_meal).asEdges {
    label "includedIn"
    inV "mealId", {
        label "meal"
        key "mealId"
        exists()
    }
    outV "recipeId", {
        label "recipe"
        key "recipeId"
        exists()
    }
}

load(includes).asEdges {
    label "includes"
    inV "itemId", {
        label "meal_item"
        key "itemId"
        exists()
    }
    outV "mealId", {
        label "meal"
        key "mealId"
        exists()
    }
}

load(isLocatedAt_fridge_sensor).asEdges {
    label "isLocatedAt"
    inV "homeId", {
        label "home"
        key "homeId"
        exists()
    }
    outV "fridge_sensor", {
        label "fridge_sensor"
        key cityId: "cityId", sensorId: "sensorId"
        exists()
    }
}

load(isLocatedAt_home).asEdges {
    label "isLocatedAt"
    inV "locId", {
        label "location"
        key "locId"
        exists()
    }
    outV "homeId", {
        label "home"
        key "homeId"
        exists()
    }
}

load(isLocatedAt_store).asEdges {
    label "isLocatedAt"
    inV "locId", {
        label "location"
        key "locId"
        exists()
    }
    outV "storeId", {
        label "store"
        key "storeId"
        exists()
    }
}

load(isStockedWith).asEdges {
    label "isStockedWith"
    inV "ingredId", {
        label "ingredient"
        key "ingredId"
        exists()
    }
    outV "storeId", {
        label "store"
        key "storeId"
        exists()
    }
}

load(knows).asEdges {
    label "knows"
    outV "u1", {
        label "person"
        key "personId"
    exists()
    }
    inV "u2", {
        label "person"
        key "personId"
    exists()
    }
}

load(reviewed).asEdges {
    label "reviewed"
    outV "recipeId", {
        label "recipe"
        key "recipeId"
    exists()
    }
    inV "personId", {
        label "person"
        key "personId"
    exists()
    }
}