package we.lcx.admaker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import we.lcx.admaker.common.Result;
import we.lcx.admaker.common.entities.ModifyAd;
import we.lcx.admaker.common.entities.NewAds;
import we.lcx.admaker.manager.impl.BiddingManager;
import we.lcx.admaker.manager.impl.ContractManager;
import we.lcx.admaker.service.BasicService;
import javax.annotation.Resource;

/**
 * Created by LinChenxiao on 2019/12/13 17:02
 **/
@Controller
public class Portal {
    @Resource
    private BasicService basicService;

    @Resource
    private BiddingManager biddingManager;

    @Resource
    private ContractManager contractManager;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/j/flight/{query}")
    @ResponseBody
    public Result query(@PathVariable String query) {
        return Result.ok(basicService.queryFlight(query));
    }

    @PostMapping("/j/modify")
    @ResponseBody
    public Result modify(ModifyAd modifyAd) {
        return contractManager.modify(modifyAd);
    }

    @PostMapping("/j/create")
    @ResponseBody
    public Result create(NewAds ads) {
        ads.convert();
        return ads.getType() == 1 ? contractManager.create(ads) : biddingManager.create(ads);
    }
}
