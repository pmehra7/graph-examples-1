//Configures the data loader to create the schema
config create_schema: false, load_new: true

//Defines the data input source (a file which is specified via command line arguments)
source = Graph.file(filename).gryo()

//Specifies what data source to load using which mapper
load(source.vertices().withVertexId()).asVertices {
    labelField "~label"
    key "name", "name"
    ignore "~id"
}

load(source.edges().withVertexId()).asEdges {
    labelField "~label"
    outV "outV", {
        labelField "~label"
        key "name", "name"
	ignore "~id"
    }
    inV "inV", {
        labelField "~label"
        key "name", "name"
	ignore "~id"
    }
}
