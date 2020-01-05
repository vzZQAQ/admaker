package we.lcx.admaker.common.consts;

/**
 * Created by LinChenxiao on 2019/12/12 19:25
 **/
public interface Params {
    String COMMON_QUERY = "{\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":null,\"sponsorName\":null,\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null}";
    String COMMON_APPROVE = "{\"creativeId\":\"MAISUI_1595088\",\"result\":1,\"timestamp\":\"98888535352275\",\"memo\":\"描述\"}";
    String COMMON_PAGE = "{\"offset\":0,\"limit\":10}";

    String YUNYING_POSITION = "{\"positionUidSet\":[],\"name\":\"\",\"offset\":null,\"limit\":1000,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":null,\"sponsorName\":null,\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null}";

    String YUNYING_FLIGHT_QUERY = "{\"uidSet\":[],\"nameLike\":\"\",\"offset\":0,\"limit\":100,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":null,\"sponsorName\":null,\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null}";
    String YUNYING_CREATE = "{\"name\":\"\",\"adType\":\"3\",\"positionType\":\"1\",\"monitorType\":\"1\",\"contractThirdMonitorList\":[],\"biddingThirdMonitorList\":[],\"desc\":\"\",\"exposure\":0,\"needBind\":\"0\",\"nosId\":\"1\",\"productTypeList\":[\"101\"],\"relateTemplates\":true,\"flightUidList\":[90000002],\"positionGroupUidList\":[\"100003\"],\"uid\":-1,\"templateUidList\":[\"2013303\"],\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":null,\"sponsorName\":null,\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null}";
    String YUNYING_FLIGHT = "{\"dspId\":10101,\"mediaUid\":\"\",\"adFlightId\":\"623\",\"page\":1,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":null,\"sponsorName\":null,\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null}";
    String YUNYING_STATUS = "{\"id\":69,\"status\":1,\"dspId\":10101,\"adFlightId\":623,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":null,\"sponsorName\":null,\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null}";

    String MAISUI_PRICE = "{\"adPlanId\":443754,\"campaignPackageUid\": 0,\"timeSeries\":\"111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\",\"beginDate\":\"\",\"endDate\":\"\",\"targetContent\":{\"region_location\":[],\"dev_os\":null,\"user_gender\":null,\"dev_network\":null,\"ageGroupTargetCodes\":[],\"brandTargetCodes\":[],\"ad_apptype\":null},\"billingMode\":3,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":213234815,\"sponsorName\":\"测试登录sponsorName\",\"sponsorProductName\":\"牛奶\",\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null,\"sellerId\":null,\"userInfo\":{\"sellerId\":700000002}}";
    String MAISUI_CREATE = "{\"adPlanId\":443754,\"adformName\":\"测试建立1\",\"targetEffect\":\"-1\",\"landingPage\":\"http://www.apple.com\",\"productId\":null,\"campaignPackageId\":2019201,\"bidAmountMin\":\"4\",\"bidAmountMax\":\"4\",\"billingMode\":3,\"adAudienceRelationList\":[],\"targetContent\":{\"categoryInterest\":null,\"region_location\":[],\"dev_os\":null,\"user_gender\":null,\"dev_network\":null,\"ageGroupTargetCodes\":[],\"brandTargetCodes\":[],\"ad_apptype\":null,\"app_include\":null,\"app_exclude\":[],\"app_category\":[]},\"adCreativeList\":[{\"creativeName\":\"创意1\",\"customName\":\"创意1\",\"deepLink\":null,\"destinationUrl\":\"http://www.banana.com\",\"monitorList\":[{\"monitor\":\"\",\"clickUrl\":\"\",\"exposureUrl\":\"\"}],\"materialList\":[]}],\"creativeStrategy\":1,\"beginDate\":\"2019-12-12T12:05:30.258Z\",\"endDate\":\"2019-12-31T12:05:30.258Z\",\"timeSeries\":\"111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\",\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":213234815,\"sponsorName\":\"测试登录sponsorName\",\"sponsorProductName\":\"牛奶\",\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null,\"sellerId\":null,\"userInfo\":{\"sellerId\":700000002}}";
    String MAISUI_CREATIVE_QUERY = "{\"status\":1,\"beginDate\":\"2020-01-01T16:00:00.533Z\",\"endDate\":\"2020-01-02T15:59:59.533Z\",\"adformId\":1585700,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":213234815,\"sponsorName\":\"测试登录sponsorName\",\"sponsorProductName\":\"牛奶\",\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null,\"sellerId\":null,\"userInfo\":{\"sellerId\":700000002}}";
    String MAISUI_AD_LIST = "{\"queryStates\":1,\"beginDate\":\"2019-12-26T16:00:00.664Z\",\"endDate\":\"2019-12-27T15:59:59.664Z\",\"adInfo\":\"\",\"offset\":0,\"limit\":2000,\"orderField\":null,\"orderDesc\":null,\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":213234815,\"sponsorName\":\"测试登录sponsorName\",\"sponsorProductName\":\"牛奶\",\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null,\"sellerId\":null,\"userInfo\":{\"sellerId\":700000002}}";
    String MAISUI_UPDATE = "{\"userId\":10000,\"email\":\"maisui_operator@163.com\",\"accessType\":null,\"sponsorId\":213234815,\"sponsorName\":\"测试登录sponsorName\",\"sponsorProductName\":\"牛奶\",\"agentId\":null,\"agentName\":null,\"operatorId\":110000001,\"operatorName\":\"凯撒运营1\",\"mediaId\":null,\"mediaName\":null,\"sellerId\":null,\"userInfo\":{\"sellerId\":700000002}}";

    String MAITIAN_RESOURCE = "{\"mediaUid\":5001,\"resourceName\":\"\",\"scheduleStatus\":\"101\",\"limit\":10,\"offset\":0}";
    String MAITIAN_RESOURCE_NEW = "{\"uid\":\"\",\"mediaUid\":5001,\"resourceName\":\"\",\"openType\":\"YES\",\"version\":\"\",\"rotationList\":[],\"fixRotation\":null}";
    String MAITIAN_ITEM = "{\"uid\":\"\",\"resourceUid\":1068001,\"mediaUid\":5001,\"itemName\":\"项目B\",\"resourceTrafficType\":\"PDB\",\"billingMode\":\"BILLING_MODE_CPT\",\"resourceTrafficRatio\":\"ALL\",\"version\":\"\",\"trafficSplitTypes\":[\"INDIVIDUATION\"],\"showTimeType\":\"NO_NEED_SHOW_TIME\",\"positionIdList\":[\"2014302\"],\"positionList\":[{\"code\":\"2014201\",\"value\":\"云音乐开机画IOS-视频-2019\"}]}";
    String MAITIAN_REVENUE = "{\"resourceItemUid\":1030602,\"resourceUid\":1068001,\"revenueName\":\"测试刊例1\",\"revenueByFen\":10000,\"year\":2020,\"month\":\"Q1\",\"customUids\":null,\"durationVO\":{\"beginTime\":1576684800000,\"endTime\":1643644799999},\"isStandard\":true,\"status\":\"201\"}";
    String MAITIAN_RESERVE = "{\"reserveUid\":null,\"customerUid\":213290621,\"resourceOwnerUid\":5001,\"resourceUid\":1068001,\"statusCode\":201,\"lockStatus\":2,\"mergeDurations\":[],\"resourceType\":1,\"resourceItemUid\":1030602,\"content\":null,\"billingModeCode\":1,\"amountDaily\":1,\"resourceItem\":{\"uid\":1030602,\"trafficType\":{\"code\":\"1\",\"value\":\"保价保量\"},\"relateType\":1},\"trafficType\":{\"code\":\"1\",\"value\":\"保价保量\"},\"relateType\":1,\"revenueUid\":1030401}";
    String MAITIAN_DEAL = "{\"name\":\"\",\"scheduleTrafficType\":\"PDB\",\"scheduleRevenueByFen\":0,\"scheduleRevenueSwitchStatus\":\"\",\"beginTime\":1576684800000,\"endTime\":1643644799999,\"contractUid\":142402,\"memo\":\"\",\"firstIndustryUid\":10080,\"secondIndustryUid\":10083,\"brandUid\":2153988870,\"productName\":\"Intro\",\"scheduleCategoryCode\":\"1\"}";
    String MAITIAN_DEAL_ITEM = "{\"name\":\"条目名称\",\"scheduleUid\":354726,\"reserveItemUid\":\"127133226\",\"positionUids\":[\"2014701\"],\"showTime\":\"\",\"frequenceLimit\":\"\",\"deliveryPeriods\":[{\"uid\":114943595,\"beginTime\":1576684800000,\"endTime\":1576943999999,\"serveBeginTime\":1576684800000,\"serveEndTime\":1576943999999}],\"trafficSplitType\":\"SCHEDULE\",\"realAmountDaily\":\"\",\"realTrafficRatio\":1,\"refundStatus\":\"NOT_REFUND\",\"refundAmountRatio\":0,\"costType\":\"PURCHASE_ITEM\",\"resourceRevenueUid\":1030401,\"targetPremiumRatio\":\"\",\"discount\":0,\"dspUid\":\"10101\",\"trafficSwitch\":\"ON\",\"individuation\":{\"regionLocation\":[],\"gender\":[],\"devOS\":[],\"playlistId\":[],\"ageGroup\":[],\"singerIdList\":[],\"interest\":[],\"interestNames\":[]},\"priority\":1,\"relateType\":1}";
    String MAITIAN_CREATIVE = "{\"id\":null,\"name\":\"创意1\",\"monitorMark\":\"DEFAULT\",\"destinationUrl\":\"http://www.target.com\",\"exposureMonitorList\":[\"\"],\"clickMonitorList\":[\"\"],\"videoPlayMonitorList\":[\"\"],\"visibleMonitorList\":[\"\"],\"templateRefId\":\"\",\"mainTitle\":\"\",\"subTitle\":\"\",\"content\":\"\",\"mediaSponsorId\":\"\",\"multiMediaList\":[],\"dynamicWords\":[],\"template\":{}}";
    String MAITIAN_CREATE = "{\"id\":null,\"name\":\"\",\"relatedAdId\":\"\",\"scheduleItemInfo\":{\"positionId\":\"2009405\",\"scheduleId\":354728,\"scheduleItemId\":488620,\"relateType\":\"\",\"relatedScheduleItemUid\":\"\"},\"execPeriods\":[1577376000000,1577462399999],\"product\":{\"id\":\"\",\"type\":\"101\",\"productReference\":\"http://www.google.com\",\"name\":\"\",\"md5\":\"\",\"packageName\":\"\",\"size\":null},\"creatives\":[]}";
    String MAITIAN_CREATIVE_QUERY = "{\"uid\":0,\"startTime\":\"\",\"endTime\":\"\"}";
    String MAITIAN_AD_LIST = "{\"status\":\"1\",\"execPeriod\":{\"startTime\":\"\",\"endTime\":\"\"},\"adformId\":\"\",\"scheduleItemName\":\"\",\"nonStandardResourceName\":\"\",\"scheduleName\":\"\",\"scheduleItemId\":\"\",\"positionName\":\"\",\"positionId\":\"\",\"offset\":0,\"limit\":2000}";

}
