// script = new File('/Users/lorinapoland/CLONES/graph-examples/generateAll.groovy').text; []
// :> @script

// Add all vertices and edges for Recipe

// author vertices
juliaChild = graph.addVertex(label, 'author', 'id', 1, 'aname','Julia Child', 'gender', 'F')
simoneBeck = graph.addVertex(label, 'author', 'id', 2, 'aname', 'Simone Beck', 'gender', 'F')
louisetteBertholie = graph.addVertex(label, 'author', 'id', 3, 'aname', 'Louisette Bertholie', 'gender', 'F')
patriciaSimon = graph.addVertex(label, 'author', 'id', 4, 'aname', 'Patricia Simon', 'gender', 'F')
aliceWaters = graph.addVertex(label, 'author', 'id', 5, 'aname', 'Alice Waters', 'gender', 'F')
patriciaCurtan = graph.addVertex(label, 'author', 'id', 6, 'aname', 'Patricia Curtan', 'gender', 'F')
kelsieKerr = graph.addVertex(label, 'author', 'id', 7, 'aname', 'Kelsie Kerr', 'gender', 'F')
fritzStreiff = graph.addVertex(label, 'author', 'id', 8, 'aname', 'Fritz Streiff', 'gender', 'M')
emerilLagasse = graph.addVertex(label, 'author', 'id', 9, 'aname', 'Emeril Lagasse', 'gender', 'M')
jamesBeard = graph.addVertex(label, 'author', 'id', 10, 'aname', 'James Beard', 'gender', 'M')

// book vertices
artOfFrenchCookingVolOne = graph.addVertex(label, 'book', 'id', 100, 'bookTitle', 'The Art of French Cooking, Vol. 1', 'publishDate', 1961)
simcasCuisine = graph.addVertex(label, 'book', 'id', 101,'bookTitle', "Simca's Cuisine: 100 Classic French Recipes for Every Occasion", 'publishDate', 1972, 'ISBN', '0-394-40152-2')
frenchChefCookbook = graph.addVertex(label, 'book', 'id', 102, 'bookTitle','The French Chef Cookbook', 'publishDate',1968, 'ISBN', '0-394-40135-2')
artOfSimpleFood = graph.addVertex(label, 'book', 'id', 103, 'bookTitle', 'The Art of Simple Food: Notes, Lessons, and Recipes from a Delicious Revolution', 'publishDate', 2007, 'ISBN', '0-307-33679-4')

// recipe vertices
beefBourguignon = graph.addVertex('id', 200, label, 'recipe', 'recipeTitle', 'Beef Bourguignon', 'instructions', 'Braise the beef. Saute the onions and carrots. Add wine and cook in a dutch oven at 425 degrees for 1 hour.')
ratatouille = graph.addVertex('id', 201, label, 'recipe', 'recipeTitle', 'Rataouille', 'instructions', 'Peel and cut the egglant. Make sure you cut eggplant into lengthwise slices that are about 1-inch wide, 3-inches long, and 3/8-inch thick')
saladeNicoise = graph.addVertex('id', 202, label, 'recipe', 'recipeTitle', 'Salade Nicoise', 'instructions', 'Take a salad bowl or platter and line it with lettuce leaves, shortly before serving. Drizzle some olive oil on the leaves and dust them with salt.')
wildMushroomStroganoff = graph.addVertex('id', 203, label, 'recipe', 'recipeTitle', 'Wild Mushroom Stroganoff', 'instructions', 'Cook the egg noodles according to the package directions and keep warm. Heat 1 1/2 tablespoons of the oliveoil in a large saute pan over medium-high heat.')
spicyMeatloaf = graph.addVertex('id', 204, label, 'recipe', 'recipeTitle', 'Spicy Meatloaf', 'instructions', 'Preheat the oven to 375 degrees F. Cook bacon in a large skillet over medium heat until very crisp and fat has rendered, 8-10 minutes.')
oystersRockefeller = graph.addVertex('id', 205, label, 'recipe', 'recipeTitle', 'Oysters Rockefeller', 'instructions', 'Saute the shallots, celery, herbs, and seasonings in 3 tablespoons of the butter for 3 minutes. Add the watercress and let it wilt.')
carrotSoup = graph.addVertex('id', 206, label, 'recipe', 'recipeTitle', 'Carrot Soup', 'instructions', 'In a heavy-bottomed pot, melt the butter. When it starts to foam, add the onions and thyme and cook over medium-low heat until tender, about 10 minutes.')
roastPorkLoin = graph.addVertex('id', 207, label, 'recipe', 'recipeTitle', 'Roast Pork Loin', 'instructions', 'The day before, separate the meat from the ribs, stopping about 1 inch before the end of the bones. Season the pork liberally inside and out with salt and pepper and refrigerate overnight.')

// ingredients vertices
beef = graph.addVertex('id', 300, label, 'ingredient', 'iName', 'beef')
onion = graph.addVertex('id', 301, label, 'ingredient', 'iName', 'onion')
mashedGarlic = graph.addVertex('id', 302, label, 'ingredient', 'iName', 'mashed garlic')
butter = graph.addVertex('id', 303, label, 'ingredient', 'iName', 'butter')
tomatoPaste = graph.addVertex('id', 304, label, 'ingredient', 'iName', 'tomato paste')
eggplant = graph.addVertex('id', 305, label, 'ingredient', 'iName', 'eggplant')
zucchini = graph.addVertex('id', 306, label, 'ingredient', 'iName', 'zucchini')
oliveOil = graph.addVertex('id', 307, label, 'ingredient', 'iName', 'olive oil')
yellowOnion = graph.addVertex('id', 308, label, 'ingredient', 'iName', 'yellow onion')
greenBean = graph.addVertex('id', 309, label, 'ingredient', 'iName', 'green beans')
tuna = graph.addVertex('id', 310, label, 'ingredient', 'iName', 'tuna')
tomato = graph.addVertex('id', 311, label, 'ingredient', 'iName', 'tomato')
hardBoiledEgg = graph.addVertex('id', 312, label, 'ingredient', 'iName', 'hard-boiled egg')
eggNoodles = graph.addVertex('id', 313, label, 'ingredient', 'iName', 'egg noodles')
mushroom = graph.addVertex('id', 314, label, 'ingredient', 'iName', 'mushrooms')
bacon = graph.addVertex('id', 315, label, 'ingredient', 'iName', 'bacon')
celery = graph.addVertex('id', 316, label, 'ingredient', 'iName', 'celery')
greenBellPepper = graph.addVertex('id', 317, label, 'ingredient', 'iName', 'green bell pepper')
groundBeef = graph.addVertex('id', 318, label, 'ingredient', 'iName', 'ground beef')
porkSausage = graph.addVertex('id', 319, label, 'ingredient', 'iName', 'pork sausage')
shallot = graph.addVertex('id', 320, label, 'ingredient', 'iName', 'shallots')
chervil = graph.addVertex('id', 321, label, 'ingredient', 'iName', 'chervil')
fennel = graph.addVertex('id', 322, label, 'ingredient', 'iName', 'fennel')
parsley = graph.addVertex('id', 323, label, 'ingredient', 'iName', 'parsley')
oyster = graph.addVertex('id', 324, label, 'ingredient', 'iName', 'oyster')
pernod = graph.addVertex('id', 325, label, 'ingredient', 'iName', 'Pernod')
thyme = graph.addVertex('id', 326, label, 'ingredient', 'iName', 'thyme')
carrot = graph.addVertex('id', 327, label, 'ingredient', 'iName', 'carrots')
chickenBroth = graph.addVertex('id', 328, label, 'ingredient', 'iName', 'chicken broth')
porkLoin = graph.addVertex('id', 329, label, 'ingredient', 'iName', 'pork loin')
redWine = graph.addVertex('id', 330, label, 'ingredient', 'iName', 'red wine')

// author-book edges
juliaChild.addEdge('authored', artOfFrenchCookingVolOne)
simoneBeck.addEdge('authored', artOfFrenchCookingVolOne)
louisetteBertholie.addEdge('authored', artOfFrenchCookingVolOne)
simoneBeck.addEdge('authored',simcasCuisine)
patriciaSimon.addEdge('authored',simcasCuisine)
juliaChild.addEdge('authored', frenchChefCookbook)
aliceWaters.addEdge('authored', artOfSimpleFood)
patriciaCurtan.addEdge('authored', artOfSimpleFood)
kelsieKerr.addEdge('authored', artOfSimpleFood)
fritzStreiff.addEdge('authored', artOfSimpleFood)

// author - recipe edges
juliaChild.addEdge('created', beefBourguignon, 'rCreateDate', 1961)
juliaChild.addEdge('created', ratatouille, 'rCreateDate', 1965)
juliaChild.addEdge('created', saladeNicoise, 'rCreateDate', 1962)
emerilLagasse.addEdge('created', wildMushroomStroganoff, 'rCreateDate', 2003)
emerilLagasse.addEdge('created', spicyMeatloaf, 'rCreateDate', 2000)
aliceWaters.addEdge('created', carrotSoup, 'rCreateDate', 1995)
aliceWaters.addEdge('created', roastPorkLoin, 'rCreateDate', 1996)
jamesBeard.addEdge('created', oystersRockefeller, 'rCreateDate', 1970)

// recipe - ingredient edges
beefBourguignon.addEdge('includes', beef, 'amount', '2 lbs')
beefBourguignon.addEdge('includes', onion, 'amount', '1 sliced')
beefBourguignon.addEdge('includes', mashedGarlic, 'amount', '2 cloves')
beefBourguignon.addEdge('includes', butter, 'amount', '3.5 Tbsp')
beefBourguignon.addEdge('includes', tomatoPaste, 'amount', '1 Tbsp')
ratatouille.addEdge('includes', eggplant, 'amount', '1 lb')
ratatouille.addEdge('includes', zucchini, 'amount', '1 lb')
ratatouille.addEdge('includes', mashedGarlic, 'amount', '2 cloves')
ratatouille.addEdge('includes', oliveOil, 'amount', '4-6 Tbsp')
ratatouille.addEdge('includes', yellowOnion, 'amount', '1 1/2 cups or 1/2 lb thinly sliced')
saladeNicoise.addEdge('includes', oliveOil, 'amount', '2-3 Tbsp')
saladeNicoise.addEdge('includes', greenBean, 'amount', '1 1/2 lbs blanched, trimmed')
saladeNicoise.addEdge('includes', tuna, 'amount', '8-10 ozs oil-packed, drained and flaked')
saladeNicoise.addEdge('includes', tomato, 'amount', '3 or 4 red, peeled, quartered, cored, and seasoned')
saladeNicoise.addEdge('includes', hardBoiledEgg, 'amount', '8 halved lengthwise')
wildMushroomStroganoff.addEdge('includes', eggNoodles, 'amount', '16 ozs wide')
wildMushroomStroganoff.addEdge('includes', mushroom, 'amount', '2 lbs wild or exotic, cleaned, stemmed, and sliced')
wildMushroomStroganoff.addEdge('includes', yellowOnion, 'amount', '1 cup thinly sliced')
spicyMeatloaf.addEdge('includes', bacon, 'amount', '3 ozs diced')
spicyMeatloaf.addEdge('includes', onion, 'amount', '2 cups finely chopped')
spicyMeatloaf.addEdge('includes', celery, 'amount', '2 cups finely chopped')
spicyMeatloaf.addEdge('includes', greenBellPepper, 'amount', '1/4 cup finely chopped')
spicyMeatloaf.addEdge('includes', porkSausage, 'amount', '3/4 lbs hot')
spicyMeatloaf.addEdge('includes', groundBeef, 'amount', '1 1/2 lbs chuck')
oystersRockefeller.addEdge('includes', shallot, 'amount', '1/4 cup chopped')
oystersRockefeller.addEdge('includes', celery, 'amount', '1/4 cup chopped')
oystersRockefeller.addEdge('includes', chervil, 'amount', '1 tsp')
oystersRockefeller.addEdge('includes', fennel, 'amount', '1/3 cup chopped')
oystersRockefeller.addEdge('includes', parsley, 'amount', '1/3 cup chopped')
oystersRockefeller.addEdge('includes', oyster, 'amount', '2 dozen on the half shell')
oystersRockefeller.addEdge('includes', pernod, 'amount', '1/3 cup')
carrotSoup.addEdge('includes', butter, 'amount', '4 Tbsp')
carrotSoup.addEdge('includes', onion, 'amount', '2 medium sliced')
carrotSoup.addEdge('includes', thyme, 'amount', '1 sprig')
carrotSoup.addEdge('includes', carrot, 'amount', '2 1/2 lbs, peeled and sliced')
carrotSoup.addEdge('includes', chickenBroth, 'amount', '6 cups')
roastPorkLoin.addEdge('includes', porkLoin, 'amount', '1 bone-in, 4-rib')
roastPorkLoin.addEdge('includes', redWine, 'amount', '1/2 cup')
roastPorkLoin.addEdge('includes', chickenBroth, 'amount', '1 cup')

// book - recipe edges

beefBourguignon.addEdge('includedIn', artOfFrenchCookingVolOne)
saladeNicoise.addEdge('includedIn', artOfFrenchCookingVolOne)
carrotSoup.addEdge('includedIn', artOfSimpleFood)
roastPorkLoin.addEdge('includedIn', artOfSimpleFood)

// meal vertices
SaturdayFeast = graph.addVertex(label, 'meal', 'id', 500, 'mealTitle', 'Saturday Feast', 'mCreateDate', '2015-11-30', 'calories', 1000)
EverydayDinner = graph.addVertex(label, 'meal', 'id', 501, 'mealTitle', 'EverydayDinner', 'mCreateDate', '2016-01-14', 'calories', 600)
JuliaDinner = graph.addVertex(label, 'meal', 'id', 502, 'mealTitle', 'JuliaDinner', 'mCreateDate', '2016-01-14', 'calories', 900)
// meal - recipe edges

SaturdayFeast.addEdge('includedIn', beefBourguignon)
SaturdayFeast.addEdge('includedIn', carrotSoup)
SaturdayFeast.addEdge('includedIn', oystersRockefeller)
EverydayDinner.addEdge('includedIn', carrotSoup)
EverydayDinner.addEdge('includedIn', roastPorkLoin)
JuliaDinner.addEdge('includedIn', beefBourguignon)
JuliaDinner.addEdge('includedIn', saladeNicoise)

// meal - book edges

artOfSimpleFood.addEdge('includedIn', EverydayDinner)
simcasCuisine.addEdge('includedIn', SaturdayFeast)
artOfFrenchCookingVolOne.addEdge('includedIn', JuliaDinner)

// reviewer vertices
johnDoe = graph.addVertex(label, 'reviewer', 'id', 400, 'revname','John Doe')
johnSmith = graph.addVertex(label, 'reviewer', 'id', 401, 'revname','John Smith')
janeDoe = graph.addVertex(label, 'reviewer', 'id', 402, 'revname','Jane Doe')
sharonSmith = graph.addVertex(label, 'reviewer', 'id', 403, 'revname','Sharon Smith')
betsyJones = graph.addVertex(label, 'reviewer', 'id', 404, 'revname','Betsy Jones')

// reviewer - recipe edges
johnDoe.addEdge('rated', beefBourguignon, 'ratedDate', Instant.parse('2014-01-01T00:00:00.00Z'), 'stars', 5, 'comment', 'Pretty tasty!')
johnSmith.addEdge('rated', beefBourguignon, 'ratedDate', Instant.parse('2014-01-23T00:00:00.00Z'), 'stars', 4)
janeDoe.addEdge('rated', beefBourguignon, 'ratedDate', Instant.parse('2014-02-01T00:00:00.00Z'), 'stars', 5, 'comment', 'Yummy!')
sharonSmith.addEdge('rated', beefBourguignon, 'ratedDate', Instant.parse('2015-01-01T00:00:00.00Z'), 'stars', 3, 'comment', 'It was okay.')
johnDoe.addEdge('rated', spicyMeatloaf, 'ratedDate', Instant.parse('2015-12-31T00:00:00.00Z'), 'stars', 4, 'comment', 'Really spicy - be careful!')
sharonSmith.addEdge('rated', spicyMeatloaf, 'ratedDate',Instant.parse('2014-07-23T00:00:00.00Z'), 'stars', 3, 'comment', 'Too spicy for me. Use less garlic.')
janeDoe.addEdge('rated', carrotSoup, 'ratedDate', Instant.parse('2015-12-30T00:00:00.00Z'), 'stars', 5, 'comment', 'Loved this soup! Yummy vegetarian!')