package com.sam.springmybatis.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * descrption: 多数据源的选择
 */
public class MultipleDataSourceToChoose extends AbstractRoutingDataSource{

    /**
     * @desction: 根据Key获取数据源的信息，上层抽象函数的钩子
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return HandlerDataSource.getDataSource();
    }
}
