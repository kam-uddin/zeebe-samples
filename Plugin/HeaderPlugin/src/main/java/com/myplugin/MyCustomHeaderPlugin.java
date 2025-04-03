package com.myplugin;

import io.camunda.plugin.search.header.CustomHeader;
import io.camunda.plugin.search.header.DatabaseCustomHeaderSupplier;
import java.util.UUID;

public class MyCustomHeaderPlugin implements DatabaseCustomHeaderSupplier {

    public static final String CUSTOM_TOKEN_PLUGIN = "X-Custom-Auth-Token";

    @Override
    public CustomHeader getSearchDatabaseCustomHeader() {
        return new CustomHeader(CUSTOM_TOKEN_PLUGIN, UUID.randomUUID().toString());
    }

}