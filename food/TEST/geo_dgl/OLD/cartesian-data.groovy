// Cartesian example - NO SEARCH INDEX

system.graph('cartesianData').create()
:remote config alias g cartesianData.g
schema.config().option('graph.allow_scan').set('true')

//SCHEMA
schema.propertyKey('name').Text().create()
schema.propertyKey('point').Point().withBounds(-3,-3,3,3).create()
schema.vertexLabel('location').properties('name','point').create()
schema.propertyKey('line').Linestring().withBounds(-3,-3,3,3).create()
schema.vertexLabel('lineLocation').properties('name','line').create()
schema.propertyKey('polygon').Polygon().withBounds(-3,-3,3,3).create()
schema.vertexLabel('polyLocation').properties('name','polygon').create()

// Create a point
graph.addVertex(label,'location','name','p0','point',Geo.point(0.5,0.5))
graph.addVertex(label,'location','name','p1','point',Geo.point(1,1))
graph.addVertex(label,'location','name','p2','point',Geo.point(-1,1))
graph.addVertex(label,'location','name','p3','point',Geo.point(-2,-2))
graph.addVertex(label,'location','name','p4','point',Geo.point(2,2))

// Create a linestring
graph.addVertex(label, 'lineLocation', 'name', 'l1', 'line', "LINESTRING(0 0, 1 1)")
graph.addVertex(label, 'lineLocation', 'name', 'l2', 'line', "LINESTRING(0 0, -1 1)")
graph.addVertex(label, 'lineLocation', 'name', 'l3', 'line', "LINESTRING(0 0, -2 -2)")
graph.addVertex(label, 'lineLocation', 'name', 'l4', 'line', "LINESTRING(0 0, 2 -2)")

// Create a polygon
graph.addVertex(label, 'polyLocation','name', 'g1', 'polygon',Geo.polygon(0,0,1,1,0,1,0,0))
graph.addVertex(label, 'polyLocation','name', 'g2', 'polygon',Geo.polygon(0,0,0,1,-1,1,0,0))
graph.addVertex(label, 'polyLocation','name', 'g3', 'polygon',Geo.polygon(0,0,-2,0,-2,-2,0,0))
graph.addVertex(label, 'polyLocation','name', 'g4', 'polygon',Geo.polygon(0,0,2,0,2,-2,0,0))

// Test point
g.V().hasLabel('location').valueMap()
// Test that no points are inside distance from (0,0) to slightly less than (1,1)
g.V().has('location', 'point', Geo.inside(Geo.point(0.0, 0.0), 1, DEGREES)).values()
// Test that two closer points are inside distance from (0,0) to slightly more than (1,1) - squareroot of 2
g.V().has('location', 'point', Geo.inside(Geo.point(0.0, 0.0), 1.415, DEGREES)).values()
// Test that all four points are inside distance from (0,0) to slightly more than (-2,-2) - squareroot of 8
g.V().has('location', 'point', Geo.inside(Geo.point(0.0, 0.0), 2.829, DEGREES)).values()

// Test linestring
g.V().hasLabel('lineLocation').valueMap()
// Test that no linestrings are inside distance from (0,0) to slightly less than (1,1)
g.V().has('lineLocation', 'line', Geo.inside(Geo.point(0.0, 0.0), 1, DEGREES)).values()
// Test that two closer lines are inside distance from (0,0) to slightly more than (1,1) - squareroot of 2
g.V().has('lineLocation', 'line', Geo.inside(Geo.point(0.0, 0.0), 1.415, DEGREES)).values()
// Test that all four lines are inside distance from (0,0) to slightly more than (-2,-2) - squareroot of 8
g.V().has('lineLocation', 'line', Geo.inside(Geo.point(0.0, 0.0), 2.829, DEGREES)).values()

// Test polygon
g.V().hasLabel('polyLocation').valueMap()
// Test that no polygons are inside distance from (0,0) to slightly less than (1,1)
g.V().has('polyLocation', 'polygon', Geo.inside(Geo.point(0.0, 0.0), 1, DEGREES)).values()
// Test that two closer polygons are inside distance from (0,0) to slightly more than (1,1) - squareroot of 2
g.V().has('polyLocation', 'polygon', Geo.inside(Geo.point(0.0, 0.0), 1.415, DEGREES)).values()
// Test that all four polygons are inside distance from (0,0) to slightly more than (-2,-2) - squareroot of 8
g.V().has('polyLocation', 'polygon', Geo.inside(Geo.point(0.0, 0.0), 2.829, DEGREES)).values()
