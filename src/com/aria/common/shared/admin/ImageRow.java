package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image_row", propOrder = {
    "defaultImageUrl",
    "thumbnailImageUrl",
    "imageText",
    "defaultInd",
    "active"
    })
public class ImageRow {

    @XmlElement(name = "default_image_url")
    protected String defaultImageUrl;
    @XmlElement(name = "thumbnail_image_url")
    protected String thumbnailImageUrl;
    @XmlElement(name = "image_text")
    protected String imageText;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    @XmlElement(name = "active")
    protected Long active;
    public String getDefaultImageUrl() {
        return defaultImageUrl;
    }

    public void setDefaultImageUrl(String value) {
        this.defaultImageUrl = value;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String value) {
        this.thumbnailImageUrl = value;
    }

    public String getImageText() {
        return imageText;
    }

    public void setImageText(String value) {
        this.imageText = value;
    }

    public Long getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Long value) {
        this.defaultInd = value;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long value) {
        this.active = value;
    }

    
}
