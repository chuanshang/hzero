package org.hzero.halm.api.controller.v1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.hzero.export.annotation.ExcelExport;
import org.hzero.export.vo.ExportParam;
import org.hzero.halm.domain.entity.Asset;
import org.hzero.halm.domain.repository.AssetRepository;
import org.hzero.halm.infra.mapper.AssetMapper;
import org.hzero.mybatis.helper.SecurityTokenHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.annotation.SortDefault;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.mybatis.pagehelper.domain.Sort;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 *  管理 API
 *
 * @author shuailong.tan@hand-china.com 2019-06-14 09:50:23
 */
@RestController("assetController.v1")
@RequestMapping("/v1/assets")
public class AssetController extends BaseController {

    @Autowired
    private AssetRepository assetRepository;
    @Autowired
    private AssetMapper assetMapper;

    @ApiOperation(value = "列表")
    @Permission(level = ResourceLevel.SITE)
    @GetMapping
    public ResponseEntity<Page<Asset>> list(Asset asset, @ApiIgnore @SortDefault(value = Asset.FIELD_ASSET_ID,
            direction = Sort.Direction.DESC) PageRequest pageRequest) {
        Page<Asset> list = assetRepository.pageAndSort(pageRequest, asset);
        return Results.success(list);
    }

    @ApiOperation(value = "明细")
    @Permission(level = ResourceLevel.SITE)
    @GetMapping("/{assetId}")
    public ResponseEntity<Asset> detail(@PathVariable Long assetId) {
        Asset asset = assetRepository.selectByPrimaryKey(assetId);
        return Results.success(asset);
    }

    @ApiOperation(value = "创建")
    @Permission(level = ResourceLevel.SITE)
    @PostMapping
    public ResponseEntity<Asset> create(@RequestBody Asset asset) {
        validObject(asset);
        assetRepository.insertSelective(asset);
        return Results.success(asset);
    }

    @ApiOperation(value = "修改")
    @Permission(level = ResourceLevel.SITE)
    @PutMapping
    public ResponseEntity<Asset> update(@RequestBody Asset asset) {
        SecurityTokenHelper.validToken(asset);
        assetRepository.updateByPrimaryKeySelective(asset);
        return Results.success(asset);
    }

    @ApiOperation(value = "删除")
    @Permission(level = ResourceLevel.SITE)
    @DeleteMapping
    public ResponseEntity<?> remove(@RequestBody Asset asset) {
        SecurityTokenHelper.validToken(asset);
        assetRepository.deleteByPrimaryKey(asset);
        return Results.success();
    }

//    @GetMapping("/export")
//    public Page<List<Asset>> export2(Asset s, Asset record, ExportParam exportParam, HttpServletResponse response, PageRequest pageRequest) {
////        exportParam.setIds();
//        HashSet hashSet = new HashSet();
//        hashSet.add(2);
//        hashSet.add(3);
//        hashSet.add(4);
//        hashSet.add(5);
//        exportParam.setIds(hashSet);
//        return export(s, record, exportParam, response, pageRequest);
////        return Results.success(list);
//    }
    @GetMapping("/export")
    @ExcelExport(Asset.class)
    public Page<List<Asset>> export(Asset s, Asset record, ExportParam exportParam, HttpServletResponse response, PageRequest pageRequest) {
//        exportParam.setIds();
        List<Asset> list = assetRepository.export(record, exportParam, pageRequest);
        System.out.print(list);
        return PageHelper.doPageAndSort(pageRequest, () -> {
            return this.assetMapper.selectExportRecords(exportParam.getIds());
        });
//        return Results.success(list);
    }


//    @ExcelExport(Asset.class)
//    public Page<List<Asset>> export(Asset s, Asset record, ExportParam exportParam, HttpServletResponse response, PageRequest pageRequest) {
////        exportParam.setIds();
//        List<Asset> list = assetRepository.export(record, exportParam, pageRequest);
//        System.out.print(list);
//        return PageHelper.doPageAndSort(pageRequest, () -> {
//            return this.assetMapper.selectExportRecords(exportParam.getIds());
//        });
////        return Results.success(list);
//    }
}
