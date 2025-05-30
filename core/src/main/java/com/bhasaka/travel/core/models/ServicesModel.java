package com.bhasaka.travel.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServicesModel {

    @ValueMapValue
    private String icon;

    @ValueMapValue
    private String titleInfo;

    @ValueMapValue
    private String titleDesc;

    public String getIcon() {
        return icon;
    }

    public String getTitleInfo() {
        return titleInfo;
    }

    public String getTitleDesc() {
        return titleDesc;
    }
}
