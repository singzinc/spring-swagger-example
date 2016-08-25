package com.spring_swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring_swagger.model.UserGroup;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping(value = "/group", produces = { "application/json;charset=UTF-8" })
@Api(value = "/group", description = "group API")
public class GroupController {

	@ApiOperation(notes = "this function for add group use only", httpMethod = "POST", value = "insert new group")
	@ApiImplicitParams({ @ApiImplicitParam(name = "name", value = "User's name", required = true, dataType = "string", paramType = "query"),
			@ApiImplicitParam(name = "email", value = "User's email", required = false, dataType = "string", paramType = "query"),
			@ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "long", paramType = "query") })
	@ApiResponses({ @ApiResponse(code = 200, message = "Successful retrieval of item"), @ApiResponse(code = 404, message = "Course or Item not found"),
			@ApiResponse(code = 403, message = "User not authorized"), @ApiResponse(code = 400, message = "Item id incorrect format") })
	@RequestMapping(value = "addGroup", method = RequestMethod.POST)
	public UserGroup addGroup(@ApiParam(required = true, value = "group data") @RequestBody UserGroup group) {
		return group;
	}

	@RequestMapping(value = "getAccessibleGroups", method = RequestMethod.GET)
	@ApiOperation(notes = "getAccessibleGroups this is note ", httpMethod = "GET", value = "get the group list")
	public List<UserGroup> getAccessibleGroups() {
		UserGroup group1 = new UserGroup();
		group1.setGroupId("1");
		group1.setName("testGroup1");

		UserGroup group2 = new UserGroup();
		group2.setGroupId("2");
		group2.setName("testGroup2");

		List<UserGroup> groupList = new LinkedList<UserGroup>();
		groupList.add(group1);
		groupList.add(group2);

		return groupList;
	}
}
