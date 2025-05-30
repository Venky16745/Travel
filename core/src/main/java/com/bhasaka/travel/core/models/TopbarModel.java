package com.bhasaka.travel.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TopbarModel {

    @ValueMapValue
    private String email;

    @ValueMapValue
    private String mobile;

    @ValueMapValue
    private String address;



    public String getEmail() {
        return email;
    }
    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
}
