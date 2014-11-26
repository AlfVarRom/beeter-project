package edu.upc.dsa.alfvarrom.beeter.api;

import java.util.HashMap;
import java.util.Map;

public class BeeterRootAPI {

    private Map<String, Link> links;

    public BeeterRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }

}
