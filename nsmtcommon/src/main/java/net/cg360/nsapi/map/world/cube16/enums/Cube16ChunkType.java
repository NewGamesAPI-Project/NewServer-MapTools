package net.cg360.nsapi.map.world.cube16.enums;

public enum Cube16ChunkType {

    DEFAULT(0),
    ENTITY(1); // Entity chunks use the same header.
    // When contributing, add to the switch below.

    private final int chunkTypeID;

    Cube16ChunkType(int chunkTypeID){
        this.chunkTypeID = chunkTypeID;
    }

    public int getChunkyTypeID() { return chunkTypeID; }


    public static Cube16ChunkType getFromID(int id){
        switch (id){
            case 1:
                return ENTITY;

            case 0:
            default:
                return DEFAULT;
        }
    }
}
