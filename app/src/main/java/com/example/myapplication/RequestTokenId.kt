package com.example.myapplication

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


@Root(strict = false,name = "soap12:Envelope")
data class RequestTokenId(
    @field:Element(name = "soap12:Body")
    var tokenBody:RequestTokenBody= RequestTokenBody()
)

@Root(strict = false,name = "soap12:Body")
data class RequestTokenBody(
    @field:Element(name = "SaveSessiondId")
    var saveSessionId: SessionValues=SessionValues()
)

@Root(name = "SaveSessiondId", strict = false)
data class SessionValues(
    @field:Element(name = "sAppCode")
    var AppCode: String? = null,

    @field:Element(name = "sCostCenter")
    var CostCenter: String? = null,

    @field:Element(name = "nUserId")
    var UserId: String? = null,

    @field:Element(name = "sUserName")
    var UserName: String? = null,

    @field:Element(name = "nRegionID")
    var RegionID: String? = null,

    @field:Attribute(required = false)
    var xmlns: String?=null
)

   /* @Element
    var AppCode: String,

    @Element(name = "sCostCenter")
    var CostCenter: String,

    @Element(name = "nUserId")
    var UserId: String,

    @Element(name = "sUserName")
    var UserName: String,

    @Element(name = "nRegionID")
    var RegionID: String,

    @Attribute(required = false)
    var xmlns: String*/


