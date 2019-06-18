package org.hzero.halm.infra.feign;

import org.hzero.halm.infra.feign.fallback.DemoFeignFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;


/**
 * FeignDemo
 */
@FeignClient(value = "demo-service", path = "/v1/demos", fallback = DemoFeignFallBack.class)
public interface DemoFeign {


}
