    Key key = datastore.newKeyFactory().setKind("Task").newKey("sampleTask");
    Entity task = Entity.newBuilder(key).set("description", "Buy milk").build();
    datastore.save(task);  
