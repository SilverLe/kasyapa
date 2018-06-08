package com.sui.op.mall.api.controller;

import com.sui.op.mall.api.entity.Integration;
import com.sui.op.mall.api.entity.IntegrationRequest;
import com.sui.op.mall.api.service.IntegrationServiceFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <description>:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.api.controller
 * date:   2018-06-08 14:48
 */
@RestController
public class IntegationController {

    Logger logger = LoggerFactory.getLogger(IntegationController.class);

    @Autowired
    private IntegrationServiceFeign integrationServiceFeign;

    @GetMapping("integration/get/{id}")
    public Integration getIntegrationById(@PathVariable("id") Long id){
        return integrationServiceFeign.getIntegrationById(id);
    }

    @GetMapping("integration/upd/{id}/{integra}")
    public Integration updIntegrationById(@PathVariable("id") Long id,@PathVariable("integra") Long integra){
        Map<String,Object> map = new HashMap<>(4);
        map.put("integration",integra);
        return integrationServiceFeign.updateIntegration(id,map);
    }

    @GetMapping("integration/create")
    public Integration createIntegration(){
        IntegrationRequest integrationRequest = new IntegrationRequest();
        integrationRequest.setUserId("007");
        integrationRequest.setIntegration(800000L);
        return integrationServiceFeign.createIntegration(integrationRequest);
    }

    /*@PutMapping("integration/{id}")
    public Integration updateIntegration(@PathVariable("id") Long id,@RequestBody Map<String,Object> fieldMap){
        Integration integration = integrationService.getIntegrationById(id);
        try {
            BeanUtils.populate(integration, fieldMap);
        }catch (Exception e){
            logger.error("参与转化异常");
            return null;
        }
        return integrationService.updateIntegration(integration);
    }

    @DeleteMapping("integration/{id}")
    public Integration deleteIntegrationById(@PathVariable("id") Long id){
        Integration integration = integrationService.getIntegrationById(id);
        integrationService.deleteIntegrationById(id);
        return integration;
    }


    @GetMapping("/integration")
    public IntegrationReponse getAllIntegrations(){
        List<Integration> integrationList = integrationService.getAllIntegrations();
        IntegrationReponse response = new IntegrationReponse();
        response.setIntegrationList(integrationList);
        response.setTotal(CollectionUtils.isEmpty(integrationList) ? 0 : integrationList.size());
        return response;
    }*/
}
