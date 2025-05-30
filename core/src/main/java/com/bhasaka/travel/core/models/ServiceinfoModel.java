package com.bhasaka.travel.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServiceinfoModel {

    @ChildResource
    private List<ServicesModel> servicesInfo;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String header;


    public List<ServicesModel> getServicesInfo() {
        return servicesInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getHeader() {
        return header;
    }
}
