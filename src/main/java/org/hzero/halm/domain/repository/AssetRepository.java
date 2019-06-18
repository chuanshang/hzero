package org.hzero.halm.domain.repository;

import java.util.List;

import org.hzero.export.vo.ExportParam;
import org.hzero.halm.domain.entity.Asset;
import org.hzero.mybatis.base.BaseRepository;

import io.choerodon.mybatis.pagehelper.domain.PageRequest;

/**
 * 资源库
 *
 * @author shuailong.tan@hand-china.com 2019-06-14 09:50:23
 */
public interface AssetRepository extends BaseRepository<Asset> {

    List<Asset> export(Asset record, ExportParam exportParam, PageRequest pageRequest);
}
