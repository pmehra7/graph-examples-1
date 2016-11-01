schema.propertyKey('name').Text().single().create()
schema.propertyKey('age').Text().create()
schema.vertexLabel('person').properties('age').add()
schema.vertexLabel('person').properties('name').add()
schema.vertexLabel('person').index('byname').materialized().by('name').add()
