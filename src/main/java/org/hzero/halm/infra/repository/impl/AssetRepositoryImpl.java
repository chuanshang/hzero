package org.hzero.halm.infra.repository.impl;

import java.util.List;
import java.util.Set;

import org.hzero.export.vo.ExportParam;
import org.hzero.halm.domain.entity.Asset;
import org.hzero.halm.domain.repository.AssetRepository;
import org.hzero.halm.infra.mapper.AssetMapper;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.choerodon.mybatis.pagehelper.domain.PageRequest;

/**
 *  资源库实现
 *
 * @author shuailong.tan@hand-china.com 2019-06-14 09:50:23
 */
@Component
public class AssetRepositoryImpl extends BaseRepositoryImpl<Asset> implements AssetRepository {

    @Autowired
    AssetMapper assetMapper;

    @Override
    public List<Asset> export(Asset record, ExportParam exportParam, PageRequest pageRequest) {
        Set<Long> ids = exportParam.getIds();
//        return PageHelper.doPageAndSort(pageRequest, () -> {
//            return this.assetMapper.selectExportRecords(ids);
//        });
        List<Asset> assets = assetMapper.selectExportRecords(ids);
        return assets;
    }
}
