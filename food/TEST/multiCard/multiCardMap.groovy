/* SAMPLE INPUT
authorCity: Julia Child|Paris|1960
 */

// CONFIGURATION
// Configures the data loader to create the schema
config dryrun: false, preparation: true, create_schema: true, load_new: true, load_vertex_threads: 3, schema_output: 'loader_output.txt'

// DATA INPUT
// Define the data input source (a file which can be specified via command line arguments)
// inputfiledir is the directory for the input files
inputfiledir = '/Users/lorinapoland/CLONES/graph-examples/food/Test/authorCity/'
authorCityInput = File.csv(inputfiledir + "authorCity.csv").delimiter('|')

//Specifies what data source to load using which mapper (as defined inline)
  
load(authorCityInput).asVertices {
    label "author"
    key "author"
    ignore "city","dateStart","dateEnd"
}

load(authorCityInput).asVertices {
    label "city"
    key "city"
    ignore "author","dateStart","dateEnd"
}

load(authorCityInput).asEdges {
    label "livedIn"
    outV "author", {
        label "author"
        key "author"
    }
    inV "city", {
        label "city"
        key "city"
    }
}
