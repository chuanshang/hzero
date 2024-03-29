#!/usr/bin/env bash
mkdir -p target
if [ ! -f target/choerodon-tool-liquibase.jar ]
then
    curl https://nexus.choerodon.com.cn/repository/choerodon-release/io/choerodon/choerodon-tool-liquibase/0.9.2.RELEASE/choerodon-tool-liquibase-0.9.2.RELEASE.jar -o target/choerodon-tool-liquibase.jar
fi

java -Dspring.datasource.url="jdbc:oracle:thin:@db.hzero.org:1521:XE" \
	 -Dspring.datasource.username=hzero \
	 -Dspring.datasource.password=hzero \
	 -Ddata.drop=false -Ddata.init=init \
	 -Ddata.dir=src/main/resources \
	 -jar target/choerodon-tool-liquibase.jar



