package com.pojo;

import java.util.Date;

public class Assetsinformation {
    private Integer id;

    private Integer assetno;

    private String assetsname;

    private Date creatdate;

    private Date modifydate;
    
    private String name;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssetno() {
        return assetno;
    }

    public void setAssetno(Integer assetno) {
        this.assetno = assetno;
    }

    public String getAssetsname() {
        return assetsname;
    }

    public void setAssetsname(String assetsname) {
        this.assetsname = assetsname == null ? null : assetsname.trim();
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}