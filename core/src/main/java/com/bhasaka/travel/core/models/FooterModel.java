package com.bhasaka.travel.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String details;


    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }
}
