Vertex daenerys = graph.addVertex(label,'human','name','Daenerys','house','Targaryen','origin','Dragonstone')
Vertex viserys = graph.addVertex(label,'human','name','Viserys','house','Targaryen','origin','King\'s Landing')
Vertex drogon = graph.addVertex(label,'dragon','name','Drogon','colors','black and red')
Vertex viserion = graph.addVertex(label,'dragon','name','Viserion','colors','gold and red-orange')
Vertex rhaegal = graph.addVertex(label,'dragon','name','Rhaegal','colors','green bronze and yellow-orange')
daenerys.addEdge('relatedBy',viserys).property('relationship','sister')
viserys.addEdge('relatedBy',daenerys).property('relationship','brother')
daenerys.addEdge('hatchedBy',drogon)
daenerys.addEdge('hatchedBy',viserion)
daenerys.addEdge('hatchedBy',rhaegal)
