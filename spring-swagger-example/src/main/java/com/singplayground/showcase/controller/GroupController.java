package com.singplayground.showcase.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.singplayground.showcase.model.UserGroup;

@Controller
@RequestMapping(value = "/group", produces = { "application/json;charset=UTF-8" })
@Api(value = "/group", description = "group API")
public class GroupController {

	// ------------------------------ API Doc ---------------------------------
	@ApiOperation(notes = "This function for add group use only", httpMethod = "POST", value = "insert new group")
	@ApiResponses({ @ApiResponse(code = 200, message = "Successful retrieval of item"), @ApiResponse(code = 404, message = "Course or Item not found"),
			@ApiResponse(code = 403, message = "User not authorized"), @ApiResponse(code = 400, message = "Item id incorrect format") })
	// ---------------------------------------------------------------
	@RequestMapping(value = "addGroup", method = RequestMethod.POST)
	@ResponseBody
	public UserGroup addGroup(@ApiParam(required = true, value = "group data") @RequestBody UserGroup group) {
		System.out.println("------ this is add group ----");
		return group;
	}

	@RequestMapping(value = "getAccessibleGroups", method = RequestMethod.GET)
	@ApiOperation(notes = "getAccessibleGroups this is note ", httpMethod = "GET", value = "get the group list")
	@ResponseBody
	public List<UserGroup> getAccessibleGroups() {
		UserGroup group1 = new UserGroup();
		group1.setGroupId(Long.parseLong("1"));
		group1.setName("testGroup1");

		UserGroup group2 = new UserGroup();
		group2.setGroupId(Long.parseLong("2"));
		group2.setName("testGroup2");

		List<UserGroup> groupList = new LinkedList<UserGroup>();
		groupList.add(group1);
		groupList.add(group2);

		return groupList;
	}

	@ApiOperation(notes = "This function for add group use only", httpMethod = "GET", value = "get group by id")
	@ApiImplicitParams({ @ApiImplicitParam(name = "name", value = "User's name", required = true, dataType = "string", paramType = "query"),
			@ApiImplicitParam(name = "email", value = "User's email", required = false, dataType = "string", paramType = "query"),
			@ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "long", paramType = "query") })
	@RequestMapping(value = "getGroupById", method = RequestMethod.GET)
	@ResponseBody
	public UserGroup getGroupById(@RequestParam(value = "id", required = true) Long id) {
		System.out.println("-------- get group by id -------" + id);
		UserGroup group = new UserGroup();
		group.setGroupId(id);
		return group;
	}

}
