package com.singplayground.showcase.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "This is User Group model")
public class UserGroup {

	@ApiModelProperty(value = "Group Id value", required = true, example = "aaa")
	private String groupId;

	@ApiModelProperty(value = "Group Name value", required = true, example = "bbb")
	private String name;

	@ApiModelProperty(value = "Group Icon value", required = false, example = "ccc")
	private String icon;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
