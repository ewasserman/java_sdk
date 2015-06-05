package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image_ReturnElement", propOrder = {"thumbnailImageUrl", "imageText", "defaultInd", "imageClassSeqNo", "active", "mainImageUrl"})
public class ImageReturnElement {

    @XmlElement(name = "thumbnail_image_url")
    protected String thumbnailImageUrl;
    @XmlElement(name = "image_text")
    protected String imageText;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    @XmlElement(name = "image_class_seq_no")
    protected Long imageClassSeqNo;
    @XmlElement(name = "active")
    protected Long active;
    @XmlElement(name = "main_image_url")
    protected String mainImageUrl;
    
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

    public Long getImageClassSeqNo() {
        return imageClassSeqNo;
    }

    public void setImageClassSeqNo(Long value) {
        this.imageClassSeqNo = value;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long value) {
        this.active = value;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String value) {
        this.mainImageUrl = value;
    }

    
}
