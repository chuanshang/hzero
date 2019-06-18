package org.hzero.halm.infra.mapper;

import java.util.List;
import java.util.Set;

import org.hzero.halm.domain.entity.Asset;

import io.choerodon.mybatis.common.BaseMapper;

/**
 * Mapper
 *
 * @author shuailong.tan@hand-china.com 2019-06-14 09:50:23
 */
public interface AssetMapper extends BaseMapper<Asset> {


    List<Asset> selectExportRecords(Set<Long> ids);
}
