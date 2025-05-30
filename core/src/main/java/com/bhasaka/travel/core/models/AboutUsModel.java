package com.bhasaka.travel.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AboutUsModel {


    @ValueMapValue
    private String aboutImage;

    @ValueMapValue
    private String abouttTitle;


    @ValueMapValue
    private String abouttDesc;

    @ValueMapValue
    private String[] benifits;


    public String getAbouttDesc() {
        return abouttDesc;
    }

    public String getAboutImage() {
        return aboutImage;
    }

    public String getAbouttTitle() {
        return abouttTitle;
    }

    public String[] getBenifits() {
        return benifits;
    }
}
